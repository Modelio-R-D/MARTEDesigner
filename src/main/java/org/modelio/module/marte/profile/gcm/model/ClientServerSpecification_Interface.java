package org.modelio.module.marte.profile.gcm.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClientServerSpecification_Interface {
    protected Interface element;

    public ClientServerSpecification_Interface() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInterface();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE);
        this.element.setName(MARTEResourceManager.getName("ClientServerSpecification_Interface"));
    }

    public ClientServerSpecification_Interface(Interface element) {
        this.element = element;
    }

    public Interface getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public List<ClientServerFeature_Operation> getClientServerFeature_Operation() {
        List<ClientServerFeature_Operation> res = new java.util.ArrayList<>();        
        for(Feature feature : this.element.getOwnedOperation()){
            res.add(new ClientServerFeature_Operation((Operation)feature));
        }
        return res;
    }

    public void addClientServerFeature_Operation(ClientServerFeature_Operation model) {
        this.element.getOwnedOperation().add(model.getElement());
    }

}
