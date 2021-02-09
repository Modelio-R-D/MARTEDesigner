package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommChannel_Attribute extends SchedulableResource_Attribute {
    public GaCommChannel_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_Attribute"));
    }

    public GaCommChannel_Attribute(Attribute element) {
        super(element);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, this.element);
    }

    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, value);
    }

    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, this.element);
    }

    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, value);
    }

}
