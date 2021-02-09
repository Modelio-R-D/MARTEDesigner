package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Acquire_Operation extends GrService_Operation {
    public Acquire_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("Acquire_Operation"));
    }

    public Acquire_Operation(final Operation element) {
        super(element);
    }

    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING, this.element);
    }

    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING,value);
    }

}
