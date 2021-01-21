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

@objid ("c25a1448-f249-4699-9134-de9ce675b090")
public class SwSchedulableResource_AssociationProperty implements IPropertyContent {
    @objid ("e8202040-105a-480d-9601-ad70d810b992")
    private static List<ModelElement> typedElement = null;

    @objid ("1682f07a-b272-4a40-b5b7-af40e3096a0a")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("3c70fa6a-c951-491e-ae28-b8238794c746")
    private static List<ModelElement> namedElement = null;

    @objid ("8e57fa19-27a8-4a90-b95a-678d278d7373")
    private static List<ModelElement> listScheduler = null;

    @objid ("0b44344f-ca39-4aad-8196-240c072d59ec")
    private static List<ModelElement> listSecondaryScheduler = null;

    @objid ("ce82e947-1da4-4fdf-b819-3a3a8f31c50f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageSingleOrientedLink(elt, 
                    namedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS, 
                    value);
        }
        else if(row == 7){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES, 
                    value);
        }
        else if(row == 8){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES, 
                    value);
        }
        else if(row == 9){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, 
        //                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES, 
                    value);
        }    
        else if(row == 10){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS, value);
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
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_HOST,
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
                    MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("3cace26f-e79c-4689-ab82-02994ab80260")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        namedElement = MARTESearchUtils.searchNamedElement(); 
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISSTATICSCHEDULINGFEATURE, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_ISPREEMPTABLE, elt));
        
        String[] tab_schedulers = ModelUtils.createListString(namedElement);      
        String value_schedulers = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULERS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDULERS), value_schedulers, tab_schedulers);
        
        
        String[] tab_deadlineElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINEELEMENTS),value_deadlineElements, tab_deadlineElements);
        
        String[] tab_deadlineTypeElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_deadlineTypeElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEADLINETYPEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEADLINETYPEELEMENTS),value_deadlineTypeElements, tab_deadlineTypeElements);
        
        String[] tab_timeSliceElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE), typedElement);
        String value_timeSliceElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_TIMESLICEELEMENTS_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_TIMESLICEELEMENTS),value_timeSliceElements, tab_timeSliceElements);
        
        String[] tab_delayServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_delayServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DELAYSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DELAYSERVICES),value_delayServices, tab_delayServices);
        
        String[] tab_joinServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_joinServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_JOINSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_JOINSERVICES),value_joinServices, tab_joinServices);
        
        String[] tab_yieldServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE), behavioralFeature);
        String value_yieldServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_YIELDSERVICES_SWSCHEDULABLERESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_YIELDSERVICES),value_yieldServices, tab_yieldServices);
        
        String value_schedParams = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_SCHEDPARAMS),value_schedParams);
        
        
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_host = ModelUtils.createListString(listScheduler);      
        String value_host = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_HOST), value_host, tab_host);
        
        
        listSecondaryScheduler = MARTESearchUtils.searchSecondaryScheduler();  
        String[] tab_dependentScheduler = ModelUtils.createListString(listSecondaryScheduler);      
        String value_dependentScheduler = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_ASSOCIATION_SWSCHEDULABLERESOURCE_ASSOCIATION_DEPENDENTSCHEDULER), value_dependentScheduler, tab_dependentScheduler);
    }

}