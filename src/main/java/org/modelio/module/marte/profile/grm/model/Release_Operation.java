package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Release_Operation extends GrService_Operation {
    public Release_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("Release_Operation"));
    }

    public Release_Operation(final Operation element) {
        super(element);
    }

}
