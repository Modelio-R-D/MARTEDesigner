package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_Attribute extends HwComputingResource_Attribute {
    public HwASIC_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Attribute"));
    }

    public HwASIC_Attribute(Attribute element) {
        super(element);
    }

}
