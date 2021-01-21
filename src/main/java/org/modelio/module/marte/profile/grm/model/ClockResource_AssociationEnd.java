package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4137f366-fb6d-44b7-89e5-9140b1864bf5")
public class ClockResource_AssociationEnd extends TimingResource_AssociationEnd {
    @objid ("ad7e20f7-fcec-4194-a169-de0868b1de87")
    public ClockResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ClockResource_AssociationEnd"));
    }

    @objid ("b8bd6e01-0caa-4611-9ff3-16b06acf17ba")
    public ClockResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
