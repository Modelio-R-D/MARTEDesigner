package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_BindableInstance extends HwDevice_BindableInstance {
    public HwSupport_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_BindableInstance"));
    }

    public HwSupport_BindableInstance(BindableInstance element) {
        super(element);
    }

}
