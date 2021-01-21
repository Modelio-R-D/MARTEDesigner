package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("47f52e77-4135-4be6-9370-17e1db0d6f13")
public class DeviceBroker_Instance extends SwResource_Instance {
    @objid ("997963ad-c047-4479-972e-99de80c44993")
    public DeviceBroker_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("DeviceBroker_Instance"));
    }

    @objid ("a03dd1a9-76ad-4a29-9e11-299b37a6e655")
    public DeviceBroker_Instance(Instance element) {
        super(element);
    }

    @objid ("36ee5f7b-dc12-467a-863f-5d7742a72505")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    @objid ("dea99a61-c78a-4a4d-b873-eaa914735a24")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    @objid ("f5069ed6-d4d1-4715-818e-76b579787ad4")
    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED, this.element);
    }

    @objid ("cd8f4cfe-d25e-4322-b7c0-4c3be152b76e")
    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED,value);
    }

    @objid ("44be7d73-7699-444e-afb6-8f34040ef2b0")
    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, this.element);
    }

    @objid ("0c2de424-6902-4b7b-bc3b-6e9d54f45c35")
    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, value);
    }

    @objid ("7ea7a1d5-2a5d-485c-aea4-99a4ba2da6d7")
    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, this.element);
    }

    @objid ("1ee95b01-316b-44f9-a716-96ec94323bad")
    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, value);
    }

    @objid ("0a51f59c-2460-4719-854f-ebe758d3df77")
    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, this.element);
    }

    @objid ("8c4ac46a-5c5c-475e-9ef0-444340f36b3b")
    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, value);
    }

    @objid ("33106505-db07-44ab-9b8e-8ebf0236e844")
    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, this.element);
    }

    @objid ("9933d68e-9626-4863-a45b-c49730e06a01")
    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, value);
    }

    @objid ("76750896-815b-47af-a5b5-00bf798fa2e0")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, this.element);
    }

    @objid ("b1385826-623e-480a-b061-4b88043196d4")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, value);
    }

    @objid ("e1ce5d3f-d8ac-490f-8e0a-28c2634b6d9c")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, this.element);
    }

    @objid ("7b167556-2cef-4a0b-b4b0-e04e0bcccd24")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, value);
    }

    @objid ("054c76ce-05f8-47be-8f1c-006fba14d498")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
