package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4492d62e-e284-4729-a962-c2085a129149")
public class MessageComResource_Class extends SwCommunicationResource_Class {
    @objid ("2d65e59b-13f4-4c39-b3a2-6fa780b0f626")
    public MessageComResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MESSAGECOMRESOURCE_CLASSIFIER));
    }

    @objid ("ceab46f0-6fbb-4a1f-85e0-ab17c357dcf1")
    public MessageComResource_Class(Class element) {
        super(element);
    }

    @objid ("115a84d9-533d-4fd7-9046-d36f265d2516")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("ea277188-0e95-43f7-ad89-d2cfc50749b5")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("3aca186f-e743-41d7-8cd6-b7e961f79c08")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("a89a2a98-4fe1-43db-a895-83d307a0797b")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("225f3bc1-65c0-4dc9-a8bb-354e24fb7019")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("13a096dd-315f-4247-ac13-6bf28c9f00e9")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGESIZEELEMENTS, value);
    }

    @objid ("fd03a492-d690-4c89-84e3-304cf56d949f")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("f5be23ef-afc7-4719-86ec-c651d9c70bfb")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("5f96f203-78c5-47de-b85a-97ff3602a48f")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("d3baa22e-2328-45eb-99d3-b20c25a7d95e")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("801b4d16-9b40-4d3b-8db6-eaca11a7023f")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, this.element);
    }

    @objid ("9cd0cb4d-c67b-4e53-a616-3da2a18f78d5")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_SENDSERVICES, value);
    }

    @objid ("4e27f5a3-77e6-44c7-9b14-06ac0dd7fa40")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, this.element);
    }

    @objid ("da8048bc-c195-4138-9b57-e8410aaee136")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_CLASSIFIER_MESSAGECOMRESOURCE_CLASSIFIER_RECEIVESERVICES, value);
    }

    @objid ("41c6b46e-d5d7-4292-9af6-7afe6267d574")
    public enum MessageResourceKind {
        MessageQueue,
        Pipe,
        Blackboard,
        Undef,
        Other;
    }

    @objid ("f83eecca-30ae-40cc-81ea-2fa10683a9eb")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
