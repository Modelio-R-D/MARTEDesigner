package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0fdc2223-cfc8-4274-bb9f-09de73c7aa8f")
public class SwTimerResource_Instance extends TimerResource_Instance {
    @objid ("5b2d2501-7c1f-47b2-9cbc-6c2b06cddcd4")
    public SwTimerResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWTIMERRESOURCE_INSTANCE);
        element.setName(MARTEResourceManager.getName("SwTimerResource_Instance"));
    }

    @objid ("10c777ae-899d-482e-a168-c4349b14ae05")
    public SwTimerResource_Instance(Instance element) {
        super(element);
    }

}
