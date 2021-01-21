package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d1d1d0b8-995f-4c91-9c9e-a0bbe0a80f54")
public class MessageComResource_Association {
    @objid ("398a96d8-7697-4b3e-929f-8d30579e4051")
    protected Association element;

    @objid ("f689051f-1251-45e3-a2ac-16ce3a8b9a4f")
    public MessageComResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("MessageComResource_Association"));
    }

    @objid ("c618d7f1-812c-410a-8069-a3501078e61c")
    public MessageComResource_Association(Association element) {
        this.element = element;
    }

    @objid ("f721de0a-261e-4ebe-83d1-60c0e0b0ac72")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(this.element, source, destination);
    }

    @objid ("6e64acb8-b868-47b1-9d08-d9f607a6662e")
    public Association getElement() {
        return this.element;
    }

    @objid ("47b87403-5f55-46ce-9e47-0ee3faa1f285")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("f4ef07d4-7cf2-42de-91c1-fe6b1321a27b")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("6e0022f5-849d-48a8-a120-1d4de0359797")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, this.element);
    }

    @objid ("3a1de4bf-8584-4c5b-b323-08a4d31801cd")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MECHANISM, value);
    }

    @objid ("3bc898fa-29ff-42c7-a508-036884b40113")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("18407483-5c55-4cc5-8670-824cbd5db62f")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGESIZEELEMENTS, value);
    }

    @objid ("da049db5-bc1b-46e2-9140-5358d34cc566")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("d1b7b3ca-7a34-421b-9b4c-83428af929fa")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("746ebff6-1b4f-4452-afc1-d6290d9ea263")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("5bfcc673-789a-4db4-b339-9d06b5724e15")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("b997e7b2-fb77-4945-9908-9d858891e1e6")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES, this.element);
    }

    @objid ("02ca01f2-3b8b-44e2-8658-14ffd6f70334")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_SENDSERVICES, value);
    }

    @objid ("e6182061-97f3-4494-a200-6f67243b995d")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES, this.element);
    }

    @objid ("54599111-4201-43be-b970-c81206d9423d")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_ASSOCIATION_MESSAGECOMRESOURCE_ASSOCIATION_RECEIVESERVICES, value);
    }

    @objid ("39d1eb64-75a3-4c58-9cc6-9ce4a1313b3b")
    public enum MessageResourceKind {
        MessageQueue,
        Pipe,
        Blackboard,
        Undef,
        Other;
    }

    @objid ("14d7ec7d-0e9b-4c6f-a4f0-618e94068648")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
