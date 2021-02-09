package org.modelio.module.marte.profile.hwgeneral.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.GrService_Operation;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwResourceService_Operation extends GrService_Operation {
    public HwResourceService_Operation() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createOperation());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
                this.element.setName(MARTEResourceManager.getName("HwResourceService_Operation"));
    }

    public HwResourceService_Operation(Operation element) {
        super(element);
    }

    public String getHwResourceService_Operation_consumption() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, this.element);
    }

    public void setHwResourceService_Operation_consumption(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, value);
    }

    public String getHwResourceService_Operation_dissipation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, this.element);
    }

    public void setHwResourceService_Operation_dissipation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, value);
    }

}
