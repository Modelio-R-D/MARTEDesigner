package org.modelio.module.marte.profile.grm.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6276971c-5a7c-4ade-bdd7-bae74cbe2dae")
public class SchedulableResource_LifelineProperty implements IPropertyContent {
    @objid ("f918a496-c310-4a77-9b09-9d8f275b956e")
    private static List<ModelElement> listScheduler = null;

    @objid ("593366b5-0780-45ae-8700-28d1cbad7fa0")
    private static List<ModelElement> listSecondaryScheduler = null;

    @objid ("a2bbb37b-1e12-4278-ac54-58e09bbe4b4d")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS, value);
        }
        else if(row == 2){
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
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
                    MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_HOST,
                    possibleTagTypeName,
                    value
            );
        
        }
        else if(row == 3){
        
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
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
                    MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("96e3c2f9-46d3-4a4e-8500-cb97fe3a6b72")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Schedulable Resource
        //
        String value_schedParams = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_SCHEDPARAMS),value_schedParams);
        
        
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_host = ModelUtils.createListString(listScheduler);      
        String value_host = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_HOST), value_host, tab_host);
        
        
        listSecondaryScheduler = MARTESearchUtils.searchSecondaryScheduler();  
        String[] tab_dependentScheduler = ModelUtils.createListString(listSecondaryScheduler);      
        String value_dependentScheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_DEPENDENTSCHEDULER), value_dependentScheduler, tab_dependentScheduler);
    }

}
