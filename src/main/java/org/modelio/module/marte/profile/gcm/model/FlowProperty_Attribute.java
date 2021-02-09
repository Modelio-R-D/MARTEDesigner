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

public class FlowProperty_Attribute {
    protected Attribute element;

    public FlowProperty_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_Attribute"));
    }

    public FlowProperty_Attribute(Attribute element) {
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

    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, this.element);
    }

    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_ATTRIBUTE_FLOWPROPERTY_ATTRIBUTE_DIRECTION, value);
    }

}
