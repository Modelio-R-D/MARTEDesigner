package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2cdf0f10-1d9e-412f-b125-f6815edeef21")
public class HwBus_Class extends HwMedia_Class {
    @objid ("c5aab307-6261-4dcf-b057-bf0e33dc5024")
    public HwBus_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBUS_CLASSIFIER));
    }

    @objid ("cb367331-9533-4c71-89a6-aa07c2bf192d")
    public HwBus_Class(Class element) {
        super(element);
    }

    @objid ("44bc3c0c-40be-4c7d-bd7a-eba7d54b61aa")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ADRESSWIDTH, this.element);
    }

    @objid ("65b72596-7a2d-4a9d-b38f-24050ebb9802")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ADRESSWIDTH, value);
    }

    @objid ("500d8d96-1376-4e0d-a17e-2a019e975d70")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_WORDWIDTH, this.element);
    }

    @objid ("70fa0c62-05a9-4d24-9ced-e723dc606250")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_WORDWIDTH, value);
    }

    @objid ("dbf23cfb-8834-436c-8a5c-22c5949a60d1")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSYNCHRONOUS, this.element);
    }

    @objid ("fba1f383-85a6-4cef-8b59-f4afb8c62225")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSYNCHRONOUS,value);
    }

    @objid ("553d0173-27e8-479d-b4b3-94366ac7c33d")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSERIAL, this.element);
    }

    @objid ("d11d365b-066b-4b33-a15d-1b58e10190f3")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_CLASSIFIER_HWBUS_CLASSIFIER_ISSERIAL,value);
    }

}
