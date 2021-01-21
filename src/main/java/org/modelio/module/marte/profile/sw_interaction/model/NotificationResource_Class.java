package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("11ea3e63-b126-49b6-9d84-fea29103359a")
public class NotificationResource_Class extends SwSynchronizationResource_Class {
    @objid ("69b6e681-a259-4428-9114-b761e0921412")
    public NotificationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("bc4df870-da4e-4b79-b712-de0da4616c15")
    public NotificationResource_Class(Class element) {
        super(element);
    }

    @objid ("630a0f95-ed94-4df4-bc7c-9f2b72ec5eb0")
    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, this.element);
    }

    @objid ("96820a90-063a-4ff8-9383-a3a449f4e570")
    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCE, value);
    }

    @objid ("9575aa61-65c1-42ae-aa03-5e0a96f21c9f")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, this.element);
    }

    @objid ("fc1e2ed6-2222-4717-86c1-ba209f15f70b")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MECHANISM, value);
    }

    @objid ("1fd4a33f-a74b-4d51-82a3-a8a0749d1419")
    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, this.element);
    }

    @objid ("cc7ae2a8-dc2f-45be-95ec-12034dc4afef")
    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_OCCURENCECOUNTELEMENTS, value);
    }

    @objid ("3f26e099-808a-4d04-b843-29b581f87465")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, this.element);
    }

    @objid ("9b629265-10d9-4253-8b77-d7e00cab2321")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_MASKELEMENTS, value);
    }

    @objid ("5d84e499-4150-4e2c-b0ab-4167a9167835")
    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, this.element);
    }

    @objid ("1b17fcb0-8ce6-4fb8-b668-761358156392")
    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_FLUSHSERVICES, value);
    }

    @objid ("865c584c-e73d-4d96-a772-87f287fc1152")
    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, this.element);
    }

    @objid ("330f2766-bbf2-4807-880e-3193668dd241")
    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_SIGNALSERVICES, value);
    }

    @objid ("7408f4ab-68d9-4423-9473-202e2cdb2959")
    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, this.element);
    }

    @objid ("c9506f80-e60b-4f9e-bcb0-b311b8ee25bd")
    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_WAITSERVICES, value);
    }

    @objid ("da97f1f0-eddd-483d-ad3c-e1f2596fddee")
    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, this.element);
    }

    @objid ("db985787-9df6-4c4a-ac3f-0cd7ccd146c5")
    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCE_CLASSIFIER_CLEARSERVICES, value);
    }

    @objid ("fedba17a-bcc8-4e7e-8044-23ad51b9c22c")
    public enum NotificationKind {
        Memorized,
        Bounded,
        Memoryless,
        Undef,
        Other;
    }

    @objid ("468c2d3d-6193-44c5-809a-6ecd302a184c")
    public enum NotificationResourceKind {
        Event,
        Barrier,
        Undef,
        Other;
    }

}
