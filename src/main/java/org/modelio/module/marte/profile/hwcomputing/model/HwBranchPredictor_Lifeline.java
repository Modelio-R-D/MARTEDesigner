package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("093ab27c-8325-45cf-85c8-a599bf6137af")
public class HwBranchPredictor_Lifeline extends Resource_Lifeline {
    @objid ("9a8af819-f6e4-4cf1-af9a-b311c79de06f")
    public HwBranchPredictor_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Lifeline"));
    }

    @objid ("90576f30-090c-4f7f-a36c-74e49a30042a")
    public HwBranchPredictor_Lifeline(Lifeline element) {
        super(element);
    }

}
