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

@objid ("1896271f-1a1b-4258-8b28-edb602caea89")
public class HwMMU_InstanceProperty implements IPropertyContent {
    @objid ("b226de90-7476-4e75-92c5-10496c6595a9")
    private static List<ModelElement> ownedTLBs;

    @objid ("59f15e73-89c9-4523-a487-14bf497f3841")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedTLBs, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, 
        //                        MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS,
                        value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION, value);
        }
    }

    @objid ("dcc7353d-58c6-4650-9cc5-d3c73083192b")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw MMU
        //
        String value_virtualAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_VIRTUALADDRSPACE),value_virtualAddrSpace);
        
        
        String value_physicalAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_PHYSICALADDRSPACE),value_physicalAddrSpace);
        
        
        String value_nbEntries = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_NBENTRIES),value_nbEntries);
        
        
        ownedTLBs = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE), ownedTLBs);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_OWNEDTLBS),value_caches, tab_caches);
           
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_INSTANCE_HWMMU_INSTANCE_MEMORYPROTECTION, elt));
    }

}
