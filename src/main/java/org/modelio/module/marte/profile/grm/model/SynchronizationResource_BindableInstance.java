package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("04d7c274-7a4d-4dfe-93a0-5b08abfd7753")
public class SynchronizationResource_BindableInstance extends SchedulableResource_BindableInstance {
    @objid ("517c8991-2072-4c99-a33a-4eb259de4d03")
    public SynchronizationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_BindableInstance"));
    }

    @objid ("9d0a9bf1-107c-4547-8f49-9c316fc8edc1")
    public SynchronizationResource_BindableInstance(final BindableInstance element) {
        super(element);
    }

}
