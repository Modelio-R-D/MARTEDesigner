package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaExecHost_Association {
    protected Association element;

    public GaExecHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("GaExecHost_Association"));
    }

    public GaExecHost_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, this.element);
    }

    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMTXOVH, value);
    }

    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, this.element);
    }

    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_COMMRCVOVH, value);
    }

    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, this.element);
    }

    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CNTXTSWT, value);
    }

    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, this.element);
    }

    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_CLOCKOVH, value);
    }

    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, this.element);
    }

    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPRIRANGE, value);
    }

    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, this.element);
    }

    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_MEMSIZE, value);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_UTILIZATION, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_THROUGHPUT, value);
    }

    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE, this.element);
    }

    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_ISPREEMPTIBLE,value);
    }

    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, this.element);
    }

    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDPOLICY, value);
    }

    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, this.element);
    }

    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_OTHERSCHEDPOLICY, value);
    }

    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, this.element);
    }

    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULE, value);
    }

    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, this.element);
    }

    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROCESSINGUNITS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, this.element);
    }

    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_HOST, value);
    }

    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, this.element);
    }

    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, value);
    }

    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, this.element);
    }

    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATION_GAEXECHOST_ASSOCIATION_SCHEDULABLERESOURCES, value);
    }

}
