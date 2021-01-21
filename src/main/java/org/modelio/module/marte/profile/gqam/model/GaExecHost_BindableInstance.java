package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("595450d5-535f-4c38-8e70-5748ce922241")
public class GaExecHost_BindableInstance extends ComputingResource_BindableInstance {
    @objid ("8f810d53-71a8-40f9-ae17-3ac437e5eabf")
    public GaExecHost_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_BindableInstance"));
    }

    @objid ("ad3d95a9-72d0-46d6-a31a-1e9704f289d6")
    public GaExecHost_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("7d2a1f3e-9ea2-4197-a430-ce67f2c4cd43")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, this.element);
    }

    @objid ("2f9a622e-d521-452f-8aea-146a289b3e59")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMTXOVH, value);
    }

    @objid ("c6281793-2c47-45cc-9677-9d56fb35527b")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, this.element);
    }

    @objid ("2e9a6e8d-ba66-483e-ab7f-3dd037d1f1a0")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_COMMRCVOVH, value);
    }

    @objid ("1c55332c-548d-452d-baa1-74d4cbdf2fe7")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, this.element);
    }

    @objid ("8dbd7074-c6e3-4f68-a371-74962a761e06")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CNTXTSWT, value);
    }

    @objid ("c976dc06-6c17-436d-9d29-f986247acada")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, this.element);
    }

    @objid ("af087224-e81c-4c33-852d-98ae8a1d2b82")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_CLOCKOVH, value);
    }

    @objid ("bb844bc0-5335-4197-a59e-9ef6fb9cb442")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, this.element);
    }

    @objid ("8bbebcd2-3556-4b02-b71d-c7a548fddbb3")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPRIRANGE, value);
    }

    @objid ("f46c7077-3294-4651-806a-7800105d5cc3")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, this.element);
    }

    @objid ("152544d5-abf0-43f2-8c14-39dec70d4d80")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_MEMSIZE, value);
    }

    @objid ("12298a82-f757-495e-95e8-31af3f916698")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("16945fd2-1c3d-4ef0-ae1f-65e93a7f365b")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_UTILIZATION, value);
    }

    @objid ("7c71f0d4-16d4-4824-8001-f063665810ef")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("6ea1ecaa-d75f-43f1-9123-53825bcc96fe")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_THROUGHPUT, value);
    }

    @objid ("2fefc731-97de-458a-a8a5-101b6564bfe7")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("7f837995-2bd1-44ef-b825-7414b98403e7")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("97199b3b-9bb0-4bad-a743-8c5a3db92c77")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("1595b865-ec14-4409-9964-ca93bddfaed0")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("a9924ed4-1c1b-4a2c-ba28-2e2c4d66255d")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("c7fb6cac-eb59-4121-bbae-7e6afc18e90f")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("080f33f5-9638-4b38-815b-bb9523f43077")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("7905a299-f01d-43a9-930b-4db163720f9a")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULE, value);
    }

    @objid ("773c068d-2bd8-44e6-a12f-69b9ae560c55")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    @objid ("1467fafc-4db1-4df7-88f1-06398a51f3c6")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    @objid ("73c584b2-ca6e-4dca-8e67-bab2ff162ee3")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, this.element);
    }

    @objid ("cda6f0e3-d458-4d71-9241-ecb63feb72c7")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_HOST, value);
    }

    @objid ("4877d595-cf4b-48d9-b047-9f07ea4694dc")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("1adcab44-43c8-49a9-8f4f-f7396c83e1d9")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("3799f827-39eb-4a98-9e66-e78a343c4c10")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("156a31bd-8014-4a7e-b61f-3e89f1d7bcb5")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_INSTANCE_GAEXECHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
