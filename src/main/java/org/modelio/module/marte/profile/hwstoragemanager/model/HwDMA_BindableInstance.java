package org.modelio.module.marte.profile.hwstoragemanager.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwcommunication.model.HwArbiter_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("53736c64-45a1-49e6-b9ed-1fcac68d7061")
public class HwDMA_BindableInstance extends HwArbiter_BindableInstance {
    @objid ("5c4e9201-92d6-4bd1-bef1-19823014b884")
    public HwDMA_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDMA_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDMA_BindableInstance"));
    }

    @objid ("349274d8-37aa-45cd-a8e4-bd90260e0eab")
    public HwDMA_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("fd423443-bdbe-4e8b-a71a-297a9e7db543")
    public String getnbChannels() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, this.element);
    }

    @objid ("bf99f288-51cf-4d58-ad47-dfadb452e9de")
    public void setnbChannels(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_NBCHANNELS, value);
    }

    @objid ("c492eb4a-156a-49c7-9c6b-805d80c7049b")
    public String gettransferWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, this.element);
    }

    @objid ("5eb7c7fc-b4e6-409d-b215-217810265987")
    public void settransferWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_TRANSFERWIDTH, value);
    }

    @objid ("3144cfc2-2444-41fc-863e-46b7a79cd24f")
    public String getdrivenBy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, this.element);
    }

    @objid ("a362e018-6e44-4220-b31b-fb8965299901")
    public void setdrivenBy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_DRIVENBY, value);
    }

    @objid ("0f987d5d-561f-4431-bcb2-4442e7cb1a40")
    public String getmanagedMemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, this.element);
    }

    @objid ("417d4ab4-d72f-45b1-b494-ab68c7ff5883")
    public void setmanagedMemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWDMA_INSTANCE_HWDMA_INSTANCE_MANAGEDMEMORIES, value);
    }

}
