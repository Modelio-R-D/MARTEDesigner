package org.modelio.module.marte.profile.coreelements.model;

import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Mode_State {
    protected State element;

    public Mode_State() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createState();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODE_STATE);
        this.element.setName(MARTEResourceManager.getName("Mode_State"));
    }

    public Mode_State(final State element) {
        this.element = element;
    }

    public State getElement() {
        return this.element;
    }

    public void setParent(final Region parent) {
        this.element.setParent(parent);
    }

    public void setParent(final StateMachine parent) {
        if (parent.getTop() != null){
            this.element.setParent(parent.getTop());
        }
        else {
            Region newRegion = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createRegion();
            newRegion.setRepresented(parent);
            parent.setTop(newRegion);
        }
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
