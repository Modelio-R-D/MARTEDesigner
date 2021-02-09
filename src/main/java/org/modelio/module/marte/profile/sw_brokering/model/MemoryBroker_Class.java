package org.modelio.module.marte.profile.sw_brokering.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MemoryBroker_Class {
    protected Class element;

    public MemoryBroker_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER));
    }

    public MemoryBroker_Class(Class element) {
        this.element = element;
    }

    public Class getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, this.element);
    }

    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, value);
    }

    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, value);
    }

    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, value);
    }

    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, this.element);
    }

    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, value);
    }

    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, this.element);
    }

    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, value);
    }

    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, this.element);
    }

    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, value);
    }

    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, this.element);
    }

    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, value);
    }

    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
