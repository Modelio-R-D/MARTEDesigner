package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("099f90a5-9e18-406c-bc71-9b7aa5f31b20")
public class GaExecHost_Parameter extends ComputingResource_Parameter {
    @objid ("7280c589-8626-414d-9cff-e5d37ca5dee7")
    public GaExecHost_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_Parameter"));
    }

    @objid ("009eb440-5b57-48fd-8025-1ffa0d86cac5")
    public GaExecHost_Parameter(Parameter element) {
        super(element);
    }

    @objid ("c2c9f99b-b1a1-437d-82e8-194487799d07")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_COMMTXOVH, this.element);
    }

    @objid ("89844c80-5a20-4a6d-960f-d38655a90366")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_COMMTXOVH, value);
    }

    @objid ("7e13320f-532c-45c0-a977-9230b0bc6564")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_COMMRCVOVH, this.element);
    }

    @objid ("8f30e48d-6bfb-40b8-a730-9db587fe865a")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_COMMRCVOVH, value);
    }

    @objid ("8e763398-4ad6-40d6-950f-46c044f0794d")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_CNTXTSWT, this.element);
    }

    @objid ("db77908d-80e0-4efe-93c8-8b3728c77b9b")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_CNTXTSWT, value);
    }

    @objid ("cd6a0ce5-bfe7-464c-9ae6-f21a1c5a4789")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_CLOCKOVH, this.element);
    }

    @objid ("b98cda51-a2e1-4b14-ade1-6ef5a3f3bda2")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_CLOCKOVH, value);
    }

    @objid ("efecf46e-8055-4c9f-b249-048a4583446f")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDPRIRANGE, this.element);
    }

    @objid ("2c4d4433-6809-4987-9f80-e1646668a5c8")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDPRIRANGE, value);
    }

    @objid ("c8d95510-eae0-43ec-a0a2-d07103d0f340")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_MEMSIZE, this.element);
    }

    @objid ("97da17fd-2beb-41cd-a0bc-74898e0db831")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_MEMSIZE, value);
    }

    @objid ("bde748ed-42a0-4ac3-b33a-bb3701f3009b")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_UTILIZATION, this.element);
    }

    @objid ("66aff5bc-c788-4233-a619-0d446c74355d")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_UTILIZATION, value);
    }

    @objid ("24eef604-4942-400e-b5e2-8826adc36fc9")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_THROUGHPUT, this.element);
    }

    @objid ("2d61fad6-f442-4679-9c97-a51f11c30c8a")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_THROUGHPUT, value);
    }

    @objid ("4e7b1b93-3fcd-432b-a175-ac04a4bdbfac")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_ISPREEMPTIBLE, this.element);
    }

    @objid ("bd9f8e31-d3a4-4d4e-8304-a16a86545f2f")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_ISPREEMPTIBLE,value);
    }

    @objid ("257d1835-0412-4b5a-9b04-2acfb7a870da")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDPOLICY, this.element);
    }

    @objid ("82484b10-42ca-41bf-91a6-04205756df58")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDPOLICY, value);
    }

    @objid ("3f8746f0-9d59-4889-b4c6-6bb1857f0afe")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("4010f445-69bc-4c39-9113-11fc92bb2a86")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_OTHERSCHEDPOLICY, value);
    }

    @objid ("1e47783f-5c79-40bd-8af6-df5e8fa2a9d9")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDULE, this.element);
    }

    @objid ("ef2d5d97-e5e5-47df-9f98-a10a3d3fed5f")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDULE, value);
    }

    @objid ("d2790da7-b051-48dd-8e18-f3b8e945de0a")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_PROCESSINGUNITS, this.element);
    }

    @objid ("38c9ebfe-bfa7-4342-8182-8e0b668fa92d")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_PROCESSINGUNITS, value);
    }

    @objid ("5df12f31-e340-412b-b626-fbaac5029b02")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_HOST, this.element);
    }

    @objid ("9a70a65b-db8e-4d04-ab0c-776c08945002")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_HOST, value);
    }

    @objid ("c4b0629f-39f2-45e4-860d-971d1b199403")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("21545ca8-609a-4a32-b857-c79a20b01556")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("70a24bc7-e09e-48ee-9033-a7696536e64e")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("d05b0d07-a79f-4f90-ad85-580af7335862")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_PARAMETER_GAEXECHOST_PARAMETER_SCHEDULABLERESOURCES, value);
    }

}
