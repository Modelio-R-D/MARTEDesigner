package org.modelio.module.marte.profile.hwtiming.propertys;

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

@objid ("83cf20ba-e401-4098-98dd-4f4adc2bf9a0")
public class HwTimingResource_ParameterProperty implements IPropertyContent {
    @objid ("20548607-f5db-4bd3-a424-b46f4cba76e9")
    private static List<ModelElement> ownedHwResource;

    @objid ("7f5e255a-0467-4cdf-8ddf-51da5d83ad7f")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("ec1b52c8-a5f1-4759-802a-a6d8617e7ff7")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("34945a7a-3e20-41a2-ac6b-baa298d0ec56")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("75110143-ef79-453b-9100-a0e39ca4d2ba")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_ENDPOINTS,
                    value);
        }
    }

    @objid ("109b9769-0d53-42e2-98ef-ca8490b5a153")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timming resource
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_PARAMETER_HWTIMINGRESOURCE_PARAMETER_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
