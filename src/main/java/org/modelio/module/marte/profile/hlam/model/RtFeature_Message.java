package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtFeature_Message {
    protected Message element;

    public RtFeature_Message() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createMessage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_MESSAGE);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Message"));
    }

    public RtFeature_Message(Message element) {
        this.element = element;
    }

    public void setParent(MessageEnd source, Operation destination) {
        this.element.setSendEvent(source);
        this.element.setInvoked(destination);
    }

    public Message getElement() {
        return this.element;
    }

}
