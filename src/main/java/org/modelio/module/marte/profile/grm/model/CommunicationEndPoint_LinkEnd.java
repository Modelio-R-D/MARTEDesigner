package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationEndPoint_LinkEnd {
    protected ConnectorEnd element;

    public CommunicationEndPoint_LinkEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LINKEND);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_ConnectorEnd"));
    }

    public CommunicationEndPoint_LinkEnd(final ConnectorEnd element) {
        this.element = element;
    }

    public ConnectorEnd getElement() {
        return this.element;
    }

    public void setParent(final Link parent) {
        this.element.setLink(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, this.element);
    }

    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, value);
    }

}
