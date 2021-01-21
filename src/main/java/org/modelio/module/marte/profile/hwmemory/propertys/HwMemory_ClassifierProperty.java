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

@objid ("6c9239f3-3a32-4fdd-9aba-49e76b7ac24e")
public class HwMemory_ClassifierProperty implements IPropertyContent {
    @objid ("8b948786-5fc9-493c-b81c-62d80285ba75")
    private static List<ModelElement> ownedHwResource;

    @objid ("4e573546-8d24-4cb6-9f14-648e72e65193")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("e466cefc-6f8e-4b2c-b694-61db9145de35")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("fce76edf-e35f-4a18-8207-01fb01ee9c32")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("0b7d67e4-d7bf-45b0-a8e5-35f2d206704a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES,
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW,
                    value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, value);
        }
        
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS,
                    value);
        }
    }

    @objid ("b07fb06c-dfef-4e0e-b574-e41095c72a92")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Memory
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_MEMORYSIZE),value_memorySize);
        
        
        String value_adressSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ADRESSSIZE),value_adressSize);
        
        
        String value_timings = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_TIMINGS),value_timings);
        
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_THROUGHPUT),value_throughput);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_CLASSIFIER_HWMEMORY_CLASSIFIER_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
