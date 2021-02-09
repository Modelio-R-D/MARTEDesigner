package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_Operation;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwAccessService_Operation extends GrService_Operation {
    public SwAccessService_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("SwAccessService_Operation"));
    }

    public SwAccessService_Operation(Operation element) {
        super(element);
    }

    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER, this.element);
    }

    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ISMODIFIER,value);
    }

    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, this.element);
    }

    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_OPERATION_SWACCESSSERVICE_OPERATION_ACCESSEDELEMENT, value);
    }

}
