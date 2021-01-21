package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dfd3cccb-fab7-4cf4-9b8c-92cf94fa8da0")
public class HwPLD_Node extends HwComputingResource_Node {
    @objid ("cf4e6714-5ff8-4514-8180-73d61998b895")
    public HwPLD_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPLD_CLASSIFIER));
    }

    @objid ("68bf3069-3369-4d46-b5c6-f7db53946cd7")
    public HwPLD_Node(Node element) {
        super(element);
    }

    @objid ("09812d3f-2574-4f15-9416-2670d722d12c")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, this.element);
    }

    @objid ("c9eeedca-eeb2-443c-863d-4234b5f56f23")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, value);
    }

    @objid ("e450fc73-e3d0-4f2b-a080-8f9e13258fef")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("62202595-784a-4498-a485-d92b29535136")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("b3d706e0-42fd-41fe-8dca-3f77aea2a9fe")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, this.element);
    }

    @objid ("b33d6dab-bdb1-4fdf-8100-fbe4d4199cce")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, value);
    }

    @objid ("30ac5038-e6c9-4bf1-9349-1a60d7a97be5")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, this.element);
    }

    @objid ("2b296d72-4971-431e-afb9-ca0d36d464e4")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, value);
    }

    @objid ("53d72a0a-30ea-4004-8d3a-5c3cd7561e27")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, this.element);
    }

    @objid ("9820b1e7-819a-4122-8ebf-61885184ca96")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, value);
    }

    @objid ("8ad0fd87-c17f-4302-a00b-3ce2c0337349")
    public enum PLD_Technology {
        SRAM,
        antifuse,
        flash,
        other,
        undef;
    }

}
