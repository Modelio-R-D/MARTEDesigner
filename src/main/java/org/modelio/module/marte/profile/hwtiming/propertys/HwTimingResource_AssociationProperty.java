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

@objid ("c580cce1-a8ba-47f7-babe-096cec703ee6")
public class HwTimingResource_AssociationProperty implements IPropertyContent {
    @objid ("b2644b46-6cce-475c-b7ad-95829f4674a4")
    private static List<ModelElement> ownedHwResource;

    @objid ("c3f57b06-bf1c-4d80-8a6f-8213dd76b144")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("12dcd5c7-9df0-4791-b1d8-d15e94df4279")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("b84184e1-4056-43f8-81e2-a48c22d5ee3e")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("03898d64-2ab5-459f-8375-fa4425982c78")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS,
                    value);
        }
    }

    @objid ("e0a0cb8b-878c-4644-9680-a7a3510c713f")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timming resource
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATION_HWTIMINGRESOURCE_ASSOCIATION_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
