package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("610f953b-0923-4db0-b763-d9beb0752886")
public class CommunicationMedia_Association {
    @objid ("97da56ea-9ed6-4be1-9602-9b71e7785001")
    protected Association element;

    @objid ("01fdffb8-060b-4ff5-bb15-5e6572b66987")
    public CommunicationMedia_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Association"));
    }

    @objid ("97038769-b82e-4dbd-bd63-b238c497969c")
    public CommunicationMedia_Association(final Association element) {
        this.element = element;
    }

    @objid ("b186abbd-07f3-4045-9dd2-0049e5b2cdf3")
    public void setParent(final TemplateParameter source, final AssociationEnd destination) {
        this.element.getEnd().add(destination);
    }

    @objid ("a0d90e61-cb09-46e9-bcb9-79b00f2062dc")
    public Association getElement() {
        return this.element;
    }

    @objid ("f308b996-9e59-4bc0-b7a0-f6365fa967c5")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, this.element);
    }

    @objid ("598d177b-3f24-4d34-be89-e724a0bc4dd1")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_ELEMENTSIZE, value);
    }

    @objid ("170c771b-451b-473d-a300-12d48b385db3")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, this.element);
    }

    @objid ("1843f412-d2b9-4e25-9b62-7f748d622fae")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_TRANSMMODE, value);
    }

    @objid ("d3c5daf9-19b5-4f90-b2c7-cb4a89bfb5f5")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, this.element);
    }

    @objid ("e8f3444b-6391-4f88-a751-38302edbdf38")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_BLOCKT, value);
    }

    @objid ("018c0415-f73c-40a5-9926-851ee2cc7f9f")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, this.element);
    }

    @objid ("f550fe49-6a1d-41d3-b98c-11a33bb1c247")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_PACKETT, value);
    }

    @objid ("6858b766-b5f5-43c8-9317-a0168870dc3d")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, this.element);
    }

    @objid ("bdf49c36-3d4c-48c1-b653-82572cd7cda7")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_ASSOCIATION_COMMUNICATIONMEDIA_ASSOCIATION_CAPACITY, value);
    }

    @objid ("9c025814-0f36-404c-9551-3bf230024106")
    public enum TransmModeKind {
        simplex,
        halfDuplex,
        fullDuplex;
    }

}
