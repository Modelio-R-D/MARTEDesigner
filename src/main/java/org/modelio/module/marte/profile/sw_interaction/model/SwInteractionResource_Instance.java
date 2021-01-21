package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d748c927-0f6f-41c0-a9a8-0e6e5f0241e3")
public class SwInteractionResource_Instance extends SwResource_Instance {
    @objid ("1e4fbefa-cb36-484b-b497-1aa4c3a12160")
    public SwInteractionResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwInteractionResource_Instance"));
    }

    @objid ("496a1377-c14f-4532-a6c1-aa796ae391d8")
    public SwInteractionResource_Instance(Instance element) {
        super(element);
    }

    @objid ("c3a3bf65-f256-4891-98d3-50cc680b9707")
    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    @objid ("b4ecf46d-5006-4178-9526-4cd0a351f489")
    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    @objid ("4cf128ed-f02c-4841-94ce-399a3c212bee")
    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, this.element);
    }

    @objid ("668da979-438c-428d-bc0f-6b9d5270e38a")
    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY, value);
    }

    @objid ("0b57470a-2ba2-4390-9916-d8cebf0f9280")
    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, this.element);
    }

    @objid ("51eb96bf-1998-485e-9eec-f548f4083e13")
    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY, value);
    }

    @objid ("8ab85a2f-268f-4091-844f-59d1240770be")
    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, this.element);
    }

    @objid ("04f374a3-4711-4e89-9277-f20fb36106c8")
    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_INSTANCE_SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS, value);
    }

    @objid ("6a369e4d-4ead-4f9e-8d42-162600d96bef")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
