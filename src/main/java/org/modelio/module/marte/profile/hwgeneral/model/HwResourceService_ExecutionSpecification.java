package org.modelio.module.marte.profile.hwgeneral.model;

import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_ExecutionSpecification;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwResourceService_ExecutionSpecification extends GrService_ExecutionSpecification {
    public HwResourceService_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("HwResourceService_ExecutionSpecification"));
    }

    public HwResourceService_ExecutionSpecification(ExecutionSpecification element) {
        super(element);
    }

    public String getHwResourceService_ExecutionSpecification_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, this.element);
    }

    public void setHwResourceService_ExecutionSpecification_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, value);
    }

    public String getHwResourceService_ExecutionSpecification_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, this.element);
    }

    public void setHwResourceService_ExecutionSpecification_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, value);
    }

}
