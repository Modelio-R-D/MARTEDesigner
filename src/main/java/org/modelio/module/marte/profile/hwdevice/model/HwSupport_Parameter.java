package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_Parameter extends HwDevice_Parameter {
    public HwSupport_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Parameter"));
    }

    public HwSupport_Parameter(Parameter element) {
        super(element);
    }

}
