package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bfd8c821-15ca-45c1-85e2-a711f6a8f29f")
public class SwInteractionResource_Class extends SwResource_Class {
    @objid ("b2b47202-e15e-4da6-b09a-086899c4685c")
    public SwInteractionResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWINTERACTIONRESOURCE_CLASSIFIER));
    }

    @objid ("34a67e80-4489-4346-8c2b-f1fc7128533b")
    public SwInteractionResource_Class(Class element) {
        super(element);
    }

    @objid ("2487c9fa-d4c4-4afc-b819-e13e488614f9")
    public boolean isisIntraMemoryPartitionInteraction() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION, this.element);
    }

    @objid ("3d0ff628-2203-40a9-a0b0-577f947bb189")
    public void isisIntraMemoryPartitionInteraction(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION,value);
    }

    @objid ("02cfd68e-c9a0-4553-b20d-6455d07284b5")
    public String getwaitingQueuePolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, this.element);
    }

    @objid ("ec7172a5-4412-463d-9985-d46ba44686ed")
    public void setwaitingQueuePolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY, value);
    }

    @objid ("71766608-c755-4baf-a54c-9f76b6aeb4f5")
    public String getwaitingQueueCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, this.element);
    }

    @objid ("06b86ada-6f8d-421b-840f-3c1000fc25b3")
    public void setwaitingQueueCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY, value);
    }

    @objid ("e638faed-fc3d-4f72-911c-248f0cf1cc64")
    public String getwaitingPolicyElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, this.element);
    }

    @objid ("9b90c2d4-bd6c-4ace-9c29-b61e057ba0fb")
    public void setwaitingPolicyElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWINTERACTIONRESOURCE_CLASSIFIER_SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS, value);
    }

    @objid ("72f591db-5957-4628-94cb-52956b3fccd1")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
