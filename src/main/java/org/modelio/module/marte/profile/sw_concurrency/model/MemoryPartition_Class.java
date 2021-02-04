package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier.MemoryPartitionClassifier;
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
        ModelUtils.setStereotype(this.element, MemoryPartitionClassifier.STEREOTYPE_NAME);
        this.element.setName(MARTEResourceManager.getName(MemoryPartitionClassifier.STEREOTYPE_NAME));
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

}
