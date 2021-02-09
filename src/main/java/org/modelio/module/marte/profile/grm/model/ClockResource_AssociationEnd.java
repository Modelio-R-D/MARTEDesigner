package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClockResource_AssociationEnd extends TimingResource_AssociationEnd {
    public ClockResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ClockResource_AssociationEnd"));
    }

    public ClockResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
