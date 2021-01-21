package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("adf7bcc2-5424-4696-86c1-36adce1a0f8a")
public class ModeTransition_Transition {
    @objid ("a4cec20d-8fff-477c-a269-5de245ad8b02")
    protected Transition element;

    @objid ("50f098fe-bc88-472d-a7cd-00021071490c")
    public ModeTransition_Transition() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTransition();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODETRANSITION_TRANSITION);
        this.element.setName(MARTEResourceManager.getName("ModeTransition_Transition"));
    }

    @objid ("3dea5ec2-aa72-42ac-87c3-89de0424dd73")
    public ModeTransition_Transition(Transition element) {
        this.element = element;
    }

    @objid ("d5bf8499-a984-4806-8354-b4896f92dc2e")
    public void setParent(StateVertex source, Behavior destination) {
        this.element.setSource(source);
        this.element.setBehaviorEffect(destination);
    }

    @objid ("796eb82c-11f3-43ff-8e1a-17332a46101e")
    public Transition getElement() {
        return this.element;
    }

}
