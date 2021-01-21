package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e83eb12c-6fd7-4894-a77e-392922397c79")
public class CommunicationMedia_Lifeline extends ConcurrencyResource_Lifeline {
    @objid ("9e54d0ed-8527-41fa-9577-379b2146e8fc")
    public CommunicationMedia_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMMUNICATIONMEDIA_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("CommunicationMedia_Lifeline"));
    }

    @objid ("26b76f03-bdf7-4f3e-a278-b86aa8116f81")
    public CommunicationMedia_Lifeline(final Lifeline element) {
        super(element);
    }

    @objid ("2998249d-4e59-4166-8284-0fe986245fd4")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, this.element);
    }

    @objid ("febc777e-8bfe-4dd3-8bf2-2462324e0c83")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_ELEMENTSIZE, value);
    }

    @objid ("511103c8-d5e3-410c-8ab1-4230e2d64e6b")
    public String gettransmMode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, this.element);
    }

    @objid ("3a176a3a-752e-4d2c-bf29-2199df64bbfc")
    public void settransmMode(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_TRANSMMODE, value);
    }

    @objid ("a85456c0-ae86-486e-b6af-883ffb3494d8")
    public String getblockT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, this.element);
    }

    @objid ("d33d6bc6-c01a-48bb-8b8c-15a12698fea2")
    public void setblockT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_BLOCKT, value);
    }

    @objid ("7266a7be-d82b-4df8-812a-5083e12834ba")
    public String getpacketT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, this.element);
    }

    @objid ("063ddc75-9745-4b73-a930-8df5ec1b8a95")
    public void setpacketT(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_PACKETT, value);
    }

    @objid ("62085297-422e-4bef-b2ff-568cc99963c0")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, this.element);
    }

    @objid ("cfb40ea4-9bcd-4e9a-88f2-02545269d2cb")
    public void setcapacity(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_LIFELINE_COMMUNICATIONMEDIA_LIFELINE_CAPACITY, value);
    }

}
