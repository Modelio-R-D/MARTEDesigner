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

@objid ("1ed75925-b798-42fb-8ebb-8824c9c2e7c6")
public class HwDrive_LinkProperty implements IPropertyContent {
    @objid ("a55a0b96-090c-4ade-ad54-4183de30b36b")
    private static List<ModelElement> ownedBuffers;

    @objid ("56860c37-63f3-4b55-8f29-85cd7e5bee07")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWDRIVE_LINK_HWDRIVE_LINK_SECTORSIZE, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedBuffers, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, 
        //                    MARTEDesignerTagTypes.HWDRIVE_LINK_HWDRIVE_LINK_BUFFER,
                    value);
        }
    }

    @objid ("692e7a0e-5ecc-4142-a362-c2821e5ba7ef")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Drive
        //
        String value_sectorSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDRIVE_LINK_HWDRIVE_LINK_SECTORSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_LINK_HWDRIVE_LINK_SECTORSIZE),value_sectorSize);
        
        ownedBuffers = MARTESearchUtils.getOwnedHwRAM(elt); 
        String[] tab_buffer = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM), ownedBuffers);  
        String value_buffer = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_BUFFER_HWDRIVE_HWRAM, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWDRIVE_LINK_HWDRIVE_LINK_BUFFER),value_buffer, tab_buffer);
    }

}
