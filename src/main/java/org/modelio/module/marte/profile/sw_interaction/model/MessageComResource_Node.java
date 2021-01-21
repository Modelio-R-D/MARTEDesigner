package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b028672d-4cce-4f52-bbd4-21b99be62dd3")
public class MessageComResource_Node extends SwCommunicationResource_Node {
    @objid ("57b0733b-5cc0-484b-b2b4-e9640c01e4cd")
    public MessageComResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_CLASSIFIER));
    }

    @objid ("146ad113-b613-4656-b341-8865783ea854")
    public MessageComResource_Node(Node element) {
        super(element);
    }

    @objid ("e540fd86-27e4-44d3-b835-3ce5f2569d9c")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("291d9f1c-8dbb-4362-a8cf-40ddd4c3846d")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("c6f81f75-3b26-461a-a2b1-550b11e85f91")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("ea3c79c0-1edc-4be5-b96b-39702096caa2")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("8f613f0a-5930-42d9-8f55-c5459dd365fb")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("31c3ee28-041e-41b0-afa8-d3e379c29322")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, value);
    }

    @objid ("a28862b1-a875-47b6-a9cf-5c1e8774a51a")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("f4db3980-cca3-4005-a574-1123b3589547")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("d1912bb7-5401-4751-8953-3cb27fd85517")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("7e4d9f47-f1ca-4cac-8fb3-eaf0e9a394b8")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("1f5ea1ea-0451-4924-b123-e11dd58e1925")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, this.element);
    }

    @objid ("80892494-efaa-4eeb-82e5-0d161658e813")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, value);
    }

    @objid ("7477bd8e-a960-4843-bffd-e0e8f687df08")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, this.element);
    }

    @objid ("eed9071f-2136-49b9-8ecd-a18bb1cff668")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, value);
    }

    @objid ("fe21beb6-8af5-4503-a9b4-04b58c6c6f06")
    public enum MessageResourceKind {
        MessageQueue,
        Pipe,
        Blackboard,
        Undef,
        Other;
    }

    @objid ("fce08c4b-1c04-4aa5-9768-7edc4711734a")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
