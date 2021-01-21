package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.grm.model.Resource_BindableInstance;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e8c14400-7ebf-4257-b712-8868c9e3bf14")
public class HwResource_BindableInstance extends Resource_BindableInstance {
    @objid ("f3ba1533-63e5-40c5-8920-3dfe0f9eb511")
    public HwResource_BindableInstance() {
    }

    @objid ("83d21b07-fcba-49d0-acc3-a344f2501064")
    public HwResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("b3e153a4-e613-4a94-a969-45fdd660188f")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("d56b173e-0ba9-4831-a616-376ae81bf7df")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("6d840bd5-cc49-4908-bc58-694b03ead98f")
    public String getp_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("5f78fd02-9589-49eb-a804-64795a93bfcb")
    public void setp_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("1b38900a-e554-4fb4-bce5-9b62709f1490")
    public String getr_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("b080424a-2d84-499f-84d7-f6a97e287036")
    public void setr_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("167a9c56-95e8-48d8-82c2-f96be52f628a")
    public String getownedhw() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("8517f43d-c8cc-4f46-9ef9-29751707f718")
    public void setownedhw(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("6e25fb4d-ceed-4ae4-8936-4c08c8fc1678")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("56e66bce-6b1f-4795-9b85-88e2ff981766")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("c3a7914f-4132-45f3-ab20-3cf0bd1a873b")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("cfab93e8-30aa-4756-8e64-7724d280779f")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
