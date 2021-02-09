package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_AssociationEnd extends HwMedia_AssociationEnd {
    public HwBridge_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwBridge_AssociationEnd"));
    }

    public HwBridge_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATIONEND_HWBRIDGE_ASSOCIATIONEND_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_ASSOCIATIONEND_HWBRIDGE_ASSOCIATIONEND_SIDES, value);
    }

    public AssociationEnd getElement() {
        return this.element;
    }

}
