package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("378800f1-d17a-483d-809f-bbc32ce0cab1")
public class Scheduler_Attribute extends Resource_Attribute {
    @objid ("70a666a0-e97a-47ff-8272-2bfe649ed105")
    public Scheduler_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_ATTRIBUTE);
        element.setName(MARTEResourceManager.getName("Scheduler_Attribute"));
        this.isisPreemptible(true);
    }

    @objid ("2b02d0ca-7601-497e-9020-03e221a4afb4")
    public Scheduler_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("fb4cd375-c998-4b5a-8205-7e73d1f6d513")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE, this.element);
    }

    @objid ("4b6a1cde-e528-4470-aba2-caf986c1850e")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_ISPREEMPTIBLE,value);
    }

    @objid ("7ce1fe19-8157-477c-94b9-581162cca458")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDPOLICY, this.element);
    }

    @objid ("ac88d91c-1019-4f71-bb87-8b7a40b7ee37")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDPOLICY, value);
    }

    @objid ("dd46224c-003b-470d-b8d3-9d4c14a07c2c")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("28f03503-d4e9-4dba-bd34-e47b3db34cea")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_OTHERSCHEDPOLICY, value);
    }

    @objid ("776de8d0-8246-4e2f-980f-d2bafb499161")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDULE, this.element);
    }

    @objid ("cb465c57-e670-4011-aeee-356f8e8f5082")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDULE, value);
    }

    @objid ("5c237baf-185c-451c-a685-cc8d15aa0721")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROCESSINGUNITS, this.element);
    }

    @objid ("8940bee1-6f42-4ed6-8a57-91e24fc94fcc")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROCESSINGUNITS, value);
    }

    @objid ("9a9574c0-ac7c-4738-8412-69995ca88bae")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_HOST, this.element);
    }

    @objid ("89113243-2d6b-476c-83a4-27f6b8b1caee")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_HOST, value);
    }

    @objid ("5e724d68-15dc-4fd2-b2c9-7daa4c4027f1")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("2e2569d7-f620-40a6-87a9-e4244770ea61")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("c79af7b1-8929-4533-848b-ff6cb7f52260")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("459274d1-813e-451f-8cea-835e9a806008")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_SCHEDULABLERESOURCES, value);
    }

}
