package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1d97de94-8da7-4861-b26f-5296b99fd848")
public class SwSynchronizationResource_Instance extends SynchronizationResource_Instance {
    @objid ("e3050c1d-5170-4be5-9a0c-e65f9b7f4bac")
    public SwSynchronizationResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwSynchronizationResource_Instance"));
    }

    @objid ("2cd4d814-bdf7-4193-88b6-b011085337f8")
    public SwSynchronizationResource_Instance(Instance element) {
        super(element);
    }

    @objid ("863b5ae5-0c62-432e-beb9-e3900ff09cbb")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
