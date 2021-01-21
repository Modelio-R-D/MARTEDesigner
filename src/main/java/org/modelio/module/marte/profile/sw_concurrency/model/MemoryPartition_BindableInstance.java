package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e84b5df5-8e7f-4531-8844-f2206ec7d11c")
public class MemoryPartition_BindableInstance {
    @objid ("eca1c661-854c-4c73-94c6-0eeb1ef6301f")
    protected BindableInstance element;

    @objid ("e917f9f7-5d54-42d4-b11a-150ba8422f9f")
    public MemoryPartition_BindableInstance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYPARTITION_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("MemoryPartition_BindableInstance"));
    }

    @objid ("4bc92ac0-7450-440a-8c3a-532330cc026c")
    public MemoryPartition_BindableInstance(BindableInstance element) {
        this.element = element;
    }

    @objid ("7e0e70a9-6dac-44a2-85a4-3fdaab42ad5b")
    public BindableInstance getElement() {
        return this.element;
    }

    @objid ("005e6f53-0ccc-4b2c-9275-cda34a08d8d5")
    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    @objid ("0d1e9c9c-006d-4383-93d0-0c63dd6629fb")
    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    @objid ("f6fd6f81-8ca8-4148-a0e5-8b4805a2b643")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("4c83fb63-caa9-4f0b-9554-c1f39595032b")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("0f26dc9b-c251-4a8a-af85-92c8a3237159")
    public String getconcurrentResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, this.element);
    }

    @objid ("a2aca4ef-976f-463c-9393-ce6d46ba0af6")
    public void setconcurrentResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_CONCURRENTRESOURCES, value);
    }

    @objid ("3e3c6e0b-c9fe-4766-90b2-a806be86e601")
    public String getmemorySpaces() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, this.element);
    }

    @objid ("5641e0aa-67c0-491c-a3e2-e96c529b93a3")
    public void setmemorySpaces(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_MEMORYSPACES, value);
    }

    @objid ("8859ca0b-1fda-4b69-a4b0-0a148b685615")
    public String getfork() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, this.element);
    }

    @objid ("27dd845a-899a-4a4e-9ffe-5959d2ef21df")
    public void setfork(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_FORK, value);
    }

    @objid ("1bade72c-b7cf-4ea4-92a4-976eff064e7b")
    public String getexit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, this.element);
    }

    @objid ("9f57e1d9-a695-43e9-9459-99097bcddf9e")
    public void setexit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_INSTANCE_MEMORYPARTITION_INSTANCE_EXIT, value);
    }

}
