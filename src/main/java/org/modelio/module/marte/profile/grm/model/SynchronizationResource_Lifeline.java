package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7a020a54-727a-4abf-b5fe-32d4b8ce7158")
public class SynchronizationResource_Lifeline extends Resource_Lifeline {
    @objid ("4a6f18d6-bf3c-4754-b46e-86ee4ca4d355")
    public SynchronizationResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_Lifeline"));
    }

    @objid ("ce1715b5-6811-4e57-a715-d7abe5da41d3")
    public SynchronizationResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
