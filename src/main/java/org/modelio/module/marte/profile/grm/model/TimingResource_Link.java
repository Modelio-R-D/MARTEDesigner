package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8d73a50d-bdf9-47d2-b398-2e9cb0e413d4")
public class TimingResource_Link {
    @objid ("977c8e15-840c-47f2-a82c-9bc38be7d31a")
    protected Link element;

    @objid ("a30ca4f2-f212-43a8-9266-7cbf012a82b8")
    public TimingResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("TimingResource_Link"));
    }

    @objid ("005be497-0130-4576-9199-2b21c5f3c7f4")
    public TimingResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("28d39228-2f89-4f49-9e4a-495f0e3b4cb4")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("20073021-1562-4307-bfe0-dfa6bba910ce")
    public Link getElement() {
        return this.element;
    }

}
