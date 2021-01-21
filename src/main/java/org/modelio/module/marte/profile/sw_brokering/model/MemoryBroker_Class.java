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

@objid ("f1594144-26ed-4246-a820-d8a21c4518be")
public class MemoryBroker_Class {
    @objid ("bdc36c89-be7d-4b29-b265-ecaa44ab23a2")
    protected Class element;

    @objid ("1255e943-bd88-4842-b7a1-e415c37fd7b8")
    public MemoryBroker_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER));
    }

    @objid ("1ebbcb1b-87d7-4d6b-952a-d56b09d13797")
    public MemoryBroker_Class(Class element) {
        this.element = element;
    }

    @objid ("33ed43c9-a7b4-488e-9d98-851873e16075")
    public Class getElement() {
        return this.element;
    }

    @objid ("27bfb16a-9833-472e-94ee-99f7a9e0f05e")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("0702f93a-6bf5-4557-aa7b-5c22f7e9283d")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("5c49676b-0500-4a8c-adb5-28631cd6c73e")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    @objid ("777d3514-2016-4651-8836-cc07eb9bb46a")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    @objid ("c25b4ef3-7b07-4a83-8a03-3580e100fc55")
    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, this.element);
    }

    @objid ("9511ef09-89b0-47e3-a746-996b0cc7ea08")
    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, value);
    }

    @objid ("35c25aff-91b2-4553-9bad-698e3be63b7e")
    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    @objid ("744164d3-47a9-4017-bf8a-c8c979592d8e")
    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, value);
    }

    @objid ("b98b9815-e114-4623-9953-d38ea7c94fa6")
    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    @objid ("3a1223a7-fe56-4717-ae08-60d444a9a3a0")
    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, value);
    }

    @objid ("90a98615-93a2-4d64-b613-c02958a7eb69")
    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, this.element);
    }

    @objid ("fc6ca68f-4931-4c17-a31b-2aa3df1caf94")
    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, value);
    }

    @objid ("da4944d0-2ea5-4c95-8a98-738f6944e246")
    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, this.element);
    }

    @objid ("232bd358-4650-41dc-b284-debe6653144e")
    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, value);
    }

    @objid ("ee91f7f1-a1ad-49e7-b360-b70393cd542d")
    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, this.element);
    }

    @objid ("d9fde536-c980-4f4c-8201-7c72380083cd")
    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, value);
    }

    @objid ("36c8f8fc-439e-4748-90ce-29cc2021ffd1")
    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, this.element);
    }

    @objid ("a974603b-4867-4aa8-bf02-47d0d621f5e0")
    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, value);
    }

    @objid ("93cc31db-53ef-4ccc-ac6b-ee373cb7637e")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
