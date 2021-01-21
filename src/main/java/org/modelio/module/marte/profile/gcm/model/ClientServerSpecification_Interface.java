package org.modelio.module.marte.profile.gcm.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("de1e6520-f0d7-4d6b-ba66-b1f9f729b6dd")
public class ClientServerSpecification_Interface {
    @objid ("409d21f3-c5f3-45de-aa6e-1daa5b031e2d")
    protected Interface element;

    @objid ("a3edff64-626a-43b8-b05a-4372694f7a3d")
    public ClientServerSpecification_Interface() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInterface();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE);
        this.element.setName(MARTEResourceManager.getName("ClientServerSpecification_Interface"));
    }

    @objid ("c8e2714f-f942-4a29-851d-94f95a10985d")
    public ClientServerSpecification_Interface(Interface element) {
        this.element = element;
    }

    @objid ("5ca33392-4226-4d2e-bacf-8270af6c1376")
    public Interface getElement() {
        return this.element;
    }

    @objid ("8fdcc88c-5dcc-479d-8293-fe3904934443")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("7433efe8-d90c-4638-ad42-6df1d65033e9")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("23fd302a-e5f3-4fe8-91d1-f021c209b407")
    public List<ClientServerFeature_Operation> getClientServerFeature_Operation() {
        List<ClientServerFeature_Operation> res = new java.util.ArrayList<>();        
        for(Feature feature : this.element.getOwnedOperation()){
            res.add(new ClientServerFeature_Operation((Operation)feature));
        }
        return res;
    }

    @objid ("63f98516-8ff4-49be-9289-ebcebc22423c")
    public void addClientServerFeature_Operation(ClientServerFeature_Operation model) {
        this.element.getOwnedOperation().add(model.getElement());
    }

}
