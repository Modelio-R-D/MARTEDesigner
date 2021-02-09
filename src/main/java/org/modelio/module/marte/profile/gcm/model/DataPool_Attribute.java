package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DataPool_Attribute {
    protected Attribute element;

    public DataPool_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAPOOL_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("DataPool_Attribute"));
    }

    public DataPool_Attribute(Attribute element) {
        this.element = element;
    }

    public Attribute getElement() {
        return this.element;
    }

    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getordering() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, this.element);
    }

    public void setordering(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_ORDERING, value);
    }

    public String getinsertion() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION, this.element);
    }

    public void setinsertion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_INSERTION, value);
    }

    public String getselection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_SELECTION, this.element);
    }

    public void setselection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAPOOL_ATTRIBUTE_DATAPOOL_ATTRIBUTE_SELECTION, value);
    }

}
