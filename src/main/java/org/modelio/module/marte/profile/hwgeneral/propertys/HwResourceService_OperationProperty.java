package org.modelio.module.marte.profile.hwgeneral.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2b103e2d-9b02-46d0-a56d-f3564cdd250c")
public class HwResourceService_OperationProperty implements IPropertyContent {
    @objid ("ddc2f2d9-8cc6-4136-832c-7122e686bb94")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, value);
        }
    }

    @objid ("8cce13b2-40d1-46a7-8b68-50ac14ebde55")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hardware Resource Service
        //
        String value_HwResourceService_OPERATION_consumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_CONSUMPTION),value_HwResourceService_OPERATION_consumption);
        
        String value_HwResourceService_OPERATION_dissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_OPERATION_HWRESOURCESERVICE_OPERATION_DISSIPATION),value_HwResourceService_OPERATION_dissipation);
    }

}
