package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f3713709-80e6-4a9e-bd39-7bbddcf5d3e1")
public class MemoryPartition_Node {
    @objid ("03d22339-01bd-4451-8704-7301fbba1c21")
    protected Node element;

    @objid ("00d13a7d-f966-4d5d-b2d0-039312809907")
    public MemoryPartition_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MEMORYPARTITION_NAMESPACE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.MEMORYPARTITION_NAMESPACE));
    }

    @objid ("6172eb02-d1f9-4fc9-8143-d8f9f04c4d85")
    public MemoryPartition_Node(Node element) {
        this.element = element;
    }

    @objid ("1d09b27a-e443-4dea-9c67-e0706749e32d")
    public Node getElement() {
        return this.element;
    }

    @objid ("5715f5c7-348f-4e5f-acd1-867c767bdeb8")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("68fe84b3-5090-4be0-8e4f-bd829d5e93c0")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("fb245ca2-6995-4ad9-b87c-958acbd77551")
    public String getconcurrentResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES, this.element);
    }

    @objid ("f37964bc-e45e-4e96-8e53-3dffa112f86a")
    public void setconcurrentResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES, value);
    }

    @objid ("6c6a6224-0f97-4209-8bc1-e0dd310801df")
    public String getmemorySpaces() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_MEMORYSPACES, this.element);
    }

    @objid ("3fbd939f-e571-4e65-8c6d-530be88db15b")
    public void setmemorySpaces(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_MEMORYSPACES, value);
    }

    @objid ("9e9c0fb3-7a8b-4b5f-b511-07429e582d2f")
    public String getfork() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_FORK, this.element);
    }

    @objid ("7b47ba3f-72a2-470f-a9ce-c59e86c47e79")
    public void setfork(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_FORK, value);
    }

    @objid ("6068d057-b7b4-4682-a561-c303117b9d7e")
    public String getexit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_EXIT, this.element);
    }

    @objid ("7af8f45f-c539-41e6-9917-ebdb63075c57")
    public void setexit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MEMORYPARTITION_NAMESPACE_MEMORYPARTITION_NAMESPACE_EXIT, value);
    }

}
