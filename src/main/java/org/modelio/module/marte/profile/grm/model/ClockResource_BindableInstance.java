package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClockResource_BindableInstance extends TimerResource_BindableInstance {
    public ClockResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_BindableInstance"));
    }

    public ClockResource_BindableInstance(final BindableInstance element) {
        super(element);
    }

}
