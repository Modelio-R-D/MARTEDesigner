package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_Lifeline extends DeviceResource_Lifeline {
    public HwDevice_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Lifeline"));
    }

    public HwDevice_Lifeline(Lifeline element) {
        super(element);
    }

}
