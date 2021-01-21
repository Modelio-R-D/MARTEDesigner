package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ea235878-1726-4b39-b3b0-40e2f818e2bd")
public class SwInteractionResource_Node extends SwResource_Node {
    @objid ("3828cb89-8b09-47c0-8e57-ad03bcdeb1cf")
    public SwInteractionResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER));
    }

    @objid ("b952adb2-4f07-4369-8e0b-dd2b4595310e")
    public SwInteractionResource_Node(Node element) {
        super(element);
    }

    @objid ("f0a2a03f-d9a9-4d23-86d7-c14b4885736c")
    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    @objid ("e9de0919-16bb-457c-9712-77b5cd601ba0")
    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    @objid ("54bac77a-8577-45b8-ab70-830a466597f5")
    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, this.element);
    }

    @objid ("d61a4994-a2cf-45e9-8e06-80f3d11ac552")
    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, value);
    }

    @objid ("45a7e638-d6e1-4d9f-bbec-6da5835ef220")
    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, this.element);
    }

    @objid ("bbf1c63a-a827-4782-9fee-f9a6cb2d7375")
    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, value);
    }

    @objid ("a1502c9e-1b3e-41c0-bc5c-be4f18875f01")
    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, this.element);
    }

    @objid ("215a2c8e-2dde-410c-8d65-e0606676cba1")
    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, value);
    }

    @objid ("68ab3292-f2e7-4888-9d5f-0cd7024eaa28")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
