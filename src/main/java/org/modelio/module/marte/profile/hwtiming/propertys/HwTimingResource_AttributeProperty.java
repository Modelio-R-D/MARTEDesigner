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

@objid ("575694a9-60d5-4e4e-b3c0-4c54be17bff2")
public class HwTimingResource_AttributeProperty implements IPropertyContent {
    @objid ("a1b0b71c-d467-42e6-a577-5605ef89e415")
    private static List<ModelElement> ownedHwResource;

    @objid ("c4217ec0-2832-45cf-b205-eeb4fc2ecea7")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("06112293-3e29-4e56-be8b-b5689ee8c5de")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("e5119321-e4aa-4db2-9fb6-cc991f131650")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("24968246-534a-40fe-b687-4602c6bde16c")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS,
                    value);
        }
    }

    @objid ("6159c078-4424-457b-93a1-001df4b928fa")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timming resource
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = MARTESearchUtils.searchHwResourceService();
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);       
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWTIMINGRESOURCE_ATTRIBUTE_HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
