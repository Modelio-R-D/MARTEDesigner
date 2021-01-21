package org.modelio.module.marte.profile.sw_concurrency.propertys;

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

@objid ("03c3af1f-b5c0-486c-a7fb-1ea60024de8c")
public class SwConcurrentResource_ParameterProperty implements IPropertyContent {
    @objid ("40c5dceb-e4b1-457d-a4fa-18714b89e949")
    private static List<ModelElement> typedElement = null;

    @objid ("2557ee70-70bb-48de-a8ac-76005981ef2a")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("779b8f6d-1c83-4f77-8c92-df6478c2ccd4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS, value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ADDRESSSPACE_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ADRESSSPACE, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_PRIORITYELEMENTS_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_STACKSIZEELEMENTS_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS, 
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ACTIVATESERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES, 
                    value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ENABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES, 
                    value);
        }
        else if(row == 10){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_RESUMESERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES, 
                    value);
        }
        else if(row == 11){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SUSPENDSERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES, 
                    value);
        }
        else if(row == 12){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TERMINATESERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES, 
                    value);
        }
        else if(row == 13){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DISABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES, 
                    value);
        }
        else if(row == 14){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SHAREDATARESOURCES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES, 
                    value);
        }
        else if(row == 15){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGERESOURCES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES, 
                    value);
        }
        else if(row == 16){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MUTUALEXCLUSIONRESOURCES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES, 
                    value);
        }
        else if(row == 17){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_NOTIFICATIONRESOURCES_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES, 
                    value);
        }
        else if(row == 18){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_HEAPSIZEELEMENTS_SWCONCURRENTRESOURCE, 
        //                    MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS, s
                    value);
        }
    }

    @objid ("c3540cee-0f41-4f5c-94f2-ec69e1feec57")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Sw Concurrent Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE, elt);
        if(value_type.equals("")){
            value_type = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_TYPE),value_type);
        
        
        String value_activationCapacity = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY, elt);
        if(value_activationCapacity.equals("")){
            value_activationCapacity = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATIONCAPACITY),value_activationCapacity);
        
        
        String value_entryPoint = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.ENTRYPOINT_DEPENDENCY, elt);
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENTRYPOINTS),
                value_entryPoint);
        
        
        String[] tab_adressSpace = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ADDRESSSPACE_SWCONCURRENTRESOURCE), typedElement);
        String value_adressSpace = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ADDRESSSPACE_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.MEMORYPARTITION_PARAMETER_MEMORYPARTITION_PARAMETER_CONCURRENTRESOURCES),value_adressSpace, tab_adressSpace);
        
        String[] tab_periodElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE), typedElement);
        String value_periodElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_PERIODELEMENTS),value_periodElements, tab_periodElements);
        
        String[] tab_priorityElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_PRIORITYELEMENTS_SWCONCURRENTRESOURCE), typedElement);
        String value_priorityElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_PRIORITYELEMENTS_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_PRIORITYELEMENTS),value_priorityElements, tab_priorityElements);
        
        String[] tab_stackSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_STACKSIZEELEMENTS_SWCONCURRENTRESOURCE), typedElement);
        String value_stackSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_STACKSIZEELEMENTS_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_STACKSIZEELEMENTS),value_stackSizeElements, tab_stackSizeElements);
        
        String[] tab_activateServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ACTIVATESERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_activateServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ACTIVATESERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ACTIVATESERVICES),value_activateServices, tab_activateServices);
        
        
        String[] tab_enableConcurrencyServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ENABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_enableConcurrencyServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ENABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_ENABLECONCURRENCYSERVICES),value_enableConcurrencyServices, tab_enableConcurrencyServices);
        
        
        String[] tab_resumeServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_RESUMESERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_resumeServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_RESUMESERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_RESUMESERVICES),value_resumeServices, tab_resumeServices);
        
        
        String[] tab_suspendServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SUSPENDSERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_suspendServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SUSPENDSERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_SUSPENDSERVICES),value_suspendServices, tab_suspendServices);
        
        String[] tab_terminateServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TERMINATESERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_terminateServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TERMINATESERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_TERMINATESERVICES),value_terminateServices, tab_terminateServices);
        
        String[] tab_disableConcurrencyServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DISABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE), behavioralFeature);
        String value_disableConcurrencyServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DISABLECONCURRENCYSERVICES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_DISABLECONCURRENCYSERVICES),value_disableConcurrencyServices, tab_disableConcurrencyServices);
        
        String[] tab_shareDataResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SHAREDATARESOURCES_SWCONCURRENTRESOURCE), typedElement);
        String value_shareDataResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SHAREDATARESOURCES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_SHAREDATARESOURCES),value_shareDataResources, tab_shareDataResources);
        
        
        String[] tab_messageResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGERESOURCES_SWCONCURRENTRESOURCE), typedElement);
        String value_messageResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MESSAGERESOURCES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_MESSAGERESOURCES),value_messageResources, tab_messageResources);
        
        String[] tab_mutualExclusionResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MUTUALEXCLUSIONRESOURCES_SWCONCURRENTRESOURCE), typedElement);
        String value_mutualExclusionResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MUTUALEXCLUSIONRESOURCES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCES),value_mutualExclusionResources, tab_mutualExclusionResources);
        
        
        String[] tab_notificationResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_NOTIFICATIONRESOURCES_SWCONCURRENTRESOURCE), typedElement);
        String value_notificationResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_NOTIFICATIONRESOURCES_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_NOTIFICATIONRESOURCES),value_notificationResources, tab_notificationResources);
        
        String[] tab_heapSizeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_HEAPSIZEELEMENTS_SWCONCURRENTRESOURCE), typedElement);
        String value_heapSizeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HEAPSIZEELEMENTS_SWCONCURRENTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_ASSOCIATIONEND_SWCONCURRENTRESOURCE_ASSOCIATIONEND_HEAPSIZEELEMENTS),value_heapSizeElements, tab_heapSizeElements);
    }

}