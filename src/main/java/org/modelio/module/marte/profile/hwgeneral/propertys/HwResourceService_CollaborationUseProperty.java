package org.modelio.module.marte.profile.hwgeneral.propertys;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwResourceService_CollaborationUseProperty implements IPropertyContent {
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hardware Resource Service
        //
        String value_HwResourceService_COLLABORATIONUSE_consumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_CONSUMPTION),value_HwResourceService_COLLABORATIONUSE_consumption);
        
        String value_HwResourceService_COLLABORATIONUSE_dissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATIONUSE_HWRESOURCESERVICE_COLLABORATIONUSE_DISSIPATION),value_HwResourceService_COLLABORATIONUSE_dissipation);
    }

}
