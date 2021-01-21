package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b288c8f4-4455-4609-ba5c-867f45f8c271")
public class GaCommChannel_Attribute extends SchedulableResource_Attribute {
    @objid ("b12cab9b-7b83-4865-be66-b01d8ec2e8c1")
    public GaCommChannel_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_Attribute"));
    }

    @objid ("98c73a63-de75-4db5-81bc-8479a687788e")
    public GaCommChannel_Attribute(Attribute element) {
        super(element);
    }

    @objid ("ad07a951-451a-4a83-aab7-db55747bc4dc")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, this.element);
    }

    @objid ("e322789c-26fc-42f1-a17b-df0661b20219")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE, value);
    }

    @objid ("0b23e349-7b3f-4639-9f84-033761e4d3ea")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, this.element);
    }

    @objid ("dde04bf0-ba20-4ca1-9d2b-1cce859db5f3")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_ATTRIBUTE_GACOMMCHANNEL_ATTRIBUTE_UTILIZATION, value);
    }

}
