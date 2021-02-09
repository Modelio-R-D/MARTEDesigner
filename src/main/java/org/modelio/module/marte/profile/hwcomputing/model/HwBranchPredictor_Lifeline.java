package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBranchPredictor_Lifeline extends Resource_Lifeline {
    public HwBranchPredictor_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Lifeline"));
    }

    public HwBranchPredictor_Lifeline(Lifeline element) {
        super(element);
    }

}
