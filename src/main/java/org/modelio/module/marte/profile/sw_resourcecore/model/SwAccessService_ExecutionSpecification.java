package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_ExecutionSpecification;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwAccessService_ExecutionSpecification extends GrService_ExecutionSpecification {
    public SwAccessService_ExecutionSpecification() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createExecutionSpecification());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION);
                this.element.setName(MARTEResourceManager.getName("SwAccessService_ExecutionSpecification"));
    }

    public SwAccessService_ExecutionSpecification(ExecutionSpecification element) {
        super(element);
    }

    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER, this.element);
    }

    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER,value);
    }

    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, this.element);
    }

    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT, value);
    }

}
