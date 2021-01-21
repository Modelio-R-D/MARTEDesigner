package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ec804de3-649b-43ae-9267-a351300720ec")
public class MessageComResource_Connector {
    @objid ("d3f4fd97-1456-4e30-8ec7-bd56e165ae43")
    protected Connector element;

    @objid ("84b7046e-4a32-4e58-b985-1eb1ecec4629")
    public MessageComResource_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("MessageComResource_Connector"));
    }

    @objid ("750b9aef-86f2-46a7-9c82-bc4f2d031c09")
    public MessageComResource_Connector(Connector element) {
        this.element = element;
    }

    @objid ("b5d57766-c562-4cd0-a7cf-9f76c24c2dff")
    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachLink(element, source, destination);
    }

    @objid ("00342d57-37d7-4fce-89c5-dda041dd6279")
    public Connector getElement() {
        return this.element;
    }

    @objid ("c64066c3-662a-4268-a94b-6e74f37ce71b")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("bae5588e-e683-4cac-a1f8-5db3a2eda4a7")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("597734c6-56c3-4152-89f6-63c3ed1fa300")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("75b97a1a-b8bc-4be7-ba54-29060e68033e")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("0b2b14a1-d8c1-47f0-a6de-00dd3ede7cb7")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("4b25431e-f373-47d9-8c2a-a97cdc557039")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, value);
    }

    @objid ("7a70f1b8-7115-40a0-b8f6-d8efe3a49d9d")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("e24b2e5a-67bb-4328-be33-cda01e5feaa7")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("9168d5dd-01c8-4555-8d48-fcb54e18d379")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("b2aafef7-d0c5-4386-b738-e8a7997e86de")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("ce99f77f-e95b-4742-ae9b-9a089a07ffe9")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, this.element);
    }

    @objid ("6dfd1e9d-c5a6-4869-9233-636b7966d11d")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, value);
    }

    @objid ("a0575d06-ebb9-4b1b-a284-79706040434f")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, this.element);
    }

    @objid ("e88dab38-7e38-440a-9c78-261d4927b695")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, value);
    }

    @objid ("40708cb9-d502-4337-9bde-dc4d7a001205")
    public enum MessageResourceKind {
        MessageQueue,
        Pipe,
        Blackboard,
        Undef,
        Other;
    }

    @objid ("319315cd-6325-4029-9f88-9e68e050fd47")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
