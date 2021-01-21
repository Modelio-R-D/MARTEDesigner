package org.modelio.module.marte.profile.hwcommunication.propertys;

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

@objid ("9f48659d-119f-45e9-9a0b-f74142c90e2d")
public class HwEndPoint_AssociationEndProperty implements IPropertyContent {
    @objid ("7bff62bb-e55c-4627-b8b9-22d500d834ee")
    private static List<ModelElement> ownedHwResource;

    @objid ("3ebeb515-e7ec-4197-bda4-1cc221c12ab7")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("21d13c20-c974-4eea-a804-f1fa3310245c")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("c3a5be35-0dca-4a2f-bfa7-a0e8595ece3b")
    private static List<ModelElement> referencedHwMedia;

    @objid ("2aa910f8-d3c7-4509-93cc-dc323140ca10")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_DESCRIPTION, value);
        }
        else if(row == 3){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES,
                     value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     referencedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES,
                     value);
        }
        else if(row == 5){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResource, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_OWNEDHW,
                     value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_FREQUENCY, value);
        }
    }

    @objid ("6a0f07fb-feae-4b1d-85cd-d2cd84e8a36d")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();      
        String[] tab_connectedto = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA), referencedHwMedia);  
        String value_connectedto = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO),value_connectedto, tab_connectedto);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_DESCRIPTION),value_description);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt);               
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService(); 
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
               
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);   
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_ASSOCIATIONEND_HWENDPOINT_ASSOCIATIONEND_FREQUENCY),value_frequency);
    }

}
