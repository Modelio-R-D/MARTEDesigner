package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SharedDataComResource_Connector {
    protected Connector element;

    public SharedDataComResource_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("SharedDataComResource_Connector"));
    }

    public SharedDataComResource_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(element, source, destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES, this.element);
    }

    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_READSERVICES, value);
    }

    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES, this.element);
    }

    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_LINK_SHAREDDATACOMRESOURCE_LINK_WRITESERVICES, value);
    }

}
