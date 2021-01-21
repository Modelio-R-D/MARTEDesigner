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

@objid ("15c7c7e9-0ce9-4122-bdfa-4ce5016431e6")
public class HwStorageManager_AttributeProperty implements IPropertyContent {
    @objid ("ae41ace8-de65-412d-a7c1-b9e4b6212db4")
    private static List<ModelElement> referencedHwMemory;

    @objid ("7157ccc3-b6ad-48fc-9aee-d9c9e26bbd3d")
    private static List<ModelElement> ownedHwResource;

    @objid ("374477ca-25c3-4c20-8dc9-fbde6d356c19")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("9ab1a7d0-fd56-41c8-901e-29b048a3af6d")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("9b4703ed-32de-4bc5-905a-e72d49e69583")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("6cb95a07-e212-4bef-8792-fa38d17eb23b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMemory, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY, value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS,
                    value);
        }
    }

    @objid ("10cbea72-5fbe-43a5-b78e-cc0e784b7807")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Storage Manager
        //
        referencedHwMemory = MARTESearchUtils.searchHwMemory();
        String[] tab_managedMemories = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY), referencedHwMemory);  
        String value_managedMemories = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MANAGEDMEMORIES_HWSTORAGEMANAGER_HWMEMORY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_MANAGEDMEMORIES),value_managedMemories, tab_managedMemories);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWSTORAGEMANAGER_ATTRIBUTE_HWSTORAGEMANAGER_ATTRIBUTE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
