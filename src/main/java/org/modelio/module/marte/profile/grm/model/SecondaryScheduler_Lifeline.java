package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2e92f83a-a2f3-4b71-8f8e-9b932149303b")
public class SecondaryScheduler_Lifeline extends Scheduler_Lifeline {
    @objid ("3928766a-302c-46d4-9bcb-ce89f94ef96a")
    public SecondaryScheduler_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Lifeline"));
        this.isisPreemptible(true);
    }

    @objid ("a0b05d03-2992-44c7-ba13-94aa05f1b711")
    public SecondaryScheduler_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("ff4b6a7d-d8fc-42c7-83f9-2b418e1866b2")
    public String getSecondaryScheduler_Lifeline_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_LIFELINE_SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("a614ccd1-96d8-4b2a-aebd-7d6a6e045d43")
    public void setSecondaryScheduler_Lifeline_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_LIFELINE_SECONDARYSCHEDULER_LIFELINE_VIRTUALPROCESSINGUNITS, value);
    }

}
