package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.MemoryPartitionClassifier;
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
        ModelUtils.setStereotype(this.element, MemoryPartitionClassifier.STEREOTYPE_NAME);
        this.element.setName(MARTEResourceManager.getName(MemoryPartitionClassifier.STEREOTYPE_NAME));
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

}
