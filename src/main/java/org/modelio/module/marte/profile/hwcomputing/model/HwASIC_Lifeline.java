package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_Lifeline extends HwComputingResource_Lifeline {
    public HwASIC_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Lifeline"));
    }

    public HwASIC_Lifeline(Lifeline element) {
        super(element);
    }

}
