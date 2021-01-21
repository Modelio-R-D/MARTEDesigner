package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("98f2db94-13b0-4370-ac82-6444065ca3c0")
public class DefaultLink_Connector {
    @objid ("1a6b4f21-f135-4575-b5c9-16e9dd741546")
    protected Connector element;

    @objid ("1d1d64d5-2149-4d10-86e0-40661bc706c7")
    public DefaultLink_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"DefaultLink_Connector");
        this.element.setName(MARTEResourceManager.getName("DefaultLink_Connector"));
    }

    @objid ("357ad24e-d0ad-4e28-8c9e-c5af756646cd")
    public DefaultLink_Connector(Connector element) {
        this.element = element;
    }

    @objid ("1a1c1b1d-ea14-40d2-ab3f-c644aecb9e5f")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("51db131f-48e5-475a-a1c0-9a1b8cf81c65")
    public Connector getElement() {
        return this.element;
    }

}
