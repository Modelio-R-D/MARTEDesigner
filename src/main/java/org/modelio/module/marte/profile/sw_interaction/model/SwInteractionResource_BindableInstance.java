package org.modelio.module.marte.profile.sw_interaction.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwInteractionResource_BindableInstance extends SwResource_BindableInstance {
    public SwInteractionResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwInteractionResource_BindableInstance"));
    }

    public SwInteractionResource_BindableInstance(BindableInstance element) {
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

}
