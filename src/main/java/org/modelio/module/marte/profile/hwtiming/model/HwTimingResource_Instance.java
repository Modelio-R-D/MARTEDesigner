package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3d9fbe48-4714-432f-bc99-a5ba4f0b0947")
public class HwTimingResource_Instance extends TimingResource_Instance {
    @objid ("3c425e0d-f458-41ca-bd38-800b2635f0f6")
    public HwTimingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimingResource_Instance"));
    }

    @objid ("e77f965a-0231-47ca-89ce-5e5e68a9a93c")
    public HwTimingResource_Instance(Instance element) {
        super(element);
    }

    @objid ("de807f33-ec93-4901-a6ee-e3201e717c77")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, this.element);
    }

    @objid ("236d1dfb-0b73-46e9-84a6-748fc3d90d2d")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_DESCRIPTION, value);
    }

    @objid ("4bead6a2-7827-4e69-93e0-e5f4b557dde2")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, this.element);
    }

    @objid ("af493f3d-6a1d-4fd0-9e62-eea82fa0f7a6")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_P_HW_SERVICES, value);
    }

    @objid ("f61f6944-0780-4d56-a425-c21af0fc1811")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, this.element);
    }

    @objid ("f045451c-9eda-4a5e-a369-a815d9ebf0a0")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_R_HW_SERVICES, value);
    }

    @objid ("71b916df-a830-4e4a-812d-86924c139bea")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, this.element);
    }

    @objid ("7f496427-fa6e-4369-9f0f-01fd483bc863")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_OWNEDHW, value);
    }

    @objid ("f20ba037-d217-4d2f-9f05-3feb48606475")
    public String getHwTimingResource_Instance_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("fd76a052-ca3d-4bc0-9a0e-5c3f478b896e")
    public void setHwTimingResource_Instance_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_INSTANCE_HWRESOURCE_INSTANCE_FREQUENCY, value);
    }

    @objid ("5ad17743-1b19-4744-ab5c-8390c5f8e5e3")
    public String getHwTimingResource_Instance_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, this.element);
    }

    @objid ("7281511e-dcd0-44f6-8042-128039aa3774")
    public void setHwTimingResource_Instance_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_INSTANCE_HWTIMINGRESOURCE_INSTANCE_ENDPOINTS, value);
    }

}
