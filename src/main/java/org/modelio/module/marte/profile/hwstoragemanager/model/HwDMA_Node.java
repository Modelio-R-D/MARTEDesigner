package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4de99460-31ec-44cb-a3aa-7876c820ea71")
public class HwDMA_Node extends HwArbiter_Node {
    @objid ("c501393f-e3ae-40fa-a89e-0dcc59be2208")
    public HwDMA_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDMA_CLASSIFIER));
    }

    @objid ("4e48be8e-65ba-4f06-93cd-66e562fc9081")
    public HwDMA_Node(Node element) {
        super(element);
    }

    @objid ("71bc6eab-cc69-4e91-a415-f7c946f6e4a2")
    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, this.element);
    }

    @objid ("2c20dad6-c6b5-4be8-bdcf-46e17afefc6e")
    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_NBCHANNELS, value);
    }

    @objid ("33b7b525-8790-413f-a40b-b92e25bf8a41")
    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, this.element);
    }

    @objid ("89cd759e-503b-44f0-8224-77828dc24f10")
    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_TRANSFERWIDTH, value);
    }

    @objid ("126b30d2-f25c-4896-92da-2f6def1ad945")
    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, this.element);
    }

    @objid ("e4d41564-b691-4be5-838d-f285d50bd7c0")
    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_DRIVENBY, value);
    }

    @objid ("20eb4b46-2181-4f15-a024-73ea82dc335e")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, this.element);
    }

    @objid ("6f38e1b7-2da8-4b6d-b599-4d3473a4da4f")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_CLASSIFIER_HWDMA_CLASSIFIER_MANAGEDMEMORIES, value);
    }

}
