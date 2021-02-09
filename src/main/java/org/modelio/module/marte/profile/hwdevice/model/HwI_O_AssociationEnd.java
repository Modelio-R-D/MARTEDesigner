package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwI_O_AssociationEnd extends HwDevice_AssociationEnd {
    public HwI_O_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwI_O_AssociationEnd"));
    }

    public HwI_O_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
