package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DeviceResource_Attribute extends ProcessingResource_Attribute {
    public DeviceResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Attribute"));
    }

    public DeviceResource_Attribute(final Attribute element) {
        super(element);
    }

}
