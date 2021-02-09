package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBus_Parameter extends HwMedia_Parameter {
    public HwBus_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwBus_Parameter"));
    }

    public HwBus_Parameter(Parameter element) {
        super(element);
    }

    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, this.element);
    }

    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ADRESSWIDTH, value);
    }

    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, this.element);
    }

    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_WORDWIDTH, value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSYNCHRONOUS,value);
    }

    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL, this.element);
    }

    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_PARAMETER_HWBUS_PARAMETER_ISSERIAL,value);
    }

    public Parameter getElement() {
        return this.element;
    }

}
