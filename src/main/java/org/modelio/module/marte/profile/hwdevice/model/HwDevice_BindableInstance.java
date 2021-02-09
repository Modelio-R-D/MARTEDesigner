package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_BindableInstance extends DeviceResource_BindableInstance {
    public HwDevice_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_BindableInstance"));
    }

    public HwDevice_BindableInstance(BindableInstance element) {
        super(element);
    }

}
