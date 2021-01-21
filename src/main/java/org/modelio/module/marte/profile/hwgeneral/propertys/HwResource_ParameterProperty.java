package org.modelio.module.marte.profile.hwgeneral.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("420dcb18-3d3c-483e-b781-a2759983034c")
public class HwResource_ParameterProperty implements IPropertyContent {
    @objid ("cc8589b2-f17b-478a-ae32-f7434c30c7ec")
    private static List<ModelElement> ownedHwResource;

    @objid ("ac401f4b-d4c6-4519-90a3-c522cce15f44")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("d5cdca53-3a60-4e2b-a331-39e21cd01b88")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("05023b61-ee90-4a10-ab77-c3220139c41c")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("15734e93-f659-4652-947e-ede43e3b51a8")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_ENDPOINTS,
                    value);
        }
    }

    @objid ("c622ea99-c2ff-465c-8ee7-4203544016c1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_DESCRIPTION),value_description);
        
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);   
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_PARAMETER_HWRESOURCE_PARAMETER_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
