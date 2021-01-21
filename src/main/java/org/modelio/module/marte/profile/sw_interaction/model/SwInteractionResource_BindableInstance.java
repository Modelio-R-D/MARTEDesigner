package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("94536a12-342d-40ba-bcdc-f13bb2a300af")
public class SwInteractionResource_BindableInstance extends SwResource_BindableInstance {
    @objid ("783aead1-4246-47dc-b2f8-42d6d62d3617")
    public SwInteractionResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwInteractionResource_BindableInstance"));
    }

    @objid ("5bb57c01-9203-4ef6-8586-b98a3575e9fe")
    public SwInteractionResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("f6050ff5-6ab7-4f5a-9a72-3366f4698b60")
    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    @objid ("01c835c2-bdd7-418a-8331-2923a6a51f81")
    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    @objid ("3b421c31-545c-4582-8dd4-09b82b3cdc76")
    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, this.element);
    }

    @objid ("47c25c9d-2268-4a58-802e-d488af717d78")
    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, value);
    }

    @objid ("9ed89e0a-ce89-49ea-be18-83414b643096")
    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, this.element);
    }

    @objid ("3f16b250-d970-4227-bea0-7a6ba2a6b3d2")
    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, value);
    }

    @objid ("e0cc458d-d0a6-49d1-b343-fdfdbb9c2481")
    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, this.element);
    }

    @objid ("07f1f167-8478-4543-8f71-7a0d5c1040c9")
    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, value);
    }

}
