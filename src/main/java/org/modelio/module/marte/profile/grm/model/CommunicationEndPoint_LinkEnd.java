package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("11b62b39-8dae-43a3-8d4f-df4f8f734ac8")
public class CommunicationEndPoint_LinkEnd {
    @objid ("887b4463-74f7-4488-a68b-364c646cf077")
    protected ConnectorEnd element;

    @objid ("ea57f65b-33c9-46d5-b5b3-51b01a0f949a")
    public CommunicationEndPoint_LinkEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LINKEND);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_ConnectorEnd"));
    }

    @objid ("2fc3022b-fc64-4dec-85e4-faec68b75514")
    public CommunicationEndPoint_LinkEnd(final ConnectorEnd element) {
        this.element = element;
    }

    @objid ("1800fb43-95b3-49b9-aebd-38bc120a6c53")
    public ConnectorEnd getElement() {
        return this.element;
    }

    @objid ("cbae4617-6607-4084-a4f9-a8ea5991ebb6")
    public void setParent(final Link parent) {
        this.element.setLink(parent);
    }

    @objid ("5518ba78-53b2-432d-b962-d3a859cc24ec")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("ec58f0db-b271-43a8-954d-1b7b833cb254")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, this.element);
    }

    @objid ("4669b179-805f-4b8a-8477-f49c8aaf6e6c")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINKEND_COMMUNICATIONENDPOINT_LINKEND_PACKETSIZE, value);
    }

}
