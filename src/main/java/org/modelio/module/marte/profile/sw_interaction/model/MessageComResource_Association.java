package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MessageComResource_Association {
    protected Association element;

    public MessageComResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("MessageComResource_Association"));
    }

    public MessageComResource_Association(Association element) {
        this.element = element;
    }

    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    public Association getElement() {
        return this.element;
    }

    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE, this.element);
    }

    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE,value);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, value);
    }

    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS, this.element);
    }

    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS, value);
    }

    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, this.element);
    }

    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, value);
    }

    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES, this.element);
    }

    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES, value);
    }

    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES, this.element);
    }

    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES, value);
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
