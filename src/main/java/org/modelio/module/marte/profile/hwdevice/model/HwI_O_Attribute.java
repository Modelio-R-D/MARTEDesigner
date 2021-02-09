package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwI_O_Attribute extends HwDevice_Attribute {
    public HwI_O_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Attribute"));
    }

    public HwI_O_Attribute(Attribute element) {
        super(element);
    }

}
