package org.modelio.module.marte.profile.alloc.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1bbb487f-893c-426d-96cb-58fdc35ead42")
public class AllocateActivityGroup_ActivityPartition {
    @objid ("cc0d6d96-157f-4bc4-918f-74496c8d5e99")
    protected ActivityPartition element;

    @objid ("7db1b89c-fef9-448c-9bbf-0e5c7712ddd3")
    public AllocateActivityGroup_ActivityPartition() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActivityPartition();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION);
        this.element.setName(MARTEResourceManager.getName("AllocateActivityGroup_ActivityPartition"));
    }

    @objid ("990ede9d-af82-4a0d-b0a8-c0952adc236c")
    public AllocateActivityGroup_ActivityPartition(ActivityPartition element) {
        this.element = element;
    }

    @objid ("be52c7e7-618a-4764-bd28-d8f47d13c3a5")
    public ActivityPartition getElement() {
        return this.element;
    }

    @objid ("fdcc7704-7618-4690-8e56-41b0d819e4cf")
    public void setParent(ActivityPartition parent) {
        this.element.setSuperPartition(parent);
    }

    @objid ("0a8a81b9-912c-4d43-93bb-9f1a9031e273")
    public void setParent(Activity parent) {
        this.element.setInActivity(parent);
    }

    @objid ("73b88bf0-0269-44ae-ae8a-c7351fb12379")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("49cec830-7157-42b7-88df-07d8b4f2881a")
    public boolean isisUnique() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, this.element);
    }

    @objid ("f17449cf-0a24-4343-a6d5-aca549b9231b")
    public void isisUnique(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, value);
    }

}
