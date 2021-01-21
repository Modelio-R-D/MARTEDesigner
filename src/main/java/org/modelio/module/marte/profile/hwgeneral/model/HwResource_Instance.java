package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.grm.model.Resource_Instance;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3300103f-d7c8-436e-8975-25a66697463b")
public class HwResource_Instance extends Resource_Instance {
    @objid ("f7a41733-df70-4e2d-960b-2c1365900b90")
    public HwResource_Instance() {
    }

    @objid ("05970665-0d72-41a1-9c91-f02f0d6e353f")
    public HwResource_Instance(Instance element) {
        super(element);
    }

    @objid ("b75121ca-552d-43a1-8c33-8dbaa35259e8")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("937f95d2-7480-449f-9370-8c78655ebf60")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("52e04811-c559-49bb-8946-cdb79ae2ebbd")
    public String getp_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("cc897022-9403-45ac-ba0d-325701d09a71")
    public void setp_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("2781c745-0bb5-4ecc-b352-04716fbcdd52")
    public String getr_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("6cf8c93d-2b73-4cdd-974a-e29eb383b41d")
    public void setr_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("c1f5a4e2-f169-4f6d-8ca7-15ad2c687068")
    public String getownedhw() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("af6828fb-bc63-48fe-98cf-dc19a4e9b0ce")
    public void setownedhw(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("7ec6f190-cf5e-4fed-823e-fc8b6127c43c")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("a178b8ef-c5da-48c6-87b7-4d0e1c8935a1")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("113d16c3-6611-4b82-98ce-36e356d6fdc9")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("fda148f1-f17b-4f48-aaec-8c7cc2dcbad9")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
