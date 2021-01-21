package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("20d77de1-7af8-45ce-a837-8f913a47c507")
public class CommunicationEndPoint_Lifeline {
    @objid ("a5ae248b-385e-407c-af6b-08f57dab6fe7")
    protected Lifeline element;

    @objid ("1b25da93-d332-4419-95f7-0071320226c1")
    public CommunicationEndPoint_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("CommunicationEndPoint_Lifeline"));
    }

    @objid ("2b8e4461-d40a-4c6a-81a9-19a839fbe613")
    public CommunicationEndPoint_Lifeline(final Lifeline element) {
        this.element = element;
    }

    @objid ("9c6c7b67-6892-4f0a-8b25-4956aee94ae9")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("0f94312a-8e96-4d29-806c-8cb488dd35be")
    public void setParent(final Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("5e0ecfea-1647-469a-885e-cf9490b07e85")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2133137c-c3bb-4ffe-a3c1-55486b3dda42")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LIFELINE_COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE, this.element);
    }

    @objid ("d7784562-6797-4c3f-81aa-cd42e1c44372")
    public void setpacketSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONENDPOINT_LIFELINE_COMMUNICATIONENDPOINT_LIFELINE_PACKETSIZE, value);
    }

}
