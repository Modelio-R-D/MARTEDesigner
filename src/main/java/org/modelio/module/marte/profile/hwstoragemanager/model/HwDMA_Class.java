package org.modelio.module.marte.profile.hwstoragemanager.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDMA_Class extends HwArbiter_Class {
    public HwDMA_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDMA_CLASSIFIER));
    }

    public HwDMA_Class(Class element) {
        super(element);
    }

    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, this.element);
    }

    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, value);
    }

    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, this.element);
    }

    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, value);
    }

    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, this.element);
    }

    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, value);
    }

    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, this.element);
    }

    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, value);
    }

}
