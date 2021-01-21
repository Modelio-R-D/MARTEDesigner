package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("984b9d01-5248-419f-8a72-dfda2d7abf13")
public class TimerResource_Lifeline extends TimingResource_Lifeline {
    @objid ("a81c1194-5bae-471b-ae34-a7b4b827e503")
    public TimerResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Lifeline"));
    }

    @objid ("365db0ca-55e4-4b6b-81a8-27e2a26c22b6")
    public TimerResource_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("a6983bca-1ea6-43d3-9608-56f4cc795250")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION, this.element);
    }

    @objid ("30f36079-5c4a-4243-946b-e015028aa138")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION, value);
    }

    @objid ("7d1483bc-6000-4319-b5ca-332dd270c964")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_ISPERIODIC, this.element);
    }

    @objid ("9107f65d-aca0-4b40-b792-8c5cf68e2d96")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_ISPERIODIC,value);
    }

}
