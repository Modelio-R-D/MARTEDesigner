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

@objid ("dbf61c0a-1eed-4dd4-8583-0778b3d2ae6e")
public class HwMemory_AssociationProperty implements IPropertyContent {
    @objid ("4adc050f-0dc1-486a-a9f3-3e89257936eb")
    private static List<ModelElement> ownedHwResource;

    @objid ("6714c290-5d31-4813-a460-29104e5b3ff1")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("37928b20-5172-4cac-9cae-e0fc7b7ed0f6")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("d864ff00-cbb5-4422-a861-e75a0f61fabd")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("c56bed75-7dcc-4e58-8894-d13ca6b75bed")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_MEMORYSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_ADRESSSIZE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_TIMINGS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_THROUGHPUT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_DESCRIPTION, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_P_HW_SERVICES,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_R_HW_SERVICES,
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_OWNEDHW,
                    value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_FREQUENCY, value);
        }
        
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_ENDPOINTS,
                    value);
        }
    }

    @objid ("90707e03-6a8b-44a7-b3af-6e4bca650436")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Memory
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_MEMORYSIZE),value_memorySize);
        
        
        String value_adressSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_ADRESSSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_ADRESSSIZE),value_adressSize);
        
        
        String value_timings = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_TIMINGS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_TIMINGS),value_timings);
        
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_THROUGHPUT),value_throughput);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATION_HWMEMORY_ASSOCIATION_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
