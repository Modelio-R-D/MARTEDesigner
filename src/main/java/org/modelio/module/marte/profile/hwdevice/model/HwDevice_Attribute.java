package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4c558038-c746-4c96-9b3f-4ab1973dc615")
public class HwDevice_Attribute extends DeviceResource_Attribute {
    @objid ("2033b89b-9f93-456e-8430-13d1a9f4c956")
    public HwDevice_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Attribute"));
    }

    @objid ("49ff8f64-33f3-4d8a-a9c6-7965f8d054f6")
    public HwDevice_Attribute(Attribute element) {
        super(element);
    }

}
