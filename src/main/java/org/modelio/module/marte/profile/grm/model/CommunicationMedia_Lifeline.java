package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_Lifeline extends ConcurrencyResource_Lifeline {
    public CommunicationMedia_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Lifeline"));
    }

    public CommunicationMedia_Lifeline(final Lifeline element) {
        super(element);
    }

    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, this.element);
    }

    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, value);
    }

    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, this.element);
    }

    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, this.element);
    }

    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, value);
    }

    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, this.element);
    }

    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, this.element);
    }

    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, value);
    }

}
