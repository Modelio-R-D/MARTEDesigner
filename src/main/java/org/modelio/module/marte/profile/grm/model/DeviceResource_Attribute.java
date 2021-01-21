package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("31ff9a41-bcf7-44d2-8882-2053c389ad71")
public class DeviceResource_Attribute extends ProcessingResource_Attribute {
    @objid ("31be4f10-ca38-43f4-8da1-dceced6c806b")
    public DeviceResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Attribute"));
    }

    @objid ("995723b7-fefb-4cde-9c0b-8a50abf6236b")
    public DeviceResource_Attribute(final Attribute element) {
        super(element);
    }

}
