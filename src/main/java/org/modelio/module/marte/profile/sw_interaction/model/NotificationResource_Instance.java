package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51765bc6-d1b7-454d-85c4-6974799705cd")
public class NotificationResource_Instance extends SwSynchronizationResource_Instance {
    @objid ("8fec9aeb-2c0c-41f4-87a2-14bd33a83003")
    public NotificationResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NOTIFICATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("NotificationResource_Instance"));
    }

    @objid ("e8244e8f-e7bd-4885-baaa-f1537e1881f0")
    public NotificationResource_Instance(Instance element) {
        super(element);
    }

    @objid ("d2d0145e-92ad-4d73-b743-dca82955286f")
    public String getoccurence() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, this.element);
    }

    @objid ("5f5987bb-8036-4370-9f61-680be1a45dbc")
    public void setoccurence(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCE, value);
    }

    @objid ("31b8c809-8cf5-4d5d-8514-d2551e063489")
    public String getmechanism() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, this.element);
    }

    @objid ("2c472244-e335-466c-8a13-15f17d13efcd")
    public void setmechanism(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MECHANISM, value);
    }

    @objid ("aacb25a3-eabc-4cfb-a57a-ffa4c5865480")
    public String getoccurenceCountElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, this.element);
    }

    @objid ("92a58873-7b45-4755-8def-1260c91887a1")
    public void setoccurenceCountElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_OCCURENCECOUNTELEMENTS, value);
    }

    @objid ("5bfaec72-1867-4551-abb3-ea8d2f359234")
    public String getmaskElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, this.element);
    }

    @objid ("7dc508bc-e926-4b9d-902c-4c4ef694baa5")
    public void setmaskElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_MASKELEMENTS, value);
    }

    @objid ("a851f40f-1062-4e26-aeb9-d49216141994")
    public String getflushServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, this.element);
    }

    @objid ("9540200b-d926-44d7-a1ff-e99b7a248f3f")
    public void setflushServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_FLUSHSERVICES, value);
    }

    @objid ("ea220528-dc6e-438e-a162-af19b9f67949")
    public String getsignalServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, this.element);
    }

    @objid ("44af0989-a118-431e-aa34-0a1e7dd945ed")
    public void setsignalServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_SIGNALSERVICES, value);
    }

    @objid ("6e5a0ee5-72c0-4125-b2bf-324ca49fe098")
    public String getwaitServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, this.element);
    }

    @objid ("3b5d0e50-3642-49be-b570-981c1bedc879")
    public void setwaitServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_WAITSERVICES, value);
    }

    @objid ("c08b68d9-2215-49af-a456-3fcc5bfc25f9")
    public String getclearServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, this.element);
    }

    @objid ("75fbe519-81a3-4c1c-93a7-61add169b22e")
    public void setclearServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NOTIFICATIONRESOURCE_INSTANCE_NOTIFICATIONRESOURCE_INSTANCE_CLEARSERVICES, value);
    }

    @objid ("61c9ca4e-4392-46b9-89b4-f8370885547b")
    public enum NotificationKind {
        Memorized,
        Bounded,
        Memoryless,
        Undef,
        Other;
    }

    @objid ("1519a9f3-6be2-4f67-a22d-c5984b182d9b")
    public enum NotificationResourceKind {
        Event,
        Barrier,
        Undef,
        Other;
    }

}
