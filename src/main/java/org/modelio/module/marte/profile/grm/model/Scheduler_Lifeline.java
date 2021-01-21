package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c4c477bb-b55f-4c95-8d7d-dff6b72b9a3a")
public class Scheduler_Lifeline extends Resource_Lifeline {
    @objid ("707bd18a-4679-4fe1-bbf9-3e58a4707946")
    public Scheduler_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_LIFELINE);
        element.setName(MARTEResourceManager.getName("Scheduler_Lifeline"));
        this.isisPreemptible(true);
    }

    @objid ("deff7e80-c483-408d-9adb-5f1938da6924")
    public Scheduler_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("c271a2bc-ab11-48de-81ed-d84fe5f47d1c")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_ISPREEMPTIBLE, this.element);
    }

    @objid ("adbdab2d-cc49-4e79-bdf1-0d048b993911")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_ISPREEMPTIBLE,value);
    }

    @objid ("73e3b418-f7b9-460c-a3f4-d67d31502ec4")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDPOLICY, this.element);
    }

    @objid ("0d5f27fd-bb10-401b-bebd-c1c0b6ebea79")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDPOLICY, value);
    }

    @objid ("b1fe0d87-79de-4f9b-a0de-b0ddf2940fdd")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("8a46e37a-b661-426e-b38a-70f4c8ab5cab")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_OTHERSCHEDPOLICY, value);
    }

    @objid ("84e686d8-a73d-46ac-9edf-2ab65a967fc6")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDULE, this.element);
    }

    @objid ("2966d3eb-3bb8-4ed2-bae2-276649686e7c")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDULE, value);
    }

    @objid ("8cdb0dfd-3e9c-4dcf-8d51-224e051e5a1c")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROCESSINGUNITS, this.element);
    }

    @objid ("c2881dc3-88c5-4919-9729-a8c27bcd369b")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROCESSINGUNITS, value);
    }

    @objid ("b6e0e2f8-9d61-4053-93e8-096a20c0887d")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_HOST, this.element);
    }

    @objid ("edc6776f-5ded-4e54-bfea-880d37879151")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_HOST, value);
    }

    @objid ("47738b99-56b2-4211-9a99-a582b422258f")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("db056fe5-bdb7-4866-94cc-aa78ed855636")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("2aaaf6f0-1ac3-4468-9045-6511978f0985")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("238fc3e1-1ce7-4634-8adf-31f7bc28c4a8")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_SCHEDULABLERESOURCES, value);
    }

}
