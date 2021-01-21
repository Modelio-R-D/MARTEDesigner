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

@objid ("0627d20d-a4e3-4629-b0bf-10c1a14f9021")
public class SchedulableResource_AssociationEndProperty implements IPropertyContent {
    @objid ("0baa41ea-0780-4115-bc3c-fda418d0ae3f")
    private static List<ModelElement> listScheduler = null;

    @objid ("bf2130af-8f15-435e-9262-e391dc391985")
    private static List<ModelElement> listSecondaryScheduler = null;

    @objid ("df91295c-9c07-4ba4-8cc4-2160131b6651")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS, value);
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
                    MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST,
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
                    MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER,
                    possibleTagTypeName,
                    value
            );
        }
    }

    @objid ("545c9a2f-ffa7-4a56-8f2b-58263d0fddae")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Schedulable Resource
        //
        String value_schedParams = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDPARAMS),value_schedParams);
        
        
        listScheduler = MARTESearchUtils.searchScheduler();   
        String[] tab_host = ModelUtils.createListString(listScheduler);      
        String value_host = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST), value_host, tab_host);
        
        
        listSecondaryScheduler = MARTESearchUtils.searchSecondaryScheduler();  
        String[] tab_dependentScheduler = ModelUtils.createListString(listSecondaryScheduler);      
        String value_dependentScheduler = ModelUtils.getSourceDependencyNames(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_DEPENDENTSCHEDULER_SCHEDULABLERESOURCE_SECONDARYSCHEDULER);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_DEPENDENTSCHEDULER), value_dependentScheduler, tab_dependentScheduler);
    }

}
