package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("306f25c5-ec1c-49a4-84a5-a7992cd3b838")
public class GaExecHost_AssociationEnd extends ComputingResource_AssociationEnd {
    @objid ("07d6090c-dde5-471a-ab2e-466d4e2dfc1d")
    public GaExecHost_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_AssociationEnd"));
    }

    @objid ("0de48fec-2796-4a9d-a2fe-e27adbf6d565")
    public GaExecHost_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("3458a925-9d95-4238-be05-a3c212ac13d3")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMTXOVH, this.element);
    }

    @objid ("971795e8-f070-478c-93b2-c3efaad66e37")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMTXOVH, value);
    }

    @objid ("8180fba3-1628-4e25-ad12-a7771ed08786")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH, this.element);
    }

    @objid ("383dac2d-5a77-4ae0-b39d-5d3d5b07ccc2")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_COMMRCVOVH, value);
    }

    @objid ("e8f5ec01-132e-4684-b89b-8012868a1f2b")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CNTXTSWT, this.element);
    }

    @objid ("bb5e98d8-f7d7-4134-828d-80a469b58105")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CNTXTSWT, value);
    }

    @objid ("9026fa3f-cfa6-4ead-b314-55996b4990e7")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CLOCKOVH, this.element);
    }

    @objid ("68a45560-b4cd-4071-9298-3aeb4a4966aa")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_CLOCKOVH, value);
    }

    @objid ("a4a7b195-f045-4a91-a4ae-613062e8cc29")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE, this.element);
    }

    @objid ("beb99b81-5767-4c1d-9f6c-821ffab2a93a")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPRIRANGE, value);
    }

    @objid ("9efb2c36-fe9c-48ad-b237-676fbef536ff")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_MEMSIZE, this.element);
    }

    @objid ("69ab7e98-3916-4a34-a40b-67584ceebc26")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_MEMSIZE, value);
    }

    @objid ("072fe108-cb64-4caf-a32e-516630c49f89")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_UTILIZATION, this.element);
    }

    @objid ("03be3f82-9cf2-4d58-9f01-d6a587eb8329")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_UTILIZATION, value);
    }

    @objid ("98a1e91c-cacd-418f-8b7f-9dd51eb07b69")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_THROUGHPUT, this.element);
    }

    @objid ("0fcc391d-2405-418d-9d43-2d4be110e059")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_THROUGHPUT, value);
    }

    @objid ("bf60324c-2089-4aad-9a24-cfa1845394b5")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE, this.element);
    }

    @objid ("deb68ff4-9feb-4910-878e-e65d86e3575c")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_ISPREEMPTIBLE,value);
    }

    @objid ("1f8a20f7-8d0b-43e2-ad16-0bf488bffb55")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY, this.element);
    }

    @objid ("4115b19a-4003-444e-b3e2-f42f7d6478ea")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDPOLICY, value);
    }

    @objid ("495f244e-edcb-497e-9431-3da6f92d3346")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("b891861d-9fee-4f60-9b43-b2ed5a284084")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, value);
    }

    @objid ("6a7fdf1a-f28c-48fe-bc97-58f191aaf019")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULE, this.element);
    }

    @objid ("7d0b9105-9d35-403c-bf3e-5a6f66e0fb1f")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULE, value);
    }

    @objid ("1567ac44-594f-4603-8bdf-84b41e01e0ea")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS, this.element);
    }

    @objid ("1f6cae4e-01b5-444c-af81-a9323d540955")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROCESSINGUNITS, value);
    }

    @objid ("1ac63613-0b58-4019-bb0d-7d895fc1139b")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_HOST, this.element);
    }

    @objid ("01f665a5-76d7-4b6a-a7ad-3b3054f7f4f3")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_HOST, value);
    }

    @objid ("e5069617-d80e-4002-91c8-256cef3386cc")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("43289e48-2d8c-4555-a65b-71a203ba0ea0")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("4d65d131-cc6f-433b-b72a-34c23feaa2e6")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("23a5e774-057e-4aa3-8e08-9123305335a5")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ASSOCIATIONEND_GAEXECHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, value);
    }

}
