package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("816f28f8-ae9a-4f6e-9510-2970d745f706")
public class ConcurrencyResource_Lifeline extends Resource_Lifeline {
    @objid ("035bf71a-ccfa-4dc7-b217-4a363d697480")
    public ConcurrencyResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Lifeline"));
    }

    @objid ("69490af5-f87d-48a8-8fb0-e14cddca4b4f")
    public ConcurrencyResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
