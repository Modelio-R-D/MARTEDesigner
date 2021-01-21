package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f4dddc33-c6e6-4dcc-b7c0-5a23ae01fd26")
public class DeviceResource_Instance extends Resource_Instance {
    @objid ("8152bc86-7a47-4250-be59-47c622a7a03d")
    public DeviceResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Instance"));
    }

    @objid ("09509a32-d75e-4d85-9d07-c83d912f267d")
    public DeviceResource_Instance(final Instance element) {
        super(element);
    }

}
