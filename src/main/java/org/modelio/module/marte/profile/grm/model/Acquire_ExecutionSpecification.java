package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Acquire_ExecutionSpecification extends GrService_ExecutionSpecification {
    public Acquire_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("Acquire_ExecutionSpecification"));
    }

    public Acquire_ExecutionSpecification(final ExecutionSpecification element) {
        super(element);
    }

    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING, this.element);
    }

    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING,value);
    }

}
