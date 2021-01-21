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

@objid ("37639aaa-135a-4d6c-a52c-704c6a7ba8fb")
public class HwMMU_ClassifierProperty implements IPropertyContent {
    @objid ("b1166a62-6605-47df-9ab4-d938331efd75")
    private static List<ModelElement> ownedTLBs;

    @objid ("b46c4f32-57c5-439e-a2d7-8873e7ba7818")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedTLBs, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, 
        //                        MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS,
                        value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION, value);
        }
    }

    @objid ("adc55f24-74c0-47a7-b0a6-0c696668eaf2")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw MMU
        //
        String value_virtualAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_VIRTUALADDRSPACE),value_virtualAddrSpace);
        
        
        String value_physicalAddrSpace = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_PHYSICALADDRSPACE),value_physicalAddrSpace);
        
        
        String value_nbEntries = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_NBENTRIES),value_nbEntries);
        
        
        ownedTLBs = MARTESearchUtils.getOwnedCaches(elt); 
        String[] tab_caches = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE), ownedTLBs);  
        String value_caches = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDTLBS_HWMMU_HWCACHE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_OWNEDTLBS),value_caches, tab_caches);
           
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWMMU_CLASSIFIER_HWMMU_CLASSIFIER_MEMORYPROTECTION, elt));
    }

}
