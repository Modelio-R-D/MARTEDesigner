package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a30ec3ac-c227-460f-a2cf-c81f40776f0a")
public class HwASIC_AssociationEnd extends HwComputingResource_AssociationEnd {
    @objid ("c8c6b25b-7223-4f67-82f4-4132ae0da709")
    public HwASIC_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwASIC_AssociationEnd"));
    }

    @objid ("87b0abda-2edf-434a-aa0f-2cd6f5f68c30")
    public HwASIC_AssociationEnd(AssociationEnd element) {
        super(element);
    }

}
