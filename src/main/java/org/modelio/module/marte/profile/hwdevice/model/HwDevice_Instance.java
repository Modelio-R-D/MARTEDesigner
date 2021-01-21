package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("348136e2-7bd1-4512-8b30-b8f588b1bcd8")
public class HwDevice_Instance extends DeviceResource_Instance {
    @objid ("759a348d-4f4a-48d8-a09d-0358445b1870")
    public HwDevice_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Instance"));
    }

    @objid ("28f27f66-5041-4916-8e7c-238e85af36fc")
    public HwDevice_Instance(Instance element) {
        super(element);
    }

}
