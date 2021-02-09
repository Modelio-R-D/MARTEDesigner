package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NotificationResource_BindableInstance extends SwSynchronizationResource_BindableInstance {
    public NotificationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("NotificationResource_BindableInstance"));
    }

    public NotificationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, this.element);
    }

    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, value);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, this.element);
    }

    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, value);
    }

    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, this.element);
    }

    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, value);
    }

    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, this.element);
    }

    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, value);
    }

    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, this.element);
    }

    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, value);
    }

    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, this.element);
    }

    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, value);
    }

}
