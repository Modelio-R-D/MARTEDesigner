package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SchedulableResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9a633b88-76aa-40b9-b899-c0edf3b3258b")
public class GaCommChannel_BindableInstance extends SchedulableResource_BindableInstance {
    @objid ("73a4e617-d266-462f-9ecf-f28a5194d4d4")
    public GaCommChannel_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMCHANNEL_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("GaCommChannel_BindableInstance"));
    }

    @objid ("f865baf5-301a-4d83-9e80-2c5ee1e2d589")
    public GaCommChannel_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("6310a153-7940-48a6-8762-bb4e122e259f")
    public String getpacketSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, this.element);
    }

    @objid ("8706247f-4c15-40e0-ac85-12fa84395020")
    public void setpacketSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_PACKETSIZE, value);
    }

    @objid ("79d8743d-9ec2-4c31-b228-f1de95f936a2")
    public String getutlization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, this.element);
    }

    @objid ("17458c59-30ec-4201-93ae-cfc92f8fa071")
    public void setutlization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMCHANNEL_INSTANCE_GACOMMCHANNEL_INSTANCE_UTILIZATION, value);
    }

}
