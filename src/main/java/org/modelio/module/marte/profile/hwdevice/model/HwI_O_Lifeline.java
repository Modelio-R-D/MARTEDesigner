package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwI_O_Lifeline extends HwDevice_Lifeline {
    public HwI_O_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Lifeline"));
    }

    public HwI_O_Lifeline(Lifeline element) {
        super(element);
    }

}
