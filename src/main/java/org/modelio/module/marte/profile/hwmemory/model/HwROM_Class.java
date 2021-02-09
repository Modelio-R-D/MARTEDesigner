package org.modelio.module.marte.profile.hwmemory.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwROM_Class extends HwMemory_Class {
    public HwROM_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWROM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWROM_CLASSIFIER));
    }

    public HwROM_Class(Class element) {
        super(element);
    }

    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, this.element);
    }

    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, value);
    }

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
