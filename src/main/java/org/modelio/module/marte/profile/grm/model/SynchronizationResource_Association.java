package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1c1e0706-b039-4e60-9c02-405ac9d27ef8")
public class SynchronizationResource_Association {
    @objid ("f452385b-6032-4e7e-952f-65a4fec094ad")
    protected Association element;

    @objid ("d32c9d8f-5b63-4e7e-bdd0-7d86cfd08417")
    public SynchronizationResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Association"));
    }

    @objid ("59598568-8cc1-4130-a253-f6f992b0afc3")
    public SynchronizationResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("29687909-2bd1-46a9-827d-5f66c873ce8d")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("6538f79a-e9a0-45a0-b177-9774f5f57097")
    public Association getElement() {
        return this.element;
    }

}
