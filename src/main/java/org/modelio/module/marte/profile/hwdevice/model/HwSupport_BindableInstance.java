package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a21b12a3-33a1-4550-952f-06886c67b69d")
public class HwSupport_BindableInstance extends HwDevice_BindableInstance {
    @objid ("43a38425-ec1c-4414-a9b1-82a11d8bd361")
    public HwSupport_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_BindableInstance"));
    }

    @objid ("3c23b6d4-c6fd-4ac2-9342-16b77b29215d")
    public HwSupport_BindableInstance(BindableInstance element) {
        super(element);
    }

}
