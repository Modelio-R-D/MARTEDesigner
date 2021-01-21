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

@objid ("e0744c17-c103-4161-a909-4ee9b136429d")
public class HwEndPoint_LinkProperty implements IPropertyContent {
    @objid ("34f4a814-6069-4e62-bb8b-69b070918f8e")
    private static List<ModelElement> ownedHwResource;

    @objid ("f9eb329f-277d-4fa2-8468-29ce11c1de6c")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("930f0aa7-b58f-491a-8efd-152eaa5e712d")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("55bd31d3-5e51-4e18-ab8f-7941eb5a3df8")
    private static List<ModelElement> referencedHwMedia;

    @objid ("7214933b-2ccf-4512-803b-36ab4da90a0b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_CONNECTEDTO,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_DESCRIPTION, value);
        }
        else if(row == 3){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_P_HW_SERVICES,
                     value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     referencedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_R_HW_SERVICES,
                     value);
        }
        else if(row == 5){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResource, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_OWNEDHW,
                     value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_FREQUENCY, value);
        }
    }

    @objid ("963226c0-f671-46b5-af7e-79fb60c64d42")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();     
        String[] tab_connectedto = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA), referencedHwMedia);  
        String value_connectedto = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_CONNECTEDTO),value_connectedto, tab_connectedto);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_DESCRIPTION),value_description);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);  
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINK_HWENDPOINT_LINK_FREQUENCY),value_frequency);
    }

}
