package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d1fc8e96-ea04-4b35-8040-d2819674948b")
public class SwSchedulableResource_BindableInstance extends SwConcurrentResource_BindableInstance {
    @objid ("4598181a-148f-4bbb-a8de-18045f1b0004")
    public SwSchedulableResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwSchedulableResource_BindableInstance"));
    }

    @objid ("d51369b2-239d-4f53-b84b-d7aadcd0caf5")
    public SwSchedulableResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("fd8d0d7b-92cf-4fb3-bd20-0777a55e99f3")
    public boolean isisStaticSchedulingFeature() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE, this.element);
    }

    @objid ("b3172a68-af74-4e15-8df7-adb0d74253bb")
    public void isisStaticSchedulingFeature(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE,value);
    }

    @objid ("58ec319f-1757-453d-a5dd-28267e217d3b")
    public boolean isisPreemptable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE, this.element);
    }

    @objid ("65261f6a-67a5-4d5f-be7d-bec50f99b4d1")
    public void isisPreemptable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE,value);
    }

    @objid ("35791b7f-45cc-4104-a18d-a76c4227dbee")
    public String getschedulers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS, this.element);
    }

    @objid ("863b78ae-d6c5-4b4a-b790-17fbd905e0d7")
    public void setschedulers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS, value);
    }

    @objid ("96ea1728-facc-4fce-9021-07d19fa2e0f7")
    public String getdeadlineElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS, this.element);
    }

    @objid ("52c855e0-cbae-42f3-b4c9-2fdf7cbc284c")
    public void setdeadlineElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS, value);
    }

    @objid ("74f4cd9a-2785-4f0d-860a-171cafa0a39e")
    public String getdeadlineTypeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS, this.element);
    }

    @objid ("22e3a482-969c-466d-b2d4-9a04507c53a5")
    public void setdeadlineTypeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS, value);
    }

    @objid ("3d33a83d-1ee7-4bf5-b149-cbf4ffc13ece")
    public String gettimeSliceElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS, this.element);
    }

    @objid ("c33ffee5-e011-481a-9103-2f1345377399")
    public void settimeSliceElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS, value);
    }

    @objid ("48b46063-f156-4ae3-a0c5-3b0c7ed63bf9")
    public String getdelayServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES , this.element);
    }

    @objid ("fb4aa5be-ee4a-4d55-a138-c1aad743ab3d")
    public void setdelayServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES, value);
    }

    @objid ("2dc109d9-eac9-4f31-a7cd-db4f77d88713")
    public String getjoinServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES, this.element);
    }

    @objid ("c33bb3d0-345c-471b-99e6-f506f38d01ac")
    public void setjoinServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES, value);
    }

    @objid ("f7907b17-6571-4998-a0b5-9032b7a32104")
    public String getyieldServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES, this.element);
    }

    @objid ("0fcb954b-0e22-4b8b-9e68-851fb7c9f1ee")
    public void setyieldServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES, value);
    }

    @objid ("4a42f1db-bf31-4998-ab6f-ec5344765cfe")
    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, this.element);
    }

    @objid ("1830784f-feb8-46c2-aaf2-f743498b7586")
    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, value);
    }

    @objid ("0b695ba8-6fac-465e-90ae-c24a8932a65b")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST, this.element);
    }

    @objid ("e49fc80f-8f93-418b-bd44-fa0fa2c382a7")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST, value);
    }

    @objid ("c6ff2d8e-732c-443a-941c-cf2c59e2f6e6")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("1dcb17ea-ea12-4510-a8cb-b2a091f80ece")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER, value);
    }

}
