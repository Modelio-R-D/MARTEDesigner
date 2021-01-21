package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("430ff247-e2c3-4b58-81bc-6e4bb1a7eb04")
public class HwI_O_AssociationEnd extends HwDevice_AssociationEnd {
    @objid ("f2f3d2e8-317f-4667-8666-8773dc49bbe9")
    public HwI_O_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwI_O_AssociationEnd"));
    }

    @objid ("bc4ea601-5dbb-4978-84dc-3dbd16ead599")
    public HwI_O_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
