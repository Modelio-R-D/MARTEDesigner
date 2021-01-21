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

@objid ("7d10b937-e546-4378-aba3-ffba2017baa9")
public class HwEndPoint_LinkEndProperty implements IPropertyContent {
    @objid ("e3374f01-1973-435e-8c9c-ec92484aca84")
    private static List<ModelElement> ownedHwResource;

    @objid ("203b3130-619f-4e01-8297-1a775d0e8786")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("3a18e0fd-f65a-4875-b009-d19dd71bbbe8")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("85a8fa7c-a623-4a3c-a904-bee57138a4b6")
    private static List<ModelElement> referencedHwMedia;

    @objid ("577bcb39-7780-4911-a6c0-0aa221bbc88a")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_CONNECTEDTO,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_DESCRIPTION, value);
        }
        else if(row == 3){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_P_HW_SERVICES,
                     value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     referencedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_R_HW_SERVICES,
                     value);
        }
        else if(row == 5){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResource, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_OWNEDHW,
                     value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_FREQUENCY, value);
        }
    }

    @objid ("f287a2fd-e924-480a-a8cd-ecaca3ebc862")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();     
        String[] tab_connectedto = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA), referencedHwMedia);  
        String value_connectedto = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_CONNECTEDTO),value_connectedto, tab_connectedto);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_DESCRIPTION),value_description);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);   
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_LINKEND_HWENDPOINT_LINKEND_FREQUENCY),value_frequency);
    }

}
