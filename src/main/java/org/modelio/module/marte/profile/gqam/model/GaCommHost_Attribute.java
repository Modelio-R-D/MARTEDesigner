package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bf4eb3fb-8998-442b-a86e-c92fe02494f8")
public class GaCommHost_Attribute extends CommunicationMedia_Attribute {
    @objid ("67bb60d9-dfd9-4db1-8c08-3a372e3c226f")
    public GaCommHost_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_Attribute"));
    }

    @objid ("1f0ca442-6b38-44f8-933b-dddc39d30bcc")
    public GaCommHost_Attribute(Attribute element) {
        super(element);
    }

    @objid ("acfeeadc-6fc8-4702-a507-26b52e58e35a")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_THROUGHPUT, this.element);
    }

    @objid ("993d0336-9958-4e99-91a5-55ad27cb2aea")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_THROUGHPUT, value);
    }

    @objid ("8a1e966b-ef85-44f1-904d-47765294231b")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_UTILIZATION, this.element);
    }

    @objid ("0a854714-0f01-4a4b-b39b-bc96f13b1010")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_UTILIZATION, value);
    }

    @objid ("0b78da7f-95db-4e7c-8501-60d31c0d43c2")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE, this.element);
    }

    @objid ("811b1da3-59be-4d69-9a00-8a7f8faa10e5")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_ISPREEMPTIBLE,value);
    }

    @objid ("2527684c-f3af-4fa3-9b3d-864f69b05f8e")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDPOLICY, this.element);
    }

    @objid ("98c52a3b-2eda-4d67-96d9-09eb29725f6c")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDPOLICY, value);
    }

    @objid ("0cd075a1-498b-4d95-9904-6b8c8142f8ef")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("c7a82b9a-4abe-436a-bf87-13bc49e342d0")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_OTHERSCHEDPOLICY, value);
    }

    @objid ("d8a6cd62-103d-48ca-9478-e112d205752c")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULE, this.element);
    }

    @objid ("0490eb32-8071-4a55-9b4c-856713a989fb")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULE, value);
    }

    @objid ("63e976f9-15b7-4178-b208-d96c8af25d42")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS, this.element);
    }

    @objid ("4b95cd20-a8ac-4428-a018-c73c0891922e")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROCESSINGUNITS, value);
    }

    @objid ("5d02be10-5447-4220-8110-48bb06ac7276")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_HOST, this.element);
    }

    @objid ("ea8ac7fa-4d1e-4094-b771-951ce76436bf")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_HOST, value);
    }

    @objid ("fbbacfb8-a949-46da-b5f3-8c6c99183e88")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("b9d38c64-e6a0-496b-8d83-8ed890c06dd9")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("ef85b025-a6f2-4240-b9fd-614242d7d9d2")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("56858bcd-2bd9-4f2f-a35b-f404d0cf15da")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ATTRIBUTE_GACOMMHOST_ATTRIBUTE_SCHEDULABLERESOURCES, value);
    }

}
