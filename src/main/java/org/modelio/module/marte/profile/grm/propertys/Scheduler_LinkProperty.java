package org.modelio.module.marte.profile.grm.propertys;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9f4865b4-e649-43f2-ac8b-4e770a3d09da")
public class Scheduler_LinkProperty implements IPropertyContent {
    @objid ("823fa507-c5b1-4b84-9dff-d5a7ce54343f")
    private static List<ModelElement> listComputingResource = null;

    @objid ("a7a9e295-d331-4a91-9b93-e2321fa8116b")
    private static List<ModelElement> listMutualExclusionResource = null;

    @objid ("0e1c02be-d1b5-4b85-8cb7-f3b55a70d54c")
    private static List<ModelElement> listProcessingResource = null;

    @objid ("de9656ff-f390-440f-9805-4f7818e2554b")
    private static List<ModelElement> listSchedulableResource = null;

    @objid ("bbf24381-67a1-4647-a98f-ce9a8f04a199")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_ISPREEMPTIBLE, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDPOLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_OTHERSCHEDPOLICY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULE, value);
        }
        else if(row == 5){
            List<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATION_PROCESSINGRESOURCE_ASSOCIATION_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ASSOCIATIONEND_PROCESSINGRESOURCE_ASSOCIATIONEND_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_ATTRIBUTE_PROCESSINGRESOURCE_ATTRIBUTE_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_INSTANCE_PROCESSINGRESOURCE_INSTANCE_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LIFELINE_PROCESSINGRESOURCE_LIFELINE_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_LINK_PROCESSINGRESOURCE_LINK_MAINSCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.PROCESSINGRESOURCE_PARAMETER_PROCESSINGRESOURCE_PARAMETER_MAINSCHEDULER);
        
            ModelUtils.manageMultipleToOneLink(elt,
                    listProcessingResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER, 
                    possibleTagTypeName,
                    MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROCESSINGUNITS,
                    value
            );
        }
        else if(row == 6){
        
            ModelUtils.manageSingleOrientedLink(elt, 
                    listComputingResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULER_COMPUTINGRESOURCE, 
        //                    MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_HOST, 
                    value
            );
        }
        else if(row == 7){
            List<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCE_CLASSIFIER_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCE_INSTANCE_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER);
            possibleTagTypeName.add(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER);
        
            ModelUtils.manageMultipleToOneLink(elt,
                    listMutualExclusionResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER, 
                    possibleTagTypeName,
                    MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES,
                    value
            );
        }
        else if(row == 8){
            ArrayList<String> possibleTagTypeName = new ArrayList<>();
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATION_SCHEDULABLERESOURCE_ASSOCIATION_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ASSOCIATIONEND_SCHEDULABLERESOURCE_ASSOCIATIONEND_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_ATTRIBUTE_SCHEDULABLERESOURCE_ATTRIBUTE_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_CLASSIFIER_SCHEDULABLERESOURCE_CLASSIFIER_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_INSTANCE_SCHEDULABLERESOURCE_INSTANCE_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LIFELINE_SCHEDULABLERESOURCE_LIFELINE_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_LINK_SCHEDULABLERESOURCE_LINK_HOST);
            possibleTagTypeName.add(MARTEDesignerTagTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDULABLERESOURCE_PARAMETER_HOST);
        
            ModelUtils.manageMultipleToOneLink(elt,
                    listSchedulableResource, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, 
                    possibleTagTypeName,
                    MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULABLERESOURCES,
                    value
            );
        }
    }

    @objid ("61deb9d4-493b-42f2-81c6-a984aa9402e1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Scheduler
        //
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_ISPREEMPTIBLE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_ISPREEMPTIBLE, elt));
        
        String[] types = MARTEEnumerationUtils.getSchedPolicyKind();
        String value_schedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDPOLICY, elt);
        if(!(MARTEEnumerationUtils.isSchedPolicyKind(value_schedPolicy))){
             value_schedPolicy = "FixedPriority";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDPOLICY),value_schedPolicy, types);
        
        
        String value_otherSchedPolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_OTHERSCHEDPOLICY, elt);
        if(value_otherSchedPolicy.equals("")){
            value_otherSchedPolicy = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_OTHERSCHEDPOLICY),value_otherSchedPolicy);
        
        
        String value_schedule = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULE, elt);
        if(value_schedule.equals("")){
            value_schedule = "";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULE),value_schedule);
        
        //
        // Processing Units
        //
        
        listProcessingResource = new ArrayList<> ();
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATION));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATIONEND));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_ATTRIBUTE));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_INSTANCE));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_LIFELINE));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_LINK));
        listProcessingResource.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.PROCESSINGRESOURCE_PARAMETER));
        
        String[] tab_processingUnits = ModelUtils.createListAddRemove( LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER), listProcessingResource);            
        String value_processingUnits = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROCESSINGUNITS), value_processingUnits, tab_processingUnits);
        
        //
        //  host 
        //
        listComputingResource = new ArrayList<> ();
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_ASSOCIATION));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_ASSOCIATIONEND));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_ATTRIBUTE));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_CLASSIFIER));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_INSTANCE));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_LIFELINE));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_LINK));
        listComputingResource.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.COMPUTINGRESOURCE_PARAMETER));
        
        
        String[] tab_host = ModelUtils.createListString(listComputingResource);      
        String value_host = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULER_COMPUTINGRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_HOST), value_host, tab_host);
        
        //
        // ProtectedSharedResources
        //
        listMutualExclusionResource = new ArrayList<> ();
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_INSTANCE));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK));
        listMutualExclusionResource.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER));
        
        String[] tab_protectedSharedRsources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER), listMutualExclusionResource);      
        String value_protectedSharedRsources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_SCHEDULER_MUTUALEXCLUSIONRESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_PROTECTEDSHAREDRESOURCES), value_protectedSharedRsources, tab_protectedSharedRsources);
        
        //
        // SchedulableResources
        //
        
        listSchedulableResource = new ArrayList<> ();
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATION));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ATTRIBUTE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK));
        listSchedulableResource.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER));
        
        
        String[] tab_schedulableResources = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER), listSchedulableResource);      
        String value_schedulableResources = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_HOST_SCHEDULABLERESOURCE_SCHEDULER, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.SCHEDULER_LINK_SCHEDULER_LINK_SCHEDULABLERESOURCES), value_schedulableResources, tab_schedulableResources);
    }

}
