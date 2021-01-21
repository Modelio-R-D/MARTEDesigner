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

@objid ("e94f819c-fdeb-4536-8aea-dc0ea773ee0d")
public class HwTimingResource_AssociationEndProperty implements IPropertyContent {
    @objid ("083cf61d-366d-4f08-bb3f-447022ee5667")
    private static List<ModelElement> ownedHwResource;

    @objid ("b9fefff8-3797-4ca8-95c3-2d6cd74e5b04")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("b3a26d6a-b9ab-405f-b2ce-faf4284a13ac")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("87b57a5b-8010-4b34-a1e4-c80323d7c2de")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("6bf4b8df-fc9a-49e2-9d06-f2fff3d9b61e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS,
                    value);
        }
    }

    @objid ("1b08629a-846b-4524-a31a-5e17e8329881")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timming resource
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ASSOCIATIONEND_HWTIMINGRESOURCE_ASSOCIATIONEND_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
