package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3317b267-9627-451e-9e51-d8441de8658c")
public class MessageComResource_BindableInstance extends SwCommunicationResource_BindableInstance {
    @objid ("8bb861da-e697-4611-a751-e929d4739797")
    public MessageComResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MessageComResource_BindableInstance"));
    }

    @objid ("9b70ceca-a856-4e4a-83fa-b27501a89256")
    public MessageComResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("280e199a-0dcb-4ce4-bde5-0491289a475a")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("c60a644c-4ab0-4740-903e-981a889949f7")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("bd28da80-fae4-4765-ab8d-0e3667f86d41")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("ec6a61b2-1dc3-4f9c-9e79-ba24fc4b7151")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("503c9c7d-e54d-4d6c-8625-253ef073db16")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("dd2392a5-fe2c-4a2d-a725-fa532f346668")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, value);
    }

    @objid ("64a6e49e-2560-4baa-86f2-3ed5164779f7")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("835450c8-17f1-4312-a15d-20f8a7e6065c")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("eede3e0b-f69b-45e0-960c-246423851bdb")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("ac6e8654-f776-41bb-ba14-1cdbc0f4baab")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("855aa759-e1a2-440c-a203-97c53b3f0dac")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, this.element);
    }

    @objid ("2b678801-84e6-4f50-acbc-49530e7d6277")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, value);
    }

    @objid ("6ece2ddd-e167-4338-93d0-82ba160b4279")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, this.element);
    }

    @objid ("05055061-bdef-42a1-9bb2-0c82f8d28fc4")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, value);
    }

}
