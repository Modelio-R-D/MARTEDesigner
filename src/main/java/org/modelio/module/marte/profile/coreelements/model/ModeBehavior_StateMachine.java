package org.modelio.module.marte.profile.coreelements.model;

import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ModeBehavior_StateMachine {
    protected StateMachine element;

    public ModeBehavior_StateMachine() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createStateMachine();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODEBEHAVIOR_STATEMACHINE);
        this.element.setName(MARTEResourceManager.getName("ModeBehavior_StateMachine"));
    }

    public ModeBehavior_StateMachine(StateMachine element) {
        this.element = element;
    }

    public StateMachine getElement() {
        return this.element;
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(Operation parent) {
        this.element.setOwnerOperation(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
