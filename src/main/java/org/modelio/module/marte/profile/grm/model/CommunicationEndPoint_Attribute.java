package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dee8d9d1-a53a-4feb-8f39-38f008473331")
public class CommunicationEndPoint_Attribute {
    @objid ("e5d34d1e-2810-4c03-9528-3bdef696a94c")
    protected Attribute element;

    @objid ("01b3c423-3aa1-48e5-ad13-9d4942c7eee3")
    public CommunicationEndPoint_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Attribute"));
    }

    @objid ("e3404c63-bcc9-4708-ad8b-ebc20440527f")
    public CommunicationEndPoint_Attribute(final Attribute element) {
        this.element = element;
    }

    @objid ("1faf4262-fc94-479f-b649-217156a270e7")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("c5d6b1bd-5214-4b3d-99dd-a74b3dbad9cd")
    public void setParent(final AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("9e98890e-dccf-4f51-8c91-0fbb020c731d")
    public void setParent(final Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("7a516211-6b51-4ae8-be01-5b7660ca2a4c")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4ca04823-4b0b-41fb-b11e-49dd8435d7b9")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE, this.element);
    }

    @objid ("6e321db2-6777-4f0d-a39a-68f62c54e209")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ATTRIBUTE_COMMUNICATIONENDPOINT_ATTRIBUTE_PACKETSIZE, value);
    }

}
