package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.MemoryPartitionClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MemoryPartition_Class {
    protected Class element;

    public MemoryPartition_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element, MemoryPartitionClassifier.STEREOTYPE_NAME);
        this.element.setName(MARTEResourceManager.getName(MemoryPartitionClassifier.STEREOTYPE_NAME));
    }

    public MemoryPartition_Class(Class element) {
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

}
