package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f496eb0a-c5b8-472b-a102-43972942de87")
public class ClientServerFeature_Operation {
    @objid ("fdc5a42e-3253-41aa-9e95-47b68e96fc3b")
    protected Operation element;

    @objid ("8682cf9f-a303-4ebd-beeb-87a79d87e6fd")
    public ClientServerFeature_Operation() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERFEATURE_OPERATION);
        this.element.setName(MARTEResourceManager.getName("ClientServerFeature_Operation"));
    }

    @objid ("c81625d6-6ccb-462b-a5c9-ef4ae582593a")
    public ClientServerFeature_Operation(Operation element) {
        this.element = element;
    }

    @objid ("5bdc4bfd-c185-44e2-8600-14caa95debae")
    public Operation getElement() {
        return this.element;
    }

    @objid ("b1b0d16e-565b-4c71-9edf-7442a2ebe593")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("562c5906-591f-43a9-a0cf-9246432f8224")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("c9be91eb-1013-4419-b9b2-300496b004c8")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, this.element);
    }

    @objid ("32c74a12-76ec-4574-8b4e-75b729bea7e1")
    public void setkind(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLIENTSERVERFEATURE_OPERATION_CLIENTSERVERFEATURE_OPERATION_KIND, value);
    }

    @objid ("89059031-27df-40ec-b0c6-56121028b22e")
    public ClientServerSpecification_Interface getClientServerSpecification_Interface() {
        return new ClientServerSpecification_Interface((Interface)this.element.getOwner());
    }

    @objid ("7ac550f2-0e59-46e3-a7c5-b5170d4b2ce7")
    public void addClientServerSpecification_Interface(ClientServerSpecification_Interface model) {
        this.element.setOwner(model.getElement());
    }

}
