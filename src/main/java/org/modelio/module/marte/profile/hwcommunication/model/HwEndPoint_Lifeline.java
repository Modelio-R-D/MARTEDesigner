package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationEndPoint_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwEndPoint_Lifeline extends CommunicationEndPoint_Lifeline {
    public HwEndPoint_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWENDPOINT_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwEndPoint_Lifeline"));
    }

    public HwEndPoint_Lifeline(Lifeline element) {
        super(element);
    }

    public String getconnectedTo() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWENDPOINT_LIFELINE_HWENDPOINT_LIFELINE_CONNECTEDTO, this.element);
    }

    public void setconnectedTo(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWENDPOINT_LIFELINE_HWENDPOINT_LIFELINE_CONNECTEDTO, value);
    }

}
