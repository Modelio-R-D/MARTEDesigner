package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBus_AssociationEnd extends HwMedia_AssociationEnd {
    public HwBus_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwBus_AssociationEnd"));
    }

    public HwBus_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, this.element);
    }

    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ADRESSWIDTH, value);
    }

    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, this.element);
    }

    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_WORDWIDTH, value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS,value);
    }

    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL, this.element);
    }

    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_ASSOCIATIONEND_HWBUS_ASSOCIATIONEND_ISSERIAL,value);
    }

    public AssociationEnd getElement() {
        return this.element;
    }

}
