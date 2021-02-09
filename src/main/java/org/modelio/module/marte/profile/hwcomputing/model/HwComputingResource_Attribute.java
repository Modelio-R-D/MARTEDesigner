package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_Attribute extends ComputingResource_Attribute {
    public HwComputingResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_Attribute"));
    }

    public HwComputingResource_Attribute(Attribute element) {
        super(element);
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_OWNEDHW, value);
    }

    public String getHwComputingResource_Attribute_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY, this.element);
    }

    public void setHwComputingResource_Attribute_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_FREQUENCY, value);
    }

    public String getHwComputingResource_Attribute_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_Attribute_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ATTRIBUTE_HWCOMPUTINGRESOURCE_ATTRIBUTE_ENDPOINTS, value);
    }

}
