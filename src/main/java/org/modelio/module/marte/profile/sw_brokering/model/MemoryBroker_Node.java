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

@objid ("11a7c502-6e9c-492e-9eff-c34e1f7c589a")
public class MemoryBroker_Node {
    @objid ("d598839a-38d6-4a39-8014-7958c54cb9db")
    protected Node element;

    @objid ("3d2c6eea-c8f8-4b2b-a5bd-96eec441e4a9")
    public MemoryBroker_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MEMORYBROKER_CLASSIFIER));
    }

    @objid ("79a26431-f2e5-408e-869c-ae83487e9e28")
    public MemoryBroker_Node(Node element) {
        this.element = element;
    }

    @objid ("bdc7d521-a91e-47c5-8ea3-cbc82d775000")
    public Node getElement() {
        return this.element;
    }

    @objid ("4e742a12-0a17-4acc-a867-3d3c42deafbd")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("d7723e18-d4d5-4c3f-86f3-9566c8caffbf")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("33999731-30d1-48ab-8e1d-ed68e640cdd4")
    public String getaccessPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, this.element);
    }

    @objid ("ca17c2ab-76cc-4255-8ecd-24094027b6a5")
    public void setaccessPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_ACCESSPOLICY, value);
    }

    @objid ("8cdae5ea-b8af-4bdc-9577-e4e7d476ee7d")
    public String getmemories() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, this.element);
    }

    @objid ("1606cbe9-4490-44e5-9384-8bb09997010a")
    public void setmemories(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORIES, value);
    }

    @objid ("81bc66dc-8243-4f57-a0a6-10c949296c9a")
    public String getmemoryBlockAdressElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, this.element);
    }

    @objid ("a9f04276-40bf-464e-9a3e-723b3ac8fae3")
    public void setmemoryBlockAdressElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS, value);
    }

    @objid ("43c29254-c79c-4cc5-b2c5-2026d6d45bc6")
    public String getmemoryBlockSizeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, this.element);
    }

    @objid ("aac97c9c-ea6e-4558-bb30-4933509ff5ad")
    public void setmemoryBlockSizeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS, value);
    }

    @objid ("efbeb0d7-50a2-4d7e-bea2-650e77432939")
    public String getlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, this.element);
    }

    @objid ("a3124310-87a4-413d-b9c1-3d58be67f58d")
    public void setlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_LOCKSERVICES, value);
    }

    @objid ("906948e8-e966-4c26-9e1b-a5fe83c49e5d")
    public String getunlockServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, this.element);
    }

    @objid ("3f4d92b3-dab7-498a-a87b-107ba0124d21")
    public void setunlockServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES, value);
    }

    @objid ("aa2ba872-d7ba-4341-aafd-e572fce28883")
    public String getmapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, this.element);
    }

    @objid ("c2bddc48-6770-42ce-9a89-2fed07944ff5")
    public void setmapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_MAPSERVICES, value);
    }

    @objid ("91638089-556a-4bd0-9448-7ba6e4a530c9")
    public String getunMapServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, this.element);
    }

    @objid ("c7a0d4e6-7b40-45bb-acb9-c554ccc18bcb")
    public void setunMapServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYBROKER_CLASSIFIER_MEMORYBROKER_CLASSIFIER_UNMAPSERVICES, value);
    }

    @objid ("3f251714-c515-465a-88bc-1f57602527d7")
    public enum AccessPolicyKind {
        Read,
        Write,
        ReadWrite,
        Undef,
        Other;
    }

}
