package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8129b019-43d9-4a96-b9d5-799039cdc99f")
public class Scheduler_Parameter extends Resource_Parameter {
    @objid ("51f221d6-48e3-483c-a7f9-2ed922ae8269")
    public Scheduler_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_PARAMETER);
        element.setName(MARTEResourceManager.getName("Scheduler_Parameter"));
        this.isisPreemptible(true);
    }

    @objid ("d37819f3-33c5-4068-8427-7118f75bb21a")
    public Scheduler_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("3b25e90f-d4e3-4360-856e-7e8da269aa12")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_ISPREEMPTIBLE, this.element);
    }

    @objid ("2b9daf05-567d-430b-b2ee-d655ca3ad79a")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_ISPREEMPTIBLE,value);
    }

    @objid ("6c1786a4-74a1-4cd2-83ea-510f628248a4")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDPOLICY, this.element);
    }

    @objid ("25d7a5c4-eabb-41be-b82b-93bb6d813698")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDPOLICY, value);
    }

    @objid ("2ee73e49-4217-4c30-9c9a-2d35d5545ca3")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("79c5a8e2-ac1a-4f85-8fc3-4b5d7e6a40d6")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_OTHERSCHEDPOLICY, value);
    }

    @objid ("9ad376ad-d2ca-4687-83a3-a128322f6a1f")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDULE, this.element);
    }

    @objid ("aa3fc1c0-b44e-4718-9acf-fc21c02a5e5a")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDULE, value);
    }

    @objid ("5ffd61d2-f685-4999-bad7-c917b31ad8be")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROCESSINGUNITS, this.element);
    }

    @objid ("c1d06992-03c1-46e0-b5f4-6214bea030b1")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROCESSINGUNITS, value);
    }

    @objid ("659ab48e-6d74-4df3-b79a-163def76949b")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_HOST, this.element);
    }

    @objid ("bc4894ab-9e48-45ce-9cf3-94a333a4abef")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_HOST, value);
    }

    @objid ("99b0f402-f512-4625-a343-d3bf49ad62ff")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("a66480a3-eaa9-4573-8377-d62d346fb97f")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("48a57641-fd98-4d64-8f69-e7bfa7013d5f")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("aa0fcb58-2b2a-4fae-9423-d550dc0ef2a8")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_SCHEDULABLERESOURCES, value);
    }

}
