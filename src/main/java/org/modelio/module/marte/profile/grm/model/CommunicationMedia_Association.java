package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_Association {
    protected Association element;

    public CommunicationMedia_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Association"));
    }

    public CommunicationMedia_Association(final Association element) {
        this.element = element;
    }

    public void setParent(final TemplateParameter source, final AssociationEnd destination) {
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, value);
    }

    public enum TransmModeKind {
        simplex,
        halfDuplex,
        fullDuplex;
    }

}
