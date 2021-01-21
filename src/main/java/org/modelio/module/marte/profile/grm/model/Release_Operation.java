package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e4ae7886-a7ef-4bbe-bea0-23b128addb22")
public class Release_Operation extends GrService_Operation {
    @objid ("dcb4c735-b395-4dda-b0c5-b84ee223479a")
    public Release_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("Release_Operation"));
    }

    @objid ("98381b05-9730-47b0-9d21-c79ff7e5b378")
    public Release_Operation(final Operation element) {
        super(element);
    }

}
