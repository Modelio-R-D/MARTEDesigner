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

@objid ("e3ebc67f-901a-44eb-a1c1-866d5f386e35")
public class HwMemory_InstanceProperty implements IPropertyContent {
    @objid ("fc6a961b-0633-4238-a0ea-7a8184216c27")
    private static List<ModelElement> ownedHwResource;

    @objid ("760bf345-5d6c-40aa-b08c-63f721517b70")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("fe55209d-ccb3-4509-80f0-44d25e723607")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("cf7375d7-329b-494b-b5a5-fc9dbabf9d1d")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("a80ca3e2-c562-46b4-a896-1cdcd608b9ef")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES,
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW,
                    value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, value);
        }
        
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS,
                    value);
        }
    }

    @objid ("02857474-5f96-4c36-8293-27041e3b69d7")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Memory
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_MEMORYSIZE),value_memorySize);
        
        
        String value_adressSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ADRESSSIZE),value_adressSize);
        
        
        String value_timings = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_TIMINGS),value_timings);
        
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_THROUGHPUT),value_throughput);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_INSTANCE_HWMEMORY_INSTANCE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}