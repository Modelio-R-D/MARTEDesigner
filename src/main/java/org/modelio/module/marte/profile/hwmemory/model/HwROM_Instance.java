package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c975e7e5-6730-4a13-9235-fd06ecbbe3a2")
public class HwROM_Instance extends HwMemory_Instance {
    @objid ("685f1e5d-d64f-455a-a92a-05ea168fc43f")
    public HwROM_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWROM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwROM_Instance"));
    }

    @objid ("f98296f8-e8f4-46b9-beb3-628d5f6f0696")
    public HwROM_Instance(Instance element) {
        super(element);
    }

    @objid ("c029533a-2920-4303-845c-ac5706e1911f")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("8e369f1a-ded5-472d-aefa-6bcf9036d869")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_ORGANIZATION, value);
    }

    @objid ("866077f6-500d-4cc8-b25e-856f5fc9a39e")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, this.element);
    }

    @objid ("1e96a846-84c3-4845-91b9-0614c1fda554")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_INSTANCE_HWROM_INSTANCE_TYPE, value);
    }

    @objid ("48644abd-4e84-408d-959e-d1eeeb7f7ba0")
    public enum ROM_Type {
        maskedROM,
        EPROM,
        OTP_EPROM,
        EEPROM,
        flash,
        other,
        undefined;
    }

}
