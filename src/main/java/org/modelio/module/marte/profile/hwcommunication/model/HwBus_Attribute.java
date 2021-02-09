package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBus_Attribute extends HwMedia_Attribute {
    public HwBus_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBus_Attribute"));
    }

    public HwBus_Attribute(Attribute element) {
        super(element);
    }

    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, this.element);
    }

    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, value);
    }

    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, this.element);
    }

    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS,value);
    }

    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL, this.element);
    }

    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL,value);
    }

    public Attribute getElement() {
        return this.element;
    }

}
