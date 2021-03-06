package org.modelio.module.marte.profile.variables.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Var_Attribute {
    protected Attribute element;

    public Var_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.VAR_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("Var_Attribute"));
    }

    public Var_Attribute(Attribute element) {
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

    public String getdir() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, this.element);
    }

    public void setdir(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.VAR_ATTRIBUTE_VAR_ATTRIBUTE_DIR, value);
    }

}
