package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("df8e2b00-8d64-403a-b1fe-09f66e931d62")
public class HwDMA_Instance extends HwArbiter_Instance {
    @objid ("b76af66f-f9e4-4db8-9215-7e01a08e9441")
    public HwDMA_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDMA_Instance"));
    }

    @objid ("2a9404e0-4239-4f58-8793-30b6c282f21c")
    public HwDMA_Instance(Instance element) {
        super(element);
    }

    @objid ("70b28298-d8ff-49da-8e75-1f40c29ba2cd")
    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, this.element);
    }

    @objid ("37b0ad34-b2c3-4076-a206-2896d6c01466")
    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, value);
    }

    @objid ("a41aff56-9b3e-4cca-afa9-fa3d880168cf")
    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, this.element);
    }

    @objid ("7a67802f-47d2-4f5c-ba00-5941e2800438")
    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, value);
    }

    @objid ("dbc8329c-65b7-48a6-8d7f-c21c0539f03d")
    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, this.element);
    }

    @objid ("ea332abe-e5b5-4e13-b3b7-12edd924890e")
    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, value);
    }

    @objid ("7a0d65c6-4bdc-4f44-bbfd-cb5744926c7b")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    @objid ("f4df7ff1-ec5e-4429-bc09-683e34edb0b4")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, value);
    }

}
