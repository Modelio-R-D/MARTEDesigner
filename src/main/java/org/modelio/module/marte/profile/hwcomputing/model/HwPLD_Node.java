package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPLD_Node extends HwComputingResource_Node {
    public HwPLD_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPLD_CLASSIFIER));
    }

    public HwPLD_Node(Node element) {
        super(element);
    }

    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, this.element);
    }

    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, value);
    }

    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, this.element);
    }

    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, value);
    }

    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, this.element);
    }

    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, value);
    }

    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, this.element);
    }

    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, value);
    }

    public enum PLD_Technology {
        SRAM,
        antifuse,
        flash,
        other,
        undef;
    }

}
