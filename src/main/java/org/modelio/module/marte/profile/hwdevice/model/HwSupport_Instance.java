package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_Instance extends HwDevice_Instance {
    public HwSupport_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Instance"));
    }

    public HwSupport_Instance(Instance element) {
        super(element);
    }

}
