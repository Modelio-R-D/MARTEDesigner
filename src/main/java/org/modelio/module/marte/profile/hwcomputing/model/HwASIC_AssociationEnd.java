package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_AssociationEnd extends HwComputingResource_AssociationEnd {
    public HwASIC_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwASIC_AssociationEnd"));
    }

    public HwASIC_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
