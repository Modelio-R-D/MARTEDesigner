package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6c3c99fd-f24f-415b-94e2-fe7432ad3efb")
public class SwCommunicationResource_Connector {
    @objid ("7c91f9b9-de6e-46d6-9b72-787e4121ce1d")
    protected Connector element;

    @objid ("e5c51fe3-94a4-419b-bc66-81bf6bac71f6")
    public SwCommunicationResource_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("SwCommunicationResource_Connector"));
    }

    @objid ("0242fd25-8f77-4216-9076-a582c0a221f7")
    public SwCommunicationResource_Connector(Connector element) {
        this.element = element;
    }

    @objid ("5a1d6174-6c84-48b8-ad47-b891e57071cd")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(element, source, destination);
    }

    @objid ("ecad086c-dad1-458a-b423-5f913a1214d6")
    public Connector getElement() {
        return this.element;
    }

    @objid ("8f028508-dfb8-4a76-ac52-91a9fa7ffbe5")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
