package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.ArrayList;
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

@objid ("7565a887-820a-4f51-a84f-345d0167a31a")
public class SwSchedulableResource_InstanceProperty implements IPropertyContent {
    @objid ("6594a6dd-669d-4de7-a4d7-2441b390a248")
    private static List<ModelElement> typedElement = null;

    @objid ("60930fa0-7d55-4ae4-9e43-be366c1218d9")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("53a47325-05d6-4995-8af5-cabffa9fcfd7")
    private static List<ModelElement> namedElement = null;

    @objid ("c9f27f5c-c772-4f74-bb25-f62b1ebc654d")
    private static List<ModelElement> listScheduler = null;

    @objid ("b2bfae72-2567-4a38-ad7d-d4e1799ef9f8")
    private static List<ModelElement> listSecondaryScheduler = null;

    @objid ("cb552d87-063e-4d68-839b-3751e4a93800")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                    namedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES, 
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES, 
                    value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES, 
                    value);
        }    
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, value);
        }
        else if(row == 11){
            List<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATIONEND_SCHEDULER_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_ATTRIBUTE_SCHEDULER_ATTRIBUTE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_CLASSIFIER_SCHEDULER_CLASSIFIER_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_INSTANCE_SCHEDULER_INSTANCE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LIFELINE_SCHEDULER_LIFELINE_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULER_PARAMETER_SCHEDULER_PARAMETER_PROTECTEDSHAREDRESOURCES);
        
            ModelUtils.manageOneToMultipleLink(elt, 
                    listScheduler, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, 
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST,
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 12){
        
            List<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATION_SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ATTRIBUTE_SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_CLASSIFIER_SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_LIFELINE_SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_LINK_SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SECONDARYSCHEDULER_PARAMETER_SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS);
        
            ModelUtils.manageOneToMultipleLink(elt, 
                    listSecondaryScheduler, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, 
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("29cff639-4141-46dd-899b-fce464a4a5f1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        namedElement = MARTESearchUtils.searchNamedElement(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISSTATICSCHEDULINGFEATURE, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_ISPREEMPTABLE, elt));
        
        String[] tab_schedulers = ModelUtils.createListString(namedElement);      
        String value_schedulers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDULERS), value_schedulers, tab_schedulers);
        
        
        String[] tab_deadlineElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINEELEMENTS),value_deadlineElements, tab_deadlineElements);
        
        String[] tab_deadlineTypeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineTypeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEADLINETYPEELEMENTS),value_deadlineTypeElements, tab_deadlineTypeElements);
        
        String[] tab_timeSliceElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_timeSliceElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_TIMESLICEELEMENTS),value_timeSliceElements, tab_timeSliceElements);
        
        String[] tab_delayServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_delayServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DELAYSERVICES),value_delayServices, tab_delayServices);
        
        String[] tab_joinServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_joinServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_JOINSERVICES),value_joinServices, tab_joinServices);
        
        String[] tab_yieldServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_yieldServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_YIELDSERVICES),value_yieldServices, tab_yieldServices);
        
        String value_schedParams = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_SCHEDPARAMS),value_schedParams);
        
        
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_host = ModelUtils.createListString(listScheduler);      
        String value_host = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_HOST), value_host, tab_host);
        
        
        listSecondaryScheduler = MARTESearchUtils.searchSecondaryScheduler();  
        String[] tab_dependentScheduler = ModelUtils.createListString(listSecondaryScheduler);      
        String value_dependentScheduler = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_INSTANCE_SWSCHEDULABLERESOURCE_INSTANCE_DEPENDENTSCHEDULER), value_dependentScheduler, tab_dependentScheduler);
    }

}
