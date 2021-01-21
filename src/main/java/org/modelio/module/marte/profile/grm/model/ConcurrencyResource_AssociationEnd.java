package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("694a5508-0ee6-4dd6-8ebd-ae5c42a8dfa3")
public class ConcurrencyResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("7e2dd33a-da35-4554-a6b2-6c482d5c8b9f")
    public ConcurrencyResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_AssociationEnd"));
    }

    @objid ("f6e0674c-b572-494f-b771-22579e4f987f")
    public ConcurrencyResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
