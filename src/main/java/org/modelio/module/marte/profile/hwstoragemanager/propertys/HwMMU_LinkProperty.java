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

@objid ("8d7deaee-83ac-4663-8793-68498e68aa76")
public class HwMMU_LinkProperty implements IPropertyContent {
    @objid ("4330b266-0508-40cb-8662-5f62fd3d019d")
    private static List<ModelElement> ownedTLBs;

    @objid ("175a7f50-46f0-4c99-b84d-b16a8f2c67e9")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_VIRTUALADDRSPACE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_PHYSICALADDRSPACE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_NBENTRIES, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedTLBs, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, 
        //                        MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_OWNEDTLBS,
                        value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_MEMORYPROTECTION, value);
        }
    }

    @objid ("3aa56d12-f3f9-4957-a5dc-4f1a8bcb7093")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw MMU
        //
        String value_virtualAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_VIRTUALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_VIRTUALADDRSPACE),value_virtualAddrSpace);
        
        
        String value_physicalAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_PHYSICALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_PHYSICALADDRSPACE),value_physicalAddrSpace);
        
        
        String value_nbEntries = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_NBENTRIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_NBENTRIES),value_nbEntries);
        
        
        ownedTLBs = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE), ownedTLBs);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_OWNEDTLBS),value_caches, tab_caches);
           
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_MEMORYPROTECTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_LINK_HWMMU_LINK_MEMORYPROTECTION, elt));
    }

}
