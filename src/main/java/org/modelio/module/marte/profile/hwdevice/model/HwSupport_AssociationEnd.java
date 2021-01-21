package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3d0dc2ac-f45e-467a-962e-4d5f92dee5ce")
public class HwSupport_AssociationEnd extends HwDevice_AssociationEnd {
    @objid ("9393914f-4c77-41d8-b57b-7d8e5939c611")
    public HwSupport_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwSupport_AssociationEnd"));
    }

    @objid ("4ae97f9a-17eb-439a-a97b-e1ea77dd1a96")
    public HwSupport_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
