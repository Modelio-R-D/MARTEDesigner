package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.gqam.propertys.DefaultProperty;

@objid ("b199d922-1eda-4096-85ea-33d2188724bf")
public class PropertyManager {
    @objid ("283abc74-a4c4-4b03-9272-c904e7e61040")
    public static IPropertyContent getPalette(Stereotype ste) {
        if(ste.getName().equals(MARTEDesignerStereotypes.ACQUIRE_BEHAVIOR)){
            return new Acquire_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ACQUIRE_COLLABORATION)){
            return new Acquire_CollaborationProperty();
        }      
        else if(ste.getName().equals(MARTEDesignerStereotypes.ACQUIRE_COLLABORATIONUSE)){
            return new Acquire_CollaborationUseProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ACQUIRE_EXECUTIONSPECIFICATION)){
            return new Acquire_ExecutionSpecificationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.ACQUIRE_OPERATION)){
            return new Acquire_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ASSOCIATION)){
            return new CommunicationEndPoint_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ASSOCIATIONEND)){
            return new CommunicationEndPoint_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_ATTRIBUTE)){
            return new CommunicationEndPoint_AttributeProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_CLASSIFIER)){
            return new CommunicationEndPoint_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_INSTANCE)){
            return new CommunicationEndPoint_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LIFELINE)){
            return new CommunicationEndPoint_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LINK)){
            return new CommunicationEndPoint_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONENDPOINT_LINKEND)){
            return new CommunicationEndPoint_LinkEndProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATION)){
            return new CommunicationMedia_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ASSOCIATIONEND)){
            return new CommunicationMedia_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_ATTRIBUTE)){
            return new CommunicationMedia_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_CLASSIFIER)){
            return new CommunicationMedia_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_INSTANCE)){
            return new CommunicationMedia_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LIFELINE)){
            return new CommunicationMedia_LifelineProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LINK)){
            return new CommunicationMedia_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.COMMUNICATIONMEDIA_PARAMETER)){
            return new CommunicationMedia_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GRSERVICE_BEHAVIOR)){
            return new GrService_BehaviorProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GRSERVICE_COLLABORATION)){
            return new GrService_CollaborationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GRSERVICE_COLLABORATIONUSE)){
            return new GrService_CollaborationUseProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GRSERVICE_EXECUTIONSPECIFICATION)){
            return new GrService_ExecutionSpecificationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.GRSERVICE_OPERATION)){
            return new GrService_OperationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION)){
            return new MutualExclusionResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND)){
            return new MutualExclusionResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE)){
            return new MutualExclusionResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_CLASSIFIER)){
            return new MutualExclusionResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_INSTANCE)){
            return new MutualExclusionResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE)){
            return new MutualExclusionResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK)){
            return new MutualExclusionResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_PARAMETER)){
            return new MutualExclusionResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATIONEND)){
            return new ProcessingResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_ASSOCIATION)){
            return new ProcessingResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_ATTRIBUTE)){
            return new ProcessingResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_CLASSIFIER)){
            return new ProcessingResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_INSTANCE)){
            return new ProcessingResource_InstanceProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_LIFELINE)){
            return new ProcessingResource_LifelineProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_LINK)){
            return new ProcessingResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.PROCESSINGRESOURCE_PARAMETER)){
            return new ProcessingResource_ParameterProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCEUSAGE_MODELELEMENT)){
            return new ResourceUsage_ModelElementProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_ASSOCIATIONEND)){
            return new Resource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_ASSOCIATION)){
            return new Resource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_ATTRIBUTE)){
            return new Resource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_CLASSIFIER)){
            return new Resource_ClassifierProperty();
        }
        
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_INSTANCE)){
            return new Resource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_LIFELINE)){
            return new Resource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_LINK)){
            return new Resource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_LINKEND)){
            return new Resource_LinkEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.RESOURCE_PARAMETER)){
            return new Resource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATION)){
            return new SchedulableResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND)){
            return new SchedulableResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ATTRIBUTE)){
            return new SchedulableResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER)){
            return new SchedulableResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE)){
            return new SchedulableResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_ASSOCIATION)){
            return new Scheduler_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_ASSOCIATIONEND)){
            return new Scheduler_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_ATTRIBUTE)){
            return new Scheduler_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER)){
            return new Scheduler_ClassifierProperty();
        }     
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_INSTANCE)){
            return new Scheduler_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_LIFELINE)){
            return new Scheduler_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_LINK)){
            return new Scheduler_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SCHEDULER_PARAMETER)){
            return new Scheduler_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATION)){
            return new SecondaryScheduler_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATIONEND)){
            return new SecondaryScheduler_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_ATTRIBUTE)){
            return new SecondaryScheduler_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER)){
            return new SecondaryScheduler_ClassifierProperty();
        }     
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_INSTANCE)){
            return new SecondaryScheduler_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_LIFELINE)){
            return new SecondaryScheduler_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_LINK)){
            return new SecondaryScheduler_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.SECONDARYSCHEDULER_PARAMETER)){
            return new SecondaryScheduler_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_ASSOCIATION)){
            return new StorageResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_ASSOCIATIONEND)){
            return new StorageResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_ATTRIBUTE)){
            return new StorageResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_CLASSIFIER)){
            return new StorageResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_INSTANCE)){
            return new StorageResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_LIFELINE)){
            return new StorageResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_LINK)){
            return new StorageResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.STORAGERESOURCE_PARAMETER)){
            return new StorageResource_ParameterProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_ASSOCIATION)){
            return new TimerResource_AssociationProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_ASSOCIATIONEND)){
            return new TimerResource_AssociationEndProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_ATTRIBUTE)){
            return new TimerResource_AttributeProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER)){
            return new TimerResource_ClassifierProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_INSTANCE)){
            return new TimerResource_InstanceProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_LIFELINE)){
            return new TimerResource_LifelineProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_LINK)){
            return new TimerResource_LinkProperty();
        }
        else if(ste.getName().equals(MARTEDesignerStereotypes.TIMERRESOURCE_PARAMETER)){
            return new TimerResource_ParameterProperty();
        }
        return new DefaultProperty();
    }

}
