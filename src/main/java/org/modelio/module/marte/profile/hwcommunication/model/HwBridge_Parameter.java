package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_Parameter extends HwMedia_Parameter {
    public HwBridge_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Parameter"));
    }

    public HwBridge_Parameter(Parameter element) {
        super(element);
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_PARAMETER_HWBRIDGE_PARAMETER_SIDES, value);
    }

    public Parameter getElement() {
        return this.element;
    }

}
