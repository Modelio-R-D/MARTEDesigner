package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwInteractionResource_Instance extends SwResource_Instance {
    public SwInteractionResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwInteractionResource_Instance"));
    }

    public SwInteractionResource_Instance(Instance element) {
        super(element);
    }

    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, this.element);
    }

    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, value);
    }

    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, this.element);
    }

    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, value);
    }

    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, this.element);
    }

    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, value);
    }

    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
