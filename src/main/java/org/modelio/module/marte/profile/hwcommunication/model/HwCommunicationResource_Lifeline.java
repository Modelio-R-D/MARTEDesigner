package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCommunicationResource_Lifeline {
    protected Lifeline element;

    public HwCommunicationResource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Lifeline"));
    }

    public HwCommunicationResource_Lifeline(Lifeline element) {
        this.element = element;
    }

    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public Lifeline getElement() {
        return this.element;
    }

}
