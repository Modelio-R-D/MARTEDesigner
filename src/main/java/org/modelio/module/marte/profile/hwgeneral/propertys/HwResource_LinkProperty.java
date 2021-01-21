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

@objid ("a5970d97-dddc-40c4-8b90-50d2a68cb4db")
public class HwResource_LinkProperty implements IPropertyContent {
    @objid ("71cc724b-49ed-488b-ab74-2e1d4a6bc7d5")
    private static List<ModelElement> ownedHwResource;

    @objid ("f0f2d95b-64d7-4faa-ae3e-20b5dc3f5804")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("e2b0bebf-e7d7-497b-adb5-f70bea540649")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("b0017eb4-3d06-4e14-bf06-41982ce73f96")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("6ec09f93-fbd7-4030-a547-d03e7eb8df8b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_ENDPOINTS,
                    value);
        }
    }

    @objid ("25589d67-5884-4deb-adf1-942ed32c00bd")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_DESCRIPTION),value_description);
        
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);  
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);   
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_LINK_HWRESOURCE_LINK_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
