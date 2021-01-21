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

@objid ("564136d5-581c-48c2-ada1-efcd326f0625")
public class HwComputingResource_AssociationEndProperty implements IPropertyContent {
    @objid ("09ab9a59-d54e-4c41-bc37-0025ef4fbbf4")
    private static List<ModelElement> ownedHwResource;

    @objid ("76eb0bce-cff3-4472-9ccb-3139e1285840")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("d5e21b52-e9c3-49a7-a754-311630b9a3d2")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("8aec9603-fdc1-4dcb-bbce-b6d5f713284e")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("0660a6a9-477d-4c03-960c-fd1569960f83")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, value);
        }
        
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS,
                    value);
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS, value);
        }
    }

    @objid ("49d0751d-c525-4c18-b382-7e3ea9b384d4")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Computing Resource
        //
        String value_op_Frequencies = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES),value_op_Frequencies);
            
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION),value_description);
        
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);    
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY),value_frequency);
        
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);    
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
