package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class FlowProperty_AssociationEnd {
    protected AssociationEnd element;

    public FlowProperty_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWPROPERTY_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("FlowProperty_AssociationEnd"));
    }

    public FlowProperty_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getdirection() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, this.element);
    }

    public void setdirection(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.FLOWPROPERTY_ASSOCIATIONEND_FLOWPROPERTY_ASSOCIATIONEND_DIRECTION, value);
    }

}
