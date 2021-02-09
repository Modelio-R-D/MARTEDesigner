package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaExecHost_Lifeline extends ComputingResource_Lifeline {
    public GaExecHost_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_Lifeline"));
    }

    public GaExecHost_Lifeline(Lifeline element) {
        super(element);
    }

    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, this.element);
    }

    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, value);
    }

    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, this.element);
    }

    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, value);
    }

    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, this.element);
    }

    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, value);
    }

    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, this.element);
    }

    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, value);
    }

    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, this.element);
    }

    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, value);
    }

    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, this.element);
    }

    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, value);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, value);
    }

    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE, this.element);
    }

    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE,value);
    }

    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, this.element);
    }

    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, value);
    }

    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, this.element);
    }

    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, value);
    }

    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, this.element);
    }

    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, value);
    }

    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, this.element);
    }

    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, this.element);
    }

    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, value);
    }

    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, value);
    }

    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, this.element);
    }

    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, value);
    }

}
