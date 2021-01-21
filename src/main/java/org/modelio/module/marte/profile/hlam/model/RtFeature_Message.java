package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bc05dbaa-b279-47ce-ad9b-1f6e79aa3800")
public class RtFeature_Message {
    @objid ("dbd9a063-fb8f-4e76-91ae-c349d8bbf666")
    protected Message element;

    @objid ("ed31dca0-017d-473c-ae22-59e3e4c2facd")
    public RtFeature_Message() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createMessage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_MESSAGE);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Message"));
    }

    @objid ("555f2cb2-9caf-4f72-a263-dab0b7476bf0")
    public RtFeature_Message(Message element) {
        this.element = element;
    }

    @objid ("79550b2d-67ee-4546-bdc6-e1d4a9c3121b")
    public void setParent(MessageEnd source, Operation destination) {
        this.element.setSendEvent(source);
        this.element.setInvoked(destination);
    }

    @objid ("00086823-0826-4506-8a6d-d33f9ca58ac4")
    public Message getElement() {
        return this.element;
    }

}
