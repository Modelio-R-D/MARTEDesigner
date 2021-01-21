package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_ExecutionSpecification;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("72c81757-791b-44e4-a8cd-dab19a0bd28a")
public class HwResourceService_ExecutionSpecification extends GrService_ExecutionSpecification {
    @objid ("7aa583d3-e815-43be-99e3-e8dd534d2dc6")
    public HwResourceService_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("HwResourceService_ExecutionSpecification"));
    }

    @objid ("a004a476-89d0-43b4-be77-01da651b3e98")
    public HwResourceService_ExecutionSpecification(ExecutionSpecification element) {
        super(element);
    }

    @objid ("a72e4848-8d43-4c0f-bc3a-2749131784f5")
    public String getHwResourceService_ExecutionSpecification_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, this.element);
    }

    @objid ("2791ea9b-ccd4-471d-9183-630050534fd1")
    public void setHwResourceService_ExecutionSpecification_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, value);
    }

    @objid ("29b5d742-7903-4fe8-90cc-43271ca4e071")
    public String getHwResourceService_ExecutionSpecification_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, this.element);
    }

    @objid ("75e18cbb-bf79-44b0-844e-e17ea299e6fe")
    public void setHwResourceService_ExecutionSpecification_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, value);
    }

}
