package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPLD_Link {
    protected Link element;

    public HwPLD_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_LINK);
        this.element.setName(MARTEResourceManager.getName("HwPLD_Link"));
    }

    public HwPLD_Link(Link element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, this.element);
    }

    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, value);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, value);
    }

    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, this.element);
    }

    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, value);
    }

    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, this.element);
    }

    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, value);
    }

    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, this.element);
    }

    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, value);
    }

    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM, this.element);
    }

    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM, value);
    }

    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING, this.element);
    }

    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING, value);
    }

}
