package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaCommChannel_BindableInstance extends SchedulableResource_BindableInstance {
    public GaCommChannel_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_BindableInstance"));
    }

    public GaCommChannel_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, this.element);
    }

    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, value);
    }

    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, this.element);
    }

    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, value);
    }

}
