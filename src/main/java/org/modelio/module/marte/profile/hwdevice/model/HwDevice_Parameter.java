package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_Parameter extends DeviceResource_Parameter {
    public HwDevice_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Parameter"));
    }

    public HwDevice_Parameter(Parameter element) {
        super(element);
    }

}
