package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwSchedulableResource_Class extends SwConcurrentResource_Class {
    public SwSchedulableResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER));
    }

    public SwSchedulableResource_Class(Class element) {
        super(element);
    }

    public boolean isisStaticSchedulingFeature() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE, this.element);
    }

    public void isisStaticSchedulingFeature(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE,value);
    }

    public boolean isisPreemptable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE, this.element);
    }

    public void isisPreemptable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE,value);
    }

    public String getschedulers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, this.element);
    }

    public void setschedulers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, value);
    }

    public String getdeadlineElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, this.element);
    }

    public void setdeadlineElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, value);
    }

    public String getdeadlineTypeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, this.element);
    }

    public void setdeadlineTypeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, value);
    }

    public String gettimeSliceElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, this.element);
    }

    public void settimeSliceElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, value);
    }

    public String getdelayServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, this.element);
    }

    public void setdelayServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, value);
    }

    public String getjoinServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, this.element);
    }

    public void setjoinServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, value);
    }

    public String getyieldServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, this.element);
    }

    public void setyieldServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, value);
    }

    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, this.element);
    }

    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, this.element);
    }

    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, value);
    }

    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, this.element);
    }

    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, value);
    }

}
