package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("617f8f64-b83b-4ce1-8c63-b270ead846de")
public class HwCommunicationResource_Link {
    @objid ("2c9951fd-b0e2-49fe-b705-01791970e347")
    protected Link element;

    @objid ("2c4aa62a-3c97-42e1-b1a2-0b3f3c985de3")
    public HwCommunicationResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Link"));
    }

    @objid ("0ee8b62c-8703-4e42-961a-d44ff9aa7848")
    public HwCommunicationResource_Link(Link element) {
        this.element = element;
    }

    @objid ("d73de371-d774-41b7-a0a2-0f368c7e3e81")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(element, source, destination);
    }

    @objid ("03ab0ae6-12ce-4cd9-a04a-174e0ee43bf3")
    public Link getElement() {
        return this.element;
    }

}
