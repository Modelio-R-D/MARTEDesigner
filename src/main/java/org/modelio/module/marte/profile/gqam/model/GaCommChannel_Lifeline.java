package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d99a9e7f-f4c6-4071-bca8-b5b1e4e23569")
public class GaCommChannel_Lifeline extends SchedulableResource_Lifeline {
    @objid ("c46e1e1a-eb83-4b5d-a854-c3a2e2c61921")
    public GaCommChannel_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_Lifeline"));
    }

    @objid ("2966fdf6-a58b-46f1-800c-ef4e72ca8b71")
    public GaCommChannel_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("8784c1c9-9bdb-42d4-9997-fc7dbd559260")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE, this.element);
    }

    @objid ("6a6b3aae-0718-42a2-aae5-62c20886228e")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_PACKETSIZE, value);
    }

    @objid ("a2211263-92bd-4bbd-bbc6-348261368c62")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION, this.element);
    }

    @objid ("813deb03-2628-43f0-95fa-d73cf86f9e52")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_LIFELINE_GACOMMCHANNEL_LIFELINE_UTILIZATION, value);
    }

}
