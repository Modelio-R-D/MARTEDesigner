package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("21ce788b-fc33-4f64-a330-570a39912709")
public class HwBus_Attribute extends HwMedia_Attribute {
    @objid ("a56a8bcb-021b-4ce3-849d-fd575aceed9a")
    public HwBus_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBus_Attribute"));
    }

    @objid ("0133ffc8-ca07-4dd1-9b2a-d982b6fd2a2b")
    public HwBus_Attribute(Attribute element) {
        super(element);
    }

    @objid ("35d43acc-7f5c-487e-83da-33c1765c8084")
    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, this.element);
    }

    @objid ("f7b207c4-1664-4fff-aebc-20e4fd2c8f79")
    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ADRESSWIDTH, value);
    }

    @objid ("8842f59f-868a-4386-ae0b-918504c6f5d3")
    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, this.element);
    }

    @objid ("1fdf18f3-af2c-4c14-bf21-10d67b7ee39d")
    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_WORDWIDTH, value);
    }

    @objid ("def6b4d4-3f28-459b-9a60-0b87212e0f80")
    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS, this.element);
    }

    @objid ("5524c23b-602b-4349-8b6d-aa6482a113ba")
    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSYNCHRONOUS,value);
    }

    @objid ("9c6419de-c239-4471-a692-5f73589765a0")
    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL, this.element);
    }

    @objid ("9484c33b-aaa2-4f01-95b3-dd5abc6763c8")
    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ATTRIBUTE_HWBUS_ATTRIBUTE_ISSERIAL,value);
    }

    @objid ("32d05a39-fb47-4584-8c45-0bd949384554")
    public Attribute getElement() {
        return this.element;
    }

}
