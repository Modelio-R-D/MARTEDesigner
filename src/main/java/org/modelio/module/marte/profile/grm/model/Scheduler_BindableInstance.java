package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4050151c-d708-4c6e-8abe-e12660bcc18a")
public class Scheduler_BindableInstance {
    @objid ("fc818b6c-cd46-4df2-86c5-7669836dfac4")
    protected BindableInstance element;

    @objid ("0aa4288c-a9bf-40e9-b09c-63f982b8c0ea")
    public Scheduler_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("Scheduler_BindableInstance"));
        this.isisPreemptible(true);
    }

    @objid ("78a0681a-b312-4ef1-ba8f-e7eeb4a4fcf8")
    public Scheduler_BindableInstance(final BindableInstance element) {
        this.element = element;
    }

    @objid ("86ca4afd-1392-44c0-acca-f6a7f794e879")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("94fa0e18-303d-401d-894d-d9376d8ad5e9")
    public void setParent(final Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("aa96d530-8caf-4cfa-bd20-ccfca9d40687")
    public void setParent(final Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("ea1b3854-4ab8-4f6d-9ac0-c708b927a8c3")
    public void setParent(final NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("6d7ec238-d8f8-44cb-af61-65e52535eb08")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("51e686ba-d7bd-4c1c-ba17-31147de2c428")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("7220dbdb-68ab-4114-9e78-3815cf84115b")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("fdee2af1-c7cd-40c4-88d4-c4e368cb4d87")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("b7fcd969-30df-4991-b2a6-ee70734b37ed")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("13f623e7-fd2b-4694-8526-b67f1c432c52")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("b16a99d6-c3a9-4f66-a1eb-66e56a891a1a")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("d4050b53-1072-40de-b7ed-b3a4dda43568")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("5ddb14c9-b836-4032-bdc6-b20d5c9aed0f")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULE, value);
    }

    @objid ("88caa2cf-82e4-470f-a22b-e52739802a55")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROCESSINGUNITS, this.element);
    }

    @objid ("62694ec1-dec2-4735-9986-9c2d0d96df0c")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROCESSINGUNITS, value);
    }

    @objid ("4230be4d-45f6-4fb8-b5d6-50e43710d481")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_HOST, this.element);
    }

    @objid ("d6f9c233-add2-43df-8840-4b8795065c0a")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_HOST, value);
    }

    @objid ("598c4ea2-d30c-4d46-b8b3-615c4b66c429")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("b670116b-8b3e-411a-8629-e41da8bcd881")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("a19e99cb-9637-4177-89fb-190acb432e24")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("0cd8c199-3e11-4141-bdf6-5a2b5d0996ee")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
