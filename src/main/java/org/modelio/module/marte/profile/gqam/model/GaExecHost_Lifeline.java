package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("17eba25b-43a5-4d4a-b219-9113d89d5f72")
public class GaExecHost_Lifeline extends ComputingResource_Lifeline {
    @objid ("a4e0cc05-19de-4b24-965c-43b53ecc1fd4")
    public GaExecHost_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_Lifeline"));
    }

    @objid ("3078f0bd-d239-4862-a0f4-dcef9b2e2067")
    public GaExecHost_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("73f19f0c-d240-4043-bed4-0dc9d3fa3d77")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, this.element);
    }

    @objid ("70f0f17a-55ab-40c4-9cc2-3f98afd6052b")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMTXOVH, value);
    }

    @objid ("32d093d5-45cb-4e1c-9e72-5a8498d88537")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, this.element);
    }

    @objid ("d56c8de2-6396-41c8-877d-22f0e58fa16d")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_COMMRCVOVH, value);
    }

    @objid ("9fb8c53c-885d-403e-95fb-5c90476eb7e9")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, this.element);
    }

    @objid ("245fd2c4-3d58-400a-843e-3b46b7732035")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CNTXTSWT, value);
    }

    @objid ("ba7c0edf-2cb4-44af-86af-0c7acefdc6e2")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, this.element);
    }

    @objid ("e0b548fb-c0a0-440e-adff-c911899109b0")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_CLOCKOVH, value);
    }

    @objid ("66b39c70-1346-4c3a-ba5a-a214276dc920")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, this.element);
    }

    @objid ("ced36412-4798-46da-9f7a-b5fc3d47d710")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPRIRANGE, value);
    }

    @objid ("ab29ffc3-cb2b-4b0b-af4f-850c8a02a1cf")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, this.element);
    }

    @objid ("1b11b8fc-b6a5-471b-a02c-995a44f33053")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_MEMSIZE, value);
    }

    @objid ("3dcc6636-918e-4ced-bdf2-8cca7c14d757")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, this.element);
    }

    @objid ("44d9c100-0eb4-4990-93e7-b9b5ee8aeb23")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_UTILIZATION, value);
    }

    @objid ("3b420cab-6a60-4be2-866f-eedab404752d")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, this.element);
    }

    @objid ("b3af2b84-9298-40bf-8263-7b567a115201")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_THROUGHPUT, value);
    }

    @objid ("b56ed086-2d6a-427c-a6c0-12661d06361e")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE, this.element);
    }

    @objid ("6ee4ce20-5d42-469f-8f7d-961f5a911f77")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_ISPREEMPTIBLE,value);
    }

    @objid ("b500ffe5-2a27-4c18-a9ab-12b39a5ecac8")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, this.element);
    }

    @objid ("0725f0ad-7bc4-4314-a1f0-729c629529d1")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDPOLICY, value);
    }

    @objid ("a7c5f909-c47c-4463-9460-2166fb8c70d2")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("e435c167-2f6f-4a59-89d0-d1e2c7b135c1")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_OTHERSCHEDPOLICY, value);
    }

    @objid ("68234384-be2c-4fcf-87de-46b1d346ef2c")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, this.element);
    }

    @objid ("7179c4f7-a856-4f4e-bb36-a242f9c9de2e")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULE, value);
    }

    @objid ("e0d8686a-2b8c-41b3-b4e0-c9be121128c9")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, this.element);
    }

    @objid ("e3d5bdbc-5daa-4bbb-be41-8c7233b22802")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROCESSINGUNITS, value);
    }

    @objid ("f53beecc-3fd1-4b14-8202-a9706a931743")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, this.element);
    }

    @objid ("2f3ffae3-a89d-4b2e-b7e5-04b9403bd63d")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_HOST, value);
    }

    @objid ("533dc006-ae80-45a6-b6e5-ab0ebf968b27")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("b70e5794-eeae-427b-83eb-9d194873596a")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("fc1917db-07ff-42fb-93c6-de0f7f4c553a")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("fe29bda1-3188-4279-a3aa-ba647846b559")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_LIFELINE_GAEXECHOST_LIFELINE_SCHEDULABLERESOURCES, value);
    }

}
