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

@objid ("00ebc888-43c1-4fea-87f6-a2a0c9e96e6f")
public class HwDrive_AssociationProperty implements IPropertyContent {
    @objid ("eeced2da-e861-40c1-9db3-9829885be815")
    private static List<ModelElement> ownedBuffers;

    @objid ("a59f8367-c96e-415a-9fe7-c1fb7f3c7e73")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDRIVE_ASSOCIATION_HWDRIVE_ASSOCIATION_SECTORSIZE, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedBuffers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, 
        //                    MARTEDesignerTagTypes.HWDRIVE_ASSOCIATION_HWDRIVE_ASSOCIATION_BUFFER,
                    value);
        }
    }

    @objid ("f4935929-d5ff-4fa8-91f6-18db3dca57ea")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Drive
        //
        String value_sectorSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATION_HWDRIVE_ASSOCIATION_SECTORSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATION_HWDRIVE_ASSOCIATION_SECTORSIZE),value_sectorSize);
        
        ownedBuffers = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_buffer = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM), ownedBuffers);  
        String value_buffer = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_ASSOCIATION_HWDRIVE_ASSOCIATION_BUFFER),value_buffer, tab_buffer);
    }

}
