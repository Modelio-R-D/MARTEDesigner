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

@objid ("ccf472f1-9188-4370-bca5-a1a16c99a8ce")
public class HwResource_AttributeProperty implements IPropertyContent {
    @objid ("67c6b1c2-e041-4922-a461-aa24caba4c50")
    private static List<ModelElement> ownedHwResource;

    @objid ("fcc2de0e-eb9f-4ca0-8d28-82e4c5eaa033")
    private static List<ModelElement> ownedHwEndPoint;

    @objid ("92d12b90-b33d-4085-9e47-ecf25928c77d")
    private static List<ModelElement> ownedHwResourceService;

    @objid ("e4a9e423-180a-4e10-803c-6df2f6ce07d7")
    private static List<ModelElement> referencedHwResourceService;

    @objid ("e00396ac-8b3e-4c74-bafd-48d7ee413280")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_DESCRIPTION, value);
        }
        else if(row == 2){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_P_HW_SERVICES,
                    value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    referencedHwResourceService, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_R_HW_SERVICES,
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_OWNEDHW,
                    value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_FREQUENCY, value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    ownedHwEndPoint, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, 
        //                    MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_ENDPOINTS,
                    value);
        }
    }

    @objid ("4d34c76a-b7d7-4cac-be7f-1d115eba3615")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw End Point
        //
        String value_description = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_DESCRIPTION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_DESCRIPTION),value_description);
        
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
        
        ownedHwResourceService = MARTESearchUtils.getOwnedHwResourceService(elt); 
        String[] tab_p_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), ownedHwResourceService);  
        String value_p_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_P_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_P_HW_SERVICES),value_p_hw_services, tab_p_hw_services);
        
        
        referencedHwResourceService = ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        referencedHwResourceService.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        
        String[] tab_r_hw_services = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE), referencedHwResourceService);  
        String value_r_hw_services = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_R_HW_SERVICES_HWRESOURCE_HWRESOURCESERVICE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_R_HW_SERVICES),value_r_hw_services, tab_r_hw_services);
        
        ownedHwResource = MARTESearchUtils.getOwnedHwResource(elt);   
        String[] tab_ownedhw = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE), ownedHwResource);  
        String value_ownedhw = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_OWNEDHW_HWRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_OWNEDHW),value_ownedhw, tab_ownedhw);
        
        
        String value_frequency = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_FREQUENCY, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_FREQUENCY),value_frequency);
        
        ownedHwEndPoint = MARTESearchUtils.getOwnedHwEndPoint(elt);     
        String[] tab_ownedendpoints = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT), ownedHwEndPoint);  
        String value_ownedendpoints = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENDPOINTS_HWRESOURCE_HWENDPOINT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRESOURCE_ATTRIBUTE_HWRESOURCE_ATTRIBUTE_ENDPOINTS),value_ownedendpoints, tab_ownedendpoints);
    }

}
