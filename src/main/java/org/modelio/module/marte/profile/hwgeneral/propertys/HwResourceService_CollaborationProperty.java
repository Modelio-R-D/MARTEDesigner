package org.modelio.module.marte.profile.hwgeneral.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("777c29af-199a-4857-bbab-7c18dbbaae4d")
public class HwResourceService_CollaborationProperty implements IPropertyContent {
    @objid ("0f87b767-8c7c-4f70-b4b7-9248bed3c725")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, value);
        }
    }

    @objid ("0af89ff7-76bf-45af-ab75-0e43773895f3")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hardware Resource Service
        //
        String value_HwResourceService_Collaboration_consumption = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_CONSUMPTION),value_HwResourceService_Collaboration_consumption);
        
        String value_HwResourceService_Collaboration_dissipation = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCESERVICE_COLLABORATION_HWRESOURCESERVICE_COLLABORATION_DISSIPATION),value_HwResourceService_Collaboration_dissipation);
    }

}
