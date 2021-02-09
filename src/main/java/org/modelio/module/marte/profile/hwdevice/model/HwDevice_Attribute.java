package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_Attribute extends DeviceResource_Attribute {
    public HwDevice_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Attribute"));
    }

    public HwDevice_Attribute(Attribute element) {
        super(element);
    }

}
