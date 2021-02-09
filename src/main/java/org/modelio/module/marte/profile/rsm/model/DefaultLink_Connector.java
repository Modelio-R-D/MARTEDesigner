package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DefaultLink_Connector {
    protected Connector element;

    public DefaultLink_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"DefaultLink_Connector");
        this.element.setName(MARTEResourceManager.getName("DefaultLink_Connector"));
    }

    public DefaultLink_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Connector getElement() {
        return this.element;
    }

}
