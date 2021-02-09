package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;

public class MARTESearchUtils {
    private static OwnedStereotypeVisitor visitor = new OwnedStereotypeVisitor();

    public static boolean isClock(ModelElement elt) {
        return (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ASSOCIATION) 
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ASSOCIATIONEND)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ATTRIBUTE)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_INSTANCE)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_EVENT));
    }

    public static boolean isClockType(ModelElement elt) {
        return (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCKTYPE_CLASS));
    }

    public static boolean isClockOrClockType(ModelElement elt) {
        return  isClock(elt) || isClockType(elt);
    }

    private static List<ModelElement> getOwnedStereotypeList(final ModelElement owner, final List<String> stereotypeNames) {
        return visitor.getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedHwRAM(final ModelElement owner) {
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRAM_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedCaches(final ModelElement owner) {
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCACHE_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedISAs(final ModelElement owner) {
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWISA_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedHwComputingResource(final ModelElement owner) {
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedHwComponent(final ModelElement owner) {
        List<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWCOMPONENT_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedHwResourceService(final ModelElement owner) {
        ArrayList<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> searchHwResourceService() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR));
        result.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        result.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        result.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        result.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        return result;
    }

    public static List<ModelElement> searchSaSharedresource() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchHwMemory() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.HWMEMORY_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.HWMEMORY_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.HWMEMORY_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.HWMEMORY_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.HWMEMORY_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.HWMEMORY_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.HWMEMORY_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.HWMEMORY_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchScheduler() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SCHEDULER_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SCHEDULER_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SCHEDULER_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SCHEDULER_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SCHEDULER_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SCHEDULER_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SCHEDULER_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchSchedulableResource() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SCHEDULABLERESOURCE_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchGaExecHost() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.GAEXECHOST_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.GAEXECHOST_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.GAEXECHOST_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.GAEXECHOST_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.GAEXECHOST_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.GAEXECHOST_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.GAEXECHOST_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchSecondaryScheduler() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.SECONDARYSCHEDULER_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchHwMedia() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.HWMEDIA_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.HWMEDIA_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.HWMEDIA_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.HWMEDIA_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.HWMEDIA_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.HWMEDIA_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.HWMEDIA_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchHwArbiter() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.HWARBITER_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.HWARBITER_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.HWARBITER_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.HWARBITER_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.HWARBITER_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.HWARBITER_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.HWARBITER_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.HWARBITER_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchHwClock() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.HWCLOCK_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.HWCLOCK_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.HWCLOCK_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.HWCLOCK_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.HWCLOCK_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.HWCLOCK_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.HWCLOCK_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchHwProcessor() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.HWPROCESSOR_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.HWPROCESSOR_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.HWPROCESSOR_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.HWPROCESSOR_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.HWPROCESSOR_PARAMETER));
        return result;
    }

    public static List<ModelElement> getOwnedHwResource(final ModelElement owner) {
        ArrayList<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCE_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> getOwnedHwEndPoint(final ModelElement owner) {
        ArrayList<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_ASSOCIATIONEND);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_ATTRIBUTE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_CLASSIFIER);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_LIFELINE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_LINK);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_LINKEND);
        stereotypeNames.add(MARTEDesignerStereotypes.HWENDPOINT_PARAMETER);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    public static List<ModelElement> searchProperty() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(BindableInstance.class));
        result.addAll(ModelUtils.searchElement(Attribute.class));
        return result;
    }

    public static List<ModelElement> searchTypedElement() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Parameter.class));
        result.addAll(ModelUtils.searchElement(Attribute.class));
        result.addAll(ModelUtils.searchElement(Instance.class));
        result.addAll(ModelUtils.searchElement(ObjectNode.class));
        result.addAll(ModelUtils.searchElement(Connector.class));
        result.addAll(ModelUtils.searchElement(AssociationEnd.class));
        return result;
    }

    public static List<ModelElement> searchBehavioralFeature() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Operation.class));
        return result;
    }

    public static List<ModelElement> searchNamedElement() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(ModelElement.class));
        return result;
    }

    public static List<ModelElement> searchResourceUsage() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.RESOURCEUSAGE_MODELELEMENT));
        return result;
    }

    public static List<ModelElement> searchResource() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Association.class, MARTEDesignerStereotypes.RESOURCE_ASSOCIATION));
        result.addAll(ModelUtils.searchElementStereotyped(AssociationEnd.class, MARTEDesignerStereotypes.RESOURCE_ASSOCIATIONEND));
        result.addAll(ModelUtils.searchElementStereotyped(Attribute.class, MARTEDesignerStereotypes.RESOURCE_ATTRIBUTE));
        result.addAll(ModelUtils.searchElementStereotyped(Classifier.class, MARTEDesignerStereotypes.RESOURCE_CLASSIFIER));
        result.addAll(ModelUtils.searchElementStereotyped(Instance.class, MARTEDesignerStereotypes.RESOURCE_INSTANCE));
        result.addAll(ModelUtils.searchElementStereotyped(Lifeline.class, MARTEDesignerStereotypes.RESOURCE_LIFELINE));
        result.addAll(ModelUtils.searchElementStereotyped(Link.class, MARTEDesignerStereotypes.RESOURCE_LINK));
        result.addAll(ModelUtils.searchElementStereotyped(Parameter.class, MARTEDesignerStereotypes.RESOURCE_PARAMETER));
        return result;
    }

    public static List<ModelElement> searchPort() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Port.class));
        return result;
    }

    public static List<ModelElement> searchFeature() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Operation.class));
        result.addAll(ModelUtils.searchElement(Connector.class));
        result.addAll(searchProperty());
        return result;
    }

    public static List<ModelElement> searchClientServerSpecification() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Interface.class, MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE));
        return result;
    }

    public static List<ModelElement> searchTimedEvent() {
        List<ModelElement> temp = new ArrayList<>();
        List<ModelElement> result = new ArrayList<>();
        temp.addAll(ModelUtils.searchElement(Event.class));
        for(ModelElement elt : temp){
            if (((Event) elt).getKind().equals(EventType.TIMEEVENT))
                result.add(elt);          
        }
        return result;
    }

    public static List<ModelElement> searchClassifier() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Classifier.class));
        result.addAll(ModelUtils.searchElement(Association.class));
        return result;
    }

    public static List<ModelElement> searchBehavior() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Behavior.class));
        return result;
    }

}
