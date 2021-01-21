package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5ccdc841-3be8-47cb-b54a-73a074487c0b")
public class CommunicationEndPoint_AssociationEnd {
    @objid ("d26d3cc7-f0a3-4c3a-a21c-9aa1d4a0d356")
    protected AssociationEnd element;

    @objid ("efc62b27-beb9-4b21-9e3c-fc1ccb233baa")
    public CommunicationEndPoint_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_AssociationEnd"));
    }

    @objid ("eaab06a8-f505-4ede-a434-49ef81df8df2")
    public CommunicationEndPoint_AssociationEnd(final AssociationEnd element) {
        this.element = element;
    }

    @objid ("50386a4d-123a-4003-8be6-2c885064e6c7")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("ed909fa7-59b1-4f83-87da-4f1d5d6ca548")
    public void setParent(final Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("1bf4f2ae-b948-446c-be59-11e6a4d946df")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("bed51fd9-5e81-4865-ab07-18cea6d9f2a3")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, this.element);
    }

    @objid ("25e7b1fb-f702-4975-9062-1a6eff05f204")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, value);
    }

}
