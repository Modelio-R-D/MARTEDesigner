package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("32e2879a-8bfa-459a-bdac-29427dbcdd1a")
public class SwConcurrentResource_BindableInstance extends SwResource_BindableInstance {
    @objid ("019a8daf-b23f-46b1-8815-ef86b2ca03ce")
    public SwConcurrentResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwConcurrentResource_BindableInstance"));
    }

    @objid ("e65fd638-89f7-4a6a-a136-7e280a798db6")
    public SwConcurrentResource_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("13c37fc1-f0a9-48af-ab84-f1757f0b4991")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, this.element);
    }

    @objid ("8863bbec-8206-41bb-a2df-a2e3c42869f1")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TYPE, value);
    }

    @objid ("7e09a294-7010-48b2-b598-bd356c38eef3")
    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, this.element);
    }

    @objid ("e25c76d3-4a9f-45b6-9dfb-f54d2fc13cd5")
    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATIONCAPACITY, value);
    }

    @objid ("7245bd64-8d0d-4dad-851f-4e67d47243a3")
    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, this.element);
    }

    @objid ("27a99018-ce0e-4243-b16c-52f787a8ca91")
    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENTRYPOINTS, value);
    }

    @objid ("89ec6321-db75-4749-86ab-8ef3bbc6f807")
    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE , this.element);
    }

    @objid ("3ec9c3de-3ea8-48b1-acbb-35b8079773fe")
    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ADRESSSPACE, value);
    }

    @objid ("c3121428-72e8-4c93-b0c3-1d9b4a4c2a9a")
    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    @objid ("468aebd1-ec26-4558-b17e-62d68b26a389")
    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PERIODELEMENTS, value);
    }

    @objid ("74342df1-870f-412c-a467-4ba9cae3d2ae")
    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, this.element);
    }

    @objid ("3310e26b-c1a7-41db-9a6e-547b9e880351")
    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_PRIORITYELEMENTS, value);
    }

    @objid ("a5e81a8a-c2cd-4a86-b170-f2ad48830bec")
    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, this.element);
    }

    @objid ("f2c80f9f-986e-408e-b770-11ae59be61b2")
    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_STACKSIZEELEMENTS, value);
    }

    @objid ("9b44eb4f-1b3e-4955-9bcd-7a3b87212518")
    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, this.element);
    }

    @objid ("3ac030be-26bf-4f9a-a73a-773b3c6e3407")
    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ACTIVATESERVICES, value);
    }

    @objid ("8a6b584f-6930-4bb0-ae38-bac352eac30b")
    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("34e10bc3-5a31-4251-811d-c8131d2eaf98")
    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_ENABLECONCURRENCYSERVICES, value);
    }

    @objid ("879a1540-022d-4d7c-80c4-ea19e9b4a260")
    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, this.element);
    }

    @objid ("de666bb2-f638-4db1-9a3e-17a377b9b038")
    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_RESUMESERVICES, value);
    }

    @objid ("e97d318d-636e-4549-a5d6-8b51e5c2d71e")
    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, this.element);
    }

    @objid ("00e7113c-5627-4710-a528-3b2f5ba80fd5")
    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SUSPENDSERVICES, value);
    }

    @objid ("4f2dc1d0-f13d-4c02-a758-0a2168fc863e")
    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, this.element);
    }

    @objid ("d1449221-cb35-4fb5-9ddf-9092e23b1b71")
    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_TERMINATESERVICES, value);
    }

    @objid ("23fce057-0fa3-47b0-8d78-0ad6cf770916")
    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("0671883f-e82d-44df-a8e8-fb6757341279")
    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_DISABLECONCURRENCYSERVICES, value);
    }

    @objid ("4182948e-8b24-4c8b-894e-a53d9e487811")
    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, this.element);
    }

    @objid ("c387fffd-10c1-41d3-97a5-69649f5b13b0")
    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_SHAREDATARESOURCES, value);
    }

    @objid ("78a21ef7-0b5f-4d48-b84a-9a415cf9a6f5")
    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, this.element);
    }

    @objid ("5358b83c-aba2-4bf0-bf3b-910820ac454a")
    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MESSAGERESOURCES, value);
    }

    @objid ("958d1041-b128-4748-8bee-1bca86ba010e")
    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    @objid ("f4dfe6a6-131f-4800-8243-55fc6bdc0ef8")
    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_MUTUALEXCLUSIONRESOURCES, value);
    }

    @objid ("d2d32b57-cca0-40fc-b7af-25c0a6177348")
    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, this.element);
    }

    @objid ("f9d95244-96b4-4d35-8652-8e9c60ba1d64")
    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_NOTIFICATIONRESOURCES, value);
    }

    @objid ("9abc52e4-d279-4747-b141-c35292bd03c3")
    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, this.element);
    }

    @objid ("122f3680-4f59-4fdf-810c-59d9b7ded1aa")
    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_INSTANCE_SWCONCURRENTRESOURCE_INSTANCE_HEAPSIZEELEMENTS, value);
    }

}
