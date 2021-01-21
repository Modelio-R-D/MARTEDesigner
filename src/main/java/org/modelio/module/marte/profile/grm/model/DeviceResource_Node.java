package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6fa2d55c-a5d1-4d82-b3d8-b9b84d8c1f8a")
public class DeviceResource_Node extends ProcessingResource_Node {
    @objid ("1c8c498e-3727-41f8-8627-635260272b5a")
    public DeviceResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.DEVICERESOURCE_CLASSIFIER));
    }

    @objid ("c6cb8c5a-e7f4-4925-b8d1-04dccde6dfc2")
    public DeviceResource_Node(final Node element) {
        super(element);
    }

}
