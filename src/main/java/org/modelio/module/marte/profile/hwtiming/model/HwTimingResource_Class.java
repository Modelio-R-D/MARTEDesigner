package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimingResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("edac250d-9d67-4186-b0ad-a0760e8e4855")
public class HwTimingResource_Class extends TimingResource_Class {
    @objid ("72bf254c-370d-4c18-a2f2-ce1d68de6262")
    public HwTimingResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMINGRESOURCE_CLASSIFIER));
    }

    @objid ("817e58e0-eba0-4eb5-b6cf-37a8031a03d9")
    public HwTimingResource_Class(Class element) {
        super(element);
    }

    @objid ("17a8c491-60d6-47fa-9d2c-a86e3790540a")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("29d2b2b9-0ac8-4307-a120-aa3fd574d32b")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("b722c808-747f-4ad4-9c56-276d61183bc4")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("5d4d7ee8-72cc-4f00-b4e7-4cbff6fba014")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("04940679-2657-49a5-b8f0-833f53e85971")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("150587e8-0da3-459c-9080-211e12326247")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("a5955c28-5c9a-4bc5-a5fb-3a6944d06835")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("68f6c55c-9361-4b98-8fac-5948fdce98be")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("49b2fea3-beae-49bd-af76-52281ff954a0")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("35d8d0a1-097b-4b71-ac77-89175967cc7b")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("4397310b-82af-48d3-94eb-863e733189ff")
    public String getendPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("83e913e4-7a4e-4547-a16a-5f17290eb47e")
    public void setendPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMINGRESOURCE_CLASSIFIER_HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
