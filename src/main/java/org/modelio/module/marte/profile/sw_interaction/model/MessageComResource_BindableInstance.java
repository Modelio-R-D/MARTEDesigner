package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MessageComResource_BindableInstance extends SwCommunicationResource_BindableInstance {
    public MessageComResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MessageComResource_BindableInstance"));
    }

    public MessageComResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE, this.element);
    }

    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE,value);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, value);
    }

    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, this.element);
    }

    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, value);
    }

    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, this.element);
    }

    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, value);
    }

    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, this.element);
    }

    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, value);
    }

    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, this.element);
    }

    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, value);
    }

}
