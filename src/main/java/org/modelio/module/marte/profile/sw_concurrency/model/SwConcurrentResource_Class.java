package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.sw_resourcecore.model.SwResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8948a474-fd1b-4db1-a43a-e2a3f469e9b8")
public class SwConcurrentResource_Class extends SwResource_Class {
    @objid ("261a85fb-de60-4df9-8702-be97e5079351")
    public SwConcurrentResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());        
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWCONCURRENTRESOURCE_CLASSIFIER));
    }

    @objid ("94de0d21-53b6-4e44-8fce-29ff4e8cd01d")
    public SwConcurrentResource_Class(Class element) {
        super(element);
        this.element = element;
    }

    @objid ("3c5c0f26-ae0b-47f8-9f88-6cb4475e2cdd")
    public Class getElement() {
        return this.element;
    }

    @objid ("4393fe16-743d-4c97-9290-664746c82c9c")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("d986eee5-fe5c-49ea-928c-1a1b5c67c08c")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("31c1483b-7a78-4b76-8532-81df08dfd27e")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, this.element);
    }

    @objid ("ad91c168-426e-467f-8cfb-3ae7fa8e78d1")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TYPE, value);
    }

    @objid ("35a64955-8fbd-49b9-84b7-8c963998babd")
    public String getactivationCapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, this.element);
    }

    @objid ("7e96dfa2-0349-4a2d-af3b-b51749653d22")
    public void setactivationCapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATIONCAPACITY, value);
    }

    @objid ("0152d37c-4091-452d-a365-f8e15912e871")
    public String getentryPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, this.element);
    }

    @objid ("42520984-f36a-48d7-9241-089c60d399e0")
    public void setentryPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENTRYPOINTS, value);
    }

    @objid ("5cf4ce2f-d0ea-422d-90db-ea0de0cb9d49")
    public String getadressSpace() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, this.element);
    }

    @objid ("2fb34996-02da-4869-8347-5e895e75dd6b")
    public void setadressSpace(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ADRESSSPACE, value);
    }

    @objid ("6c0516a9-3f43-462e-8a87-b5795c26602e")
    public List<Element> getperiodElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_PERIODELEMENTS_SWCONCURRENTRESOURCE);
    }

    @objid ("5ea0e1fc-c2c7-4349-80e3-a9b0bcbad997")
    public void setperiodElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PERIODELEMENTS, value);
    }

    @objid ("ca889ab7-724f-4788-b04f-f5365ec7e318")
    public String getpriorityElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, this.element);
    }

    @objid ("34c84279-d6b6-433b-8123-f8e63787bb22")
    public void setpriorityElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_PRIORITYELEMENTS, value);
    }

    @objid ("a8acac0f-69c3-45d7-a4ff-e4f3a20a2353")
    public String getstackSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, this.element);
    }

    @objid ("104b1de9-4610-48f0-9a94-d4f102956975")
    public void setstackSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_STACKSIZEELEMENTS, value);
    }

    @objid ("94bbeaee-d416-44a9-86bc-56ca1aceeee5")
    public String getactivateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, this.element);
    }

    @objid ("93bac8e2-7792-4b40-9689-478745c3cf0d")
    public void setactivateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ACTIVATESERVICES, value);
    }

    @objid ("4377e82e-03c6-4470-b50e-dd33c16eb548")
    public String getenableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("a7e63bc1-8d89-4088-8916-e385671601b7")
    public void setenableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_ENABLECONCURRENCYSERVICES, value);
    }

    @objid ("70808a19-0d77-4016-9cba-6dd767c5fc3f")
    public String getresumeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, this.element);
    }

    @objid ("03b65279-4524-4fc7-ad92-ca5ab14f776a")
    public void setresumeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_RESUMESERVICES, value);
    }

    @objid ("239c7404-2f54-4c7c-809d-a53384a1a3a5")
    public String getsuspendServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, this.element);
    }

    @objid ("5c1d4151-0a80-43d5-a8fc-acb30701e4a2")
    public void setsuspendServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SUSPENDSERVICES, value);
    }

    @objid ("1ef665b4-b8b1-44a3-9005-1728188b3871")
    public String getterminateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, this.element);
    }

    @objid ("9d352af7-8475-47f4-b8d9-d0c5fc1c4e0f")
    public void setterminateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_TERMINATESERVICES, value);
    }

    @objid ("f16a6c5d-2d37-488f-b74b-99bb692bc160")
    public String getdisableConcurrencyServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, this.element);
    }

    @objid ("ae4085e2-8c68-44fb-aa6a-30f68ccdcb08")
    public void setdisableConcurrencyServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_DISABLECONCURRENCYSERVICES, value);
    }

    @objid ("47c0a3c4-e65d-4b0d-b126-260a4c0aa14f")
    public String getshareDataResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, this.element);
    }

    @objid ("6cccc1e6-37f8-4370-8ffd-7bb70cc1e1a7")
    public void setshareDataResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_SHAREDATARESOURCES, value);
    }

    @objid ("ff4cb50d-0b3c-4bec-aadb-15420c59ee3c")
    public String getmessageResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, this.element);
    }

    @objid ("d837eb0d-d34a-4e8e-a65c-6d90fca17aa2")
    public void setmessageResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MESSAGERESOURCES, value);
    }

    @objid ("f6a321c9-0a0d-4ff3-90e6-536edf7c5264")
    public String getmutualExclusionResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, this.element);
    }

    @objid ("4a2d0d92-4fc5-48b3-91dc-9805d02c6991")
    public void setmutualExclusionResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_MUTUALEXCLUSIONRESOURCES, value);
    }

    @objid ("5d40a066-f773-4d3f-a911-b752bbf4b525")
    public String getnotificationResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, this.element);
    }

    @objid ("a0727e0a-b173-4ac1-afd8-595a8f39d21c")
    public void setnotificationResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_NOTIFICATIONRESOURCES, value);
    }

    @objid ("0036277e-36d7-4959-ba28-1f06d6203455")
    public String getheapSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, this.element);
    }

    @objid ("1256aa5b-e2b6-4d11-8251-38709c1e003a")
    public void setheapSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWCONCURRENTRESOURCE_CLASSIFIER_SWCONCURRENTRESOURCE_CLASSIFIER_HEAPSIZEELEMENTS, value);
    }

}
