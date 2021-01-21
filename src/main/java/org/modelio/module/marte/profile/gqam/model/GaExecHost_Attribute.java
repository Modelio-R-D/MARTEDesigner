package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("afab2668-e326-49d2-8bc6-78d91c767827")
public class GaExecHost_Attribute extends ComputingResource_Attribute {
    @objid ("b99a7e32-b5dc-470c-8ccd-9ee688bece9a")
    public GaExecHost_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAEXECHOST_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("GaExecHost_Attribute"));
    }

    @objid ("83a8690d-d045-4d42-aad8-49cac67e0c86")
    public GaExecHost_Attribute(Attribute element) {
        super(element);
    }

    @objid ("9325cd49-77b1-45a8-882f-be313b60927d")
    public String getcommTxOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_COMMTXOVH, this.element);
    }

    @objid ("6400fd7d-67a2-477e-b10f-8f2af10fd17b")
    public void setcommTxOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_COMMTXOVH, value);
    }

    @objid ("0c5248e0-b6a6-4cc5-bb78-214031f72975")
    public String getcommRcvOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_COMMRCVOVH, this.element);
    }

    @objid ("bb8ed112-727a-4d44-ace6-eeee90b5cf67")
    public void setcommRcvOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_COMMRCVOVH, value);
    }

    @objid ("dd064b4f-654a-4d29-a409-6146b2e1f72e")
    public String getcntxtSwT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_CNTXTSWT, this.element);
    }

    @objid ("a2480f5f-bea1-4b5d-a388-ecb6689f1779")
    public void setcntxtSwT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_CNTXTSWT, value);
    }

    @objid ("102a11ca-9fb7-445f-a6db-6cbd7d0129c5")
    public String getclockOvh() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_CLOCKOVH, this.element);
    }

    @objid ("3f880ad1-4cc6-4059-956f-a29ab5a602a2")
    public void setclockOvh(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_CLOCKOVH, value);
    }

    @objid ("e0171be4-98b0-4696-bbb6-e4cd890f7a92")
    public String getschedPriRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE, this.element);
    }

    @objid ("70ccb691-9567-4e1e-9a6d-30bc59c21797")
    public void setschedPriRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDPRIRANGE, value);
    }

    @objid ("3ac497a3-5506-4f42-a1f6-2432d4cd8c43")
    public String getmemSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_MEMSIZE, this.element);
    }

    @objid ("72ade4c3-956b-4c4e-a7e8-989773216db7")
    public void setmemSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_MEMSIZE, value);
    }

    @objid ("8fcc139a-cb09-4155-ab50-98c72ae79934")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_UTILIZATION, this.element);
    }

    @objid ("3ea01fb2-6e90-4ee6-aa5b-a1d797142623")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_UTILIZATION, value);
    }

    @objid ("507e3711-771e-4c0c-93c3-2359d5dd7146")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_THROUGHPUT, this.element);
    }

    @objid ("9fb83e5b-e9f8-431c-9a68-eade417f4cde")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_THROUGHPUT, value);
    }

    @objid ("fb18e8ac-dda1-4120-bb1d-36095bd0ccea")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE, this.element);
    }

    @objid ("a65d82c9-177d-4730-82a9-040a9ae7e3af")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_ISPREEMPTIBLE,value);
    }

    @objid ("f2b7125f-cede-444d-ac89-ec393c85bbd5")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDPOLICY, this.element);
    }

    @objid ("97a0bdef-8cb5-4947-9cf7-2dc1b804ff6a")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDPOLICY, value);
    }

    @objid ("26147a27-8faa-49da-82dc-9452ce176576")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("86ac0a0b-a91f-41b7-8a5c-82af13b2061f")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_OTHERSCHEDPOLICY, value);
    }

    @objid ("075af69e-d0a6-4fff-bc64-99ea00150cb6")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDULE, this.element);
    }

    @objid ("464c3416-73c1-48d1-b1a6-6f4241e078bb")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDULE, value);
    }

    @objid ("65a53993-5e9a-4f70-84e9-045d3bae1d0f")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS, this.element);
    }

    @objid ("22f7bafb-b6cd-41ec-b8ae-4b217b102298")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_PROCESSINGUNITS, value);
    }

    @objid ("02406b5e-2853-449d-8382-eb3b21dbe9a1")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_HOST, this.element);
    }

    @objid ("0ec7b64a-3e73-4685-a6b6-17074bcfb08b")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_HOST, value);
    }

    @objid ("8b5974a2-2f85-480f-90c0-c1a70d160b08")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("0ec2e9ce-7452-461f-b137-4866455e76f5")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("c20479fe-c1aa-4ed1-b7ab-b2915e7d61fb")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("70bcd004-aa07-4ade-9180-af6b8bbbc0d1")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAEXECHOST_ATTRIBUTE_GAEXECHOST_ATTRIBUTE_SCHEDULABLERESOURCES, value);
    }

}
