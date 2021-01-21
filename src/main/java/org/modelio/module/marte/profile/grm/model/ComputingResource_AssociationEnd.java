package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1bdeda02-f81c-4514-9183-9fe35f5b8ca6")
public class ComputingResource_AssociationEnd extends ProcessingResource_AssociationEnd {
    @objid ("2c956810-3317-4f1b-9f12-791321af3e98")
    public ComputingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_AssociationEnd"));
    }

    @objid ("f363daf1-52c0-4594-821c-d2b2f38cdddc")
    public ComputingResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

}
