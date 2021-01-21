package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a406340e-29b5-449c-9e4e-e5c930349c98")
public class HwBus_BindableInstance extends HwMedia_BindableInstance {
    @objid ("7dbf93a9-8172-4aa2-a65e-48b0ebc52a45")
    public HwBus_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBus_BindableInstance"));
    }

    @objid ("70086eb6-cdd3-49cd-b24c-90a271a77949")
    public HwBus_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("e59df24b-eef6-4f0a-877e-23f4b58b1f79")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, this.element);
    }

    @objid ("f371c358-506e-48c4-b3d5-c6735e08d650")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, value);
    }

    @objid ("93b1aef1-960b-4577-a191-7b19807728b7")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, this.element);
    }

    @objid ("cccc9b73-1f46-41a0-9331-06e396f54801")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, value);
    }

    @objid ("8557cc25-48ff-4d67-b3a5-68119608966e")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS, this.element);
    }

    @objid ("02322d11-1e99-45d2-82fa-0a439beb46de")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS,value);
    }

    @objid ("d868a9d1-a24c-4355-9d56-14f606f3c023")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL, this.element);
    }

    @objid ("5dbc648c-36fb-4817-a45e-a37dbec14f98")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL,value);
    }

}
