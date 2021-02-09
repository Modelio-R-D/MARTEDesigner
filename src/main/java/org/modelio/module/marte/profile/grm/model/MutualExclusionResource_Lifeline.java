package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MutualExclusionResource_Lifeline extends Resource_Lifeline {
    public MutualExclusionResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Lifeline"));
    }

    public MutualExclusionResource_Lifeline(final Lifeline element) {
        super(element);
    }

    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND, this.element);
    }

    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_PROTECTKIND, value);
    }

    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING, this.element);
    }

    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_CEILING, value);
    }

    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL, this.element);
    }

    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_OTHERPROTECTPROTOCOL, value);
    }

    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER, this.element);
    }

    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LIFELINE_MUTUALEXCLUSIONRESOURCE_LIFELINE_SCHEDULER, value);
    }

}
