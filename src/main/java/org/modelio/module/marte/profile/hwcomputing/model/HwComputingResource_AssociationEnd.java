package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwComputingResource_AssociationEnd extends ComputingResource_AssociationEnd {
    public HwComputingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_AssociationEnd"));
    }

    public HwComputingResource_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, this.element);
    }

    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, value);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW, value);
    }

    public String getHwComputingResource_AssociationEnd_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, this.element);
    }

    public void setHwComputingResource_AssociationEnd_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, value);
    }

    public String getHwComputingResource_AssociationEnd_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS, this.element);
    }

    public void setHwComputingResource_AssociationEnd_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS, value);
    }

}
