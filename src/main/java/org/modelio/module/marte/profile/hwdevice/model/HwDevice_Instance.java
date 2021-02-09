package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_Instance extends DeviceResource_Instance {
    public HwDevice_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Instance"));
    }

    public HwDevice_Instance(Instance element) {
        super(element);
    }

}
