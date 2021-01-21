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

@objid ("81add203-2440-446f-92c1-0ca14d9d3879")
public class HwStorageManager_LifelineProperty implements IPropertyContent {
    @objid ("b1a812b5-767b-4014-a73b-4805d7cfe72d")
    private static List<ModelElement> referencedHwMemory;

    @objid ("b647dd8f-bace-4de7-b9ab-e48155e185c6")
    private static List<ModelElement> ownedHwResource;

    @objid ("4c7bc099-53c4-4626-aaad-6d779dff1ffd")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("df45ba82-4268-4a36-82f1-cb7aeaf8ddf2")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("43fa6484-c931-4ded-bb5a-d157d3afb40a")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("ceb01fd2-2968-452e-886e-248c6a990abf")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_FREQUENCY, value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_ENDPOINTS,
                    value);
        }
    }

    @objid ("7e6d3e08-3401-4eee-ae94-7f982774fb0e")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Storage Manager
        //
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_LIFELINE_HWSTORAGEMANAGER_LIFELINE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
