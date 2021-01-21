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

@objid ("cf77e715-6947-4455-8672-19f61964c8c9")
public class HwMemory_LifelineProperty implements IPropertyContent {
    @objid ("ca713b60-347e-46bc-aac6-a9f793142839")
    private static List<ModelElement> ownedHwResource;

    @objid ("8ea00866-0cc1-43c3-93ff-8501d31d3bb8")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("242a8c5c-8378-4e50-9c1f-3bf2c10cef87")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("19b33361-82c0-4a0c-a77a-d64c80992b8c")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("fe755a96-7e10-4808-b223-a71a7d07bdec")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_MEMORYSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_ADRESSSIZE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_TIMINGS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_THROUGHPUT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_DESCRIPTION, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_P_HW_SERVICES,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_R_HW_SERVICES,
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_OWNEDHW,
                    value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_FREQUENCY, value);
        }
        
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_ENDPOINTS,
                    value);
        }
    }

    @objid ("7fe9ab7d-e8af-43c0-a4e3-90cf0f837477")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Memory
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_MEMORYSIZE),value_memorySize);
        
        
        String value_adressSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_ADRESSSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_ADRESSSIZE),value_adressSize);
        
        
        String value_timings = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_TIMINGS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_TIMINGS),value_timings);
        
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_THROUGHPUT),value_throughput);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_LIFELINE_HWMEMORY_LIFELINE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
