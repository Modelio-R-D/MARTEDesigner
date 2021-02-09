package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimingResource_AssociationEnd extends Resource_AssociationEnd {
    public TimingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("TimingResource_AssociationEnd"));
    }

    public TimingResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
