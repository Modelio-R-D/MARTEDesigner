package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MemoryPartition_Instance {
    protected Instance element;

    public MemoryPartition_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYPARTITION_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("MemoryPartition_Instance"));
    }

    public MemoryPartition_Instance(Instance element) {
        this.element = element;
    }

    public Instance getElement() {
        return this.element;
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getconcurrentResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, this.element);
    }

    public void setconcurrentResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, value);
    }

    public String getmemorySpaces() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, this.element);
    }

    public void setmemorySpaces(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, value);
    }

    public String getfork() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, this.element);
    }

    public void setfork(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, value);
    }

    public String getexit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, this.element);
    }

    public void setexit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, value);
    }

}
