package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("25626ceb-07d6-4850-a14d-c15c1c83480b")
public class HwI_O_Attribute extends HwDevice_Attribute {
    @objid ("db971a54-2072-4a1e-af46-39e33d8716d6")
    public HwI_O_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Attribute"));
    }

    @objid ("564ba74e-7401-426e-8e5b-68fa983b6295")
    public HwI_O_Attribute(Attribute element) {
        super(element);
    }

}
