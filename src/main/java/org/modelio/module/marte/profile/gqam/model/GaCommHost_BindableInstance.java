package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8f150f6f-1fbc-40d2-930d-dd25999de400")
public class GaCommHost_BindableInstance extends CommunicationMedia_BindableInstance {
    @objid ("58e8137c-f1bb-4a8f-8cb3-fdf3088c7902")
    public GaCommHost_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_BindableInstance"));
    }

    @objid ("385e3eea-9ba0-47b1-a347-8d65d2ab7d9d")
    public GaCommHost_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("6f91902e-1173-4e99-9703-32a987814674")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("66c4b57f-45f2-4adf-ac2c-30cd85e5f0ae")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, value);
    }

    @objid ("4557e94e-0a7c-402b-b3b2-d70596f2f2dd")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("2a307236-3538-415f-8543-30dae82e5a8a")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, value);
    }

    @objid ("d821216b-e9c5-41c3-9f27-e971bc80b30c")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("cff4bd99-33e0-4d10-a097-e73ce396b806")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("f0995410-f491-469b-bd34-557a9f54430d")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("4e021503-be42-4989-99a7-eaaa504ee5ad")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("c4e60049-aad9-44df-b531-dff7cfc1df2d")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("1c9d8e91-55c6-4d20-9f18-a726fb2e9b44")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("ca520163-cd8c-43ce-8f06-bfd638f59472")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("29799e80-2863-48b5-86a9-bda4eed4d5ae")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, value);
    }

    @objid ("673cdf21-d585-4e10-83d7-7930f61d3b10")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    @objid ("9c1dbfc7-6536-4deb-b2a2-299e552b5445")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    @objid ("3fd2ac0b-6232-44e5-bd1c-cf3614a800e7")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, this.element);
    }

    @objid ("836e6ef1-f9ee-4f56-95b4-3eb1db35399c")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, value);
    }

    @objid ("68a837db-579f-488b-81b9-0301fcc25f8c")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("5064465d-d96c-4146-b9a2-2c38a27647a1")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("b2a048de-f95b-42e4-9bd9-de2c5c996a6c")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("216ea8d2-fe1a-448a-b88c-0cff4b6f9b4b")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
