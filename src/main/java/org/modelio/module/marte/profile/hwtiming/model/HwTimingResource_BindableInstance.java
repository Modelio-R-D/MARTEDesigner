package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8a903933-e3e6-49eb-b5f5-17d3ffd19686")
public class HwTimingResource_BindableInstance extends TimingResource_BindableInstance {
    @objid ("4c16781d-47eb-4814-b8cf-e16494b0b9e4")
    public HwTimingResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimingResource_BindableInstance"));
    }

    @objid ("3f6ec902-d646-49b6-b001-ec58f00e5042")
    public HwTimingResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("b3e5fec4-897b-40c7-a218-f7fb11e4be0e")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("f4e0976e-cc4d-457c-b8b2-720690b9cab3")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, value);
    }

    @objid ("1953440a-435b-443d-9856-a0f82189fc7d")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("7e4bfb3f-cb86-4169-a9e5-5735e7bcfa01")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("7547036f-b21c-4beb-a937-e0512ae1ad3c")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("48aec372-0ea7-4a4b-aec8-63bc18a0e0d5")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("20e673a6-8616-4154-8fca-7bf102b8e144")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("a37cfc90-2d3b-42d2-8ba3-bf2471dce3a6")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, value);
    }

    @objid ("dffc54fa-ae13-40af-87ca-b7c694fb12ea")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("628f09cf-b590-4cd1-bbfe-ce9e262cd97a")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, value);
    }

    @objid ("c3411819-5983-4915-b280-069abf670809")
    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("24d30365-3f9b-4671-b1ef-7842c6424587")
    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, value);
    }

}
