/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;
import org.modelio.module.marte.api.extensions.infrastructure.dependency.*;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'MARTEDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>MARTE Designer is a Modelio extension, used to model MARTE architectures.</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< Acquire_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link AcquireBehavior}
 * <li><< Acquire_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link AcquireCollaboration}
 * <li><< Acquire_CollaborationUse >> on a {@link org.modelio.metamodel.uml.statik.CollaborationUse}: instantiates a {@link AcquireCollaborationUse}
 * <li><< Acquire_ExecutionSpecification >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification}: instantiates a {@link AcquireExecutionSpecification}
 * <li><< Acquire_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link AcquireOperation}
 * <li><< ClockResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ClockResourceAssociation}
 * <li><< ClockResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ClockResourceAssociationEnd}
 * <li><< ClockResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ClockResourceAttribute}
 * <li><< ClockResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link ClockResourceClassifier}
 * <li><< ClockResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ClockResourceInstance}
 * <li><< ClockResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link ClockResourceLifeline}
 * <li><< ClockResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ClockResourceLink}
 * <li><< ClockResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ClockResourceParameter}
 * <li><< CommunicationEndPoint_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link CommunicationEndPointAssociation}
 * <li><< CommunicationEndPoint_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link CommunicationEndPointAssociationEnd}
 * <li><< CommunicationEndPoint_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link CommunicationEndPointAttribute}
 * <li><< CommunicationEndPoint_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link CommunicationEndPointClassifier}
 * <li><< CommunicationEndPoint_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link CommunicationEndPointInstance}
 * <li><< CommunicationEndPoint_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link CommunicationEndPointLifeline}
 * <li><< CommunicationEndPoint_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link CommunicationEndPointLink}
 * <li><< CommunicationEndPoint_LinkEnd >> on a {@link org.modelio.metamodel.uml.statik.LinkEnd}: instantiates a {@link CommunicationEndPointLinkEnd}
 * <li><< CommunicationEndPoint_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link CommunicationEndPointParameter}
 * <li><< CommunicationMedia_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link CommunicationMediaAssociation}
 * <li><< CommunicationMedia_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link CommunicationMediaAssociationEnd}
 * <li><< CommunicationMedia_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link CommunicationMediaAttribute}
 * <li><< CommunicationMedia_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link CommunicationMediaClassifier}
 * <li><< CommunicationMedia_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link CommunicationMediaInstance}
 * <li><< CommunicationMedia_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link CommunicationMediaLifeline}
 * <li><< CommunicationMedia_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link CommunicationMediaLink}
 * <li><< CommunicationMedia_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link CommunicationMediaParameter}
 * <li><< ComputingResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ComputingResourceAssociation}
 * <li><< ComputingResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ComputingResourceAssociationEnd}
 * <li><< ComputingResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ComputingResourceAttribute}
 * <li><< ComputingResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link ComputingResourceClassifier}
 * <li><< ComputingResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ComputingResourceInstance}
 * <li><< ComputingResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link ComputingResourceLifeline}
 * <li><< ComputingResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ComputingResourceLink}
 * <li><< ComputingResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ComputingResourceParameter}
 * <li><< ConcurrencyResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ConcurrencyResourceAssociation}
 * <li><< ConcurrencyResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ConcurrencyResourceAssociationEnd}
 * <li><< ConcurrencyResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ConcurrencyResourceAttribute}
 * <li><< ConcurrencyResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link ConcurrencyResourceClassifier}
 * <li><< ConcurrencyResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ConcurrencyResourceInstance}
 * <li><< ConcurrencyResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link ConcurrencyResourceLifeline}
 * <li><< ConcurrencyResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ConcurrencyResourceLink}
 * <li><< ConcurrencyResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ConcurrencyResourceParameter}
 * <li><< DeviceResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link DeviceResourceAssociation}
 * <li><< DeviceResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link DeviceResourceAssociationEnd}
 * <li><< DeviceResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link DeviceResourceAttribute}
 * <li><< DeviceResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link DeviceResourceClassifier}
 * <li><< DeviceResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DeviceResourceInstance}
 * <li><< DeviceResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link DeviceResourceLifeline}
 * <li><< DeviceResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link DeviceResourceLink}
 * <li><< DeviceResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link DeviceResourceParameter}
 * <li><< GrService_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link GrServiceBehavior}
 * <li><< GrService_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link GrServiceCollaboration}
 * <li><< GrService_CollaborationUse >> on a {@link org.modelio.metamodel.uml.statik.CollaborationUse}: instantiates a {@link GrServiceCollaborationUse}
 * <li><< GrService_ExecutionSpecification >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification}: instantiates a {@link GrServiceExecutionSpecification}
 * <li><< GrService_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link GrServiceOperation}
 * <li><< MutualExclusionResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link MutualExclusionResourceAssociation}
 * <li><< MutualExclusionResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link MutualExclusionResourceAssociationEnd}
 * <li><< MutualExclusionResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MutualExclusionResourceAttribute}
 * <li><< MutualExclusionResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link MutualExclusionResourceClassifier}
 * <li><< MutualExclusionResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MutualExclusionResourceInstance}
 * <li><< MutualExclusionResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link MutualExclusionResourceLifeline}
 * <li><< MutualExclusionResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link MutualExclusionResourceLink}
 * <li><< MutualExclusionResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link MutualExclusionResourceParameter}
 * <li><< ProcessingResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ProcessingResourceAssociation}
 * <li><< ProcessingResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ProcessingResourceAssociationEnd}
 * <li><< ProcessingResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ProcessingResourceAttribute}
 * <li><< ProcessingResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link ProcessingResourceClassifier}
 * <li><< ProcessingResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ProcessingResourceInstance}
 * <li><< ProcessingResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link ProcessingResourceLifeline}
 * <li><< ProcessingResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ProcessingResourceLink}
 * <li><< ProcessingResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ProcessingResourceParameter}
 * <li><< Release_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link ReleaseBehavior}
 * <li><< Release_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link ReleaseCollaboration}
 * <li><< Release_CollaborationUse >> on a {@link org.modelio.metamodel.uml.statik.CollaborationUse}: instantiates a {@link ReleaseCollaborationUse}
 * <li><< Release_ExecutionSpecification >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification}: instantiates a {@link ReleaseExecutionSpecification}
 * <li><< Release_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link ReleaseOperation}
 * <li><< ResourceUsage_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ResourceUsageModelElement}
 * <li><< Resource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ResourceAssociation}
 * <li><< Resource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ResourceAssociationEnd}
 * <li><< Resource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ResourceAttribute}
 * <li><< Resource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link ResourceClassifier}
 * <li><< Resource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ResourceInstance}
 * <li><< Resource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link ResourceLifeline}
 * <li><< Resource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ResourceLink}
 * <li><< Resource_LinkEnd >> on a {@link org.modelio.metamodel.uml.statik.LinkEnd}: instantiates a {@link ResourceLinkEnd}
 * <li><< Resource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ResourceParameter}
 * <li><< SchedulableResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SchedulableResourceAssociation}
 * <li><< SchedulableResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SchedulableResourceAssociationEnd}
 * <li><< SchedulableResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SchedulableResourceAttribute}
 * <li><< SchedulableResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SchedulableResourceClassifier}
 * <li><< SchedulableResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SchedulableResourceInstance}
 * <li><< SchedulableResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SchedulableResourceLifeline}
 * <li><< SchedulableResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SchedulableResourceLink}
 * <li><< SchedulableResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SchedulableResourceParameter}
 * <li><< Scheduler_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SchedulerAssociation}
 * <li><< Scheduler_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SchedulerAssociationEnd}
 * <li><< Scheduler_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SchedulerAttribute}
 * <li><< Scheduler_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SchedulerClassifier}
 * <li><< Scheduler_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SchedulerInstance}
 * <li><< Scheduler_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SchedulerLifeline}
 * <li><< Scheduler_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SchedulerLink}
 * <li><< Scheduler_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SchedulerParameter}
 * <li><< SecondaryScheduler_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SecondarySchedulerAssociation}
 * <li><< SecondaryScheduler_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SecondarySchedulerAssociationEnd}
 * <li><< SecondaryScheduler_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SecondarySchedulerAttribute}
 * <li><< SecondaryScheduler_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SecondarySchedulerClassifier}
 * <li><< SecondaryScheduler_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SecondarySchedulerInstance}
 * <li><< SecondaryScheduler_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SecondarySchedulerLifeline}
 * <li><< SecondaryScheduler_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SecondarySchedulerLink}
 * <li><< SecondaryScheduler_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SecondarySchedulerParameter}
 * <li><< StorageResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link StorageResourceAssociation}
 * <li><< StorageResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link StorageResourceAssociationEnd}
 * <li><< StorageResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link StorageResourceAttribute}
 * <li><< StorageResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link StorageResourceClassifier}
 * <li><< StorageResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link StorageResourceInstance}
 * <li><< StorageResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link StorageResourceLifeline}
 * <li><< StorageResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link StorageResourceLink}
 * <li><< StorageResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link StorageResourceParameter}
 * <li><< SynchronizationResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SynchronizationResourceAssociation}
 * <li><< SynchronizationResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SynchronizationResourceAssociationEnd}
 * <li><< SynchronizationResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SynchronizationResourceAttribute}
 * <li><< SynchronizationResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SynchronizationResourceClassifier}
 * <li><< SynchronizationResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SynchronizationResourceInstance}
 * <li><< SynchronizationResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SynchronizationResourceLifeline}
 * <li><< SynchronizationResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SynchronizationResourceLink}
 * <li><< SynchronizationResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SynchronizationResourceParameter}
 * <li><< TimerResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link TimerResourceAssociation}
 * <li><< TimerResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link TimerResourceAssociationEnd}
 * <li><< TimerResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link TimerResourceAttribute}
 * <li><< TimerResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link TimerResourceClassifier}
 * <li><< TimerResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link TimerResourceInstance}
 * <li><< TimerResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link TimerResourceLifeline}
 * <li><< TimerResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link TimerResourceLink}
 * <li><< TimerResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link TimerResourceParameter}
 * <li><< TimingResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link TimingResourceAssociation}
 * <li><< TimingResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link TimingResourceAssociationEnd}
 * <li><< TimingResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link TimingResourceAttribute}
 * <li><< TimingResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link TimingResourceClassifier}
 * <li><< TimingResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link TimingResourceInstance}
 * <li><< TimingResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link TimingResourceLifeline}
 * <li><< TimingResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link TimingResourceLink}
 * <li><< TimingResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link TimingResourceParameter}
 * <li><< AllocateActivityGroup_ActivityPartition >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition}: instantiates a {@link AllocateActivityGroupActivityPartition}
 * <li><< Allocate_Dependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link AllocateDependency}
 * <li><< Allocated_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link AllocatedModelElement}
 * <li><< Assign_Note >> on a {@link org.modelio.metamodel.uml.infrastructure.Note}: instantiates a {@link AssignNote}
 * <li><< NfpRefine_Dependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link NfpRefineDependency}
 * <li><< Configuration_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link ConfigurationBehavior}
 * <li><< Configuration_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ConfigurationClass}
 * <li><< Configuration_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link ConfigurationCollaboration}
 * <li><< Configuration_Node >> on a {@link org.modelio.metamodel.uml.statik.Node}: instantiates a {@link ConfigurationNode}
 * <li><< Configuration_Package >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ConfigurationPackage}
 * <li><< ModeBehavior_StateMachine >> on a {@link org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine}: instantiates a {@link ModeBehaviorStateMachine}
 * <li><< ModeTransition_Transition >> on a {@link org.modelio.metamodel.uml.behavior.stateMachineModel.Transition}: instantiates a {@link ModeTransitionTransition}
 * <li><< Mode_State >> on a {@link org.modelio.metamodel.uml.behavior.stateMachineModel.State}: instantiates a {@link ModeState}
 * <li><< Nfp_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link NfpAssociationEnd}
 * <li><< Nfp_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link NfpBindableInstance}
 * <li><< Nfp_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link NfpAttribute}
 * <li><< Unit_EnumerationLiteral >> on a {@link org.modelio.metamodel.uml.statik.EnumerationLiteral}: instantiates a {@link UnitEnumerationLiteral}
 * <li><< NfpType_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link NfpTypeDataType}
 * <li><< Dimension_Enumeration >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link DimensionEnumeration}
 * <li><< NfpConstraint_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link NfpConstraintConstraint}
 * <li><< ClockConstraint_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link ClockConstraintConstraint}
 * <li><< ClockType_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ClockTypeClass}
 * <li><< Clock_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ClockAssociationEnd}
 * <li><< Clock_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ClockAttribute}
 * <li><< Clock_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link ClockAssociation}
 * <li><< Clock_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ClockInstance}
 * <li><< Clock_Event >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Event}: instantiates a {@link ClockEvent}
 * <li><< Clock_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link ClockLink}
 * <li><< TimedConstraint_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link TimedConstraintConstraint}
 * <li><< TimedDomain_NameSpace >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link TimedDomainNameSpace}
 * <li><< DurationConstraint_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link DurationConstraintConstraint}
 * <li><< IntervalConstraint_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link IntervalConstraintConstraint}
 * <li><< TimedDurationObservation_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link TimedDurationObservationConstraint}
 * <li><< DurationObservation_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link DurationObservationConstraint}
 * <li><< TimedInstantObservation_Note >> on a {@link org.modelio.metamodel.uml.infrastructure.Note}: instantiates a {@link TimedInstantObservationNote}
 * <li><< TimedEvent_Event >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Event}: instantiates a {@link TimedEventEvent}
 * <li><< TimedProcessing_ActivityAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.ActivityAction}: instantiates a {@link TimedProcessingActivityAction}
 * <li><< TimedProcessing_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link TimedProcessingBehavior}
 * <li><< TimedProcessing_Message >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Message}: instantiates a {@link TimedProcessingMessage}
 * <li><< TimedValueSpecification_TaggedValue >> on a {@link org.modelio.metamodel.uml.infrastructure.TaggedValue}: instantiates a {@link TimedValueSpecificationTaggedValue}
 * <li><< TimedObservation_Note >> on a {@link org.modelio.metamodel.uml.infrastructure.Note}: instantiates a {@link TimedObservationNote}
 * <li><< PpUnit_Actor >> on a {@link org.modelio.metamodel.uml.behavior.usecaseModel.Actor}: instantiates a {@link PpUnitActor}
 * <li><< PpUnit_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link PpUnitBehavior}
 * <li><< PpUnit_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PpUnitClass}
 * <li><< PpUnit_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link PpUnitCollaboration}
 * <li><< PpUnit_UseCase >> on a {@link org.modelio.metamodel.uml.behavior.usecaseModel.UseCase}: instantiates a {@link PpUnitUseCase}
 * <li><< RtAction_CallAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallAction}: instantiates a {@link RtActionCallAction}
 * <li><< RtAction_OpaqueAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link RtActionOpaqueAction}
 * <li><< RtAction_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link RtActionOperation}
 * <li><< RtAction_SendSignalAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction}: instantiates a {@link RtActionSendSignalAction}
 * <li><< RtFeature_CallAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.CallAction}: instantiates a {@link RtFeatureCallAction}
 * <li><< RtFeature_Message >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Message}: instantiates a {@link RtFeatureMessage}
 * <li><< RtFeature_OpaqueAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction}: instantiates a {@link RtFeatureOpaqueAction}
 * <li><< RtFeature_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link RtFeatureOperation}
 * <li><< RtFeature_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link RtFeaturePort}
 * <li><< RtFeature_SendSignalAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction}: instantiates a {@link RtFeatureSendSignalAction}
 * <li><< RtFeature_Signal >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Signal}: instantiates a {@link RtFeatureSignal}
 * <li><< RtService_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link RtServiceOperation}
 * <li><< RtSpecification_Note >> on a {@link org.modelio.metamodel.uml.infrastructure.Note}: instantiates a {@link RtSpecificationNote}
 * <li><< RtUnit_Actor >> on a {@link org.modelio.metamodel.uml.behavior.usecaseModel.Actor}: instantiates a {@link RtUnitActor}
 * <li><< RtUnit_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link RtUnitBehavior}
 * <li><< RtUnit_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RtUnitClass}
 * <li><< RtUnit_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link RtUnitCollaboration}
 * <li><< RtUnit_UseCase >> on a {@link org.modelio.metamodel.uml.behavior.usecaseModel.UseCase}: instantiates a {@link RtUnitUseCase}
 * <li><< HwASIC_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwASICAssociation}
 * <li><< HwASIC_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwASICAssociationEnd}
 * <li><< HwASIC_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwASICAttribute}
 * <li><< HwASIC_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwASICClassifier}
 * <li><< HwASIC_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwASICInstance}
 * <li><< HwASIC_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwASICLifeline}
 * <li><< HwASIC_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwASICLink}
 * <li><< HwASIC_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwASICParameter}
 * <li><< HwBranchPredictor_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwBranchPredictorAssociation}
 * <li><< HwBranchPredictor_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwBranchPredictorAssociationEnd}
 * <li><< HwBranchPredictor_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwBranchPredictorAttribute}
 * <li><< HwBranchPredictor_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwBranchPredictorClassifier}
 * <li><< HwBranchPredictor_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwBranchPredictorInstance}
 * <li><< HwBranchPredictor_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwBranchPredictorLifeline}
 * <li><< HwBranchPredictor_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwBranchPredictorLink}
 * <li><< HwBranchPredictor_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwBranchPredictorParameter}
 * <li><< HwComputingResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwComputingResourceAssociation}
 * <li><< HwComputingResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwComputingResourceAssociationEnd}
 * <li><< HwComputingResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwComputingResourceAttribute}
 * <li><< HwComputingResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwComputingResourceClassifier}
 * <li><< HwComputingResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwComputingResourceInstance}
 * <li><< HwComputingResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwComputingResourceLifeline}
 * <li><< HwComputingResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwComputingResourceLink}
 * <li><< HwComputingResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwComputingResourceParameter}
 * <li><< HwISA_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwISAAssociation}
 * <li><< HwISA_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwISAAssociationEnd}
 * <li><< HwISA_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwISAAttribute}
 * <li><< HwISA_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwISAClassifier}
 * <li><< HwISA_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwISAInstance}
 * <li><< HwISA_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwISALifeline}
 * <li><< HwISA_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwISALink}
 * <li><< HwISA_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwISAParameter}
 * <li><< HwPLD_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwPLDAssociation}
 * <li><< HwPLD_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwPLDAssociationEnd}
 * <li><< HwPLD_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwPLDAttribute}
 * <li><< HwPLD_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwPLDClassifier}
 * <li><< HwPLD_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwPLDInstance}
 * <li><< HwPLD_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwPLDLifeline}
 * <li><< HwPLD_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwPLDLink}
 * <li><< HwPLD_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwPLDParameter}
 * <li><< HwProcessor_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwProcessorAssociation}
 * <li><< HwProcessor_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwProcessorAssociationEnd}
 * <li><< HwProcessor_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwProcessorAttribute}
 * <li><< HwProcessor_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwProcessorClassifier}
 * <li><< HwProcessor_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwProcessorInstance}
 * <li><< HwProcessor_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwProcessorLifeline}
 * <li><< HwProcessor_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwProcessorLink}
 * <li><< HwProcessor_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwProcessorParameter}
 * <li><< HwArbiter_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwArbiterAssociation}
 * <li><< HwArbiter_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwArbiterAssociationEnd}
 * <li><< HwArbiter_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwArbiterAttribute}
 * <li><< HwArbiter_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwArbiterClassifier}
 * <li><< HwArbiter_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwArbiterInstance}
 * <li><< HwArbiter_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwArbiterLifeline}
 * <li><< HwArbiter_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwArbiterLink}
 * <li><< HwArbiter_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwArbiterParameter}
 * <li><< HwBridge_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwBridgeAssociation}
 * <li><< HwBridge_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwBridgeAssociationEnd}
 * <li><< HwBridge_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwBridgeAttribute}
 * <li><< HwBridge_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwBridgeClassifier}
 * <li><< HwBridge_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwBridgeInstance}
 * <li><< HwBridge_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwBridgeLifeline}
 * <li><< HwBridge_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwBridgeLink}
 * <li><< HwBridge_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwBridgeParameter}
 * <li><< HwBus_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwBusAssociation}
 * <li><< HwBus_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwBusAssociationEnd}
 * <li><< HwBus_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwBusAttribute}
 * <li><< HwBus_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwBusClassifier}
 * <li><< HwBus_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwBusInstance}
 * <li><< HwBus_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwBusLifeline}
 * <li><< HwBus_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwBusLink}
 * <li><< HwBus_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwBusParameter}
 * <li><< HwCommunicationResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwCommunicationResourceAssociation}
 * <li><< HwCommunicationResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwCommunicationResourceAssociationEnd}
 * <li><< HwCommunicationResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwCommunicationResourceAttribute}
 * <li><< HwCommunicationResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwCommunicationResourceClassifier}
 * <li><< HwCommunicationResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwCommunicationResourceInstance}
 * <li><< HwCommunicationResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwCommunicationResourceLifeline}
 * <li><< HwCommunicationResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwCommunicationResourceLink}
 * <li><< HwCommunicationResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwCommunicationResourceParameter}
 * <li><< HwEndPoint_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwEndPointAssociation}
 * <li><< HwEndPoint_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwEndPointAssociationEnd}
 * <li><< HwEndPoint_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwEndPointAttribute}
 * <li><< HwEndPoint_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwEndPointClassifier}
 * <li><< HwEndPoint_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwEndPointInstance}
 * <li><< HwEndPoint_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwEndPointLifeline}
 * <li><< HwEndPoint_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwEndPointLink}
 * <li><< HwEndPoint_LinkEnd >> on a {@link org.modelio.metamodel.uml.statik.LinkEnd}: instantiates a {@link HwEndPointLinkEnd}
 * <li><< HwEndPoint_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwEndPointParameter}
 * <li><< HwMedia_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwMediaAssociation}
 * <li><< HwMedia_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwMediaAssociationEnd}
 * <li><< HwMedia_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwMediaAttribute}
 * <li><< HwMedia_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwMediaClassifier}
 * <li><< HwMedia_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwMediaInstance}
 * <li><< HwMedia_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwMediaLifeline}
 * <li><< HwMedia_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwMediaLink}
 * <li><< HwMedia_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwMediaParameter}
 * <li><< HwClock_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwClockAssociation}
 * <li><< HwClock_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwClockAssociationEnd}
 * <li><< HwClock_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwClockAttribute}
 * <li><< HwClock_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwClockClassifier}
 * <li><< HwClock_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwClockInstance}
 * <li><< HwClock_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwClockLifeline}
 * <li><< HwClock_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwClockLink}
 * <li><< HwClock_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwClockParameter}
 * <li><< HwTimer_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwTimerAssociation}
 * <li><< HwTimer_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwTimerAssociationEnd}
 * <li><< HwTimer_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwTimerAttribute}
 * <li><< HwTimer_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwTimerClassifier}
 * <li><< HwTimer_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwTimerInstance}
 * <li><< HwTimer_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwTimerLifeline}
 * <li><< HwTimer_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwTimerLink}
 * <li><< HwTimer_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwTimerParameter}
 * <li><< HwTimingResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwTimingResourceAssociation}
 * <li><< HwTimingResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwTimingResourceAssociationEnd}
 * <li><< HwTimingResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwTimingResourceAttribute}
 * <li><< HwTimingResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwTimingResourceClassifier}
 * <li><< HwTimingResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwTimingResourceInstance}
 * <li><< HwTimingResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwTimingResourceLifeline}
 * <li><< HwTimingResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwTimingResourceLink}
 * <li><< HwTimingResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwTimingResourceParameter}
 * <li><< HwDevice_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwDeviceAssociation}
 * <li><< HwDevice_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwDeviceAssociationEnd}
 * <li><< HwDevice_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwDeviceAttribute}
 * <li><< HwDevice_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwDeviceClassifier}
 * <li><< HwDevice_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwDeviceInstance}
 * <li><< HwDevice_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwDeviceLifeline}
 * <li><< HwDevice_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwDeviceLink}
 * <li><< HwDevice_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwDeviceParameter}
 * <li><< HwI_O_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwIOAssociation}
 * <li><< HwI_O_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwIOAssociationEnd}
 * <li><< HwI_O_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwIOAttribute}
 * <li><< HwI_O_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwIOClassifier}
 * <li><< HwI_O_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwIOInstance}
 * <li><< HwI_O_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwIOLifeline}
 * <li><< HwI_O_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwIOLink}
 * <li><< HwI_O_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwIOParameter}
 * <li><< HwSupport_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwSupportAssociation}
 * <li><< HwSupport_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwSupportAssociationEnd}
 * <li><< HwSupport_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwSupportAttribute}
 * <li><< HwSupport_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwSupportClassifier}
 * <li><< HwSupport_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwSupportInstance}
 * <li><< HwSupport_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwSupportLifeline}
 * <li><< HwSupport_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwSupportLink}
 * <li><< HwSupport_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwSupportParameter}
 * <li><< HwActuator_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwActuatorAssociation}
 * <li><< HwActuator_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwActuatorAssociationEnd}
 * <li><< HwActuator_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwActuatorAttribute}
 * <li><< HwActuator_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwActuatorClassifier}
 * <li><< HwActuator_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwActuatorInstance}
 * <li><< HwActuator_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwActuatorLifeline}
 * <li><< HwActuator_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwActuatorLink}
 * <li><< HwActuator_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwActuatorParameter}
 * <li><< HwSensor_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwSensorAssociation}
 * <li><< HwSensor_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwSensorAssociationEnd}
 * <li><< HwSensor_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwSensorAttribute}
 * <li><< HwSensor_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwSensorClassifier}
 * <li><< HwSensor_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwSensorInstance}
 * <li><< HwSensor_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwSensorLifeline}
 * <li><< HwSensor_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwSensorLink}
 * <li><< HwSensor_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwSensorParameter}
 * <li><< HwCache_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwCacheAssociation}
 * <li><< HwCache_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwCacheAssociationEnd}
 * <li><< HwCache_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwCacheAttribute}
 * <li><< HwCache_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwCacheClassifier}
 * <li><< HwCache_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwCacheInstance}
 * <li><< HwCache_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwCacheLifeline}
 * <li><< HwCache_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwCacheLink}
 * <li><< HwCache_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwCacheParameter}
 * <li><< HwDrive_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwDriveAssociation}
 * <li><< HwDrive_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwDriveAssociationEnd}
 * <li><< HwDrive_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwDriveAttribute}
 * <li><< HwDrive_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwDriveClassifier}
 * <li><< HwDrive_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwDriveInstance}
 * <li><< HwDrive_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwDriveLifeline}
 * <li><< HwDrive_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwDriveLink}
 * <li><< HwDrive_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwDriveParameter}
 * <li><< HwMemory_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwMemoryAssociation}
 * <li><< HwMemory_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwMemoryAssociationEnd}
 * <li><< HwMemory_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwMemoryAttribute}
 * <li><< HwMemory_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwMemoryClassifier}
 * <li><< HwMemory_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwMemoryInstance}
 * <li><< HwMemory_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwMemoryLifeline}
 * <li><< HwMemory_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwMemoryLink}
 * <li><< HwMemory_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwMemoryParameter}
 * <li><< HwRAM_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwRAMAssociation}
 * <li><< HwRAM_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwRAMAssociationEnd}
 * <li><< HwRAM_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwRAMAttribute}
 * <li><< HwRAM_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwRAMClassifier}
 * <li><< HwRAM_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwRAMInstance}
 * <li><< HwRAM_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwRAMLifeline}
 * <li><< HwRAM_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwRAMLink}
 * <li><< HwRAM_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwRAMParameter}
 * <li><< HwROM_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwROMAssociation}
 * <li><< HwROM_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwROMAssociationEnd}
 * <li><< HwROM_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwROMAttribute}
 * <li><< HwROM_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwROMClassifier}
 * <li><< HwROM_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwROMInstance}
 * <li><< HwROM_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwROMLifeline}
 * <li><< HwROM_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwROMLink}
 * <li><< HwROM_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwROMParameter}
 * <li><< HwDMA_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwDMAAssociation}
 * <li><< HwDMA_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwDMAAssociationEnd}
 * <li><< HwDMA_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwDMAAttribute}
 * <li><< HwDMA_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwDMAClassifier}
 * <li><< HwDMA_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwDMAInstance}
 * <li><< HwDMA_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwDMALifeline}
 * <li><< HwDMA_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwDMALink}
 * <li><< HwDMA_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwDMAParameter}
 * <li><< HwMMU_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwMMUAssociation}
 * <li><< HwMMU_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwMMUAssociationEnd}
 * <li><< HwMMU_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwMMUAttribute}
 * <li><< HwMMU_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwMMUClassifier}
 * <li><< HwMMU_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwMMUInstance}
 * <li><< HwMMU_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwMMULifeline}
 * <li><< HwMMU_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwMMULink}
 * <li><< HwMMU_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwMMUParameter}
 * <li><< HwStorageManager_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwStorageManagerAssociation}
 * <li><< HwStorageManager_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwStorageManagerAssociationEnd}
 * <li><< HwStorageManager_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwStorageManagerAttribute}
 * <li><< HwStorageManager_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwStorageManagerClassifier}
 * <li><< HwStorageManager_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwStorageManagerInstance}
 * <li><< HwStorageManager_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwStorageManagerLifeline}
 * <li><< HwStorageManager_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwStorageManagerLink}
 * <li><< HwStorageManager_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwStorageManagerParameter}
 * <li><< HwComponent_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwComponentAssociation}
 * <li><< HwComponent_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwComponentAssociationEnd}
 * <li><< HwComponent_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwComponentAttribute}
 * <li><< HwComponent_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwComponentClassifier}
 * <li><< HwComponent_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwComponentInstance}
 * <li><< HwComponent_LifeLine >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwComponentLifeLine}
 * <li><< HwComponent_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwComponentLink}
 * <li><< HwComponent_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwComponentParameter}
 * <li><< HwBattery_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwBatteryAssociation}
 * <li><< HwBattery_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwBatteryAssociationEnd}
 * <li><< HwBattery_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwBatteryAttribute}
 * <li><< HwBattery_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwBatteryClassifier}
 * <li><< HwBattery_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwBatteryInstance}
 * <li><< HwBattery_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwBatteryLifeline}
 * <li><< HwBattery_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwBatteryLink}
 * <li><< HwBattery_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwBatteryParameter}
 * <li><< HwCoolingSupply_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwCoolingSupplyAssociation}
 * <li><< HwCoolingSupply_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwCoolingSupplyAssociationEnd}
 * <li><< HwCoolingSupply_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwCoolingSupplyAttribute}
 * <li><< HwCoolingSupply_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwCoolingSupplyClassifier}
 * <li><< HwCoolingSupply_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwCoolingSupplyInstance}
 * <li><< HwCoolingSupply_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwCoolingSupplyLifeline}
 * <li><< HwCoolingSupply_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwCoolingSupplyLink}
 * <li><< HwCoolingSupply_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwCoolingSupplyParameter}
 * <li><< HwPowerSupply_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwPowerSupplyAssociation}
 * <li><< HwPowerSupply_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwPowerSupplyAssociationEnd}
 * <li><< HwPowerSupply_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwPowerSupplyAttribute}
 * <li><< HwPowerSupply_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwPowerSupplyClassifier}
 * <li><< HwPowerSupply_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwPowerSupplyInstance}
 * <li><< HwPowerSupply_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwPowerSupplyLifeline}
 * <li><< HwPowerSupply_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwPowerSupplyLink}
 * <li><< HwPowerSupply_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwPowerSupplyParameter}
 * <li><< HwResourceService_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link HwResourceServiceBehavior}
 * <li><< HwResourceService_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link HwResourceServiceCollaboration}
 * <li><< HwResourceService_CollaborationUse >> on a {@link org.modelio.metamodel.uml.statik.CollaborationUse}: instantiates a {@link HwResourceServiceCollaborationUse}
 * <li><< HwResourceService_ExecutionSpecification >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification}: instantiates a {@link HwResourceServiceExecutionSpecification}
 * <li><< HwResourceService_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link HwResourceServiceOperation}
 * <li><< HwResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link HwResourceAssociation}
 * <li><< HwResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link HwResourceAssociationEnd}
 * <li><< HwResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link HwResourceAttribute}
 * <li><< HwResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link HwResourceClassifier}
 * <li><< HwResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link HwResourceInstance}
 * <li><< HwResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link HwResourceLifeline}
 * <li><< HwResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link HwResourceLink}
 * <li><< HwResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link HwResourceParameter}
 * <li><< SwAccessService_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link SwAccessServiceBehavior}
 * <li><< SwAccessService_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link SwAccessServiceCollaboration}
 * <li><< SwAccessService_CollaborationUse >> on a {@link org.modelio.metamodel.uml.statik.CollaborationUse}: instantiates a {@link SwAccessServiceCollaborationUse}
 * <li><< SwAccessService_ExecutionSpecification >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification}: instantiates a {@link SwAccessServiceExecutionSpecification}
 * <li><< SwAccessService_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link SwAccessServiceOperation}
 * <li><< SwResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwResourceAssociation}
 * <li><< SwResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwResourceAssociationEnd}
 * <li><< SwResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwResourceAttribute}
 * <li><< SwResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwResourceClassifier}
 * <li><< SwResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwResourceInstance}
 * <li><< SwResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwResourceLifeline}
 * <li><< SwResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwResourceLink}
 * <li><< SwResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwResourceParameter}
 * <li><< Alarm_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link AlarmAssociation}
 * <li><< Alarm_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link AlarmAssociationEnd}
 * <li><< Alarm_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link AlarmAttribute}
 * <li><< Alarm_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link AlarmClassifier}
 * <li><< Alarm_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link AlarmInstance}
 * <li><< Alarm_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link AlarmLifeline}
 * <li><< Alarm_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link AlarmLink}
 * <li><< Alarm_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link AlarmParameter}
 * <li><< EntryPoint_Dependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link EntryPointDependency}
 * <li><< InterruptResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link InterruptResourceAssociation}
 * <li><< InterruptResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link InterruptResourceAssociationEnd}
 * <li><< InterruptResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link InterruptResourceAttribute}
 * <li><< InterruptResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link InterruptResourceClassifier}
 * <li><< InterruptResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link InterruptResourceInstance}
 * <li><< InterruptResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link InterruptResourceLifeline}
 * <li><< InterruptResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link InterruptResourceLink}
 * <li><< InterruptResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link InterruptResourceParameter}
 * <li><< MemoryPartition_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link MemoryPartitionAssociation}
 * <li><< MemoryPartition_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link MemoryPartitionAssociationEnd}
 * <li><< MemoryPartition_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MemoryPartitionAttribute}
 * <li><< MemoryPartition_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MemoryPartitionInstance}
 * <li><< MemoryPartition_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link MemoryPartitionLifeline}
 * <li><< MemoryPartition_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link MemoryPartitionLink}
 * <li><< MemoryPartition_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link MemoryPartitionClassifier}
 * <li><< MemoryPartition_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link MemoryPartitionParameter}
 * <li><< SwConcurrentResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwConcurrentResourceAssociation}
 * <li><< SwConcurrentResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwConcurrentResourceAssociationEnd}
 * <li><< SwConcurrentResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwConcurrentResourceAttribute}
 * <li><< SwConcurrentResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwConcurrentResourceClassifier}
 * <li><< SwConcurrentResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwConcurrentResourceInstance}
 * <li><< SwConcurrentResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwConcurrentResourceLifeline}
 * <li><< SwConcurrentResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwConcurrentResourceLink}
 * <li><< SwConcurrentResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwConcurrentResourceParameter}
 * <li><< SwSchedulableResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwSchedulableResourceAssociation}
 * <li><< SwSchedulableResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwSchedulableResourceAssociationEnd}
 * <li><< SwSchedulableResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwSchedulableResourceAttribute}
 * <li><< SwSchedulableResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwSchedulableResourceClassifier}
 * <li><< SwSchedulableResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwSchedulableResourceInstance}
 * <li><< SwSchedulableResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwSchedulableResourceLifeline}
 * <li><< SwSchedulableResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwSchedulableResourceLink}
 * <li><< SwSchedulableResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwSchedulableResourceParameter}
 * <li><< SwTimerResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwTimerResourceAssociation}
 * <li><< SwTimerResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwTimerResourceAssociationEnd}
 * <li><< SwTimerResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwTimerResourceAttribute}
 * <li><< SwTimerResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwTimerResourceClassifier}
 * <li><< SwTimerResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwTimerResourceInstance}
 * <li><< SwTimerResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwTimerResourceLifeline}
 * <li><< SwTimerResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwTimerResourceLink}
 * <li><< SwTimerResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwTimerResourceParameter}
 * <li><< DeviceBroker_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link DeviceBrokerParameter}
 * <li><< DeviceBroker_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link DeviceBrokerAssociationEnd}
 * <li><< DeviceBroker_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link DeviceBrokerAttribute}
 * <li><< DeviceBroker_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link DeviceBrokerLink}
 * <li><< DeviceBroker_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DeviceBrokerInstance}
 * <li><< DeviceBroker_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link DeviceBrokerAssociation}
 * <li><< DeviceBroker_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link DeviceBrokerLifeline}
 * <li><< DeviceBroker_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link DeviceBrokerClassifier}
 * <li><< MemoryBroker_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link MemoryBrokerParameter}
 * <li><< MemoryBroker_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link MemoryBrokerAssociationEnd}
 * <li><< MemoryBroker_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MemoryBrokerAttribute}
 * <li><< MemoryBroker_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link MemoryBrokerLink}
 * <li><< MemoryBroker_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MemoryBrokerInstance}
 * <li><< MemoryBroker_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link MemoryBrokerAssociation}
 * <li><< MemoryBroker_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link MemoryBrokerLifeline}
 * <li><< MemoryBroker_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link MemoryBrokerClassifier}
 * <li><< MessageComResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link MessageComResourceAssociation}
 * <li><< MessageComResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link MessageComResourceAssociationEnd}
 * <li><< MessageComResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MessageComResourceAttribute}
 * <li><< MessageComResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link MessageComResourceClassifier}
 * <li><< MessageComResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MessageComResourceInstance}
 * <li><< MessageComResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link MessageComResourceLifeline}
 * <li><< MessageComResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link MessageComResourceLink}
 * <li><< MessageComResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link MessageComResourceParameter}
 * <li><< NotificationResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link NotificationResourceAssociation}
 * <li><< NotificationResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link NotificationResourceAssociationEnd}
 * <li><< NotificationResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link NotificationResourceAttribute}
 * <li><< NotificationResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link NotificationResourceClassifier}
 * <li><< NotificationResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link NotificationResourceInstance}
 * <li><< NotificationResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link NotificationResourceLifeline}
 * <li><< NotificationResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link NotificationResourceLink}
 * <li><< NotificationResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link NotificationResourceParameter}
 * <li><< SharedDataComResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SharedDataComResourceAssociation}
 * <li><< SharedDataComResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SharedDataComResourceAssociationEnd}
 * <li><< SharedDataComResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SharedDataComResourceAttribute}
 * <li><< SharedDataComResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SharedDataComResourceClassifier}
 * <li><< SharedDataComResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SharedDataComResourceInstance}
 * <li><< SharedDataComResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SharedDataComResourceLifeline}
 * <li><< SharedDataComResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SharedDataComResourceLink}
 * <li><< SharedDataComResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SharedDataComResourceParameter}
 * <li><< SwCommunicationResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwCommunicationResourceAssociation}
 * <li><< SwCommunicationResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwCommunicationResourceAssociationEnd}
 * <li><< SwCommunicationResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwCommunicationResourceAttribute}
 * <li><< SwCommunicationResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwCommunicationResourceClassifier}
 * <li><< SwCommunicationResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwCommunicationResourceInstance}
 * <li><< SwCommunicationResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwCommunicationResourceLifeline}
 * <li><< SwCommunicationResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwCommunicationResourceLink}
 * <li><< SwCommunicationResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwCommunicationResourceParameter}
 * <li><< SwInteractionResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwInteractionResourceAssociation}
 * <li><< SwInteractionResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwInteractionResourceAssociationEnd}
 * <li><< SwInteractionResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwInteractionResourceAttribute}
 * <li><< SwInteractionResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwInteractionResourceClassifier}
 * <li><< SwInteractionResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwInteractionResourceInstance}
 * <li><< SwInteractionResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwInteractionResourceLifeline}
 * <li><< SwInteractionResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwInteractionResourceLink}
 * <li><< SwInteractionResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwInteractionResourceParameter}
 * <li><< SwMutualExclusionResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwMutualExclusionResourceAssociation}
 * <li><< SwMutualExclusionResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwMutualExclusionResourceAssociationEnd}
 * <li><< SwMutualExclusionResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwMutualExclusionResourceAttribute}
 * <li><< SwMutualExclusionResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwMutualExclusionResourceClassifier}
 * <li><< SwMutualExclusionResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwMutualExclusionResourceInstance}
 * <li><< SwMutualExclusionResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwMutualExclusionResourceLifeline}
 * <li><< SwMutualExclusionResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwMutualExclusionResourceLink}
 * <li><< SwMutualExclusionResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwMutualExclusionResourceParameter}
 * <li><< SwSynchronizationResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SwSynchronizationResourceAssociation}
 * <li><< SwSynchronizationResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SwSynchronizationResourceAssociationEnd}
 * <li><< SwSynchronizationResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SwSynchronizationResourceAttribute}
 * <li><< SwSynchronizationResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SwSynchronizationResourceClassifier}
 * <li><< SwSynchronizationResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SwSynchronizationResourceInstance}
 * <li><< SwSynchronizationResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SwSynchronizationResourceLifeline}
 * <li><< SwSynchronizationResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SwSynchronizationResourceLink}
 * <li><< SwSynchronizationResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SwSynchronizationResourceParameter}
 * <li><< ClientServerFeature_Operation >> on a {@link org.modelio.metamodel.uml.statik.Operation}: instantiates a {@link ClientServerFeatureOperation}
 * <li><< ClientServerPort_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link ClientServerPortPort}
 * <li><< ClientServerSpecification_Interface >> on a {@link org.modelio.metamodel.uml.statik.Interface}: instantiates a {@link ClientServerSpecificationInterface}
 * <li><< DataEvent_Event >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Event}: instantiates a {@link DataEventEvent}
 * <li><< DataPool_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link DataPoolAssociationEnd}
 * <li><< DataPool_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link DataPoolAttribute}
 * <li><< DataPool_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link DataPoolBindableInstance}
 * <li><< FlowPort_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link FlowPortPort}
 * <li><< FlowProperty_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link FlowPropertyAssociationEnd}
 * <li><< FlowProperty_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link FlowPropertyAttribute}
 * <li><< FlowProperty_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link FlowPropertyBindableInstance}
 * <li><< FlowSpecification_Interface >> on a {@link org.modelio.metamodel.uml.statik.Interface}: instantiates a {@link FlowSpecificationInterface}
 * <li><< GCMInvocatingBehavior_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link GCMInvocatingBehaviorBehavior}
 * <li><< GCMInvocationAction_ActivityAction >> on a {@link org.modelio.metamodel.uml.behavior.activityModel.ActivityAction}: instantiates a {@link GCMInvocationActionActivityAction}
 * <li><< GCMTrigger_Dependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link GCMTriggerDependency}
 * <li><< GaAcqStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaAcqStepModelElement}
 * <li><< GaAnalysisContext_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link GaAnalysisContextBehavior}
 * <li><< GaAnalysisContext_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link GaAnalysisContextClass}
 * <li><< GaAnalysisContext_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link GaAnalysisContextCollaboration}
 * <li><< GaAnalysisContext_Node >> on a {@link org.modelio.metamodel.uml.statik.Node}: instantiates a {@link GaAnalysisContextNode}
 * <li><< GaAnalysisContext_Package >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link GaAnalysisContextPackage}
 * <li><< GaCommChannel_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link GaCommChannelAssociation}
 * <li><< GaCommChannel_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link GaCommChannelAssociationEnd}
 * <li><< GaCommChannel_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link GaCommChannelAttribute}
 * <li><< GaCommChannel_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link GaCommChannelClassifier}
 * <li><< GaCommChannel_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link GaCommChannelInstance}
 * <li><< GaCommChannel_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link GaCommChannelLifeline}
 * <li><< GaCommChannel_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link GaCommChannelLink}
 * <li><< GaCommChannel_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link GaCommChannelParameter}
 * <li><< GaCommHost_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link GaCommHostAssociation}
 * <li><< GaCommHost_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link GaCommHostAssociationEnd}
 * <li><< GaCommHost_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link GaCommHostAttribute}
 * <li><< GaCommHost_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link GaCommHostClassifier}
 * <li><< GaCommHost_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link GaCommHostInstance}
 * <li><< GaCommHost_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link GaCommHostLifeline}
 * <li><< GaCommHost_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link GaCommHostLink}
 * <li><< GaCommHost_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link GaCommHostParameter}
 * <li><< GaCommStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaCommStepModelElement}
 * <li><< GaEventTrace_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaEventTraceModelElement}
 * <li><< GaExecHost_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link GaExecHostAssociation}
 * <li><< GaExecHost_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link GaExecHostAssociationEnd}
 * <li><< GaExecHost_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link GaExecHostAttribute}
 * <li><< GaExecHost_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link GaExecHostClassifier}
 * <li><< GaExecHost_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link GaExecHostInstance}
 * <li><< GaExecHost_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link GaExecHostLifeline}
 * <li><< GaExecHost_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link GaExecHostLink}
 * <li><< GaExecHost_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link GaExecHostParameter}
 * <li><< GaLatencyObs_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link GaLatencyObsConstraint}
 * <li><< GaRelStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaRelStepModelElement}
 * <li><< GaRequestedService_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaRequestedServiceModelElement}
 * <li><< GaResourcesPlatform_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link GaResourcesPlatformClassifier}
 * <li><< GaScenario_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaScenarioModelElement}
 * <li><< GaStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaStepModelElement}
 * <li><< GaTimedObs_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link GaTimedObsConstraint}
 * <li><< GaWorkloadBehavior_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaWorkloadBehaviorModelElement}
 * <li><< GaWorkloadEvent_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link GaWorkloadEventModelElement}
 * <li><< GaWorkloadGenerator_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link GaWorkloadGeneratorBehavior}
 * <li><< PaCommStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PaCommStepModelElement}
 * <li><< PaLogicalResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link PaLogicalResourceAssociationEnd}
 * <li><< PaLogicalResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link PaLogicalResourceAssociation}
 * <li><< PaLogicalResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link PaLogicalResourceAttribute}
 * <li><< PaLogicalResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link PaLogicalResourceClassifier}
 * <li><< PaLogicalResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link PaLogicalResourceInstance}
 * <li><< PaLogicalResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link PaLogicalResourceLifeline}
 * <li><< PaLogicalResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link PaLogicalResourceLink}
 * <li><< PaLogicalResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link PaLogicalResourceParameter}
 * <li><< PaRequestedService_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PaRequestedServiceModelElement}
 * <li><< PaResPassStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PaResPassStepModelElement}
 * <li><< PaRunTInstance_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PaRunTInstanceModelElement}
 * <li><< PaStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link PaStepModelElement}
 * <li><< SaAnalysisContext_Behavior >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior}: instantiates a {@link SaAnalysisContextBehavior}
 * <li><< SaAnalysisContext_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SaAnalysisContextClass}
 * <li><< SaAnalysisContext_Collaboration >> on a {@link org.modelio.metamodel.uml.statik.Collaboration}: instantiates a {@link SaAnalysisContextCollaboration}
 * <li><< SaAnalysisContext_Package >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link SaAnalysisContextPackage}
 * <li><< SaAnalysisContext_Node >> on a {@link org.modelio.metamodel.uml.statik.Node}: instantiates a {@link SaAnalysisContextNode}
 * <li><< SaCommHost_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SaCommHostParameter}
 * <li><< SaCommHost_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SaCommHostAssociationEnd}
 * <li><< SaCommHost_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SaCommHostAttribute}
 * <li><< SaCommHost_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SaCommHostLink}
 * <li><< SaCommHost_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SaCommHostInstance}
 * <li><< SaCommHost_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SaCommHostAssociation}
 * <li><< SaCommHost_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SaCommHostLifeline}
 * <li><< SaCommHost_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SaCommHostClassifier}
 * <li><< SaCommStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link SaCommStepModelElement}
 * <li><< SaEndtoEndFlow_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link SaEndtoEndFlowModelElement}
 * <li><< SaExecHost_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SaExecHostAssociationEnd}
 * <li><< SaExecHost_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SaExecHostAssociation}
 * <li><< SaExecHost_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SaExecHostAttribute}
 * <li><< SaExecHost_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SaExecHostClassifier}
 * <li><< SaExecHost_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SaExecHostInstance}
 * <li><< SaExecHost_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SaExecHostLink}
 * <li><< SaExecHost_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SaExecHostLifeline}
 * <li><< SaExecHost_Parameter >> on a {@link org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter}: instantiates a {@link SaExecHostParameter}
 * <li><< SaSchedObs_Constraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link SaSchedObsConstraint}
 * <li><< SaSharedResource_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link SaSharedResourceParameter}
 * <li><< SaSharedResource_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link SaSharedResourceAssociationEnd}
 * <li><< SaSharedResource_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link SaSharedResourceAttribute}
 * <li><< SaSharedResource_Link >> on a {@link org.modelio.metamodel.uml.statik.Link}: instantiates a {@link SaSharedResourceLink}
 * <li><< SaSharedResource_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SaSharedResourceInstance}
 * <li><< SaSharedResource_Association >> on a {@link org.modelio.metamodel.uml.statik.Association}: instantiates a {@link SaSharedResourceAssociation}
 * <li><< SaSharedResource_Lifeline >> on a {@link org.modelio.metamodel.uml.behavior.interactionModel.Lifeline}: instantiates a {@link SaSharedResourceLifeline}
 * <li><< SaSharedResource_Classifier >> on a {@link org.modelio.metamodel.uml.statik.Classifier}: instantiates a {@link SaSharedResourceClassifier}
 * <li><< SaStep_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link SaStepModelElement}
 * <li><< DefaultLink_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link DefaultLinkConnector}
 * <li><< Distribute_Dependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link DistributeDependency}
 * <li><< InterRepetition_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link InterRepetitionConnector}
 * <li><< LinkTopology_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link LinkTopologyConnector}
 * <li><< Reshape_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link ReshapeConnector}
 * <li><< Shaped_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link ShapedAssociationEnd}
 * <li><< Shaped_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link ShapedAttribute}
 * <li><< Shaped_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link ShapedBindableInstance}
 * <li><< Shaped_ConnectorEnd >> on a {@link org.modelio.metamodel.uml.statik.ConnectorEnd}: instantiates a {@link ShapedConnectorEnd}
 * <li><< Shaped_Parameter >> on a {@link org.modelio.metamodel.uml.statik.Parameter}: instantiates a {@link ShapedParameter}
 * <li><< Tiler_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link TilerConnector}
 * <li><< Tiler_ConnectorEnd >> on a {@link org.modelio.metamodel.uml.statik.ConnectorEnd}: instantiates a {@link TilerConnectorEnd}
 * <li><< Var_AssociationEnd >> on a {@link org.modelio.metamodel.uml.statik.AssociationEnd}: instantiates a {@link VarAssociationEnd}
 * <li><< Var_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link VarBindableInstance}
 * <li><< Var_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link VarAttribute}
 * <li><< ExpressionContext_ModelElement >> on a {@link org.modelio.metamodel.uml.infrastructure.ModelElement}: instantiates a {@link ExpressionContextModelElement}
 * <li><< BoundedSubtype_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link BoundedSubtypeDataType}
 * <li><< ChoiceType_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link ChoiceTypeDataType}
 * <li><< CollectionType_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link CollectionTypeDataType}
 * <li><< IntervalType_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link IntervalTypeDataType}
 * <li><< TupleType_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link TupleTypeDataType}
 * <li><< ProfileAssociation_accessTokenElements_SwMutualExclusionResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource}
 * <li><< ProfileAssociation_accessedElement_SwAccessService >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationAccessedElementSwAccessService}
 * <li><< ProfileAssociation_acqRes_GaAcqStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationAcqResGaAcqStep}
 * <li><< ProfileAssociation_acquireServices_SwMutualExclusionResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource}
 * <li><< ProfileAssociation_activateServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationActivateServicesSwConcurrentResource}
 * <li><< ProfileAssociation_addressSpace_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationAddressSpaceSwConcurrentResource}
 * <li><< ProfileAssociation_arbiters_HwMedia_HwArbiter >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationArbitersHwMediaHwArbiter}
 * <li><< ProfileAssociation_baseDimension_Dimension_Dimension >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBaseDimensionDimensionDimension}
 * <li><< ProfileAssociation_baseType_BoundedSubType_Datatype >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBaseTypeBoundedSubTypeDatatype}
 * <li><< ProfileAssociation_baseUnit_Unit_Unit >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBaseUnitUnitUnit}
 * <li><< ProfileAssociation_behavDemand_PaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBehavDemandPaStep}
 * <li><< ProfileAssociation_behavior_GaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBehaviorGaStep}
 * <li><< ProfileAssociation_behavior_GaWorkloadBehavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBehaviorGaWorkloadBehavior}
 * <li><< ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource}
 * <li><< ProfileAssociation_blocksRAM_HwPLD_HwRAM >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBlocksRAMHwPLDHwRAM}
 * <li><< ProfileAssociation_buffer_HwDrive_HwRAM >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationBufferHwDriveHwRAM}
 * <li><< ProfileAssociation_caches_HwProcessor_HwCache >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationCachesHwProcessorHwCache}
 * <li><< ProfileAssociation_cause_GaScenario >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationCauseGaScenario}
 * <li><< ProfileAssociation_childScenario_GaScenario >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationChildScenarioGaScenario}
 * <li><< ProfileAssociation_choiceAttrib_ChoiceType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationChoiceAttribChoiceTypeAttribute}
 * <li><< ProfileAssociation_classifier_DataEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationClassifierDataEvent}
 * <li><< ProfileAssociation_clearServices_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationClearServicesNotificationResource}
 * <li><< ProfileAssociation_closeServices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationCloseServicesDeviceBroker}
 * <li><< ProfileAssociation_collectionAttrib_CollectionType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute}
 * <li><< ProfileAssociation_concurRes_GaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationConcurResGaStep}
 * <li><< ProfileAssociation_concurrentResources_MemoryPartition >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationConcurrentResourcesMemoryPartition}
 * <li><< ProfileAssociation_connectedTo_HwEndPoint_HwMedia >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationConnectedToHwEndPointHwMedia}
 * <li><< ProfileAssociation_controlServices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationControlServicesDeviceBroker}
 * <li><< ProfileAssociation_createServices_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationCreateServicesSwResource}
 * <li><< ProfileAssociation_deadlineElements_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDeadlineElementsSwSchedulableResource}
 * <li><< ProfileAssociation_deadlineTypeElements_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDeadlineTypeElementsSwSchedulableResource}
 * <li><< ProfileAssociation_defaultAttrib_ChoiceType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDefaultAttribChoiceTypeAttribute}
 * <li><< ProfileAssociation_delayServices_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDelayServicesSwSchedulableResource}
 * <li><< ProfileAssociation_deleteServices_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDeleteServicesSwResource}
 * <li><< ProfileAssociation_demand_GaWorkloadEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDemandGaWorkloadEvent}
 * <li><< ProfileAssociation_dependentScheduler_SchedulableResource_SecondaryScheduler >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler}
 * <li><< ProfileAssociation_devices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDevicesDeviceBroker}
 * <li><< ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource}
 * <li><< ProfileAssociation_drivenBy_HwDMA_HwProcessor >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDrivenByHwDMAHwProcessor}
 * <li><< ProfileAssociation_durationElements_SwTimerResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationDurationElementsSwTimerResource}
 * <li><< ProfileAssociation_effect_GaWorkloadEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationEffectGaWorkloadEvent}
 * <li><< ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource}
 * <li><< ProfileAssociation_endPoints_HwResource_HwEndPoint >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationEndPointsHwResourceHwEndPoint}
 * <li><< ProfileAssociation_exit_MemoryPartition >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationExitMemoryPartition}
 * <li><< ProfileAssociation_exprAttrib_NfpType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationExprAttribNfpTypeAttribute}
 * <li><< ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification}
 * <li><< ProfileAssociation_finish_TimedProcessing_Event >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationFinishTimedProcessingEvent}
 * <li><< ProfileAssociation_flushServices_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationFlushServicesNotificationResource}
 * <li><< ProfileAssociation_fork_MemoryPartition >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationForkMemoryPartition}
 * <li><< ProfileAssociation_generator_GaWorkloadEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationGeneratorGaWorkloadEvent}
 * <li><< ProfileAssociation_getTime_ClockType_Operation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationGetTimeClockTypeOperation}
 * <li><< ProfileAssociation_heapSizeElements_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationHeapSizeElementsSwConcurrentResource}
 * <li><< ProfileAssociation_host_GaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationHostGaStep}
 * <li><< ProfileAssociation_host_PaRunTInstance >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationHostPaRunTInstance}
 * <li><< ProfileAssociation_host_SchedulableResource_Scheduler >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationHostSchedulableResourceScheduler}
 * <li><< ProfileAssociation_host_Scheduler_ComputingResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationHostSchedulerComputingResource}
 * <li><< ProfileAssociation_identifierElements_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationIdentifierElementsSwResource}
 * <li><< ProfileAssociation_impliedConstraint_Allocate_NfpConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationImpliedConstraintAllocateNfpConstraint}
 * <li><< ProfileAssociation_indexToValue_ClockType_Operation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationIndexToValueClockTypeOperation}
 * <li><< ProfileAssociation_initializeServices_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationInitializeServicesSwResource}
 * <li><< ProfileAssociation_inputClock_HwTimer_HwClock >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationInputClockHwTimerHwClock}
 * <li><< ProfileAssociation_insertion_DataPool_Behavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationInsertionDataPoolBehavior}
 * <li><< ProfileAssociation_instance_PaRunTInstance >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationInstancePaRunTInstance}
 * <li><< ProfileAssociation_intervalAttrib_IntervalType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute}
 * <li><< ProfileAssociation_invocations_GCMInvocatingBehavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationInvocationsGCMInvocatingBehavior}
 * <li><< ProfileAssociation_joinServices_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationJoinServicesSwSchedulableResource}
 * <li><< ProfileAssociation_lockService_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationLockServiceMemoryBroker}
 * <li><< ProfileAssociation_mainScheduler_ProcessingResource_Scheduler >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMainSchedulerProcessingResourceScheduler}
 * <li><< ProfileAssociation_main_RtUnit_Operation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMainRtUnitOperation}
 * <li><< ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory}
 * <li><< ProfileAssociation_mapService_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMapServiceMemoryBroker}
 * <li><< ProfileAssociation_maskElements_InterruptResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMaskElementsInterruptResource}
 * <li><< ProfileAssociation_maskElements_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMaskElementsNotificationResource}
 * <li><< ProfileAssociation_maxValAttr_ClockType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMaxValAttrClockTypeAttribute}
 * <li><< ProfileAssociation_memories_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMemoriesMemoryBroker}
 * <li><< ProfileAssociation_memoryBlockAddressElements_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMemoryBlockAddressElementsMemoryBroker}
 * <li><< ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker}
 * <li><< ProfileAssociation_memorySizeFootprint_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMemorySizeFootprintSwResource}
 * <li><< ProfileAssociation_memorySpaces_MemoryPartition >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMemorySpacesMemoryPartition}
 * <li><< ProfileAssociation_messageQueueCapacityElements_MessageComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource}
 * <li><< ProfileAssociation_messageResources_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMessageResourcesSwConcurrentResource}
 * <li><< ProfileAssociation_messageSizeElements_MessageComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMessageSizeElementsMessageComResource}
 * <li><< ProfileAssociation_mode_Configuration_Mode >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationModeConfigurationMode}
 * <li><< ProfileAssociation_mode_NfpConstraint_Mode >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationModeNfpConstraintMode}
 * <li><< ProfileAssociation_mutualExclusionResources_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource}
 * <li><< ProfileAssociation_notificationResources_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationNotificationResourcesSwConcurrentResource}
 * <li><< ProfileAssociation_occurenceCountElements_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOccurenceCountElementsNotificationResource}
 * <li><< ProfileAssociation_offsetAttr_ClockType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOffsetAttrClockTypeAttribute}
 * <li><< ProfileAssociation_onFeature_GCMInvocatingBehavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior}
 * <li><< ProfileAssociation_onFeature_GCMInvocationAction >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOnFeatureGCMInvocationAction}
 * <li><< ProfileAssociation_onPort_GCMInvocatingBehavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOnPortGCMInvocatingBehavior}
 * <li><< ProfileAssociation_on_TimedElement_Clock >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOnTimedElementClock}
 * <li><< ProfileAssociation_openServices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOpenServicesDeviceBroker}
 * <li><< ProfileAssociation_operationMode_RtUnit_Behavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOperationModeRtUnitBehavior}
 * <li><< ProfileAssociation_ownedHw_HwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOwnedHwHwResource}
 * <li><< ProfileAssociation_ownedISAs_HwProcessor_HwISA >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOwnedISAsHwProcessorHwISA}
 * <li><< ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU}
 * <li><< ProfileAssociation_ownedTLBs_HwMMU_HwCache >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationOwnedTLBsHwMMUHwCache}
 * <li><< ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPHWServicesHwResourceHwResourceService}
 * <li><< ProfileAssociation_periodElements_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPeriodElementsSwConcurrentResource}
 * <li><< ProfileAssociation_platform_GaAnalysisContext >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPlatformGaAnalysisContext}
 * <li><< ProfileAssociation_poweredServices_HwComponent_HwResourceService >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService}
 * <li><< ProfileAssociation_predictors_HwProcessor_HwBranchPredictor >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPredictorsHwProcessorHwBranchPredictor}
 * <li><< ProfileAssociation_priorityElements_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationPriorityElementsSwConcurrentResource}
 * <li><< ProfileAssociation_r_HW_Services_HwResource_HwResourceService >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRHWServicesHwResourceHwResourceService}
 * <li><< ProfileAssociation_readServices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationReadServicesDeviceBroker}
 * <li><< ProfileAssociation_readServices_SharedDataComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationReadServicesSharedDataComResource}
 * <li><< ProfileAssociation_receiveServices_MessageComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationReceiveServicesMessageComResource}
 * <li><< ProfileAssociation_relRes_GaAcqStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRelResGaAcqStep}
 * <li><< ProfileAssociation_releaseServices_SwMutualExclusionResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationReleaseServicesSwMutualExclusionResource}
 * <li><< ProfileAssociation_resolAttr_ClockType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationResolAttrClockTypeAttribute}
 * <li><< ProfileAssociation_resource_PaResPassStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationResourcePaResPassStep}
 * <li><< ProfileAssociation_resources_GaResourcesPlatform >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationResourcesGaResourcesPlatform}
 * <li><< ProfileAssociation_resumeServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationResumeServicesSwConcurrentResource}
 * <li><< ProfileAssociation_root_GaScenario >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRootGaScenario}
 * <li><< ProfileAssociation_routineConnectServices_InterruptResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRoutineConnectServicesInterruptResource}
 * <li><< ProfileAssociation_routineDisconnectServices_InterruptResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRoutineDisconnectServicesInterruptResource}
 * <li><< ProfileAssociation_routine_EntryPoint >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationRoutineEntryPoint}
 * <li><< ProfileAssociation_scenario_GaScenario >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationScenarioGaScenario}
 * <li><< ProfileAssociation_scheduler_MutualExclusionResource_Scheduler >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSchedulerMutualExclusionResourceScheduler}
 * <li><< ProfileAssociation_schedulers_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSchedulersSwSchedulableResource}
 * <li><< ProfileAssociation_selection_DataPool_Behavior >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSelectionDataPoolBehavior}
 * <li><< ProfileAssociation_sendServices_MessageComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSendServicesMessageComResource}
 * <li><< ProfileAssociation_servDeman_GaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationServDemanGaStep}
 * <li><< ProfileAssociation_setTime_ClockType_Operation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSetTimeClockTypeOperation}
 * <li><< ProfileAssociation_shareDataResources_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationShareDataResourcesSwConcurrentResource}
 * <li><< ProfileAssociation_sharedRes_SaStep >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSharedResSaStep}
 * <li><< ProfileAssociation_sides_HwBridge_HwMedia >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSidesHwBridgeHwMedia}
 * <li><< ProfileAssociation_signalServices_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSignalServicesNotificationResource}
 * <li><< ProfileAssociation_stackSizeElements_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationStackSizeElementsSwConcurrentResource}
 * <li><< ProfileAssociation_start_TimedProcessing_Event >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationStartTimedProcessingEvent}
 * <li><< ProfileAssociation_stateElements_SwResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationStateElementsSwResource}
 * <li><< ProfileAssociation_subComponents_HwComponent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSubComponentsHwComponent}
 * <li><< ProfileAssociation_subUsage_ResourceUsage >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSubUsageResourceUsage}
 * <li><< ProfileAssociation_suspendServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationSuspendServicesSwConcurrentResource}
 * <li><< ProfileAssociation_terminateServices_SwConcurrentResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTerminateServicesSwConcurrentResource}
 * <li><< ProfileAssociation_timeSliceElements_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTimeSliceElementsSwSchedulableResource}
 * <li><< ProfileAssociation_timedEvent_GaWorkloadEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTimedEventGaWorkloadEvent}
 * <li><< ProfileAssociation_timers_Alarm >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTimersAlarm}
 * <li><< ProfileAssociation_trace_GaWorkloadEvent >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTraceGaWorkloadEvent}
 * <li><< ProfileAssociation_tupleAttrib_TupleType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationTupleAttribTupleTypeAttribute}
 * <li><< ProfileAssociation_unMapService_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUnMapServiceMemoryBroker}
 * <li><< ProfileAssociation_unitAttrib_NfpType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUnitAttribNfpTypeAttribute}
 * <li><< ProfileAssociation_unitType_ClockType_Enumeration >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUnitTypeClockTypeEnumeration}
 * <li><< ProfileAssociation_unit_Clock_Unit >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUnitClockUnit}
 * <li><< ProfileAssociation_unlockService_MemoryBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUnlockServiceMemoryBroker}
 * <li><< ProfileAssociation_usedResources_ResourceUsage_Resource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationUsedResourcesResourceUsageResource}
 * <li><< ProfileAssociation_valueAttrib_NfpType_Attribute >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationValueAttribNfpTypeAttribute}
 * <li><< ProfileAssociation_vectorElements_InterruptResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationVectorElementsInterruptResource}
 * <li><< ProfileAssociation_waitServices_NotificationResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationWaitServicesNotificationResource}
 * <li><< ProfileAssociation_waitingPolicyElements_SwInteractionResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource}
 * <li><< ProfileAssociation_workload_GaAnalysisContext >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationWorkloadGaAnalysisContext}
 * <li><< ProfileAssociation_writeServices_DeviceBroker >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationWriteServicesDeviceBroker}
 * <li><< ProfileAssociation_writeServices_SharedDataComResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationWriteServicesSharedDataComResource}
 * <li><< ProfileAssociation_yieldServices_SwSchedulableResource >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link ProfileAssociationYieldServicesSwSchedulableResource}
 * </ul>
 */
@objid ("cc70d895-8c8f-4834-91db-4aa64c431939")
public class MARTEDesignerProxyFactory {
    @objid ("1c83533f-81ab-4ef2-8c7b-e54bded4aca4")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'MARTEDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("fc430ae8-8652-4967-9d90-65d5bae14382")
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              if (s.getModule().getName().equals(IMARTEDesignerPeerModule.MODULE_NAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'MARTEDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("5cbaacd2-de29-4563-9900-9ced316ee4a0")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("c13eeaa7-2c82-4435-a7d3-1958b38eb02b")
    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("b7532a23-52d9-40f9-9076-27736ddb6349")
        private String stName;

        @objid ("fe9c5c76-03af-4d79-b09a-47dc8de4a887")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("27087425-4996-458c-af67-526a162e7f8a")
        @Override
        public final Object visitConnectorEnd(ConnectorEnd obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend.ShapedConnectorEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend.ShapedConnectorEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend.TilerConnectorEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend.TilerConnectorEnd.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitConnectorEnd(obj);
        }

        @objid ("34ff6182-74c7-479f-97a5-cb87a93657f1")
        @Override
        public final Object visitCallAction(CallAction obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction.RtActionCallAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction.RtActionCallAction.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction.RtFeatureCallAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction.RtFeatureCallAction.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitCallAction(obj);
        }

        @objid ("0074f355-9e6d-446d-80e2-c4974dee5b90")
        @Override
        public final Object visitBindableInstance(BindableInstance obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.bindableinstance.NfpBindableInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.bindableinstance.NfpBindableInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance.DataPoolBindableInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance.DataPoolBindableInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance.FlowPropertyBindableInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance.FlowPropertyBindableInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.bindableinstance.ShapedBindableInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.bindableinstance.ShapedBindableInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.bindableinstance.VarBindableInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.bindableinstance.VarBindableInstance.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitBindableInstance(obj);
        }

        @objid ("43d0feb3-b3c3-4476-869f-692700a89255")
        @Override
        public final Object visitActivityPartition(ActivityPartition obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_alloc.standard.activitypartition.AllocateActivityGroupActivityPartition.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_alloc.standard.activitypartition.AllocateActivityGroupActivityPartition.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitActivityPartition(obj);
        }

        @objid ("1a676d1e-cdcb-47f8-9922-b8d1eb533080")
        @Override
        public final Object visitTransition(Transition obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.transition.ModeTransitionTransition.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.transition.ModeTransitionTransition.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitTransition(obj);
        }

        @objid ("2ec44254-c48e-406e-9b6e-2ecc67ae15ba")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.infrastructure.modelelement.ResourceUsageModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.infrastructure.modelelement.ResourceUsageModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.modelelement.AllocatedModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.modelelement.AllocatedModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaAcqStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaAcqStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaCommStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaCommStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaEventTraceModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaEventTraceModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRelStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRelStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRequestedServiceModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaRequestedServiceModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaScenarioModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaScenarioModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaWorkloadBehaviorModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaWorkloadBehaviorModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaWorkloadEventModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement.GaWorkloadEventModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaCommStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaCommStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaRequestedServiceModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaRequestedServiceModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaResPassStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaResPassStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaRunTInstanceModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaRunTInstanceModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement.PaStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaCommStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaCommStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaEndtoEndFlowModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaEndtoEndFlowModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaStepModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.infrastructure.modelelement.SaStepModelElement.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.infrastructure.modelelement.ExpressionContextModelElement.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.infrastructure.modelelement.ExpressionContextModelElement.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @objid ("36ef8a47-9ee8-45cf-b862-285c5109f6a0")
        @Override
        public final Object visitMessage(Message obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.message.TimedProcessingMessage.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.message.TimedProcessingMessage.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.message.RtFeatureMessage.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.message.RtFeatureMessage.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitMessage(obj);
        }

        @objid ("1ab212e0-d243-460d-b241-49fb7e3c324f")
        @Override
        public final Object visitEvent(Event obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.event.ClockEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.event.ClockEvent.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.event.TimedEventEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.event.TimedEventEvent.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.event.DataEventEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.event.DataEventEvent.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitEvent(obj);
        }

        @objid ("82abf893-2caa-468d-a5ab-57e148e81aa3")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.package_.ConfigurationPackage.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.package_.ConfigurationPackage.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.package_.TimedDomainNameSpace.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.package_.TimedDomainNameSpace.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_.GaAnalysisContextPackage.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_.GaAnalysisContextPackage.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.package_.SaAnalysisContextPackage.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.package_.SaAnalysisContextPackage.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("fe937aa2-290f-4e80-b2c6-3b5f75086df7")
        @Override
        public final Object visitEnumerationLiteral(EnumerationLiteral obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumerationliteral.UnitEnumerationLiteral.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumerationliteral.UnitEnumerationLiteral.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitEnumerationLiteral(obj);
        }

        @objid ("1c0488e1-98ee-4d23-9847-de99754c774a")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.datatype.NfpTypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.datatype.NfpTypeDataType.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.BoundedSubtypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.BoundedSubtypeDataType.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.ChoiceTypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.ChoiceTypeDataType.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.CollectionTypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.CollectionTypeDataType.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.IntervalTypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.IntervalTypeDataType.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.TupleTypeDataType.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.TupleTypeDataType.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @objid ("97794117-ab37-457f-826b-ce256cd51893")
        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.port.RtFeaturePort.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.port.RtFeaturePort.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port.ClientServerPortPort.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port.ClientServerPortPort.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port.FlowPortPort.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port.FlowPortPort.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        @objid ("6a9e6afd-9770-479f-a63e-5b1ae7069496")
        @Override
        public final Object visitOpaqueAction(OpaqueAction obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction.RtActionOpaqueAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction.RtActionOpaqueAction.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction.RtFeatureOpaqueAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction.RtFeatureOpaqueAction.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitOpaqueAction(obj);
        }

        @objid ("dcafe2ba-5b82-4f9a-82c5-bd764d34d765")
        @Override
        public final Object visitStateMachine(StateMachine obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.statemachine.ModeBehaviorStateMachine.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.statemachine.ModeBehaviorStateMachine.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitStateMachine(obj);
        }

        @objid ("00a752d3-9851-4fae-8fd7-8fc483ef1e60")
        @Override
        public final Object visitParameter(Parameter obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ClockResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ClockResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationEndPointParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationEndPointParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationMediaParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationMediaParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ComputingResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ComputingResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ConcurrencyResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ConcurrencyResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.DeviceResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.DeviceResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ProcessingResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ProcessingResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SchedulableResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SchedulableResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SchedulerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SchedulerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SecondarySchedulerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SecondarySchedulerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.StorageResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.StorageResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SynchronizationResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.SynchronizationResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimerResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimerResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimingResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.TimingResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwASICParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwASICParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwBranchPredictorParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwBranchPredictorParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwComputingResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwComputingResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwISAParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwISAParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwPLDParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwPLDParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwProcessorParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.parameter.HwProcessorParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwArbiterParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwArbiterParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwBridgeParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwBridgeParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwBusParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwBusParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwCommunicationResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwCommunicationResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwEndPointParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwEndPointParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwMediaParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter.HwMediaParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwClockParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwClockParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwTimerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwTimerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwTimingResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.parameter.HwTimingResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwDeviceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwDeviceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwIOParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwIOParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwSupportParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwSupportParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwActuatorParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwActuatorParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwSensorParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter.HwSensorParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwCacheParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwCacheParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwDriveParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwDriveParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwMemoryParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwMemoryParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwRAMParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwRAMParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwROMParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.parameter.HwROMParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwDMAParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwDMAParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwMMUParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwMMUParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwStorageManagerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter.HwStorageManagerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.parameter.HwComponentParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.parameter.HwComponentParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwBatteryParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwBatteryParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwCoolingSupplyParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwCoolingSupplyParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwPowerSupplyParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.parameter.HwPowerSupplyParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.AlarmParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.AlarmParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.InterruptResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.InterruptResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.MemoryPartitionParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.MemoryPartitionParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwConcurrentResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwConcurrentResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwSchedulableResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwSchedulableResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwTimerResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.parameter.SwTimerResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter.DeviceBrokerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter.DeviceBrokerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter.MemoryBrokerParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.parameter.MemoryBrokerParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.MessageComResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.MessageComResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.NotificationResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.NotificationResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SharedDataComResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SharedDataComResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwCommunicationResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwCommunicationResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwInteractionResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwInteractionResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwMutualExclusionResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwMutualExclusionResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwSynchronizationResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter.SwSynchronizationResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommChannelParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommChannelParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommHostParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaCommHostParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaExecHostParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaExecHostParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.parameter.PaLogicalResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.parameter.PaLogicalResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter.SaCommHostParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter.SaCommHostParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter.SaSharedResourceParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter.SaSharedResourceParameter.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.parameter.ShapedParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.parameter.ShapedParameter.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitParameter(obj);
        }

        @objid ("0088a323-2d34-4f7c-8389-3481b637488c")
        @Override
        public final Object visitActor(Actor obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor.PpUnitActor.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor.PpUnitActor.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor.RtUnitActor.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor.RtUnitActor.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitActor(obj);
        }

        @objid ("669957f3-03d4-4d1f-95ff-5be85c557e62")
        @Override
        public final Object visitAssociation(Association obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ClockResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ClockResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationEndPointAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationEndPointAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationMediaAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationMediaAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ComputingResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ComputingResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ConcurrencyResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ConcurrencyResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.DeviceResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.DeviceResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.MutualExclusionResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.MutualExclusionResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ProcessingResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ProcessingResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SchedulableResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SchedulableResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SchedulerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SchedulerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SecondarySchedulerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SecondarySchedulerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.StorageResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.StorageResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SynchronizationResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.SynchronizationResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimerResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimerResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimingResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimingResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.association.ClockAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.association.ClockAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwASICAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwASICAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwBranchPredictorAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwBranchPredictorAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwComputingResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwComputingResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwISAAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwISAAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwPLDAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwPLDAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwProcessorAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association.HwProcessorAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwArbiterAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwArbiterAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwBridgeAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwBridgeAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwBusAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwBusAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwCommunicationResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwCommunicationResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwEndPointAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwEndPointAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwMediaAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association.HwMediaAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwClockAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwClockAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwTimerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwTimerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwTimingResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.association.HwTimingResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwDeviceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwDeviceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwIOAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwIOAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwSupportAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwSupportAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwActuatorAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwActuatorAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwSensorAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association.HwSensorAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwCacheAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwCacheAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwDriveAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwDriveAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwMemoryAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwMemoryAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwRAMAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwRAMAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwROMAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association.HwROMAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwDMAAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwDMAAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwMMUAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwMMUAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwStorageManagerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.association.HwStorageManagerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association.HwComponentAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association.HwComponentAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwBatteryAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwBatteryAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwCoolingSupplyAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwCoolingSupplyAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwPowerSupplyAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association.HwPowerSupplyAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.AlarmAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.AlarmAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.InterruptResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.InterruptResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.MemoryPartitionAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.MemoryPartitionAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwConcurrentResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwConcurrentResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwSchedulableResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwSchedulableResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwTimerResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association.SwTimerResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association.DeviceBrokerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association.DeviceBrokerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association.MemoryBrokerAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.association.MemoryBrokerAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.MessageComResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.MessageComResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.NotificationResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.NotificationResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SharedDataComResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SharedDataComResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwCommunicationResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwCommunicationResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwInteractionResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwInteractionResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwMutualExclusionResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwMutualExclusionResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwSynchronizationResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association.SwSynchronizationResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommChannelAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommChannelAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommHostAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommHostAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaExecHostAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaExecHostAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.association.PaLogicalResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.association.PaLogicalResourceAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaCommHostAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaCommHostAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaExecHostAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaExecHostAssociation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaSharedResourceAssociation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association.SaSharedResourceAssociation.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAssociation(obj);
        }

        @objid ("b38517ed-b656-4764-9aed-4aaa59aad175")
        @Override
        public final Object visitLink(Link obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ClockResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ClockResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationEndPointLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationEndPointLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationMediaLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.CommunicationMediaLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ConcurrencyResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ConcurrencyResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.DeviceResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.DeviceResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.MutualExclusionResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.MutualExclusionResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ProcessingResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ProcessingResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SchedulableResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SchedulableResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SchedulerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SchedulerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SecondarySchedulerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SecondarySchedulerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.StorageResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.StorageResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SynchronizationResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.SynchronizationResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimerResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimerResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimingResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.TimingResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.link.ClockLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.link.ClockLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwASICLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwASICLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwBranchPredictorLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwBranchPredictorLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwComputingResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwComputingResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwISALink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwISALink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwPLDLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwPLDLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwProcessorLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link.HwProcessorLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwArbiterLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwArbiterLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwBridgeLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwBridgeLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwBusLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwBusLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwCommunicationResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwCommunicationResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwEndPointLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwEndPointLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwMediaLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link.HwMediaLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwClockLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwClockLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwTimerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwTimerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwTimingResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.link.HwTimingResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwDeviceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwDeviceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwIOLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwIOLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwSupportLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwSupportLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwActuatorLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwActuatorLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwSensorLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link.HwSensorLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwCacheLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwCacheLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwDriveLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwDriveLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwMemoryLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwMemoryLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwRAMLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwRAMLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwROMLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.link.HwROMLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwDMALink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwDMALink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwMMULink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwMMULink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwStorageManagerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.link.HwStorageManagerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.link.HwComponentLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.link.HwComponentLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwBatteryLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwBatteryLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwCoolingSupplyLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwCoolingSupplyLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwPowerSupplyLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link.HwPowerSupplyLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.link.SwResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.AlarmLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.AlarmLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.InterruptResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.InterruptResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.MemoryPartitionLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.MemoryPartitionLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwConcurrentResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwConcurrentResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwSchedulableResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwSchedulableResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwTimerResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.link.SwTimerResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link.DeviceBrokerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link.DeviceBrokerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link.MemoryBrokerLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.link.MemoryBrokerLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.MessageComResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.MessageComResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.NotificationResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.NotificationResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SharedDataComResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SharedDataComResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwCommunicationResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwCommunicationResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwInteractionResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwInteractionResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwMutualExclusionResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwMutualExclusionResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwSynchronizationResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link.SwSynchronizationResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaCommChannelLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaCommChannelLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaCommHostLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaCommHostLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaExecHostLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.link.GaExecHostLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.link.PaLogicalResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.link.PaLogicalResourceLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaCommHostLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaCommHostLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaExecHostLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaExecHostLink.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaSharedResourceLink.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.link.SaSharedResourceLink.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitLink(obj);
        }

        @objid ("079fa41b-4e11-4847-a138-ef1ac4f63118")
        @Override
        public final Object visitCollaboration(Collaboration obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.AcquireCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.AcquireCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.GrServiceCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.GrServiceCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.ReleaseCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.ReleaseCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.collaboration.ConfigurationCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.collaboration.ConfigurationCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration.PpUnitCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration.PpUnitCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration.RtUnitCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration.RtUnitCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaboration.HwResourceServiceCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaboration.HwResourceServiceCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaboration.SwAccessServiceCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaboration.SwAccessServiceCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.collaboration.GaAnalysisContextCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.collaboration.GaAnalysisContextCollaboration.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.collaboration.SaAnalysisContextCollaboration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.collaboration.SaAnalysisContextCollaboration.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitCollaboration(obj);
        }

        @objid ("aa36b28b-a724-474e-ae18-a569d038a374")
        @Override
        public final Object visitBehavior(Behavior obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.AcquireBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.AcquireBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.GrServiceBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.GrServiceBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.ReleaseBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior.ReleaseBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.behavior.ConfigurationBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.behavior.ConfigurationBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.behavior.TimedProcessingBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.behavior.TimedProcessingBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior.PpUnitBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior.PpUnitBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior.RtUnitBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior.RtUnitBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.behavior.HwResourceServiceBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.behavior.HwResourceServiceBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.behavior.SwAccessServiceBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.behavior.SwAccessServiceBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.behavior.GCMInvocatingBehaviorBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.behavior.GCMInvocatingBehaviorBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior.GaAnalysisContextBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior.GaAnalysisContextBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior.GaWorkloadGeneratorBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.behavior.GaWorkloadGeneratorBehavior.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behavior.SaAnalysisContextBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behavior.SaAnalysisContextBehavior.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitBehavior(obj);
        }

        @objid ("ca4ffb99-8e85-4dfd-bbbd-5e2b3474a6d8")
        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.AllocateDependency.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.AllocateDependency.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.NfpRefineDependency.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.NfpRefineDependency.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.infrastructure.dependency.EntryPointDependency.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.infrastructure.dependency.EntryPointDependency.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.infrastructure.dependency.GCMTriggerDependency.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.infrastructure.dependency.GCMTriggerDependency.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.infrastructure.dependency.DistributeDependency.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.infrastructure.dependency.DistributeDependency.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAccessTokenElementsSwMutualExclusionResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAccessTokenElementsSwMutualExclusionResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAccessedElementSwAccessService.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAccessedElementSwAccessService.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAcqResGaAcqStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAcqResGaAcqStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAcquireServicesSwMutualExclusionResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAcquireServicesSwMutualExclusionResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationActivateServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationActivateServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAddressSpaceSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationAddressSpaceSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationArbitersHwMediaHwArbiter.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationArbitersHwMediaHwArbiter.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseDimensionDimensionDimension.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseDimensionDimensionDimension.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseTypeBoundedSubTypeDatatype.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseTypeBoundedSubTypeDatatype.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseUnitUnitUnit.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBaseUnitUnitUnit.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehavDemandPaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehavDemandPaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehaviorGaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehaviorGaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehaviorGaWorkloadBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBehaviorGaWorkloadBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBlocksComputingHwPLDHwComputingResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBlocksComputingHwPLDHwComputingResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBlocksRAMHwPLDHwRAM.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBlocksRAMHwPLDHwRAM.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBufferHwDriveHwRAM.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationBufferHwDriveHwRAM.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCachesHwProcessorHwCache.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCachesHwProcessorHwCache.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCauseGaScenario.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCauseGaScenario.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationChildScenarioGaScenario.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationChildScenarioGaScenario.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationChoiceAttribChoiceTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationChoiceAttribChoiceTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationClassifierDataEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationClassifierDataEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationClearServicesNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationClearServicesNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCloseServicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCloseServicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCollectionAttribCollectionTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCollectionAttribCollectionTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConcurResGaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConcurResGaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConcurrentResourcesMemoryPartition.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConcurrentResourcesMemoryPartition.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConnectedToHwEndPointHwMedia.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationConnectedToHwEndPointHwMedia.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationControlServicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationControlServicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCreateServicesSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationCreateServicesSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeadlineElementsSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeadlineElementsSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeadlineTypeElementsSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeadlineTypeElementsSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDefaultAttribChoiceTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDefaultAttribChoiceTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDelayServicesSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDelayServicesSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeleteServicesSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDeleteServicesSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDemandGaWorkloadEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDemandGaWorkloadEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDependentSchedulerSchedulableResourceSecondaryScheduler.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDevicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDevicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDrivenByHwDMAHwProcessor.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDrivenByHwDMAHwProcessor.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDurationElementsSwTimerResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationDurationElementsSwTimerResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEffectGaWorkloadEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEffectGaWorkloadEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEndPointsHwResourceHwEndPoint.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationEndPointsHwResourceHwEndPoint.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationExitMemoryPartition.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationExitMemoryPartition.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationExprAttribNfpTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationExprAttribNfpTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFinishTimedProcessingEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFinishTimedProcessingEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFlushServicesNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationFlushServicesNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationForkMemoryPartition.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationForkMemoryPartition.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationGeneratorGaWorkloadEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationGeneratorGaWorkloadEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationGetTimeClockTypeOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationGetTimeClockTypeOperation.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHeapSizeElementsSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHeapSizeElementsSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostGaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostGaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostPaRunTInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostPaRunTInstance.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostSchedulableResourceScheduler.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostSchedulableResourceScheduler.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostSchedulerComputingResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationHostSchedulerComputingResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIdentifierElementsSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIdentifierElementsSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationImpliedConstraintAllocateNfpConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationImpliedConstraintAllocateNfpConstraint.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIndexToValueClockTypeOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIndexToValueClockTypeOperation.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInitializeServicesSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInitializeServicesSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInputClockHwTimerHwClock.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInputClockHwTimerHwClock.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInsertionDataPoolBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInsertionDataPoolBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInstancePaRunTInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInstancePaRunTInstance.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIntervalAttribIntervalTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationIntervalAttribIntervalTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInvocationsGCMInvocatingBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationInvocationsGCMInvocatingBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationJoinServicesSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationJoinServicesSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationLockServiceMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationLockServiceMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMainSchedulerProcessingResourceScheduler.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMainSchedulerProcessingResourceScheduler.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMainRtUnitOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMainRtUnitOperation.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMapServiceMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMapServiceMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaskElementsInterruptResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaskElementsInterruptResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaskElementsNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaskElementsNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaxValAttrClockTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMaxValAttrClockTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoriesMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoriesMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoryBlockAddressElementsMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoryBlockAddressElementsMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoryBlockSizeElementsMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemoryBlockSizeElementsMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemorySizeFootprintSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemorySizeFootprintSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemorySpacesMemoryPartition.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMemorySpacesMemoryPartition.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageQueueCapacityElementsMessageComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageQueueCapacityElementsMessageComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageResourcesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageResourcesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageSizeElementsMessageComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMessageSizeElementsMessageComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationModeConfigurationMode.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationModeConfigurationMode.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationModeNfpConstraintMode.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationModeNfpConstraintMode.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMutualExclusionResourcesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationMutualExclusionResourcesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationNotificationResourcesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationNotificationResourcesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOccurenceCountElementsNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOccurenceCountElementsNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOffsetAttrClockTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOffsetAttrClockTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnFeatureGCMInvocatingBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnFeatureGCMInvocatingBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnFeatureGCMInvocationAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnFeatureGCMInvocationAction.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnPortGCMInvocatingBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnPortGCMInvocatingBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnTimedElementClock.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOnTimedElementClock.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOpenServicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOpenServicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOperationModeRtUnitBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOperationModeRtUnitBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedHwHwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedHwHwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedISAsHwProcessorHwISA.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedISAsHwProcessorHwISA.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedMMUsHwProcessorHwMMU.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedMMUsHwProcessorHwMMU.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedTLBsHwMMUHwCache.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationOwnedTLBsHwMMUHwCache.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPHWServicesHwResourceHwResourceService.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPHWServicesHwResourceHwResourceService.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPeriodElementsSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPeriodElementsSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPlatformGaAnalysisContext.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPlatformGaAnalysisContext.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPoweredServicesHwComponentHwResourceService.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPoweredServicesHwComponentHwResourceService.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPredictorsHwProcessorHwBranchPredictor.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPredictorsHwProcessorHwBranchPredictor.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPriorityElementsSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationPriorityElementsSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRHWServicesHwResourceHwResourceService.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRHWServicesHwResourceHwResourceService.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReadServicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReadServicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReadServicesSharedDataComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReadServicesSharedDataComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReceiveServicesMessageComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReceiveServicesMessageComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRelResGaAcqStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRelResGaAcqStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReleaseServicesSwMutualExclusionResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationReleaseServicesSwMutualExclusionResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResolAttrClockTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResolAttrClockTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResourcePaResPassStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResourcePaResPassStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResourcesGaResourcesPlatform.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResourcesGaResourcesPlatform.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResumeServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationResumeServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRootGaScenario.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRootGaScenario.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineConnectServicesInterruptResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineConnectServicesInterruptResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineDisconnectServicesInterruptResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineDisconnectServicesInterruptResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineEntryPoint.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationRoutineEntryPoint.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationScenarioGaScenario.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationScenarioGaScenario.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSchedulerMutualExclusionResourceScheduler.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSchedulerMutualExclusionResourceScheduler.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSchedulersSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSchedulersSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSelectionDataPoolBehavior.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSelectionDataPoolBehavior.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSendServicesMessageComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSendServicesMessageComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationServDemanGaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationServDemanGaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSetTimeClockTypeOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSetTimeClockTypeOperation.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationShareDataResourcesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationShareDataResourcesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSharedResSaStep.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSharedResSaStep.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSidesHwBridgeHwMedia.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSidesHwBridgeHwMedia.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSignalServicesNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSignalServicesNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStackSizeElementsSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStackSizeElementsSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStartTimedProcessingEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStartTimedProcessingEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStateElementsSwResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationStateElementsSwResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSubComponentsHwComponent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSubComponentsHwComponent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSubUsageResourceUsage.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSubUsageResourceUsage.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSuspendServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationSuspendServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTerminateServicesSwConcurrentResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTerminateServicesSwConcurrentResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimeSliceElementsSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimeSliceElementsSwSchedulableResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimedEventGaWorkloadEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimedEventGaWorkloadEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimersAlarm.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTimersAlarm.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTraceGaWorkloadEvent.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTraceGaWorkloadEvent.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTupleAttribTupleTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationTupleAttribTupleTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnMapServiceMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnMapServiceMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitAttribNfpTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitAttribNfpTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitTypeClockTypeEnumeration.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitTypeClockTypeEnumeration.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitClockUnit.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnitClockUnit.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnlockServiceMemoryBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUnlockServiceMemoryBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUsedResourcesResourceUsageResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationUsedResourcesResourceUsageResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationValueAttribNfpTypeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationValueAttribNfpTypeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationVectorElementsInterruptResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationVectorElementsInterruptResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWaitServicesNotificationResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWaitServicesNotificationResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWaitingPolicyElementsSwInteractionResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWaitingPolicyElementsSwInteractionResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWorkloadGaAnalysisContext.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWorkloadGaAnalysisContext.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWriteServicesDeviceBroker.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWriteServicesDeviceBroker.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWriteServicesSharedDataComResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationWriteServicesSharedDataComResource.instantiate(obj);
                case org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationYieldServicesSwSchedulableResource.STEREOTYPE_NAME: return org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationYieldServicesSwSchedulableResource.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @objid ("22b96362-671b-4bbf-8985-3b90270e5170")
        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ClockResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ClockResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.CommunicationEndPointInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.CommunicationEndPointInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.CommunicationMediaInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.CommunicationMediaInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ConcurrencyResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ConcurrencyResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.DeviceResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.DeviceResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.MutualExclusionResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.MutualExclusionResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ProcessingResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ProcessingResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulableResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulableResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SecondarySchedulerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SecondarySchedulerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.StorageResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.StorageResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SynchronizationResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SynchronizationResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimerResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimerResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimingResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.TimingResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.instance.ClockInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.instance.ClockInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwASICInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwASICInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwBranchPredictorInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwBranchPredictorInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwComputingResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwComputingResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwISAInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwISAInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwPLDInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwPLDInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwProcessorInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance.HwProcessorInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwArbiterInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwArbiterInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwBridgeInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwBridgeInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwBusInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwBusInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwCommunicationResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwCommunicationResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwEndPointInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwEndPointInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwMediaInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.instance.HwMediaInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwClockInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwClockInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwTimerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwTimerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwTimingResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.instance.HwTimingResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwDeviceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwDeviceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwIOInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwIOInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwSupportInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwSupportInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwActuatorInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwActuatorInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwSensorInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance.HwSensorInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwCacheInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwCacheInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwDriveInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwDriveInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwMemoryInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwMemoryInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwRAMInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwRAMInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwROMInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.instance.HwROMInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwDMAInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwDMAInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwMMUInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwMMUInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwStorageManagerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.instance.HwStorageManagerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance.HwComponentInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.instance.HwComponentInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwBatteryInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwBatteryInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwCoolingSupplyInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwCoolingSupplyInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwPowerSupplyInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.instance.HwPowerSupplyInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.AlarmInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.AlarmInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.InterruptResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.InterruptResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.MemoryPartitionInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.MemoryPartitionInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwConcurrentResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwConcurrentResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwSchedulableResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwSchedulableResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwTimerResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance.SwTimerResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance.DeviceBrokerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance.DeviceBrokerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance.MemoryBrokerInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.instance.MemoryBrokerInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.MessageComResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.MessageComResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.NotificationResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.NotificationResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SharedDataComResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SharedDataComResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwCommunicationResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwCommunicationResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwInteractionResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwInteractionResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwMutualExclusionResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwMutualExclusionResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwSynchronizationResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance.SwSynchronizationResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommChannelInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommChannelInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommHostInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommHostInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaExecHostInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaExecHostInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.instance.PaLogicalResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.instance.PaLogicalResourceInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaCommHostInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaCommHostInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaExecHostInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaExecHostInstance.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaSharedResourceInstance.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance.SaSharedResourceInstance.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @objid ("940c7237-2c21-4ed9-a37f-321c5f6c9842")
        @Override
        public final Object visitState(State obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.state.ModeState.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.state.ModeState.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitState(obj);
        }

        @objid ("d4535357-381b-4a10-b51a-8b4485a06d3b")
        @Override
        public final Object visitLinkEnd(LinkEnd obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.CommunicationEndPointLinkEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.CommunicationEndPointLinkEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.ResourceLinkEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.ResourceLinkEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.linkend.HwEndPointLinkEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.linkend.HwEndPointLinkEnd.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitLinkEnd(obj);
        }

        @objid ("6fd6857b-a2cd-4a83-9a80-03f079442a9f")
        @Override
        public final Object visitClassifier(Classifier obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ClockResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ClockResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationEndPointClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationEndPointClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationMediaClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationMediaClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ComputingResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ComputingResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ConcurrencyResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ConcurrencyResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.DeviceResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.DeviceResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.MutualExclusionResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.MutualExclusionResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ProcessingResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ProcessingResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SchedulableResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SchedulableResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SchedulerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SchedulerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SecondarySchedulerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SecondarySchedulerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.StorageResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.StorageResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SynchronizationResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.SynchronizationResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimerResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimerResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimingResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimingResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwASICClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwASICClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwBranchPredictorClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwBranchPredictorClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwComputingResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwComputingResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwISAClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwISAClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwPLDClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwPLDClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwProcessorClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.classifier.HwProcessorClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwArbiterClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwArbiterClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwBridgeClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwBridgeClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwBusClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwBusClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwCommunicationResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwCommunicationResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwEndPointClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwEndPointClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwMediaClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwMediaClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwClockClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwClockClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwTimerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwTimerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwTimingResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier.HwTimingResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwDeviceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwDeviceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwIOClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwIOClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwSupportClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwSupportClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwActuatorClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwActuatorClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwSensorClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.classifier.HwSensorClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwCacheClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwCacheClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwDriveClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwDriveClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwMemoryClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwMemoryClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwRAMClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwRAMClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwROMClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier.HwROMClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwDMAClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwDMAClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwMMUClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwMMUClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwStorageManagerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier.HwStorageManagerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.classifier.HwComponentClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.classifier.HwComponentClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwBatteryClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwBatteryClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwCoolingSupplyClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwCoolingSupplyClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwPowerSupplyClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.classifier.HwPowerSupplyClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.AlarmClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.AlarmClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.InterruptResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.InterruptResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.MemoryPartitionClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.MemoryPartitionClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwConcurrentResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwConcurrentResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwSchedulableResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwSchedulableResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwTimerResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.SwTimerResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier.DeviceBrokerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier.DeviceBrokerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier.MemoryBrokerClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier.MemoryBrokerClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.MessageComResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.MessageComResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.NotificationResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.NotificationResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SharedDataComResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SharedDataComResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwCommunicationResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwCommunicationResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwInteractionResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwInteractionResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwMutualExclusionResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwMutualExclusionResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwSynchronizationResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier.SwSynchronizationResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaCommChannelClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaCommChannelClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaCommHostClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaCommHostClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaExecHostClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaExecHostClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaResourcesPlatformClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.classifier.GaResourcesPlatformClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.classifier.PaLogicalResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.classifier.PaLogicalResourceClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaCommHostClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaCommHostClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaExecHostClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaExecHostClassifier.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaSharedResourceClassifier.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.classifier.SaSharedResourceClassifier.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitClassifier(obj);
        }

        @objid ("0578c111-9f49-4cc3-b348-9e8793276fc8")
        @Override
        public final Object visitOperation(Operation obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.AcquireOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.AcquireOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.GrServiceOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.GrServiceOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.ReleaseOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation.ReleaseOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtActionOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtActionOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtFeatureOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtFeatureOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtServiceOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation.RtServiceOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.operation.HwResourceServiceOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.operation.HwResourceServiceOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.operation.SwAccessServiceOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.operation.SwAccessServiceOperation.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.operation.ClientServerFeatureOperation.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.operation.ClientServerFeatureOperation.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitOperation(obj);
        }

        @objid ("ce8d6c86-038c-4332-a17b-1ab2687d06c2")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.class_.ConfigurationClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.class_.ConfigurationClass.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.class_.ClockTypeClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.class_.ClockTypeClass.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_.PpUnitClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_.PpUnitClass.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_.RtUnitClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_.RtUnitClass.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.class_.GaAnalysisContextClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.class_.GaAnalysisContextClass.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.class_.SaAnalysisContextClass.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.class_.SaAnalysisContextClass.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("711dd6b8-2791-4933-8f4a-60a4315ba794")
        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumeration.DimensionEnumeration.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.enumeration.DimensionEnumeration.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @objid ("0f006241-1cd2-4236-9d54-344e8afb979a")
        @Override
        public final Object visitBehaviorParameter(BehaviorParameter obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behaviorparameter.SaExecHostParameter.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behaviorparameter.SaExecHostParameter.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitBehaviorParameter(obj);
        }

        @objid ("991a22f7-3b9d-4c4d-a7a8-43c42cc7dfb0")
        @Override
        public final Object visitSignal(Signal obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.signal.RtFeatureSignal.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.signal.RtFeatureSignal.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitSignal(obj);
        }

        @objid ("2426b321-f1be-4a94-9a07-576a6e602147")
        @Override
        public final Object visitExecutionSpecification(ExecutionSpecification obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.AcquireExecutionSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.AcquireExecutionSpecification.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.GrServiceExecutionSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.GrServiceExecutionSpecification.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.ReleaseExecutionSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.ReleaseExecutionSpecification.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.executionspecification.HwResourceServiceExecutionSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.executionspecification.HwResourceServiceExecutionSpecification.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.executionspecification.SwAccessServiceExecutionSpecification.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.executionspecification.SwAccessServiceExecutionSpecification.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitExecutionSpecification(obj);
        }

        @objid ("a63d7853-22fd-4ea5-9d92-91c943a89d15")
        @Override
        public final Object visitInterface(Interface obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_.ClientServerSpecificationInterface.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_.ClientServerSpecificationInterface.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_.FlowSpecificationInterface.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_.FlowSpecificationInterface.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitInterface(obj);
        }

        @objid ("834a0979-588b-48bb-ae95-0a284c13c422")
        @Override
        public final Object visitTaggedValue(TaggedValue obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.taggedvalue.TimedValueSpecificationTaggedValue.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.taggedvalue.TimedValueSpecificationTaggedValue.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitTaggedValue(obj);
        }

        @objid ("dbcc7d6d-0cfc-4276-8f74-0c4236130a7b")
        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ClockResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ClockResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationEndPointAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationEndPointAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationMediaAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.CommunicationMediaAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ComputingResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ConcurrencyResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ConcurrencyResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.DeviceResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.DeviceResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.MutualExclusionResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.MutualExclusionResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ProcessingResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ProcessingResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SchedulableResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SchedulableResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SchedulerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SchedulerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SecondarySchedulerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SecondarySchedulerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.StorageResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.StorageResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SynchronizationResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SynchronizationResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimerResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimerResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimingResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimingResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.attribute.NfpAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.attribute.NfpAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.attribute.ClockAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.attribute.ClockAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwASICAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwASICAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwBranchPredictorAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwBranchPredictorAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwComputingResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwComputingResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwISAAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwISAAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwPLDAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwPLDAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwProcessorAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute.HwProcessorAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwArbiterAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwArbiterAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwBridgeAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwBridgeAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwBusAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwBusAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwCommunicationResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwCommunicationResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwEndPointAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwEndPointAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwMediaAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute.HwMediaAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwClockAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwClockAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwTimerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwTimerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwTimingResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute.HwTimingResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwDeviceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwDeviceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwIOAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwIOAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwSupportAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwSupportAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwActuatorAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwActuatorAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwSensorAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute.HwSensorAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwCacheAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwCacheAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwDriveAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwDriveAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwMemoryAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwMemoryAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwRAMAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwRAMAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwROMAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute.HwROMAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwDMAAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwDMAAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwMMUAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwMMUAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwStorageManagerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.attribute.HwStorageManagerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.attribute.HwComponentAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.attribute.HwComponentAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwBatteryAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwBatteryAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwCoolingSupplyAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwCoolingSupplyAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwPowerSupplyAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.attribute.HwPowerSupplyAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.AlarmAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.AlarmAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.InterruptResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.InterruptResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.MemoryPartitionAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.MemoryPartitionAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwConcurrentResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwConcurrentResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwSchedulableResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwSchedulableResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwTimerResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute.SwTimerResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute.DeviceBrokerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute.DeviceBrokerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute.MemoryBrokerAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.attribute.MemoryBrokerAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.MessageComResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.MessageComResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.NotificationResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.NotificationResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SharedDataComResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SharedDataComResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwCommunicationResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwCommunicationResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwInteractionResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwInteractionResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwMutualExclusionResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwMutualExclusionResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwSynchronizationResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute.SwSynchronizationResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute.DataPoolAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute.DataPoolAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute.FlowPropertyAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute.FlowPropertyAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommChannelAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommChannelAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommHostAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaCommHostAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaExecHostAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute.GaExecHostAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.attribute.PaLogicalResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.attribute.PaLogicalResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaCommHostAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaCommHostAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaExecHostAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaExecHostAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaSharedResourceAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute.SaSharedResourceAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.attribute.ShapedAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.attribute.ShapedAttribute.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.attribute.VarAttribute.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.attribute.VarAttribute.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @objid ("d8fa314d-7279-4e19-887e-ba89276fe56e")
        @Override
        public final Object visitCollaborationUse(CollaborationUse obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.AcquireCollaborationUse.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.AcquireCollaborationUse.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.GrServiceCollaborationUse.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.GrServiceCollaborationUse.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.ReleaseCollaborationUse.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.ReleaseCollaborationUse.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaborationuse.HwResourceServiceCollaborationUse.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.collaborationuse.HwResourceServiceCollaborationUse.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaborationuse.SwAccessServiceCollaborationUse.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaborationuse.SwAccessServiceCollaborationUse.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitCollaborationUse(obj);
        }

        @objid ("293fe041-0465-4e45-bba8-6a842bb68fe2")
        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.DefaultLinkConnector.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.DefaultLinkConnector.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.InterRepetitionConnector.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.InterRepetitionConnector.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.LinkTopologyConnector.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.LinkTopologyConnector.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.ReshapeConnector.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.ReshapeConnector.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.TilerConnector.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector.TilerConnector.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @objid ("5ed3f03e-d2f2-406a-9426-438aef4feb82")
        @Override
        public final Object visitUseCase(UseCase obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase.PpUnitUseCase.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase.PpUnitUseCase.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase.RtUnitUseCase.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase.RtUnitUseCase.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitUseCase(obj);
        }

        @objid ("e1890758-fadf-4cc2-bd74-3f79fab2952c")
        @Override
        public final Object visitAssociationEnd(AssociationEnd obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ClockResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ClockResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationEndPointAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationEndPointAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationMediaAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationMediaAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ComputingResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ComputingResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ConcurrencyResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ConcurrencyResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.DeviceResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.DeviceResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.MutualExclusionResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.MutualExclusionResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ProcessingResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ProcessingResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SchedulableResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SchedulableResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SchedulerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SchedulerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SecondarySchedulerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SecondarySchedulerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.StorageResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.StorageResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SynchronizationResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.SynchronizationResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimerResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimerResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimingResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.TimingResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.associationend.NfpAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.associationend.NfpAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.associationend.ClockAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.associationend.ClockAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwASICAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwASICAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwBranchPredictorAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwBranchPredictorAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwComputingResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwComputingResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwISAAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwISAAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwPLDAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwPLDAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwProcessorAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend.HwProcessorAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwArbiterAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwArbiterAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwBridgeAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwBridgeAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwBusAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwBusAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwCommunicationResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwCommunicationResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwEndPointAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwEndPointAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwMediaAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend.HwMediaAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwClockAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwClockAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwTimerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwTimerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwTimingResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.associationend.HwTimingResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwDeviceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwDeviceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwIOAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwIOAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwSupportAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwSupportAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwActuatorAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwActuatorAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwSensorAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend.HwSensorAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwCacheAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwCacheAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwDriveAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwDriveAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwMemoryAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwMemoryAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwRAMAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwRAMAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwROMAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend.HwROMAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwDMAAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwDMAAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwMMUAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwMMUAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwStorageManagerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.associationend.HwStorageManagerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend.HwComponentAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend.HwComponentAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwBatteryAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwBatteryAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwCoolingSupplyAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwCoolingSupplyAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwPowerSupplyAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend.HwPowerSupplyAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend.SwResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.AlarmAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.AlarmAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.InterruptResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.InterruptResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.MemoryPartitionAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.MemoryPartitionAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwConcurrentResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwConcurrentResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwSchedulableResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwSchedulableResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwTimerResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.associationend.SwTimerResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend.DeviceBrokerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend.DeviceBrokerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend.MemoryBrokerAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.associationend.MemoryBrokerAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.MessageComResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.MessageComResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.NotificationResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.NotificationResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SharedDataComResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SharedDataComResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwCommunicationResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwCommunicationResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwInteractionResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwInteractionResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwMutualExclusionResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwMutualExclusionResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwSynchronizationResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend.SwSynchronizationResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend.DataPoolAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend.DataPoolAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend.FlowPropertyAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend.FlowPropertyAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommChannelAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommChannelAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommHostAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaCommHostAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaExecHostAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.associationend.GaExecHostAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.associationend.PaLogicalResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.associationend.PaLogicalResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaCommHostAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaCommHostAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaExecHostAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaExecHostAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaSharedResourceAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend.SaSharedResourceAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.associationend.ShapedAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.associationend.ShapedAssociationEnd.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.associationend.VarAssociationEnd.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_annexes_vsl_variables.standard.associationend.VarAssociationEnd.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAssociationEnd(obj);
        }

        @objid ("4647519a-1bb8-4ee8-9b51-756a3af3a457")
        @Override
        public final Object visitSendSignalAction(SendSignalAction obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction.RtActionSendSignalAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction.RtActionSendSignalAction.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction.RtFeatureSendSignalAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction.RtFeatureSendSignalAction.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitSendSignalAction(obj);
        }

        @objid ("dee6a6b4-4157-4089-b85e-14a852b59285")
        @Override
        public final Object visitConstraint(Constraint obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint.NfpConstraintConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint.NfpConstraintConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.ClockConstraintConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.ClockConstraintConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.TimedConstraintConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.TimedConstraintConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.DurationConstraintConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.DurationConstraintConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.IntervalConstraintConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.IntervalConstraintConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.TimedDurationObservationConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.TimedDurationObservationConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.DurationObservationConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint.DurationObservationConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaLatencyObsConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaLatencyObsConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaTimedObsConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaTimedObsConstraint.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.constraint.SaSchedObsConstraint.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.constraint.SaSchedObsConstraint.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitConstraint(obj);
        }

        @objid ("f14c91dd-1465-47f4-a8e9-05e55bb71581")
        @Override
        public final Object visitNode(Node obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.node.ConfigurationNode.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.node.ConfigurationNode.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.node.GaAnalysisContextNode.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.node.GaAnalysisContextNode.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.node.SaAnalysisContextNode.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.node.SaAnalysisContextNode.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitNode(obj);
        }

        @objid ("17a6fd7b-a1b0-413d-a0ae-76fd0cb331d2")
        @Override
        public final Object visitActivityAction(ActivityAction obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_time.standard.activityaction.TimedProcessingActivityAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.standard.activityaction.TimedProcessingActivityAction.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.activityaction.GCMInvocationActionActivityAction.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.activityaction.GCMInvocationActionActivityAction.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitActivityAction(obj);
        }

        @objid ("a34865ba-ce0c-4c48-b237-12ce395190cf")
        @Override
        public final Object visitLifeline(Lifeline obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ClockResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ClockResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationEndPointLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationEndPointLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationMediaLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationMediaLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ComputingResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ComputingResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ConcurrencyResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ConcurrencyResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.DeviceResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.DeviceResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.MutualExclusionResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.MutualExclusionResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ProcessingResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ProcessingResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SchedulableResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SchedulableResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SchedulerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SchedulerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SecondarySchedulerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SecondarySchedulerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.StorageResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.StorageResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SynchronizationResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.SynchronizationResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimerResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimerResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimingResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.TimingResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwASICLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwASICLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwBranchPredictorLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwBranchPredictorLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwComputingResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwComputingResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwISALifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwISALifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwPLDLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwPLDLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwProcessorLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.lifeline.HwProcessorLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwArbiterLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwArbiterLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwBridgeLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwBridgeLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwBusLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwBusLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwCommunicationResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwCommunicationResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwEndPointLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwEndPointLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwMediaLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline.HwMediaLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwClockLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwClockLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwTimerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwTimerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwTimingResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.lifeline.HwTimingResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwDeviceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwDeviceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwIOLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwIOLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwSupportLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwSupportLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwActuatorLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwActuatorLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwSensorLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline.HwSensorLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwCacheLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwCacheLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwDriveLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwDriveLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwMemoryLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwMemoryLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwRAMLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwRAMLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwROMLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.lifeline.HwROMLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwDMALifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwDMALifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwMMULifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwMMULifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwStorageManagerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline.HwStorageManagerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline.HwComponentLifeLine.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline.HwComponentLifeLine.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwBatteryLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwBatteryLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwCoolingSupplyLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwCoolingSupplyLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwPowerSupplyLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline.HwPowerSupplyLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.AlarmLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.AlarmLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.InterruptResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.InterruptResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.MemoryPartitionLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.MemoryPartitionLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwConcurrentResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwConcurrentResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwSchedulableResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwSchedulableResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwTimerResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline.SwTimerResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline.DeviceBrokerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline.DeviceBrokerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline.MemoryBrokerLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.lifeline.MemoryBrokerLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.MessageComResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.MessageComResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.NotificationResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.NotificationResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SharedDataComResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SharedDataComResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwCommunicationResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwCommunicationResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwInteractionResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwInteractionResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwMutualExclusionResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwMutualExclusionResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwSynchronizationResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline.SwSynchronizationResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaCommChannelLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaCommChannelLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaCommHostLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaCommHostLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaExecHostLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaExecHostLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.lifeline.PaLogicalResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.lifeline.PaLogicalResourceLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaCommHostLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaCommHostLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaExecHostLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaExecHostLifeline.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaSharedResourceLifeline.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline.SaSharedResourceLifeline.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitLifeline(obj);
        }

        @objid ("68fa512a-1a42-4971-af78-e5f2a6d89f20")
        @Override
        public final Object visitNote(Note obj) {
            switch (this.stName) {
                case org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.note.AssignNote.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.note.AssignNote.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note.TimedInstantObservationNote.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note.TimedInstantObservationNote.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note.TimedObservationNote.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note.TimedObservationNote.instantiate(obj);
                case org.modelio.module.marte.api.marte_marte_designmodel_hlam.infrastructure.note.RtSpecificationNote.STEREOTYPE_NAME: return org.modelio.module.marte.api.marte_marte_designmodel_hlam.infrastructure.note.RtSpecificationNote.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitNote(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("ceefe487-1152-430e-9b34-9837de8261e4")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
