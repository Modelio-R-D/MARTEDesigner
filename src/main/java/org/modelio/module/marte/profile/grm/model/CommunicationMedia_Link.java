package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_Link {
    protected Link element;

    public CommunicationMedia_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK);
        this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Link"));
    }

    public CommunicationMedia_Link(final Link element) {
        this.element = element;
    }

    public void setParent(final BindableInstance source, final BindableInstance destination) {
    }

    public Link getElement() {
        return this.element;
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LINK_COMMUNICATIONMEDIA_LINK_CAPACITY, value);
    }

    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(element, source, destination);
    }

}
