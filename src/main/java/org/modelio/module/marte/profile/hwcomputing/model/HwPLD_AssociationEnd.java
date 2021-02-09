package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPLD_AssociationEnd extends HwComputingResource_AssociationEnd {
    public HwPLD_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwPLD_AssociationEnd"));
    }

    public HwPLD_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, this.element);
    }

    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_TECHNOLOGY, value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_ORGANIZATION, value);
    }

    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, this.element);
    }

    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBLUTS, value);
    }

    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, this.element);
    }

    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NDLUT_INPUTS, value);
    }

    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, this.element);
    }

    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_NBFLIPFLOPS, value);
    }

    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM, this.element);
    }

    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSRAM, value);
    }

    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING, this.element);
    }

    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATIONEND_HWPLD_ASSOCIATIONEND_BLOCKSCOMPUTING, value);
    }

}
