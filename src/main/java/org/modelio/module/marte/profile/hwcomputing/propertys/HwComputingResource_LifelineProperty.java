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

@objid ("1369bef3-273e-4316-acdc-2eca1fea3c2c")
public class HwComputingResource_LifelineProperty implements IPropertyContent {
    @objid ("1872fc03-4998-44b0-9ce5-b76ab2be7b52")
    private static List<ModelElement> ownedHwResource;

    @objid ("5b51d345-4c19-47b2-afcc-4359b2cd3a8f")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("00b71f39-f0cf-4b7e-8bf0-1c7f477bbe52")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("199912f1-dfb9-4dbf-a330-f65a599cbc69")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("957c1e1a-82bf-4688-965a-5bb614ccb26e")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES,
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW,
                    value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, value);
        }
        
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS,
                    value);
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS, value);
        }
    }

    @objid ("60f5a75e-55c8-4f22-88ca-dfbae34b97cc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Computing Resource
        //
        String value_op_Frequencies = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES),value_op_Frequencies);
            
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION),value_description);
        
        ownedHwResourceService =  MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);    
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);     
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
