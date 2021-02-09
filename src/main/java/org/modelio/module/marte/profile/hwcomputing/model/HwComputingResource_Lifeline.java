package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Lifeline extends ComputingResource_Lifeline {
    public HwComputingResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Lifeline"));
    }

    public HwComputingResource_Lifeline(Lifeline element) {
        super(element);
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_OWNEDHW, value);
    }

    public String getHwComputingResource_Lifeline_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, this.element);
    }

    public void setHwComputingResource_Lifeline_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_FREQUENCY, value);
    }

    public String getHwComputingResource_Lifeline_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_Lifeline_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_LIFELINE_HWCOMPUTINGRESOURCE_LIFELINE_ENDPOINTS, value);
    }

}
