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

@objid ("14d13fc4-37d2-453a-8530-04cc67dab558")
public class HwMMU_AssociationEndProperty implements IPropertyContent {
    @objid ("552330a1-63cf-4f76-b7b9-d6ea75ded56d")
    private static List<ModelElement> ownedTLBs;

    @objid ("58a8203f-0d5f-4a19-ab3c-2d00c90424da")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_NBENTRIES, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedTLBs, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, 
        //                        MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_OWNEDTLBS,
                        value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_MEMORYPROTECTION, value);
        }
    }

    @objid ("b6d7af52-7acb-4260-9c82-7d9c9d9de836")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw MMU
        //
        String value_virtualAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_VIRTUALADDRSPACE),value_virtualAddrSpace);
        
        
        String value_physicalAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_PHYSICALADDRSPACE),value_physicalAddrSpace);
        
        
        String value_nbEntries = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_NBENTRIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_NBENTRIES),value_nbEntries);
        
        
        ownedTLBs = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE), ownedTLBs);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_OWNEDTLBS),value_caches, tab_caches);
           
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_MEMORYPROTECTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_ASSOCIATIONEND_HWMMU_ASSOCIATIONEND_MEMORYPROTECTION, elt));
    }

}
