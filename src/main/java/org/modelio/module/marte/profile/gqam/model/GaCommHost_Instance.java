package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommHost_Instance extends CommunicationMedia_Instance {
    public GaCommHost_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_Instance"));
    }

    public GaCommHost_Instance(Instance element) {
        super(element);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, value);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, value);
    }

    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, value);
    }

    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, this.element);
    }

    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, value);
    }

    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, this.element);
    }

    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, value);
    }

    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
