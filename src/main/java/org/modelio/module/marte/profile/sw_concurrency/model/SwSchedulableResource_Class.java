package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ce985e96-9de5-4501-acb1-2987b7bd529e")
public class SwSchedulableResource_Class extends SwConcurrentResource_Class {
    @objid ("8d0c0c97-ddcd-44e0-8862-0accf46b27dd")
    public SwSchedulableResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER));
    }

    @objid ("cf912cad-5dd9-491b-be6e-25fcbe7cd154")
    public SwSchedulableResource_Class(Class element) {
        super(element);
    }

    @objid ("9eb0b7c5-a02f-4002-b2ce-5800f6dd2740")
    public boolean isisStaticSchedulingFeature() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE, this.element);
    }

    @objid ("cffd6357-2d98-4ff8-a805-ec3247f17231")
    public void isisStaticSchedulingFeature(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE,value);
    }

    @objid ("79f9883d-d495-4663-a732-9d8a988527ad")
    public boolean isisPreemptable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE, this.element);
    }

    @objid ("d818618a-2b96-4c16-8b3f-a2f8e503f7b7")
    public void isisPreemptable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE,value);
    }

    @objid ("6aaf2cd8-b375-417d-a852-f6a51e375821")
    public String getschedulers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, this.element);
    }

    @objid ("b0f105c7-54e5-4f6b-a9e2-bf6c05accc81")
    public void setschedulers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, value);
    }

    @objid ("5511e10b-7d2e-41d3-98c6-f2538d52f02f")
    public String getdeadlineElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, this.element);
    }

    @objid ("95f94dd9-bebf-4be7-9030-8768f88fd674")
    public void setdeadlineElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, value);
    }

    @objid ("ce19f7b4-6fa0-4d63-92ff-48cccebb7545")
    public String getdeadlineTypeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, this.element);
    }

    @objid ("b534a75e-8422-42dc-9ae3-2f221c42cc88")
    public void setdeadlineTypeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, value);
    }

    @objid ("71bbc89f-a1cf-424b-b923-71e28ba9071b")
    public String gettimeSliceElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, this.element);
    }

    @objid ("5e6c5de4-ff32-4c87-a0e0-243f2f82150b")
    public void settimeSliceElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, value);
    }

    @objid ("4ec34ff3-3807-45ce-b134-42b0d80f27ed")
    public String getdelayServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, this.element);
    }

    @objid ("58d921ae-b3de-42a8-b743-79dd80129810")
    public void setdelayServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, value);
    }

    @objid ("877724cf-d0b5-4ab7-812f-d88e7c4f6be4")
    public String getjoinServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, this.element);
    }

    @objid ("84733c2f-3ed6-462c-8a05-d29e9b389c25")
    public void setjoinServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, value);
    }

    @objid ("1e2ba945-f2ce-4c97-b873-266feceb7483")
    public String getyieldServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, this.element);
    }

    @objid ("f3f12b09-7574-4b6a-9df7-5fb263ade1a1")
    public void setyieldServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, value);
    }

    @objid ("6d0f6a1d-7795-4776-8482-5ed92d3e4a03")
    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, this.element);
    }

    @objid ("f9f7b338-d70a-4367-b8e8-3d4103bb76a6")
    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, value);
    }

    @objid ("3efd0cc3-aacc-4b25-8b78-81f0dd6beed1")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, this.element);
    }

    @objid ("ccb6d50d-214f-4bf6-bab7-d0848dec80e3")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, value);
    }

    @objid ("cda64bc8-cd80-4b9f-ad66-f066b482f1e6")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("e63a7601-2061-4c58-8ae3-6aa8dca46945")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, value);
    }

}
