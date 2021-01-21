package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9a1237af-a251-4edf-b960-7442f8360ace")
public class GaCommChannel_Instance extends SchedulableResource_Instance {
    @objid ("3c22fb7f-3668-4217-9e7a-fd8ce0a69f6f")
    public GaCommChannel_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_Instance"));
    }

    @objid ("987b0da5-5616-4a91-aff3-6fd09039b31f")
    public GaCommChannel_Instance(Instance element) {
        super(element);
    }

    @objid ("33fdba4c-1292-48af-8f3a-0d7f0185a3c4")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, this.element);
    }

    @objid ("b8c8d9c3-bb7f-49a6-91e5-c452104e49e1")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, value);
    }

    @objid ("2452b6bc-489a-406e-85d7-e4bacffe19ec")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("4dce8912-40f9-434c-a603-8d9e7578b7a0")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, value);
    }

}
