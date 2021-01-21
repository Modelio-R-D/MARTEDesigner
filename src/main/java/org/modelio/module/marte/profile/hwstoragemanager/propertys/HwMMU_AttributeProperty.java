package org.modelio.module.marte.profile.hwstoragemanager.propertys;

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

@objid ("5a397c31-88d5-4eea-b139-5773c6f1d273")
public class HwMMU_AttributeProperty implements IPropertyContent {
    @objid ("3f3d2ebb-a882-49d4-932c-539fabe0564b")
    private static List<ModelElement> ownedTLBs;

    @objid ("35784470-2be7-49dc-be60-ca22cdb8302a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_VIRTUALADDRSPACE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_PHYSICALADDRSPACE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_NBENTRIES, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedTLBs, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, 
        //                        MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_OWNEDTLBS,
                        value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_MEMORYPROTECTION, value);
        }
    }

    @objid ("ae445231-2878-4e17-819f-27142c52a85e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw MMU
        //
        String value_virtualAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_VIRTUALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_VIRTUALADDRSPACE),value_virtualAddrSpace);
        
        
        String value_physicalAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_PHYSICALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_PHYSICALADDRSPACE),value_physicalAddrSpace);
        
        
        String value_nbEntries = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_NBENTRIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_NBENTRIES),value_nbEntries);
        
        
        ownedTLBs = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE), ownedTLBs);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_OWNEDTLBS),value_caches, tab_caches);
           
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_MEMORYPROTECTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_ATTRIBUTE_HWMMU_ATTRIBUTE_MEMORYPROTECTION, elt));
    }

}
