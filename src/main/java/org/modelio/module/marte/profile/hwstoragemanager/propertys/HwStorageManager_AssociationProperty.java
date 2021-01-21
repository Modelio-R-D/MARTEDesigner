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

@objid ("45a6995c-9fc8-44bb-a0bb-f389327e2f08")
public class HwStorageManager_AssociationProperty implements IPropertyContent {
    @objid ("ff703cee-a956-4e34-906f-d858e1358b9c")
    private static List<ModelElement> referencedHwMemory;

    @objid ("6d217efc-bc0a-41c9-b5b0-e5407c2e1c6e")
    private static List<ModelElement> ownedHwResource;

    @objid ("92f0ad6f-fb9c-435b-8ef2-ee941f2282b2")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("a39cde63-3b4a-439c-b99a-426cf5789cc8")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("a406e7ce-7426-42a4-8247-b89c157bf862")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("2ca42412-07b5-446e-bd09-49de8b3cb776")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY, value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS,
                    value);
        }
    }

    @objid ("98bf2fec-e912-4cba-82b6-a5fdf7fc56c7")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Storage Manager
        //
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ASSOCIATION_HWSTORAGEMANAGER_ASSOCIATION_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
