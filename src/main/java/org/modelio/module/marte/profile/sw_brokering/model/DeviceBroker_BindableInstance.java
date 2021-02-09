package org.modelio.module.marte.profile.sw_brokering.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DeviceBroker_BindableInstance extends SwResource_BindableInstance {
    public DeviceBroker_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("DeviceBroker_BindableInstance"));
    }

    public DeviceBroker_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, this.element);
    }

    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ACCESSPOLICY, value);
    }

    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED, this.element);
    }

    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_ISBUFFERED,value);
    }

    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, this.element);
    }

    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_DEVICES, value);
    }

    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, this.element);
    }

    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CLOSESERVICES, value);
    }

    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, this.element);
    }

    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_CONTROLSERVICES, value);
    }

    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, this.element);
    }

    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_OPENSERVICES, value);
    }

    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, this.element);
    }

    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_READSERVICES, value);
    }

    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, this.element);
    }

    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_INSTANCE_DEVICEBROKER_INSTANCE_WRITESERVICES, value);
    }

}
