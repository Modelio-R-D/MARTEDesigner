package org.modelio.module.marte.profile.hwdevice.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwDevice_AssociationEnd extends DeviceResource_AssociationEnd {
    public HwDevice_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwDevice_AssociationEnd"));
    }

    public HwDevice_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
