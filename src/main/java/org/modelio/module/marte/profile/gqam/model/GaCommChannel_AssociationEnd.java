package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c83ab7a2-e09b-4f56-b026-dfab342ab050")
public class GaCommChannel_AssociationEnd extends SchedulableResource_AssociationEnd {
    @objid ("859de148-dbe6-44ab-a0a2-5d735fe1a816")
    public GaCommChannel_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_AssociationEnd"));
    }

    @objid ("f3794b03-2adb-4686-8aae-de0a3ee339ba")
    public GaCommChannel_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("149811a7-089c-4189-bedf-79ff08b286e3")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, this.element);
    }

    @objid ("63ae27f0-a319-485e-95e3-006b4d6aa349")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, value);
    }

    @objid ("d8547fa7-568e-4d06-abb6-e72647017677")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, this.element);
    }

    @objid ("46c7b312-da49-4ce2-816e-d12581807889")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, value);
    }

}
