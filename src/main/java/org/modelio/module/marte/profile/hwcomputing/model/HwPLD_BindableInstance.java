package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c4f9e9dc-bbd0-4c47-8eae-5a6bf3772001")
public class HwPLD_BindableInstance extends HwComputingResource_BindableInstance {
    @objid ("59fd8e77-cf52-448f-96ec-6e76059a722e")
    public HwPLD_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_BindableInstance"));
    }

    @objid ("786edab1-d423-4479-aa10-d1f53e3d33d4")
    public HwPLD_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("67889ea0-e7ad-4069-a1c6-ab3216999088")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, this.element);
    }

    @objid ("292cf601-8325-4488-83c6-a02597fe79a4")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY , value);
    }

    @objid ("79dd4f0f-eeb3-4ede-abe0-5f39fab28ae4")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("56903913-2b95-4f41-8637-d5850a814ed6")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, value);
    }

    @objid ("ecc6b2e5-93e4-4594-a9da-6c4f5e37bdec")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, this.element);
    }

    @objid ("02775928-5407-4dc6-a84d-5327e756e8b4")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS , value);
    }

    @objid ("31cbafe7-b10f-498e-94b0-27d4b6724d28")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, this.element);
    }

    @objid ("7d849cfb-6658-446c-a125-216392591302")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, value);
    }

    @objid ("6208b93f-58cb-4031-98cf-395697a32adb")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, this.element);
    }

    @objid ("3512af0b-73d2-4e60-9990-2b6630cb29c7")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, value);
    }

    @objid ("f5df4329-2b0b-4880-9b16-6f362392249d")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM, this.element);
    }

    @objid ("017e86ee-fb78-48e0-ae8c-37c37876e713")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSRAM, value);
    }

    @objid ("97465616-81ba-48f5-86e0-e14f9ca10484")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING, this.element);
    }

    @objid ("5bb91234-6a1f-4680-ae70-468d23228766")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_BLOCKSCOMPUTING, value);
    }

}
