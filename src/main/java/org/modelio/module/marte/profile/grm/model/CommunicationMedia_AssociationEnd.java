package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_AssociationEnd extends ProcessingResource_AssociationEnd {
    public CommunicationMedia_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_AssociationEnd"));
    }

    public CommunicationMedia_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATIONEND_COMMUNICATIONMEDIA_ASSOCIATIONEND_CAPACITY, value);
    }

}
