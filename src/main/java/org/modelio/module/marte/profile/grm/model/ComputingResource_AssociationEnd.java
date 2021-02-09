package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ComputingResource_AssociationEnd extends ProcessingResource_AssociationEnd {
    public ComputingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_AssociationEnd"));
    }

    public ComputingResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
