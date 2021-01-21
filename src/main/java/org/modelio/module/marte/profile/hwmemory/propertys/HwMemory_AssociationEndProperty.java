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

@objid ("378cdad8-738e-4e6a-940d-c91f884b756b")
public class HwMemory_AssociationEndProperty implements IPropertyContent {
    @objid ("bdf26dc5-bdf6-4843-b55b-cedbaf890865")
    private static List<ModelElement> ownedHwResource;

    @objid ("93354b56-e8a5-4c68-99a9-8e21a4e78130")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("c419f8b6-dded-4487-85e3-1b29f237a01a")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("50eb177b-f17e-4115-8b27-4764cadd74a0")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("aa7151a1-7976-4e62-b29d-3a1214e2b4b3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_MEMORYSIZE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_ADRESSSIZE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_TIMINGS, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_THROUGHPUT, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_DESCRIPTION, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES,
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES,
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_OWNEDHW,
                    value);
        }
        else if(row == 9){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_FREQUENCY, value);
        }
        
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_ENDPOINTS,
                    value);
        }
    }

    @objid ("b3842af7-e42e-4fc4-9774-e468e6833c61")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Memory
        //
        String value_memorySize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_MEMORYSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_MEMORYSIZE),value_memorySize);
        
        
        String value_adressSize = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_ADRESSSIZE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_ADRESSSIZE),value_adressSize);
        
        
        String value_timings = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_TIMINGS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_TIMINGS),value_timings);
        
        
        String value_throughput = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_THROUGHPUT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_THROUGHPUT),value_throughput);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWMEMORY_ASSOCIATIONEND_HWMEMORY_ASSOCIATIONEND_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
