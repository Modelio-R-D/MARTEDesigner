package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("22746f56-9224-402a-bcfd-074c2245e25e")
public class MemoryPartition_Class {
    @objid ("2f6e8f2a-93c5-455e-82a3-5afe5615fe76")
    protected Class element;

    @objid ("8ced1258-7b64-4e2f-b489-dc8b4f7ad4f5")
    public MemoryPartition_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYPARTITION_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MEMORYPARTITION_NAMESPACE));
    }

    @objid ("56d9b1c7-eb6c-411c-bfa8-2951eec49240")
    public MemoryPartition_Class(Class element) {
        this.element = element;
    }

    @objid ("72160e1f-ef01-4111-bd83-0d2c808368f7")
    public Class getElement() {
        return this.element;
    }

    @objid ("85625cdd-38e2-49f4-af99-1ccf8b0c199d")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("6b11d3a4-0b45-4de6-8cff-d8631b434829")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d2d39cde-36f5-46a4-b31d-3a3874de29d0")
    public String getconcurrentResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES, this.element);
    }

    @objid ("0e88d630-59ef-493b-ae39-22b9719f8a25")
    public void setconcurrentResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES, value);
    }

    @objid ("1b14e553-3013-449e-a669-80c4fa8b7174")
    public String getmemorySpaces() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_MEMORYSPACES, this.element);
    }

    @objid ("dacaf97e-1b53-4a46-b4a0-8e056503b4e8")
    public void setmemorySpaces(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_MEMORYSPACES, value);
    }

    @objid ("6bac32b9-3e99-4bc1-8f29-3307c74dd11f")
    public String getfork() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_FORK, this.element);
    }

    @objid ("474068cd-a3b2-4480-93f8-44e390619e8c")
    public void setfork(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_FORK, value);
    }

    @objid ("75847d37-45ad-4592-823a-8bde3f0f103c")
    public String getexit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_EXIT, this.element);
    }

    @objid ("a75cc393-dec9-4cd5-bea3-93e852d6fd67")
    public void setexit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_EXIT, value);
    }

}
