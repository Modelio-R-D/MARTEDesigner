package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1482cac1-ab52-42da-b503-ea6097e1d72a")
public class HwSupport_Attribute extends HwDevice_Attribute {
    @objid ("925aa871-0bf7-41ab-94b1-7737f0218b68")
    public HwSupport_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Attribute"));
    }

    @objid ("32aaf182-d35d-49e4-8361-89130d6bbaf3")
    public HwSupport_Attribute(Attribute element) {
        super(element);
    }

}
