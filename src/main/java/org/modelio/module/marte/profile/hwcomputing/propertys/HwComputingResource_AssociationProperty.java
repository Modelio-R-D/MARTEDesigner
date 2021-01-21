package org.modelio.module.marte.profile.hwcomputing.propertys;

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

@objid ("1a41d20b-c2e7-4fc2-be45-308b77c7f862")
public class HwComputingResource_AssociationProperty implements IPropertyContent {
    @objid ("27e2ae5b-e542-4aea-8415-a27d6761e9d2")
    private static List<ModelElement> ownedHwResource;

    @objid ("cf55c41d-4515-4a25-aaf0-a79829969b7d")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("0f62c067-a96d-4da3-8c2f-2e3c09392c39")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("4364651b-3649-4d66-ab68-6819723986b5")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("f7babf12-6cb1-4663-bd86-3e2fbbcd83de")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, value);
        }
        
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS,
                    value);
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS, value);
        }
    }

    @objid ("77872b38-fe66-45e0-8c65-47c520e69855")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Computing Resource
        //
        String value_op_Frequencies = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OP_FREQUENCIES),value_op_Frequencies);
            
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);    
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);      
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATION_HWCOMPUTINGRESOURCE_ASSOCIATION_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
