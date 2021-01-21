package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("64f5ca19-9de4-4a63-8324-9ac5fa6d0d78")
public class HwDevice_AssociationEnd extends DeviceResource_AssociationEnd {
    @objid ("52722207-bfab-4c84-9a53-834c61967501")
    public HwDevice_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwDevice_AssociationEnd"));
    }

    @objid ("683f1e09-7b7b-4d9b-b86e-2fd8b143d6cc")
    public HwDevice_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
