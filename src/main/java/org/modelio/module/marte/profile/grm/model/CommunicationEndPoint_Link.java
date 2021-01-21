package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3d88597d-4d74-42b9-90f4-2a63c275c4b6")
public class CommunicationEndPoint_Link {
    @objid ("df6d2515-12fb-4c04-b452-97e7ecf45af3")
    protected Link element;

    @objid ("73382c23-22d5-4d22-89a5-0f050c33e012")
    public CommunicationEndPoint_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LINK);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Link"));
    }

    @objid ("f4d55bd7-122c-46a9-b309-f66e3d399c8a")
    public CommunicationEndPoint_Link(final Link element) {
        this.element = element;
    }

    @objid ("b7cf4790-6002-4122-8c7f-a9d373857836")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("d697fae6-b99f-4fb8-9bc5-b5f958b1e27b")
    public Link getElement() {
        return this.element;
    }

    @objid ("5e543429-a9f6-4ef0-a59b-de1bfb6278e0")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINK_COMMUNICATIONENDPOINT_LINK_PACKETSIZE, this.element);
    }

    @objid ("aec55db8-f2b3-4e39-aa3e-dec08e643064")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LINK_COMMUNICATIONENDPOINT_LINK_PACKETSIZE, value);
    }

}
