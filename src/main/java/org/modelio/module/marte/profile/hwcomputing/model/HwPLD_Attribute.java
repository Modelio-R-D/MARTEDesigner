package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f4badd6a-32e8-4708-a6e6-8d3973304b09")
public class HwPLD_Attribute extends HwComputingResource_Attribute {
    @objid ("bd24c936-3e5e-451a-bde8-6d1c592db755")
    public HwPLD_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_Attribute"));
    }

    @objid ("e103cca3-133f-4b1e-9945-e1f8a1c80189")
    public HwPLD_Attribute(Attribute element) {
        super(element);
    }

    @objid ("dc384d60-d8e9-492a-b0e1-1afd2ba50ce7")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_TECHNOLOGY, this.element);
    }

    @objid ("84ebd8b9-e047-4cda-adbf-c13a0e16c3fa")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_TECHNOLOGY, value);
    }

    @objid ("1039a581-a09e-4027-8f17-f7ba25538c78")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_ORGANIZATION, this.element);
    }

    @objid ("1f42ef77-eeea-4647-a29c-86702677671a")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_ORGANIZATION, value);
    }

    @objid ("5c480861-e6e5-48f7-8b5b-04ba692677a4")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NBLUTS, this.element);
    }

    @objid ("276c2893-5275-4e71-82c2-6c1589524160")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NBLUTS, value);
    }

    @objid ("ccf6f833-a8ed-48e4-962b-bb38345fb489")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NDLUT_INPUTS, this.element);
    }

    @objid ("59d9cd02-47d8-4e13-bb2e-1403ec0de7a8")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NDLUT_INPUTS, value);
    }

    @objid ("4bc01b87-e57b-4d04-9024-acfa69a0def8")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NBFLIPFLOPS, this.element);
    }

    @objid ("9ec1f6c4-7432-4b5a-a55a-9a4f4ebcc4a8")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_NBFLIPFLOPS, value);
    }

    @objid ("deae4896-1a39-40c3-8248-8793ccab8577")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_BLOCKSRAM, this.element);
    }

    @objid ("f4b76e91-244e-42e5-a46b-23f4b9b5dcec")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_BLOCKSRAM, value);
    }

    @objid ("350bd7ee-7788-4048-99cc-866939d43143")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_BLOCKSCOMPUTING, this.element);
    }

    @objid ("7d399350-8037-454a-a44d-9bd32629cbcc")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ATTRIBUTE_HWPLD_ATTRIBUTE_BLOCKSCOMPUTING, value);
    }

}
