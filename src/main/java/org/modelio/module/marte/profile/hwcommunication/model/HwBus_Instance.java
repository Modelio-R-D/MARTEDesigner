package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cf3ec1bf-8925-4d00-97cd-aae466309f3b")
public class HwBus_Instance extends HwMedia_Instance {
    @objid ("259dec1d-29dc-42db-abe7-9b58a577071d")
    public HwBus_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBus_Instance"));
    }

    @objid ("2252028a-b176-42f0-afe1-5ed104afc9eb")
    public HwBus_Instance(Instance element) {
        super(element);
    }

    @objid ("2cebee18-f973-47e1-9653-90e4d1832aaf")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, this.element);
    }

    @objid ("f4c52d6b-150e-4bbf-8088-d9bb6d59e018")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ADRESSWIDTH, value);
    }

    @objid ("f3e07c4d-62c9-413a-98d5-8a2106116e59")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, this.element);
    }

    @objid ("524853e6-6769-441e-96b9-de14a052c859")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_WORDWIDTH, value);
    }

    @objid ("0590ce72-fdec-4c1b-bbfe-90534a9f9d65")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS, this.element);
    }

    @objid ("559b0d99-f879-4e08-8c63-b50a96274ac5")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSYNCHRONOUS,value);
    }

    @objid ("c163ae18-9b78-4cc1-b487-77618ff4db25")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL, this.element);
    }

    @objid ("a9dcfc47-7a09-4093-877b-7436b26558a8")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_INSTANCE_HWBUS_INSTANCE_ISSERIAL,value);
    }

}
