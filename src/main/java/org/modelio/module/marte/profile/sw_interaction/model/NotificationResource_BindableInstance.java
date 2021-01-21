package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b4420c8f-8336-42ba-a3ad-4c7b97fc4a85")
public class NotificationResource_BindableInstance extends SwSynchronizationResource_BindableInstance {
    @objid ("45824a63-f282-42f2-b02c-52293bf53b2c")
    public NotificationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("NotificationResource_BindableInstance"));
    }

    @objid ("856c6a37-da1b-419c-b3a1-2379a2dcdbf6")
    public NotificationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("001af5fd-465b-4e97-823c-7bf5b05fb10f")
    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, this.element);
    }

    @objid ("e9af6741-5f77-493e-b007-694991139059")
    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, value);
    }

    @objid ("83b66e5e-a38b-4237-b563-c433aa064e78")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("73ddae64-b037-443c-ad9c-894af6a900e5")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("a0dc6a48-3eb9-431e-9a42-8c4a9e722e7c")
    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, this.element);
    }

    @objid ("a2ff9c22-a587-4dcf-a94b-de4fd0179173")
    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, value);
    }

    @objid ("7b011813-e921-40d3-a63b-5f79fd163cc2")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    @objid ("bf888a27-4fb2-4d10-8177-95295cfb460b")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    @objid ("2b91aba8-e7fe-4796-8c1a-ae3347ee2d4d")
    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, this.element);
    }

    @objid ("3ff03b59-0fff-43f6-ad39-57123139389d")
    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, value);
    }

    @objid ("46a3ed38-80f1-4c39-a5cc-0a0f16d6239d")
    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, this.element);
    }

    @objid ("80294f51-8e68-4356-a699-0d5ca211ff5b")
    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, value);
    }

    @objid ("d4fcbe18-cbf9-4422-a6e8-f0f540e5d107")
    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, this.element);
    }

    @objid ("2d47b097-d7fd-48ed-a7a8-6047274e0ee8")
    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, value);
    }

    @objid ("b55758d9-bf22-4049-a9b8-b472ed11013e")
    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, this.element);
    }

    @objid ("ebe9c7b1-7059-45ff-998f-760e2a531944")
    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, value);
    }

}
