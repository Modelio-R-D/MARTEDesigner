package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("87394b93-036d-4563-ae1e-9b9f443c5b99")
public class DeviceResource_Class extends ProcessingResource_Class {
    @objid ("43c9e75d-e3dc-43ba-9c08-349d9fffae59")
    public DeviceResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.DEVICERESOURCE_CLASSIFIER));
    }

    @objid ("c3b249c1-caff-47a0-a2c4-27470163255a")
    public DeviceResource_Class(final Class element) {
        super(element);
    }

}
