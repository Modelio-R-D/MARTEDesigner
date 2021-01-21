package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1440a59a-0412-4480-8c81-6cedb44e441e")
public class MemoryPartition_Instance {
    @objid ("c9dc2f67-dfd0-46f6-a95f-47055803d1b0")
    protected Instance element;

    @objid ("1f3c5740-1573-4095-a6a9-449449f009bc")
    public MemoryPartition_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYPARTITION_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("MemoryPartition_Instance"));
    }

    @objid ("fbb0cca6-cdeb-400d-b1d0-779601961a3d")
    public MemoryPartition_Instance(Instance element) {
        this.element = element;
    }

    @objid ("a6243e90-7f92-42c1-aca3-bbd3f643b907")
    public Instance getElement() {
        return this.element;
    }

    @objid ("8b7f6cd1-911d-419a-a989-3e35ecdfb6e5")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("a5241516-023c-4f3c-b275-5904623bd82f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b795b251-8876-47ec-9e7d-aa86f535e161")
    public String getconcurrentResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, this.element);
    }

    @objid ("038c41e8-968b-499e-882b-addedcdb40a1")
    public void setconcurrentResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, value);
    }

    @objid ("34794f00-6c76-4736-8863-6c7e26c4e1d6")
    public String getmemorySpaces() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, this.element);
    }

    @objid ("d8971742-89ce-49de-86e2-66c6ab377ca7")
    public void setmemorySpaces(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, value);
    }

    @objid ("39f7bfdc-45ac-45ff-b908-add773b3e7ae")
    public String getfork() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, this.element);
    }

    @objid ("275dcdfb-a365-4bb2-a4fc-0d94e7097331")
    public void setfork(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, value);
    }

    @objid ("8cfa05b8-e294-473b-82a5-d3b2422f0127")
    public String getexit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, this.element);
    }

    @objid ("32f0d9c2-cfe9-4552-9aba-cf1ab9136646")
    public void setexit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, value);
    }

}
