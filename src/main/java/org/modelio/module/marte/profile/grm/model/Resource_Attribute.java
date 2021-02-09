package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Resource_Attribute {
    protected Attribute element;

    public Resource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("Resource_Attribute"));
    }

    public Resource_Attribute(final Attribute element) {
        this.element = element;
    }

    public Attribute getElement() {
        return this.element;
    }

    public void setParent(final AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(final Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_RESMULT, this.element);
    }

    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_RESMULT, value);
    }

    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISPROTECTED, this.element);
    }

    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISPROTECTED,value);
    }

    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISACTIVE, this.element);
    }

    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISACTIVE,value);
    }

}
