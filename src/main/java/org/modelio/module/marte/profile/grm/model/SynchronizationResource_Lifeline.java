package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SynchronizationResource_Lifeline extends Resource_Lifeline {
    public SynchronizationResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Lifeline"));
    }

    public SynchronizationResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
