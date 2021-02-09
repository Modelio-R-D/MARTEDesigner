package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwISA_Attribute {
    protected Attribute element;

    public HwISA_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("HwISA_Attribute"));
    }

    public HwISA_Attribute(Attribute element) {
        this.element = element;
    }

    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, this.element);
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_FAMILY, value);
    }

    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, this.element);
    }

    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_INST_WIDTH, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_ATTRIBUTE_HWISA_ATTRIBUTE_TYPE, value);
    }

    public Attribute getElement() {
        return this.element;
    }

}
