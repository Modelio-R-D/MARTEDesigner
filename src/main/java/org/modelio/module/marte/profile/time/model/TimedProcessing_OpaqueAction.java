package org.modelio.module.marte.profile.time.model;

import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedProcessing_OpaqueAction {
    protected OpaqueAction element;

    public TimedProcessing_OpaqueAction() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOpaqueAction();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION)+ModelUtils.getNbElement(ActivityAction.class, MARTEDesignerStereotypes.TIMEDPROCESSING_ACTIVITYACTION));
    }

    public TimedProcessing_OpaqueAction(OpaqueAction element) {
        this.element = element;
    }

    public ActivityAction getElement() {
        return this.element;
    }

    public void setParent(Activity parent) {
        this.element.setOwner(parent);
    }

    public void setParent(Clause parent) {
        this.element.setOwnerClause(parent);
    }

    public void setParent(StructuredActivityNode parent) {
        this.element.setOwnerNode(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, this.element);
    }

    public void setduration(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_DURATION, value);
    }

    public String getfinish() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH, this.element);
    }

    public void setfinish(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_FINISH, value);
    }

    public String getstart() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START, this.element);
    }

    public void setstart(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDPROCESSING_ACTIVITYACTION_TIMEDPROCESSING_ACTIVITYACTION_START, value);
    }

}
