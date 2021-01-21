package org.modelio.module.marte.profile.hwgeneral.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.grm.model.Resource_Node;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1c0d8159-570c-463e-b9a2-5ac72be0c312")
public class HwResource_Node extends Resource_Node {
    @objid ("27906dd8-05ee-488e-bbfd-55370208991c")
    public HwResource_Node() {
    }

    @objid ("02bb5ec3-5d3d-4951-9d5f-99409d585fcd")
    public HwResource_Node(Node element) {
        super(element);
    }

    @objid ("d1c0a2ee-c186-4984-b1df-9eda8bd6a105")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, this.element);
    }

    @objid ("fa16b2a7-1531-4688-9221-dbf9f844392c")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_DESCRIPTION, value);
    }

    @objid ("c0518695-4aa2-4747-81bc-2954cd3f4bde")
    public String getp_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, this.element);
    }

    @objid ("f5fe16eb-3a54-41db-aab9-f8c428f3697e")
    public void setp_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_P_HW_SERVICES, value);
    }

    @objid ("9b73c67a-a2ca-4d49-acf4-f68d75fe663f")
    public String getr_hw_services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, this.element);
    }

    @objid ("528b2ce2-b1d3-4f9c-9d18-b3d22ef58604")
    public void setr_hw_services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_R_HW_SERVICES, value);
    }

    @objid ("0aa2e1da-1127-4f9f-aebb-45ca16cd03c0")
    public String getownedhw() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, this.element);
    }

    @objid ("7e6e3ef8-d540-4f03-8c65-74f8f3880fdc")
    public void setownedhw(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_OWNEDHW, value);
    }

    @objid ("1b8bdfd7-411e-4cf8-9b86-34cadca64bd6")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, this.element);
    }

    @objid ("f402c810-8037-459b-bd4a-66a275ec2d19")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_FREQUENCY, value);
    }

    @objid ("92f72973-98b4-4845-9f4e-58f6f595f1ce")
    public String getendpoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, this.element);
    }

    @objid ("ec79c446-52dd-4b4a-b97e-1b778c30391b")
    public void setendpoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWRESOURCE_CLASSIFIER_HWRESOURCE_CLASSIFIER_ENDPOINTS, value);
    }

}
