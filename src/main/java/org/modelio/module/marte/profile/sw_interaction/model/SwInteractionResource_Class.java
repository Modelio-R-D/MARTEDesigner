package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwInteractionResource_Class extends SwResource_Class {
    public SwInteractionResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER));
    }

    public SwInteractionResource_Class(Class element) {
        super(element);
    }

    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, this.element);
    }

    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, value);
    }

    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, this.element);
    }

    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, value);
    }

    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, this.element);
    }

    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, value);
    }

    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
