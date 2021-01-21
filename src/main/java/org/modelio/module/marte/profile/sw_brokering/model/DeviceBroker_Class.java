package org.modelio.module.marte.profile.sw_brokering.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a1236052-8101-43b0-9540-de2743bc067f")
public class DeviceBroker_Class {
    @objid ("e48938be-9c85-4ba3-9af9-6244918a15f8")
    protected Class element;

    @objid ("7f1f4fed-be4f-482d-b986-1a73e7458610")
    public DeviceBroker_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.DEVICEBROKER_CLASSIFIER));
    }

    @objid ("e6dfae99-412b-4d18-b7dc-93daf9ef0791")
    public DeviceBroker_Class(Class element) {
        this.element = element;
    }

    @objid ("534fbc29-2ea0-4a31-975a-41a9cea0da10")
    public Class getElement() {
        return this.element;
    }

    @objid ("45d3c9c0-07cd-45f0-bc77-c4f6ed691ac7")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("b93f13b3-93a5-4a29-8632-c30023c04680")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("cf317a14-fabe-46eb-94ed-535d9960f6fa")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    @objid ("b5fa0db0-6032-4cf2-a127-f704c9b5bc62")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    @objid ("3f79fe49-3c22-4c9d-a7fc-252fe6af1fa5")
    public boolean isisBuffered() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED, this.element);
    }

    @objid ("1dca5a02-bfca-4bc4-b2cb-8bcfc87d0250")
    public void isisBuffered(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_ISBUFFERED,value);
    }

    @objid ("9a8468b3-accb-406d-aed2-794f42b81733")
    public String getdevices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, this.element);
    }

    @objid ("49961061-2679-4b42-9555-a5fa81d14f80")
    public void setdevices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_DEVICES, value);
    }

    @objid ("ff501361-0981-4580-9c25-77bcec5f7013")
    public String getcloseServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, this.element);
    }

    @objid ("64d3a3e7-4c95-4fad-8461-30c73385895e")
    public void setcloseServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CLOSESERVICES, value);
    }

    @objid ("2beccf5e-feda-407d-8b7d-18138d26360b")
    public String getcontrolServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, this.element);
    }

    @objid ("6bfebf79-83d8-4e26-88da-fc20b5a410a0")
    public void setcontrolServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_CONTROLSERVICES, value);
    }

    @objid ("43660d6e-3304-4f3d-aa58-6d1653406819")
    public String getopenServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, this.element);
    }

    @objid ("3adad906-6643-4321-8331-ed78b7986f9e")
    public void setopenServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_OPENSERVICES, value);
    }

    @objid ("aa598581-8d80-4a0a-96d6-57fedcaeb699")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, this.element);
    }

    @objid ("e79c6aff-9821-49e4-b941-0464dabe9ffd")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_READSERVICES, value);
    }

    @objid ("69d2f588-866a-49e5-931f-0b4ffa85f82c")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, this.element);
    }

    @objid ("0f47debf-6b4e-4ff5-9ca1-a73a5b522ccb")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DEVICEBROKER_CLASSIFIER_DEVICEBROKER_CLASSIFIER_WRITESERVICES, value);
    }

    @objid ("36d8b761-2659-481c-a9de-604bf24a6b52")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
