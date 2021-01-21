package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("87f80a09-f270-46a2-8816-bc76be2ca6f0")
public class HwDevice_Node extends DeviceResource_Node {
    @objid ("b1626de7-136c-4fa0-9551-f4f0d0e471cc")
    public HwDevice_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDEVICE_CLASSIFIER));
    }

    @objid ("1019dfdf-da13-4efc-bc3f-ac357c5eafc8")
    public HwDevice_Node(Node element) {
        super(element);
    }

}
