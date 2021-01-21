package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8f5b3af5-61a2-46f7-a216-20bbca7efd20")
public class HwDevice_Class extends DeviceResource_Class {
    @objid ("ed3e402f-3a12-4e82-8ee8-3f3cf8e0e54b")
    public HwDevice_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element, MARTEDesignerStereotypes.HWDEVICE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWDEVICE_CLASSIFIER));
    }

    @objid ("e1bed0c9-4f52-4c02-bd25-925c0a1538e7")
    public HwDevice_Class(Class element) {
        super(element);
    }

}
