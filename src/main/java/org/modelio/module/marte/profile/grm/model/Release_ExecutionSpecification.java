package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Release_ExecutionSpecification extends GrService_ExecutionSpecification {
    public Release_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("Release_ExecutionSpecification"));
    }

    public Release_ExecutionSpecification(final ExecutionSpecification element) {
        super(element);
    }

}
