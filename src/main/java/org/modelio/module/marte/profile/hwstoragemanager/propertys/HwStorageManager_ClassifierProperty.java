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

@objid ("afd27d5d-335c-4570-861b-949a0c0994b9")
public class HwStorageManager_ClassifierProperty implements IPropertyContent {
    @objid ("b7ec8415-c906-4207-b294-e750fc756789")
    private static List<ModelElement> referencedHwMemory;

    @objid ("bf484bc6-c861-48bc-8181-ec4502e59b99")
    private static List<ModelElement> ownedHwResource;

    @objid ("d5cc02c1-d443-4ade-a158-383627ae5fa5")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("fdf68f72-4fe5-4be0-97ab-5bce72e293fb")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("30cbff53-f1c0-4b4f-80b0-58488f217749")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("a1a41a86-6652-44f1-9fa8-9a446eeef6da")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY, value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS,
                    value);
        }
    }

    @objid ("25ade392-64a1-44b0-aefc-4ddc3c928a4f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Storage Manager
        //
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_CLASSIFIER_HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
