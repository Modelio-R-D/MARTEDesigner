package org.modelio.module.marte.profile.hwstoragemanager.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDMA_Instance extends HwArbiter_Instance {
    public HwDMA_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDMA_Instance"));
    }

    public HwDMA_Instance(Instance element) {
        super(element);
    }

    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, this.element);
    }

    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, value);
    }

    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, this.element);
    }

    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, value);
    }

    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, this.element);
    }

    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, value);
    }

    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, value);
    }

}
