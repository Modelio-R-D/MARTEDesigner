package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0ce317cf-2295-4033-a016-cbd045cd9294")
public class Acquire_ExecutionSpecification extends GrService_ExecutionSpecification {
    @objid ("feb659d3-d5d6-4f50-8a6b-099192f3e54a")
    public Acquire_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ACQUIRE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("Acquire_ExecutionSpecification"));
    }

    @objid ("5430a86f-fc40-433f-a9ec-1b641328fe99")
    public Acquire_ExecutionSpecification(final ExecutionSpecification element) {
        super(element);
    }

    @objid ("7752e32e-6378-447c-9faf-7aaf08d0d693")
    public boolean isisBlocking() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING, this.element);
    }

    @objid ("634ae081-acf8-498f-bf02-95831f2b4151")
    public void isisBlocking(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ACQUIRE_EXECUTIONSPECIFICATION_ACQUIRE_EXECUTIONSPECIFICATION_ISBLOCKING,value);
    }

}
