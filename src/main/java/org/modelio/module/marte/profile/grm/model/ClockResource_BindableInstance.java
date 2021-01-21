package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("53ee1ce4-3f20-49e0-afe1-f12a79b1dfcf")
public class ClockResource_BindableInstance extends TimerResource_BindableInstance {
    @objid ("a44d8169-096e-46e3-a99b-0106816df718")
    public ClockResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_BindableInstance"));
    }

    @objid ("791ed7a4-103c-4070-b3d9-e631d5167935")
    public ClockResource_BindableInstance(final BindableInstance element) {
        super(element);
    }

}
