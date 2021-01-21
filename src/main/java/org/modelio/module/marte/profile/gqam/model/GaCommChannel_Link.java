package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9a1009e0-8a5b-4334-b059-d4d843d791ab")
public class GaCommChannel_Link {
    @objid ("00aae6b0-ffb3-4a8e-a825-743c1b7dfdf0")
    protected Link element;

    @objid ("3e4fdb19-9ad5-4874-9e33-63bf22fa3588")
    public GaCommChannel_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_LINK);
        this.element.setName(MARTEResourceManager.getName("GaCommChannel_Link"));
    }

    @objid ("d6621fbc-4d31-437d-a8e6-70434ae4410d")
    public GaCommChannel_Link(Link element) {
        this.element = element;
    }

    @objid ("1d02a62e-5240-4bc7-abfe-37d37b10ebb2")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("0ab8d30c-6a5d-4314-a43a-d058b47617a8")
    public Link getElement() {
        return this.element;
    }

    @objid ("f6cb4112-77ad-4dce-b956-fbbb9229160d")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE, this.element);
    }

    @objid ("f203c813-3dc9-45fd-8fad-df5a5befa1af")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_PACKETSIZE, value);
    }

    @objid ("c06887fa-498d-48b7-9409-a62119ed71e2")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION, this.element);
    }

    @objid ("55898cbb-584d-4436-b7d1-eb12d944b413")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_LINK_GACOMMCHANNEL_LINK_UTILIZATION, value);
    }

}
