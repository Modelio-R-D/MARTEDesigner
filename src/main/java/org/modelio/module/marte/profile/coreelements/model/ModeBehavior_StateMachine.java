package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("975d291c-92d6-4024-91e5-41c902ecf50e")
public class ModeBehavior_StateMachine {
    @objid ("321a8eae-4d42-496f-af7a-6244673ca8d4")
    protected StateMachine element;

    @objid ("5558f2c5-5740-42e3-8046-34ec8a0ad589")
    public ModeBehavior_StateMachine() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createStateMachine();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODEBEHAVIOR_STATEMACHINE);
        this.element.setName(MARTEResourceManager.getName("ModeBehavior_StateMachine"));
    }

    @objid ("5e8de476-beb9-45a1-9018-ac8322583428")
    public ModeBehavior_StateMachine(StateMachine element) {
        this.element = element;
    }

    @objid ("76a544c8-2f45-4e83-83e8-e991eec83025")
    public StateMachine getElement() {
        return this.element;
    }

    @objid ("f3dfc3b1-e947-4b7f-9414-8392d09d07a0")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("a6695d44-c56b-4c1c-adc4-aac9a80eb6da")
    public void setParent(Operation parent) {
        this.element.setOwnerOperation(parent);
    }

    @objid ("b233a516-fa4c-491c-bf6e-045b79adafd0")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
