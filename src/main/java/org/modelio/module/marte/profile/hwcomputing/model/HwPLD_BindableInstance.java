package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPLD_BindableInstance extends HwComputingResource_BindableInstance {
    public HwPLD_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_BindableInstance"));
    }

    public HwPLD_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, this.element);
    }

    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY , value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, value);
    }

    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, this.element);
    }

    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS , value);
    }

    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, this.element);
    }

    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, value);
    }

    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, this.element);
    }

    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, value);
    }

    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM, this.element);
    }

    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM, value);
    }

    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING, this.element);
    }

    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING, value);
    }

}
