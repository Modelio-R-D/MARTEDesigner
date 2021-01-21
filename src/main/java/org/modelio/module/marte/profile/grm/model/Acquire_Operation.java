package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a04f43cf-3d73-4b9b-b84a-062f99a37df5")
public class Acquire_Operation extends GrService_Operation {
    @objid ("d404604c-e2d7-4020-989b-5dbeb2b85eb1")
    public Acquire_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("Acquire_Operation"));
    }

    @objid ("514c4d37-10e0-42a0-a22b-0f4bebf32653")
    public Acquire_Operation(final Operation element) {
        super(element);
    }

    @objid ("7ed685d0-d5f8-4ccf-b999-cbde63f04900")
    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING, this.element);
    }

    @objid ("227c9133-ce4b-4a57-9bcd-baf38a7b9c26")
    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_OPERATION_ACQUIRE_OPERATION_ISBLOCKING,value);
    }

}
