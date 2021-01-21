package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d2a040e4-cb7c-462d-aac4-0897d8c87216")
public class HwSupport_Instance extends HwDevice_Instance {
    @objid ("36297884-78b1-4828-a48b-b3626b6dd8c6")
    public HwSupport_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Instance"));
    }

    @objid ("5e9f6bce-1052-437a-84aa-f0776ba7e90e")
    public HwSupport_Instance(Instance element) {
        super(element);
    }

}
