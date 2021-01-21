package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("670e01b4-0e68-4c77-98fe-25e3eb9edb5c")
public class HwComputingResource_Parameter extends ComputingResource_Parameter {
    @objid ("bf3ef099-c7b9-4a70-8465-ea149aa1aa8c")
    public HwComputingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Parameter"));
    }

    @objid ("6f822123-236f-4991-be9e-b7a1bb0bf94c")
    public HwComputingResource_Parameter(Parameter element) {
        super(element);
    }

    @objid ("9c504060-6adb-4d84-9caf-fb6cea25d318")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES, this.element);
    }

    @objid ("7d4c6394-0328-435f-8de0-8b5692b51b87")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES, value);
    }

    @objid ("30f6c617-1de7-484d-8c1a-d52155a4db0a")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION, this.element);
    }

    @objid ("04d5ee54-e549-41af-9903-584f23ef1e13")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION, value);
    }

    @objid ("76c795b9-00ce-4c67-91ed-97cb45b04ac3")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES, this.element);
    }

    @objid ("3d68bf0b-1add-47cd-a36e-1d9a834d2fb4")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES, value);
    }

    @objid ("69d6377a-4d93-4ae5-8b3b-4d51c27319a1")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES, this.element);
    }

    @objid ("5f409fe1-0ccd-46a9-89f7-ed0bf7e4785c")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES, value);
    }

    @objid ("16f35ae2-fb3e-4b59-a4ff-ea8d8f84e6d0")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW, this.element);
    }

    @objid ("60d415ab-5bd9-439c-a9ae-b2c72a6561a6")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW, value);
    }

    @objid ("152ce39f-554d-44ff-908e-3cccb2f2ee2c")
    public String getHwComputingResource_Parameter_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY, this.element);
    }

    @objid ("88899814-2d44-403e-8198-3acc702990ed")
    public void setHwComputingResource_Parameter_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY, value);
    }

    @objid ("fc7e196c-4695-4aaf-8328-ccdaf474e8d8")
    public String getHwComputingResource_Parameter_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS, this.element);
    }

    @objid ("d4ca0cda-810c-47cc-9377-0e2830ff55ed")
    public void setHwComputingResource_Parameter_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS, value);
    }

}
