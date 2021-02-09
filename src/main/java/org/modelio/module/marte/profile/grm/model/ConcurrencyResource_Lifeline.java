package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ConcurrencyResource_Lifeline extends Resource_Lifeline {
    public ConcurrencyResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Lifeline"));
    }

    public ConcurrencyResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
