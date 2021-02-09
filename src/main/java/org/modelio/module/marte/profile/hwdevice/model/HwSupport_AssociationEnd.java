package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwSupport_AssociationEnd extends HwDevice_AssociationEnd {
    public HwSupport_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwSupport_AssociationEnd"));
    }

    public HwSupport_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
