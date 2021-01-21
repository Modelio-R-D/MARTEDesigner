package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e4346d03-cc71-4807-89df-585c147af9d3")
public class Scheduler_AssociationEnd extends Resource_AssociationEnd {
    @objid ("7f90d72f-dbaa-440a-b72f-268f1f067908")
    public Scheduler_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_ASSOCIATIONEND);
        element.setName(MARTEResourceManager.getName("Scheduler_AssociationEnd"));
        this.isisPreemptible(true);
    }

    @objid ("6bafa77b-5717-4c2e-82a5-3ed0ff98b802")
    public Scheduler_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("e77dd883-322e-431a-8410-3622ae6a641a")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE, this.element);
    }

    @objid ("4b86395e-a18d-4b4a-a384-b4465eccd0f2")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_ISPREEMPTIBLE,value);
    }

    @objid ("f14488d2-47af-4999-877f-b42de9630b7a")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY, this.element);
    }

    @objid ("bdf2c294-dcef-4aed-8597-6e9d437906aa")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDPOLICY, value);
    }

    @objid ("f7945957-3fad-48d0-a198-73c4fdc80a84")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("d723daa9-5483-4170-b75b-4c95d44e457d")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_OTHERSCHEDPOLICY, value);
    }

    @objid ("3fbc4182-514c-43de-a869-2a48fd93d483")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDULE, this.element);
    }

    @objid ("77464ec0-6017-442f-96f2-6a039dd03631")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDULE, value);
    }

    @objid ("1d404536-52b2-4c42-ac53-bdf5bb79ab2d")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS, this.element);
    }

    @objid ("38744ca2-8111-4601-9904-9a7c775db1df")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROCESSINGUNITS, value);
    }

    @objid ("e85f387a-e423-4b88-a5a4-39f3adf27851")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_HOST, this.element);
    }

    @objid ("3947b8e2-fda2-446e-b52b-acdd746a39f0")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_HOST, value);
    }

    @objid ("df48e464-11ad-4d8f-b767-c8f2c9827cd8")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("37667b60-8a9d-4f2f-9111-20b21260a64e")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("2f5f4ee3-1001-4c0b-92a7-4fca0e295c5e")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("267327b8-a8c6-404d-a916-0c346d3c2150")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_SCHEDULABLERESOURCES, value);
    }

}
