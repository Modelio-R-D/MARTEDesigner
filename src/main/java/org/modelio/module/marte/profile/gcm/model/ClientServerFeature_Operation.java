package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClientServerFeature_Operation {
    protected Operation element;

    public ClientServerFeature_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERFEATURE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("ClientServerFeature_Operation"));
    }

    public ClientServerFeature_Operation(Operation element) {
        this.element = element;
    }

    public Operation getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, this.element);
    }

    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, value);
    }

    public ClientServerSpecification_Interface getClientServerSpecification_Interface() {
        return new ClientServerSpecification_Interface((Interface)this.element.getOwner());
    }

    public void addClientServerSpecification_Interface(ClientServerSpecification_Interface model) {
        this.element.setOwner(model.getElement());
    }

}
