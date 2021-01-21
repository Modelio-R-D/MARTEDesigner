package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ddfabf79-492f-4499-85ef-18abfdd2fc69")
public class SwSynchronizationResource_Class extends SynchronizationResource_Class {
    @objid ("e197b827-97b0-4f05-bfec-e37976eb6dc1")
    public SwSynchronizationResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_CLASSIFIER));
    }

    @objid ("be1f43e8-8adf-43d2-9014-2c098d544f64")
    public SwSynchronizationResource_Class(Class element) {
        super(element);
    }

    @objid ("1e4a56b0-c4be-43ac-a12d-6ada0accb9b7")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
