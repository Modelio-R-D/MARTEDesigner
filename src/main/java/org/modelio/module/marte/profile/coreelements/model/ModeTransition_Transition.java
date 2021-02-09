package org.modelio.module.marte.profile.coreelements.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ModeTransition_Transition {
    protected Transition element;

    public ModeTransition_Transition() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTransition();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODETRANSITION_TRANSITION);
        this.element.setName(MARTEResourceManager.getName("ModeTransition_Transition"));
    }

    public ModeTransition_Transition(Transition element) {
        this.element = element;
    }

    public void setParent(StateVertex source, Behavior destination) {
        this.element.setSource(source);
        this.element.setBehaviorEffect(destination);
    }

    public Transition getElement() {
        return this.element;
    }

}
