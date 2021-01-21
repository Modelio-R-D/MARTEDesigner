package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("21b5b6f7-e11b-45d5-bf68-c07724dd2fee")
public class GaExecHost_Instance extends ComputingResource_Instance {
    @objid ("257955aa-febf-47e9-a86b-19d14e9455ea")
    public GaExecHost_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_Instance"));
    }

    @objid ("cd4b67cb-8e61-4305-903c-9e72c68c5feb")
    public GaExecHost_Instance(Instance element) {
        super(element);
    }

    @objid ("c3445077-6248-4c12-8252-d05de23ad25e")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, this.element);
    }

    @objid ("b66bc114-b819-43fc-b943-177c403b3b71")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, value);
    }

    @objid ("c2f9bbd5-92e7-4d5a-a5f9-d5558636c2e3")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, this.element);
    }

    @objid ("62c5eb33-6a7f-41e9-8ec0-983ca63a337c")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, value);
    }

    @objid ("2400fcb7-9af8-4f66-bf78-a28b61329c75")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, this.element);
    }

    @objid ("e74bfa8f-36d9-429a-861b-e6ba1ba5917f")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, value);
    }

    @objid ("fc7425cd-2598-4cd3-b047-3aba606dc842")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, this.element);
    }

    @objid ("ab2ecdec-a3eb-40d4-ab7f-c4a516c810ff")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, value);
    }

    @objid ("e2167f2c-0bc8-403e-8e32-04a3bdcdf1f6")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, this.element);
    }

    @objid ("87bb6c8c-9753-40d8-b55c-1593c8b38817")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, value);
    }

    @objid ("d3337af1-75f6-45ad-aefe-8ab633bb26a2")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, this.element);
    }

    @objid ("c5843478-d22c-45a3-b4bb-9f971b466a50")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, value);
    }

    @objid ("e02af7a3-6975-47dc-8c62-e466e18aaddf")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("35d6b3a0-d0d8-4fe5-8017-7bbd25237d3a")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, value);
    }

    @objid ("9eda715e-a8bb-4ec0-81d3-f0ebc6e2b5b5")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("48295b72-9758-41d0-a84d-0b291f7a7018")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, value);
    }

    @objid ("1d3a6395-2219-42cb-bb04-055457efc664")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("5f2d3e42-9c16-41a8-9972-6863dc1136d1")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("16058bfb-a974-4d39-b46c-58398efa1344")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("44cc6053-a9f3-466f-9ea6-277ad309832a")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("9396db78-3e94-4de4-a318-d6ef5c9889eb")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("af505b01-a344-42e4-a1f5-fd30b005feb7")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("56ab35ec-dc38-4f1f-90cc-9fd8e4acf372")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("71fcbaff-5bdf-4050-9fe1-9625fe640f2f")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, value);
    }

    @objid ("903c77a0-34b2-4bff-b792-efb5b434a4e6")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    @objid ("e1ca0680-b621-4c4c-ba56-b67fdfe17361")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    @objid ("0db542d9-0f8b-47b4-aebc-74a820cfe87c")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, this.element);
    }

    @objid ("0fa8baab-8bbc-44c5-85da-929d4e3fab29")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, value);
    }

    @objid ("d975dfb5-5945-4f26-a097-150b94f6452a")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("767d3824-34b9-4aca-aad3-68385a636802")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("bb925f9e-c3b9-4151-b4c1-49e157e10111")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("d85b9576-6ba5-4dd2-99e2-d3a290de250d")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
