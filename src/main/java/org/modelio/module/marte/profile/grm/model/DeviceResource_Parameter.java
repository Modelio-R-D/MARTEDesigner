package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dfbf15c1-0e81-4e77-abe0-d38500dd1fe4")
public class DeviceResource_Parameter extends ProcessingResource_Parameter {
    @objid ("e7394eda-39c1-44c6-ad7e-6442d89c3dce")
    public DeviceResource_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Parameter"));
    }

    @objid ("b0575882-6a77-4eb3-aa3a-0fff987cfeb6")
    public DeviceResource_Parameter(final Parameter element) {
        super(element);
    }

}
