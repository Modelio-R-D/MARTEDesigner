package org.modelio.module.marte.profile.hwmemory.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("15a6a9e8-42cd-484c-b289-afc86630ad7b")
public class HwROM_Class extends HwMemory_Class {
    @objid ("09e12999-e757-48cb-866c-70458ad680c5")
    public HwROM_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWROM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWROM_CLASSIFIER));
    }

    @objid ("d12d8e7a-a9bd-4026-b620-2b2b0bd6f8ec")
    public HwROM_Class(Class element) {
        super(element);
    }

    @objid ("3f342d59-1bc3-4231-984a-d355949c0d36")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, this.element);
    }

    @objid ("38643a7e-bc46-4749-a459-750bdb1def21")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_ORGANIZATION, value);
    }

    @objid ("50fd9cc8-01fa-406e-ab41-8e03c763ba17")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, this.element);
    }

    @objid ("d020760a-1731-4f32-91d8-cfb6a9e553d5")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWROM_CLASSIFIER_HWROM_CLASSIFIER_TYPE, value);
    }

    @objid ("b3c650b1-92db-474a-9541-7e23b5598fbe")
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
