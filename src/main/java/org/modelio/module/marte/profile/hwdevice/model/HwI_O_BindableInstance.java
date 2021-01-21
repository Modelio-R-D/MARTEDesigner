package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cc16aec2-48c0-4530-84f1-4669a5a1e088")
public class HwI_O_BindableInstance extends HwDevice_BindableInstance {
    @objid ("602b46f5-f029-408d-9a4c-0298755ccb54")
    public HwI_O_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_BindableInstance"));
    }

    @objid ("b814560e-86c0-4216-a277-46b24d10bc7f")
    public HwI_O_BindableInstance(BindableInstance element) {
        super(element);
    }

}
