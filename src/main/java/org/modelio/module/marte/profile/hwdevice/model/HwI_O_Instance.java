package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7c176c42-c9bc-44e8-ae85-78029fb04796")
public class HwI_O_Instance extends HwDevice_Instance {
    @objid ("274e3b2e-2c53-484f-a12a-62d8ba6dc78c")
    public HwI_O_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Instance"));
    }

    @objid ("3229ed23-bc42-4871-aadb-9acc2cea42dc")
    public HwI_O_Instance(Instance element) {
        super(element);
    }

}
