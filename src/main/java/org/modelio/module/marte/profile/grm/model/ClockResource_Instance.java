package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b4edd066-8b71-4ad5-b9d7-1c55d1b461a0")
public class ClockResource_Instance extends TimerResource_Instance {
    @objid ("bae0ddef-c367-4a76-91e8-138a3e56a9b0")
    public ClockResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ClockResource_Instance"));
    }

    @objid ("7e7f01f8-1b2d-49ee-8775-784bc36f5123")
    public ClockResource_Instance(final Instance element) {
        super(element);
    }

}
