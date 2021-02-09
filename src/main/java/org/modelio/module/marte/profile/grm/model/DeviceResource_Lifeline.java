package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DeviceResource_Lifeline extends ProcessingResource_Lifeline {
    public DeviceResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Lifeline"));
    }

    public DeviceResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
