package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwTimingResource_Instance extends TimingResource_Instance {
    public HwTimingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimingResource_Instance"));
    }

    public HwTimingResource_Instance(Instance element) {
        super(element);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, value);
    }

    public String getHwTimingResource_Instance_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, this.element);
    }

    public void setHwTimingResource_Instance_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, value);
    }

    public String getHwTimingResource_Instance_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, this.element);
    }

    public void setHwTimingResource_Instance_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, value);
    }

}
