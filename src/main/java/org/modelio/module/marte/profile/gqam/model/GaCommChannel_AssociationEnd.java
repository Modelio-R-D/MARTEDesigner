package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommChannel_AssociationEnd extends SchedulableResource_AssociationEnd {
    public GaCommChannel_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_AssociationEnd"));
    }

    public GaCommChannel_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, this.element);
    }

    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_PACKETSIZE, value);
    }

    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, this.element);
    }

    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ASSOCIATIONEND_GACOMMCHANNEL_ASSOCIATIONEND_UTILIZATION, value);
    }

}
