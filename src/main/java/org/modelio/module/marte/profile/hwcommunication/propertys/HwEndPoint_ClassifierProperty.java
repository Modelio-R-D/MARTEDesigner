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

@objid ("a6a3487e-68ac-4f1a-8cc9-e6ed12d09cf3")
public class HwEndPoint_ClassifierProperty implements IPropertyContent {
    @objid ("9f366976-9e0b-4900-9607-88c435bf2634")
    private static List<ModelElement> ownedHwResource;

    @objid ("de0d2552-5e96-4c4c-b42a-46c6c49e0b91")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("e6aa1487-06eb-474b-802b-4f801a4711df")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("6b187736-6a6f-4c2f-b77e-8e9351712c9a")
    private static List<ModelElement> referencedHwMedia;

    @objid ("fbd65870-5702-46c7-b658-90b78d8eb295")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwMedia, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, 
        //                    MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO,
                    value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_DESCRIPTION, value);
        }
        else if(row == 3){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_P_HW_SERVICES,
                     value);
        }
        else if(row == 4){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     referencedHwResourceService, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_R_HW_SERVICES,
                     value);
        }
        else if(row == 5){
             ModelUtils.manageMultipleOrientedLink(elt, 
                     ownedHwResource, 
                     MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                     MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_OWNEDHW,
                     value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_FREQUENCY, value);
        }
    }

    @objid ("8f1f1543-7ce6-418b-9dac-48d378db9316")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        referencedHwMedia = MARTESearchUtils.searchHwMedia();     
        String[] tab_connectedto = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA), referencedHwMedia);  
        String value_connectedto = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_CONNECTEDTO_HWENDPOINT_HWMEDIA, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_CONNECTEDTO),value_connectedto, tab_connectedto);
        
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_DESCRIPTION),value_description);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService(); 
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);    
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWENDPOINT_CLASSIFIER_HWENDPOINT_CLASSIFIER_FREQUENCY),value_frequency);
    }

}
