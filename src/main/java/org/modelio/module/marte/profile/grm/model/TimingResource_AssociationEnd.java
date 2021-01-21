package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("84386743-b6b4-45f7-9e96-8d25189ef2f7")
public class TimingResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("09eda189-6fcb-46ab-b561-fc95e57e2ba8")
    public TimingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("TimingResource_AssociationEnd"));
    }

    @objid ("a140aad0-1e5f-464c-b46d-f0b6fdb54261")
    public TimingResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
