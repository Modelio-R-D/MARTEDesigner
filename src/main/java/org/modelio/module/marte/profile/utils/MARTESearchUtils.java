package org.modelio.module.marte.profile.utils;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("40aa6c3d-ae83-42b8-be8b-1bbe25dbf9d8")
public class MARTESearchUtils {
    @objid ("f5dfb79a-d3d6-4c66-bda8-c41cd574cf96")
    private static OwnedStereotypeVisitor visitor = new OwnedStereotypeVisitor();

    @objid ("f443dd51-9a31-401d-b9ba-18baf33f7094")
    public static boolean isClock(ModelElement elt) {
        return (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ASSOCIATION) 
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ASSOCIATIONEND)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_ATTRIBUTE)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_INSTANCE)
                                                                || elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCK_EVENT));
    }

    @objid ("c48c2f5c-6135-41a8-a0ff-f3e8fb925f76")
    public static boolean isClockType(ModelElement elt) {
        return (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.CLOCKTYPE_CLASS));
    }

    @objid ("7b723277-4079-4f55-9457-3f73ca3ac1f0")
    public static boolean isClockOrClockType(ModelElement elt) {
        return  isClock(elt) || isClockType(elt);
    }

    @objid ("d5fd2039-b7aa-4d3b-8542-458ea64b6390")
    private static List<ModelElement> getOwnedStereotypeList(final ModelElement owner, final List<String> stereotypeNames) {
        return visitor.getOwnedStereotypeList(owner, stereotypeNames);
    }

    @objid ("740ef24b-a8a4-449a-bb18-0fef6d349266")
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

    @objid ("50eeaa97-203f-4b57-9386-d068dc6474fc")
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

    @objid ("ac66294b-01a1-4d5f-b3d6-bfe559acdee0")
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

    @objid ("6fe66676-7436-469b-9c45-63ba2b651455")
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

    @objid ("a6a0aaa9-f96c-4ac7-a64b-9e275a457205")
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

    @objid ("c01f7b6d-c8ac-4b9e-8b2b-c636599fad0d")
    public static List<ModelElement> getOwnedHwResourceService(final ModelElement owner) {
        ArrayList<String> stereotypeNames = new ArrayList<>();
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION);
        stereotypeNames.add(MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION);
        return getOwnedStereotypeList(owner, stereotypeNames);
    }

    @objid ("9962d0e7-179a-41ca-abbb-43fccc406c81")
    public static List<ModelElement> searchHwResourceService() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Behavior.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_BEHAVIOR));
        result.addAll(ModelUtils.searchElementStereotyped(Collaboration.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATION));
        result.addAll(ModelUtils.searchElementStereotyped(CollaborationUse.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_COLLABORATIONUSE));
        result.addAll(ModelUtils.searchElementStereotyped(ExecutionSpecification.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_EXECUTIONSPECIFICATION));
        result.addAll(ModelUtils.searchElementStereotyped(Operation.class, MARTEDesignerStereotypes.HWRESOURCESERVICE_OPERATION));
        return result;
    }

    @objid ("71bef5e2-ecec-49b4-ad31-a8abc42508ae")
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

    @objid ("8e8d960e-c8b3-4736-918a-0ddf1da4ed5f")
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

    @objid ("f3f1f6fd-c437-4887-8804-2892fbc3e15d")
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

    @objid ("2de80ece-55ab-4f3b-97b6-20806e7d26aa")
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

    @objid ("c4685908-648e-401c-aaa5-a4f049b92bd8")
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

    @objid ("b79bc5fd-73f7-4b72-810c-f9b161e03ef3")
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

    @objid ("cc5ba5b7-d7b5-4969-a9ac-25fe0bdea7d4")
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

    @objid ("5ad41ed7-e032-4f15-a219-fd98ebf79c29")
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

    @objid ("1e9a819b-77f8-40bc-b022-0e4b4f273202")
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

    @objid ("fc6c6ddd-fee3-4f0b-8b09-86e4f3d0576c")
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

    @objid ("8bc37db4-ac72-4ea2-b694-a525d6b640ef")
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

    @objid ("aef0855b-e561-4707-a20e-9f11500af67a")
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

    @objid ("0955bb65-1a25-45f0-9c38-61ff0e83dedc")
    public static List<ModelElement> searchProperty() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(BindableInstance.class));
        result.addAll(ModelUtils.searchElement(Attribute.class));
        return result;
    }

    @objid ("5f07286f-4d7b-40b4-b598-ae9a5ae87a31")
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

    @objid ("50103c42-48b1-41fd-8d0c-0f4d4c511130")
    public static List<ModelElement> searchBehavioralFeature() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Operation.class));
        return result;
    }

    @objid ("81d3a451-c431-478e-b988-2957078da695")
    public static List<ModelElement> searchNamedElement() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(ModelElement.class));
        return result;
    }

    @objid ("df63fd1c-7f5d-4dc3-80b5-9a7ba995fc1f")
    public static List<ModelElement> searchResourceUsage() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(ModelElement.class, MARTEDesignerStereotypes.RESOURCEUSAGE_MODELELEMENT));
        return result;
    }

    @objid ("2e246ce2-2d8f-4adf-a6b5-9e2f962b4be0")
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

    @objid ("94782ffd-1ac7-4ae6-ae35-5b990252429c")
    public static List<ModelElement> searchPort() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Port.class));
        return result;
    }

    @objid ("36fac0b4-518d-462d-aed6-da3a4f4a575e")
    public static List<ModelElement> searchFeature() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Operation.class));
        result.addAll(ModelUtils.searchElement(Connector.class));
        result.addAll(searchProperty());
        return result;
    }

    @objid ("273ab73e-d809-4e50-8b76-d00ceec0a607")
    public static List<ModelElement> searchClientServerSpecification() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElementStereotyped(Interface.class, MARTEDesignerStereotypes.CLIENTSERVERSPECIFICATION_INTERFACE));
        return result;
    }

    @objid ("eab14b98-9edc-4510-9c6a-930695d9a95c")
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

    @objid ("8b31aba3-609f-43c7-bdca-e0e0f862784a")
    public static List<ModelElement> searchClassifier() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Classifier.class));
        result.addAll(ModelUtils.searchElement(Association.class));
        return result;
    }

    @objid ("fa7d793c-e498-4aa5-8217-a30be3f9c006")
    public static List<ModelElement> searchBehavior() {
        List<ModelElement> result = new ArrayList<>();
        result.addAll(ModelUtils.searchElement(Behavior.class));
        return result;
    }

}
