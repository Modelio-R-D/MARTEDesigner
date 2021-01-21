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

@objid ("c872652d-2366-4cb7-a043-6f3e0a29bff6")
public class HwEndPoint_ParameterProperty implements IPropertyContent {
    @objid ("bb3cb67b-0819-4109-98f6-e1b65c147965")
    private static List<ModelElement> ownedHwResource;

    @objid ("a5a1b3e3-cc74-46c8-ad74-22c54a1d6fb6")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("d76ba7b5-853b-48af-a0e1-f23228aab121")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("8d25ba7f-8fd7-4689-9254-aaa5efbf33bd")
    private static List<ModelElement> referencedHwMedia;

    @objid ("30082be6-20c4-4755-bc0a-5b5ad3d4362d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_CONNECTEDTO,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_DESCRIPTION, value);
        }
        else if(row == 3){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_P_HW_SERVICES,
                     value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     referencedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_R_HW_SERVICES,
                     value);
        }
        else if(row == 5){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResource, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_OWNEDHW,
                     value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_FREQUENCY, value);
        }
    }

    @objid ("4a4dff50-c854-4ef3-8c78-9a84d099b2aa")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();     
        String[] tab_connectedto = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA), referencedHwMedia);  
        String value_connectedto = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_CONNECTEDTO),value_connectedto, tab_connectedto);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_DESCRIPTION),value_description);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);  
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_PARAMETER_HWENDPOINT_PARAMETER_FREQUENCY),value_frequency);
    }

}
