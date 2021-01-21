package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("170e9393-65c8-4d46-bf5b-9beb0570dd6d")
public class SynchronizationResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("504ca893-8e35-4d62-941a-01d9a6fc970a")
    public SynchronizationResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("SynchronizationResource_AssociationEnd"));
    }

    @objid ("d4877690-b03d-4b65-b835-bbdabd5fc15f")
    public SynchronizationResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
