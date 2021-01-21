package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e22bf25-bdf0-462b-89b8-881fa0095ded")
public class SwCommunicationResource_Association {
    @objid ("6b7b3263-6c3b-4133-b9d5-e0d2bc4c8a0b")
    protected Association element;

    @objid ("9ec5fb35-33fe-40bf-b9c2-e968359ee390")
    public SwCommunicationResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("SwCommunicationResource_Association"));
    }

    @objid ("204473bd-0f6f-428a-bb0a-1d58f149d3e1")
    public SwCommunicationResource_Association(Association element) {
        this.element = element;
    }

    @objid ("4602806d-3ba8-4e17-8282-e73e78db0d8b")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(element, source, destination);
    }

    @objid ("d5d8e799-dae9-4b99-98ef-754562734ba0")
    public Association getElement() {
        return this.element;
    }

    @objid ("9b187451-2273-4fbc-b1a5-a13b86e80949")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
