package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NotificationResource_Class extends SwSynchronizationResource_Class {
    public NotificationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER));
    }

    public NotificationResource_Class(Class element) {
        super(element);
    }

    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, this.element);
    }

    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, value);
    }

    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, this.element);
    }

    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, value);
    }

    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, this.element);
    }

    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, value);
    }

    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, this.element);
    }

    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, value);
    }

    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, this.element);
    }

    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, value);
    }

    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, this.element);
    }

    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, value);
    }

    public enum NotificationKind {
        Memorized,
        Bounded,
        Memoryless,
        Undef,
        Other;
    }

    public enum NotificationResourceKind {
        Event,
        Barrier,
        Undef,
        Other;
    }

}
