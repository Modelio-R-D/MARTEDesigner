package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cc370b63-c325-41ca-b4dc-d1c185fed81d")
public class SwSynchronizationResource_BindableInstance extends SynchronizationResource_BindableInstance {
    @objid ("3c3dde12-e897-48ee-a1e1-de08f3fdcbc6")
    public SwSynchronizationResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwSynchronizationResource_BindableInstance"));
    }

    @objid ("468d9715-84fb-435d-b2eb-1e59af4d6b2f")
    public SwSynchronizationResource_BindableInstance(BindableInstance element) {
        super(element);
    }

}
