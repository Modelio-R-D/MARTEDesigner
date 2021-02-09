package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_Attribute extends HwMedia_Attribute {
    public HwBridge_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Attribute"));
    }

    public HwBridge_Attribute(Attribute element) {
        super(element);
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ATTRIBUTE_HWBRIDGE_ATTRIBUTE_SIDES, value);
    }

    public Attribute getElement() {
        return this.element;
    }

}
