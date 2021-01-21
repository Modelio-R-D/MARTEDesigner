package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("81a4e68c-d2f3-4181-8286-b59710782700")
public class Release_ExecutionSpecification extends GrService_ExecutionSpecification {
    @objid ("8e6f3421-77b9-4782-a382-96ac2406dfee")
    public Release_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("Release_ExecutionSpecification"));
    }

    @objid ("239f5cdd-1e4a-43ed-889a-3304c904c7e2")
    public Release_ExecutionSpecification(final ExecutionSpecification element) {
        super(element);
    }

}
