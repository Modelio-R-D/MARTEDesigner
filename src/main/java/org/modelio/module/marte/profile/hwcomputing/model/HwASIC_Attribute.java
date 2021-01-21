package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6429584a-acd1-4c29-8cd2-8c25cffd7f5f")
public class HwASIC_Attribute extends HwComputingResource_Attribute {
    @objid ("7261f23c-deaa-44e1-9149-900671ec824d")
    public HwASIC_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Attribute"));
    }

    @objid ("0f5e684f-0f80-4919-a15c-3948d22f7c3d")
    public HwASIC_Attribute(Attribute element) {
        super(element);
    }

}
