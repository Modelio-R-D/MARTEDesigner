package org.modelio.module.marte.profile.hwmemory.propertys;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDrive_ParameterProperty implements IPropertyContent {
    private static List<ModelElement> ownedBuffers;

    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDRIVE_PARAMETER_HWDRIVE_PARAMETER_SECTORSIZE, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedBuffers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, 
        //                    MARTEDesignerTagTypes.HWDRIVE_PARAMETER_HWDRIVE_PARAMETER_BUFFER,
                    value);
        }
    }

    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Drive
        //
        String value_sectorSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_PARAMETER_HWDRIVE_PARAMETER_SECTORSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_PARAMETER_HWDRIVE_PARAMETER_SECTORSIZE),value_sectorSize);
        
        ownedBuffers = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_buffer = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM), ownedBuffers);  
        String value_buffer = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_PARAMETER_HWDRIVE_PARAMETER_BUFFER),value_buffer, tab_buffer);
    }

}
