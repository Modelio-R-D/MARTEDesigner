package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Parameter extends ComputingResource_Parameter {
    public HwComputingResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Parameter"));
    }

    public HwComputingResource_Parameter(Parameter element) {
        super(element);
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_OWNEDHW, value);
    }

    public String getHwComputingResource_Parameter_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY, this.element);
    }

    public void setHwComputingResource_Parameter_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_FREQUENCY, value);
    }

    public String getHwComputingResource_Parameter_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_Parameter_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_PARAMETER_HWCOMPUTINGRESOURCE_PARAMETER_ENDPOINTS, value);
    }

}
