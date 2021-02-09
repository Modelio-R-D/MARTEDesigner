package org.modelio.module.marte.profile.hwgeneral.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwResourceService_ExecutionSpecificationProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hardware Resource Service
        //
        String value_HwResourceService_EXECUTIONSPECIFICATION_consumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION),value_HwResourceService_EXECUTIONSPECIFICATION_consumption);
        
        String value_HwResourceService_EXECUTIONSPECIFICATION_dissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION),value_HwResourceService_EXECUTIONSPECIFICATION_dissipation);
    }

}
