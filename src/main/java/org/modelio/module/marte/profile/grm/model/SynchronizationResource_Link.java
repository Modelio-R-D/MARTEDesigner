package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("96093d55-db3f-40c2-8a82-e2c1bc6a3dc6")
public class SynchronizationResource_Link {
    @objid ("ba93ca26-42fb-409c-a66f-4457ff87c796")
    protected Link element;

    @objid ("e5563f6f-8ec2-4bb9-a214-352018f617df")
    public SynchronizationResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Link"));
    }

    @objid ("8e69365d-cfe9-4b66-98a1-ec886a6151cc")
    public SynchronizationResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("27f67fbe-8b7e-4055-bfca-64f805d8ba3f")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("16bc7819-6ead-451b-a04a-4c6b382630b5")
    public Link getElement() {
        return this.element;
    }

}
