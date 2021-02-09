package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GrService_ExecutionSpecification {
    protected ExecutionSpecification element;

    public GrService_ExecutionSpecification() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_EXECUTIONSPECIFICATION);
        this.element.setName(MARTEResourceManager.getName("GrService_ExecutionSpecification"));
    }

    public GrService_ExecutionSpecification(final ExecutionSpecification element) {
        this.element = element;
    }

    public ExecutionSpecification getElement() {
        return this.element;
    }

    public void setParent(final Interaction parent) {
        this.element.setEnclosingInteraction(parent);
    }

    public void setParent(final InteractionOperand parent) {
        this.element.setEnclosingOperand(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, this.element);
    }

    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_EXECUTIONSPECIFICATION_GRSERVICE_EXECUTIONSPECIFICATION_OWNER, value);
    }

}
