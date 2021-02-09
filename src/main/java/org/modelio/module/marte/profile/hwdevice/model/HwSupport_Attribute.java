package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_Attribute extends HwDevice_Attribute {
    public HwSupport_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Attribute"));
    }

    public HwSupport_Attribute(Attribute element) {
        super(element);
    }

}
