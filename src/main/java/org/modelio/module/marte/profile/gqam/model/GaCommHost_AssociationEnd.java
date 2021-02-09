package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommHost_AssociationEnd extends CommunicationMedia_AssociationEnd {
    public GaCommHost_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_AssociationEnd"));
    }

    public GaCommHost_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_THROUGHPUT, this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_THROUGHPUT, value);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_UTILIZATION, this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_UTILIZATION, value);
    }

    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE, this.element);
    }

    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE,value);
    }

    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY, this.element);
    }

    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY, value);
    }

    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, this.element);
    }

    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, value);
    }

    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULE, this.element);
    }

    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULE, value);
    }

    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS, this.element);
    }

    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS, value);
    }

    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_HOST, this.element);
    }

    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_HOST, value);
    }

    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, this.element);
    }

    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, value);
    }

    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, this.element);
    }

    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, value);
    }

}
