package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5e1f9f01-ffc7-464d-9374-db0af39ebb96")
public class Mode_State {
    @objid ("9e8af5ab-7eff-430b-9fbb-a956a070a2d9")
    protected State element;

    @objid ("91099f1d-eccc-4eb7-8ffc-be38a68199a1")
    public Mode_State() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createState();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MODE_STATE);
        this.element.setName(MARTEResourceManager.getName("Mode_State"));
    }

    @objid ("f7b56cc3-0139-426c-b598-646897646f93")
    public Mode_State(final State element) {
        this.element = element;
    }

    @objid ("8a9a5bfb-ba16-4012-97c6-0ed47bdeab08")
    public State getElement() {
        return this.element;
    }

    @objid ("b254a11d-43e6-406b-affe-4a387d9b23ae")
    public void setParent(final Region parent) {
        this.element.setParent(parent);
    }

    @objid ("5b1a14e6-fc7e-447f-aa26-f1fa49154461")
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

    @objid ("6f55f16f-7ae4-47f3-9c4b-a14ef872ee12")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
