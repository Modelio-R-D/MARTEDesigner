package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPLD_Lifeline extends HwComputingResource_Lifeline {
    public HwPLD_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_Lifeline"));
    }

    public HwPLD_Lifeline(Lifeline element) {
        super(element);
    }

    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_TECHNOLOGY, this.element);
    }

    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_TECHNOLOGY, value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_ORGANIZATION, value);
    }

    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBLUTS, this.element);
    }

    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBLUTS, value);
    }

    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NDLUT_INPUTS, this.element);
    }

    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NDLUT_INPUTS, value);
    }

    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBFLIPFLOPS, this.element);
    }

    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBFLIPFLOPS, value);
    }

    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSRAM, this.element);
    }

    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSRAM, value);
    }

    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSCOMPUTING, this.element);
    }

    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSCOMPUTING, value);
    }

}
