package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2510533f-35c0-4e93-82e0-6695c90e19bc")
public class HwPLD_Class extends HwComputingResource_Class {
    @objid ("fba534d3-fec1-4d7b-a003-80b61b3a550f")
    public HwPLD_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPLD_CLASSIFIER));
    }

    @objid ("e3aab6f3-c4ee-4fa9-9fa3-fda5fd0df64f")
    public HwPLD_Class(Class element) {
        super(element);
    }

    @objid ("e914c5df-21cf-47e4-9743-ba4b98c11bf8")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, this.element);
    }

    @objid ("f317e47b-e31b-4604-916d-e51a3e6a0542")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_TECHNOLOGY, value);
    }

    @objid ("7070eecd-fef3-4d3d-be3a-8b28f72ae620")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("eee5fd3c-4a64-4ceb-beeb-af1e9eb351ed")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("3d601334-16c8-4345-a330-ae6b4b80b903")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, this.element);
    }

    @objid ("d4962cae-d6e8-429c-83b1-cc098384497b")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBLUTS, value);
    }

    @objid ("fcb3ec68-76f5-4921-aafd-f61f88fbde36")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, this.element);
    }

    @objid ("5fa772bf-3a4e-4589-8a92-a3d46b14811d")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NDLUT_INPUTS, value);
    }

    @objid ("12bc6c25-db21-4430-b074-ada35ca6d85e")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, this.element);
    }

    @objid ("b7b25566-b27c-4ef9-884b-e73ddcc2cf83")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_CLASSIFIER_HWPLD_CLASSIFIER_NBFLIPFLOPS, value);
    }

    @objid ("b0f003fc-eaed-4693-b38b-92f823f9a966")
    public enum PLD_Technology {
        SRAM,
        antifuse,
        flash,
        other,
        undef;
    }

}
