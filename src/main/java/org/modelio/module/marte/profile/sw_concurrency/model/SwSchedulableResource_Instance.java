package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b1066d46-6398-4d80-af80-14e5ee348fa4")
public class SwSchedulableResource_Instance extends SwConcurrentResource_Instance {
    @objid ("9048abe4-8fcd-4375-94d9-9d0823ad3f2e")
    public SwSchedulableResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwSchedulableResource_Instance"));
    }

    @objid ("2846f9af-a486-4ec9-9d7c-b652ab8057e9")
    public SwSchedulableResource_Instance(Instance element) {
        super(element);
    }

    @objid ("2f09f04e-f434-49ba-9ef3-66d510d7708e")
    public boolean isisStaticSchedulingFeature() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE, this.element);
    }

    @objid ("2d7ad2de-df05-4250-ac13-9185f109e693")
    public void isisStaticSchedulingFeature(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE,value);
    }

    @objid ("7419ae36-a15e-4ab6-a992-401ebb6c8ed3")
    public boolean isisPreemptable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE, this.element);
    }

    @objid ("4f3f3bfb-84e4-4385-b5cf-72dc06328164")
    public void isisPreemptable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE,value);
    }

    @objid ("5d2ff689-b524-4813-bb1b-f40a28de7989")
    public String getschedulers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS, this.element);
    }

    @objid ("3ed036dc-fa3a-4434-804f-3642006d6dbf")
    public void setschedulers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS, value);
    }

    @objid ("03b570ce-317b-485f-839f-64594ddb13b9")
    public String getdeadlineElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS, this.element);
    }

    @objid ("30866081-35e3-4727-b849-38d9bf87a309")
    public void setdeadlineElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS, value);
    }

    @objid ("42d6a655-c8da-471b-8f37-c4932192b541")
    public String getdeadlineTypeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS, this.element);
    }

    @objid ("e7c62c99-824c-4cf4-b23e-e5504491b4bf")
    public void setdeadlineTypeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS, value);
    }

    @objid ("65adcf91-dffe-421a-ae80-74ef279726eb")
    public String gettimeSliceElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS, this.element);
    }

    @objid ("e54343fc-517e-49b2-ac34-032d83869549")
    public void settimeSliceElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS, value);
    }

    @objid ("e4104314-ef5a-41dc-a5f2-7a1e29822eff")
    public String getdelayServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES, this.element);
    }

    @objid ("b0b5ce8c-17e7-40b1-aa4f-4120e9f82d83")
    public void setdelayServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES, value);
    }

    @objid ("ec72d934-8626-40b9-8851-e6ab9b461481")
    public String getjoinServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES, this.element);
    }

    @objid ("331211a9-505e-451f-a6ce-19c5598b1fe6")
    public void setjoinServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES, value);
    }

    @objid ("bc461233-7320-4a3a-b09a-e9da7f386d49")
    public String getyieldServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES, this.element);
    }

    @objid ("d6bf4a20-9c53-46c2-864c-7d041e08193d")
    public void setyieldServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES, value);
    }

    @objid ("b9b69d1a-37be-4672-ac40-8a4982ccbd3b")
    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, this.element);
    }

    @objid ("b549a6f8-f8f9-41a8-8c92-c8a2ef9d59ba")
    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, value);
    }

    @objid ("e127f23f-47df-47fc-8ae2-82e3ba1e12ff")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST, this.element);
    }

    @objid ("b5c20d85-7de5-43ac-886e-4de4f918ac13")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST, value);
    }

    @objid ("bfb6a90b-4b90-47d1-8077-baaa1fe7cf01")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("a19d9719-3ca6-449f-8fbf-2430b17f9e99")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, value);
    }

}
