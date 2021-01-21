package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b3fa7a1f-fba9-4168-9810-4ffd80082d0e")
public class SynchronizationResource_Instance extends SchedulableResource_Instance {
    @objid ("c092de09-a7d0-4c3c-997b-63bffd4a314a")
    public SynchronizationResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Instance"));
    }

    @objid ("b6726831-3056-4d83-aa02-f0777bf71e62")
    public SynchronizationResource_Instance(final Instance element) {
        super(element);
    }

}
