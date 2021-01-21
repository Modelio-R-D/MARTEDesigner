package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("44450fe3-2ce1-4ffe-acbd-9a83b8e390e9")
public class DeviceBroker_Node {
    @objid ("8e7c4158-197e-478c-a581-8ecc557cb496")
    protected Node element;

    @objid ("ce51a9b4-f84e-4100-8d39-f052a3928045")
    public DeviceBroker_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER));
    }

    @objid ("05adbeae-7727-45be-bbe4-70fd7ce33fbb")
    public DeviceBroker_Node(Node element) {
        this.element = element;
    }

    @objid ("2047d93b-50e0-42e8-9bab-65ec15b8e33f")
    public Node getElement() {
        return this.element;
    }

    @objid ("b4a2341e-ee2c-452c-8976-73f7c87ee650")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("40879fb3-7d3a-458a-a8a8-b15ffbf0c85e")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("85432ef1-fbac-4477-a93a-d05754f13bf3")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    @objid ("fe2348ff-76a9-41bc-ba65-5a7cb6fc28be")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    @objid ("a56e2f8c-6fc8-4af6-bfaf-fe887d7afb66")
    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED, this.element);
    }

    @objid ("88c3d631-250d-49f7-8dbb-3efc15b40f38")
    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED,value);
    }

    @objid ("44e1b05c-5721-45e8-8ca6-44baa20922bf")
    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, this.element);
    }

    @objid ("f6f06445-011b-413b-9f4e-a262f8a7b6e9")
    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, value);
    }

    @objid ("507aae13-45bd-420b-af8c-e5c821af080c")
    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, this.element);
    }

    @objid ("7308f99d-e133-4514-955f-3840ed936128")
    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, value);
    }

    @objid ("837fe1c6-338b-45ed-8740-f1bdb1e08692")
    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, this.element);
    }

    @objid ("0e0f2c23-d2f8-4c12-b1c7-00c45f934bc4")
    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, value);
    }

    @objid ("a907ffbf-ceb7-439e-b163-a9d33bcd38ac")
    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, this.element);
    }

    @objid ("8ec5c260-07b5-4ca4-93f8-e7c6a08b0234")
    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, value);
    }

    @objid ("5939c5e4-f5c8-4f88-9fc2-e08064e611c0")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, this.element);
    }

    @objid ("a1701eea-32ee-458a-9742-ce26bd8e821b")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, value);
    }

    @objid ("da4d0e58-43b5-4456-98d3-a8263e3233f6")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, this.element);
    }

    @objid ("415d5557-6da3-4fbb-b5c3-0a700e8b93c7")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, value);
    }

    @objid ("1d6ad7a8-ba0e-4625-b4c3-9fde170e5efd")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
