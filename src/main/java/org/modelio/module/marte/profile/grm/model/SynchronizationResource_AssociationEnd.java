package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SynchronizationResource_AssociationEnd extends Resource_AssociationEnd {
    public SynchronizationResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_AssociationEnd"));
    }

    public SynchronizationResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
