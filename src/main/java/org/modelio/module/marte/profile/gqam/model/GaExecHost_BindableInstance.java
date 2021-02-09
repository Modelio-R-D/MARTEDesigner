package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaExecHost_BindableInstance extends ComputingResource_BindableInstance {
    public GaExecHost_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_BindableInstance"));
    }

    public GaExecHost_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, this.element);
    }

    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, value);
    }

    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, this.element);
    }

    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, value);
    }

    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, this.element);
    }

    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, value);
    }

    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, this.element);
    }

    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, value);
    }

    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, this.element);
    }

    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, value);
    }

    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, this.element);
    }

    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, value);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, value);
    }

    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, value);
    }

    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, this.element);
    }

    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, value);
    }

    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, this.element);
    }

    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, value);
    }

    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
