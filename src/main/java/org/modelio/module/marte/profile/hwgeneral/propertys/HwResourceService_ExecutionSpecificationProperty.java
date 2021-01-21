package org.modelio.module.marte.profile.hwgeneral.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("964c53f0-8ca7-4c5a-9e7c-98556b42c140")
public class HwResourceService_ExecutionSpecificationProperty implements IPropertyContent {
    @objid ("02a7c06d-b7fc-4a93-8840-96c7e2142d76")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_CONSUMPTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION_HWRESOURCESERVICE_EXECUTIONSPECIFICATION_DISSIPATION, value);
        }
    }

    @objid ("bb238e31-690f-4fd4-8be6-9cc97fe4d9f9")
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
