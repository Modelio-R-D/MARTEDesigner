package org.modelio.module.marte.profile.alloc.model;

import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class AllocateActivityGroup_ActivityPartition {
    protected ActivityPartition element;

    public AllocateActivityGroup_ActivityPartition() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createActivityPartition();
        ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION);
        this.element.setName(MARTEResourceManager.getName("AllocateActivityGroup_ActivityPartition"));
    }

    public AllocateActivityGroup_ActivityPartition(ActivityPartition element) {
        this.element = element;
    }

    public ActivityPartition getElement() {
        return this.element;
    }

    public void setParent(ActivityPartition parent) {
        this.element.setSuperPartition(parent);
    }

    public void setParent(Activity parent) {
        this.element.setInActivity(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisUnique() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, this.element);
    }

    public void isisUnique(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE, value);
    }

}
