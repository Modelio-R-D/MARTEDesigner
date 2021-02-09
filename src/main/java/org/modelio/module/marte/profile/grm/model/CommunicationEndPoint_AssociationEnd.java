package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationEndPoint_AssociationEnd {
    protected AssociationEnd element;

    public CommunicationEndPoint_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_AssociationEnd"));
    }

    public CommunicationEndPoint_AssociationEnd(final AssociationEnd element) {
        this.element = element;
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public void setParent(final Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, this.element);
    }

    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND_COMMUNICATIONENDPOINT_ASSOCIATIONEND_PACKETSIZE, value);
    }

}
