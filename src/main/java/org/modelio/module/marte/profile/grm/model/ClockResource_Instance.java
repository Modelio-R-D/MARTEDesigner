package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClockResource_Instance extends TimerResource_Instance {
    public ClockResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_Instance"));
    }

    public ClockResource_Instance(final Instance element) {
        super(element);
    }

}
