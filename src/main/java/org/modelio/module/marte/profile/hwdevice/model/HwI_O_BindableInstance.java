package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwI_O_BindableInstance extends HwDevice_BindableInstance {
    public HwI_O_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_BindableInstance"));
    }

    public HwI_O_BindableInstance(BindableInstance element) {
        super(element);
    }

}
