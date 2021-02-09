package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwArbiter_Parameter extends HwCommunicationResource_Parameter {
    public HwArbiter_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_Parameter"));
    }

    public HwArbiter_Parameter(Parameter element) {
        super(element);
    }

    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_PARAMETER_HWARBITER_PARAMETER_CONTROLLEDMEDIAS, this.element);
    }

    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_PARAMETER_HWARBITER_PARAMETER_CONTROLLEDMEDIAS, value);
    }

    public Parameter getElement() {
        return this.element;
    }

}
