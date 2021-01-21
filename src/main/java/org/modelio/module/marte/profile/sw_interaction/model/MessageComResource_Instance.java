package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c652f0fa-0f83-41d3-afce-4da22d992d4e")
public class MessageComResource_Instance extends SwCommunicationResource_Instance {
    @objid ("4eaad179-d5e7-43d2-8a9f-734e42ac450e")
    public MessageComResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MESSAGECOMRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("MessageComResource_BindableInstance"));
    }

    @objid ("55c100af-713c-493c-a108-6050b12c6b6a")
    public MessageComResource_Instance(Instance element) {
        super(element);
    }

    @objid ("1fa7d4d7-3ef4-4073-8e54-d8d8eee3074f")
    public boolean isisFixedMessageSize() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE, this.element);
    }

    @objid ("c7b99ea3-6402-4258-8692-bf5401516563")
    public void isisFixedMessageSize(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_ISFIXEDMESSAGESIZE,value);
    }

    @objid ("528ea528-59db-4dd0-a3de-977fe4a0ba21")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("0a7f5291-ab9a-4b92-aaab-db14850867cf")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("eade0534-02b9-4e60-90d3-bfce1793c948")
    public String getmessageSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, this.element);
    }

    @objid ("f557854d-5b06-44ad-a072-02e2eb92c34e")
    public void setmessageSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGESIZEELEMENTS, value);
    }

    @objid ("b0f9db26-9ce6-4004-8c61-a1ff17113d28")
    public String getmessageQueueCapacityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, this.element);
    }

    @objid ("6fc0c6ed-33d6-4f5e-9bb9-1aeb9c3793c1")
    public void setmessageQueueCapacityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUECAPACITYELEMENTS, value);
    }

    @objid ("147e8362-339e-41b8-826e-5559a844e7e9")
    public String getmessageQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, this.element);
    }

    @objid ("c0ce5cd6-7dc0-4324-9a1b-a486f0fd7380")
    public void setmessageQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_MESSAGEQUEUEPOLICY, value);
    }

    @objid ("3ac00121-1d70-41f9-b443-2136aaa8c52a")
    public String getsendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, this.element);
    }

    @objid ("5917a8a3-082d-46f4-98d4-09cd54d7d152")
    public void setsendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_SENDSERVICES, value);
    }

    @objid ("7158b08c-bf61-415e-ab59-82a344b92e97")
    public String getreceiveServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, this.element);
    }

    @objid ("0c5c4eb6-b2fc-475c-9e68-29277bfc0ca4")
    public void setreceiveServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MESSAGECOMRESOURCE_INSTANCE_MESSAGECOMRESOURCE_INSTANCE_RECEIVESERVICES, value);
    }

}
