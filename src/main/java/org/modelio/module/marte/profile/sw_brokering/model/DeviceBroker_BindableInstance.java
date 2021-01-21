package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("677bac8a-7669-4e63-b870-9881a1397678")
public class DeviceBroker_BindableInstance extends SwResource_BindableInstance {
    @objid ("bea226b7-40c4-46c8-bc21-986f8f947bd4")
    public DeviceBroker_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("DeviceBroker_BindableInstance"));
    }

    @objid ("313ec51b-f205-4605-9a4a-82e9f6b80a1b")
    public DeviceBroker_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("ec18c46f-77a6-4a3d-8f98-b48d11ed330f")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    @objid ("b266b126-7c3b-4676-b95e-79f5b108644b")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    @objid ("367d3438-7a60-4a83-bb20-abca35b58c14")
    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED, this.element);
    }

    @objid ("fa8815be-d9d9-4c49-bc4c-55addf657e2e")
    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED,value);
    }

    @objid ("4d52e3a6-1507-4d06-82fe-6349d498a5b3")
    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, this.element);
    }

    @objid ("ed080657-a2c5-4be7-957e-e930a5cbe08c")
    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, value);
    }

    @objid ("6015b05b-54c2-4269-8b1a-0eae90164f5b")
    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, this.element);
    }

    @objid ("0853d180-588a-48f7-9ce8-a2e67b14c9ac")
    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, value);
    }

    @objid ("0a55d42e-8f33-402e-8041-9de0acb719ae")
    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, this.element);
    }

    @objid ("b5171a12-4885-4940-bcaf-df6bcfedfb65")
    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, value);
    }

    @objid ("84d2dea5-e9ae-41f0-a935-9de35eaab6a5")
    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, this.element);
    }

    @objid ("6e3ae17b-014f-43d9-84e3-2cb7dbc3c95e")
    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, value);
    }

    @objid ("779bb948-fde0-48fa-80a5-00417cce206f")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, this.element);
    }

    @objid ("493c7c80-58b0-435d-b8a8-1800a6b7fc79")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, value);
    }

    @objid ("43423aea-ab39-4c7f-b236-f7f1234fb0b4")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, this.element);
    }

    @objid ("bbc742e9-4e67-431b-bea5-8f9fe5f7e34b")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, value);
    }

}
