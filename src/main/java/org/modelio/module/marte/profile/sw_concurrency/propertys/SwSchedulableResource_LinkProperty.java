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

@objid ("c87b4cbb-b3a8-4cef-a4c9-89f95d586708")
public class SwSchedulableResource_LinkProperty implements IPropertyContent {
    @objid ("1a2b8619-ddfd-4910-bbd8-9ef7e54f2be9")
    private static List<ModelElement> typedElement = null;

    @objid ("b7c7e266-bfb5-40f9-9039-90988eb3caf0")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("365fbf29-0ed2-42e3-b7a4-947b41a0152f")
    private static List<ModelElement> namedElement = null;

    @objid ("0ce5a20d-27cd-4cc1-8524-d3044053bbb8")
    private static List<ModelElement> listScheduler = null;

    @objid ("042defaf-d3b4-4218-b8e0-6732a55fc1fc")
    private static List<ModelElement> listSecondaryScheduler = null;

    @objid ("f71d3232-bedc-4183-b3c0-2c31cd7eb203")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                    namedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_SCHEDULERS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES, 
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_JOINSERVICES, 
                    value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES, 
                    value);
        }    
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS, value);
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
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_HOST,
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
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("b046c51b-1660-448c-a19a-733674716abe")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        namedElement = MARTESearchUtils.searchNamedElement(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISSTATICSCHEDULINGFEATURE, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_ISPREEMPTABLE, elt));
        
        String[] tab_schedulers = ModelUtils.createListString(namedElement);      
        String value_schedulers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_SCHEDULERS), value_schedulers, tab_schedulers);
        
        
        String[] tab_deadlineElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEADLINEELEMENTS),value_deadlineElements, tab_deadlineElements);
        
        String[] tab_deadlineTypeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineTypeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEADLINETYPEELEMENTS),value_deadlineTypeElements, tab_deadlineTypeElements);
        
        String[] tab_timeSliceElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_timeSliceElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_TIMESLICEELEMENTS),value_timeSliceElements, tab_timeSliceElements);
        
        String[] tab_delayServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_delayServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DELAYSERVICES),value_delayServices, tab_delayServices);
        
        String[] tab_joinServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_joinServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_JOINSERVICES),value_joinServices, tab_joinServices);
        
        String[] tab_yieldServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_yieldServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_YIELDSERVICES),value_yieldServices, tab_yieldServices);
        
        String value_schedParams = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_SCHEDPARAMS),value_schedParams);
        
        
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_host = ModelUtils.createListString(listScheduler);      
        String value_host = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_HOST), value_host, tab_host);
        
        
        listSecondaryScheduler = MARTESearchUtils.searchSecondaryScheduler();  
        String[] tab_dependentScheduler = ModelUtils.createListString(listSecondaryScheduler);      
        String value_dependentScheduler = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_LINK_SWSCHEDULABLERESOURCE_LINK_DEPENDENTSCHEDULER), value_dependentScheduler, tab_dependentScheduler);
    }

}
