package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8c6687d9-712f-44bb-81f1-5b6e35e4d233")
public class HwPLD_AssociationEnd extends HwComputingResource_AssociationEnd {
    @objid ("3cfabfea-76a3-4f2e-8354-b28c301dce86")
    public HwPLD_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwPLD_AssociationEnd"));
    }

    @objid ("40d54b9f-92d5-48e1-bb42-128c45d44bdd")
    public HwPLD_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("10db42ae-64bc-4562-9361-313c59f7b06b")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, this.element);
    }

    @objid ("ee974826-978e-45eb-9108-e4d2631b3c4a")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, value);
    }

    @objid ("342b647d-1fee-4851-8696-7476cfb4ce8f")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, this.element);
    }

    @objid ("01d3fc12-a2df-4b25-8d98-d204b3d0bfcc")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, value);
    }

    @objid ("d4cd8415-cbed-4a1f-a1e3-849cc375bd50")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, this.element);
    }

    @objid ("1abfe8f0-6610-4a98-b463-8c72d4afb083")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, value);
    }

    @objid ("ab561763-ed89-4457-b612-cb0fc070b55d")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, this.element);
    }

    @objid ("d2d11167-3f50-4ba0-b09c-62ac892f0641")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, value);
    }

    @objid ("2972714e-0b5e-459e-a6b9-1bf59e4bfdea")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, this.element);
    }

    @objid ("1e6f2da8-32bc-4e76-b41c-a98df7917039")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, value);
    }

    @objid ("4e6e306c-2b1e-40ba-8a08-acb8165115fd")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM, this.element);
    }

    @objid ("6628058d-1413-462d-b688-1ddd3391593c")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM, value);
    }

    @objid ("c5ecd644-42b1-4c0f-957a-9c6765735691")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING, this.element);
    }

    @objid ("5351c44d-73d4-4331-b378-cc2ed008d647")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING, value);
    }

}
