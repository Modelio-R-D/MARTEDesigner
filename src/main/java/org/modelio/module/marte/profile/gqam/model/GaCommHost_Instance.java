package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1a356765-3e3a-4b9a-80fc-0a90aa7d73f1")
public class GaCommHost_Instance extends CommunicationMedia_Instance {
    @objid ("4341f5c2-11a8-4d3c-8a41-f423c5972649")
    public GaCommHost_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_Instance"));
    }

    @objid ("4288ebc0-8926-43df-92a3-1f3174a2ebc6")
    public GaCommHost_Instance(Instance element) {
        super(element);
    }

    @objid ("80978174-adc2-48d8-b7da-1c3a6341c323")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, this.element);
    }

    @objid ("920a286a-289e-42b0-91ee-8ba81f68edaa")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_THROUGHPUT, value);
    }

    @objid ("a1b1017b-ff52-4b3f-8307-fffcbfeb45ed")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("8928e100-f1eb-4710-9704-96b3e1333557")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_UTILIZATION, value);
    }

    @objid ("4b6f1b8a-f63f-4036-b9ad-398a77ce52cb")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE, this.element);
    }

    @objid ("3642f8ca-49fc-480d-9d96-8bbb17b3bafd")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_ISPREEMPTIBLE,value);
    }

    @objid ("d7247367-09cc-40c4-beb7-79a7c3d8781d")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, this.element);
    }

    @objid ("1cfc441e-417f-436a-9344-ce8bdf47d9d0")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDPOLICY, value);
    }

    @objid ("ed3dbc6b-8ef6-4b09-b62c-f87522952865")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("7fa84166-cac4-4efe-8f9c-97306421ed2e")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_OTHERSCHEDPOLICY, value);
    }

    @objid ("1e94b867-f5bb-4d9e-b0d4-db4113c6733b")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, this.element);
    }

    @objid ("e16d0b21-342f-4e81-a7d7-a83dfef9cefc")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULE, value);
    }

    @objid ("53772631-e938-45e6-ae32-5d8450494180")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, this.element);
    }

    @objid ("da155caa-4622-41c1-8917-1859f5179ddf")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROCESSINGUNITS, value);
    }

    @objid ("d536ca63-6213-4fb3-aa34-fbd3b7ac0aaf")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, this.element);
    }

    @objid ("917498f6-dbfa-454f-b386-180737c89894")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_HOST, value);
    }

    @objid ("a1b640ed-6cc9-4fdf-a9bc-499d7485d228")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("572f0972-de21-4538-9846-424159fcdab1")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("d092be1e-e287-4843-b0a1-5f80675a1d4c")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("43ff5435-952b-4e1c-92ce-40b13565bef6")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_INSTANCE_GACOMMHOST_INSTANCE_SCHEDULABLERESOURCES, value);
    }

}
