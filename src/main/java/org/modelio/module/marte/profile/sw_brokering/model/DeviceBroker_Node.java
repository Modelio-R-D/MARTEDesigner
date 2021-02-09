package org.modelio.module.marte.profile.sw_brokering.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DeviceBroker_Node {
    protected Node element;

    public DeviceBroker_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER));
    }

    public DeviceBroker_Node(Node element) {
        this.element = element;
    }

    public Node getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED, this.element);
    }

    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED,value);
    }

    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, this.element);
    }

    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, value);
    }

    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, this.element);
    }

    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, value);
    }

    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, this.element);
    }

    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, value);
    }

    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, this.element);
    }

    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, value);
    }

    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, this.element);
    }

    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, value);
    }

    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, this.element);
    }

    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, value);
    }

    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
