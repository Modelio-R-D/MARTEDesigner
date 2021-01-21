package org.modelio.module.marte.profile.hwmemory.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dc9f3073-e1fa-4eeb-9373-c5ffcae590f2")
public class HwDrive_AssociationEndProperty implements IPropertyContent {
    @objid ("0348d256-aea2-46f9-954d-b002322289b8")
    private static List<ModelElement> ownedBuffers;

    @objid ("f5f3b0be-87b3-4d2a-893d-427a017323f8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDRIVE_ASSOCIATIONEND_HWDRIVE_ASSOCIATIONEND_SECTORSIZE, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedBuffers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, 
        //                    MARTEDesignerTagTypes.HWDRIVE_ASSOCIATIONEND_HWDRIVE_ASSOCIATIONEND_BUFFER,
                    value);
        }
    }

    @objid ("56299d9b-6d80-4776-a372-1fc3ba75ff10")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Drive
        //
        String value_sectorSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATIONEND_HWDRIVE_ASSOCIATIONEND_SECTORSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATIONEND_HWDRIVE_ASSOCIATIONEND_SECTORSIZE),value_sectorSize);
        
        ownedBuffers = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_buffer = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM), ownedBuffers);  
        String value_buffer = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATIONEND_HWDRIVE_ASSOCIATIONEND_BUFFER),value_buffer, tab_buffer);
    }

}
