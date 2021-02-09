package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_Lifeline extends HwDevice_Lifeline {
    public HwSupport_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Lifeline"));
    }

    public HwSupport_Lifeline(Lifeline element) {
        super(element);
    }

}
