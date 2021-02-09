package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwTimingResource_Node extends TimingResource_Node {
    public HwTimingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER));
    }

    public HwTimingResource_Node(Node element) {
        super(element);
    }

    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    public String getHwTimingResource_Node_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    public void setHwTimingResource_Node_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
