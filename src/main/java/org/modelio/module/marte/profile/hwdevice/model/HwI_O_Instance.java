package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwI_O_Instance extends HwDevice_Instance {
    public HwI_O_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Instance"));
    }

    public HwI_O_Instance(Instance element) {
        super(element);
    }

}
