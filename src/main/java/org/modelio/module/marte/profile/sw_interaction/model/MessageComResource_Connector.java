package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MessageComResource_Connector {
    protected Connector element;

    public MessageComResource_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("MessageComResource_Connector"));
    }

    public MessageComResource_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(element, source, destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE, this.element);
    }

    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE,value);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, this.element);
    }

    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, value);
    }

    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, this.element);
    }

    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, value);
    }

    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, this.element);
    }

    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, value);
    }

    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, this.element);
    }

    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, value);
    }

    public enum MessageResourceKind {
        MessageQueue,
        Pipe,
        Blackboard,
        Undef,
        Other;
    }

    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
