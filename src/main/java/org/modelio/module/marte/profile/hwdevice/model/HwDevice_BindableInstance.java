package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2f91936c-6afe-4a37-849b-fe463a8fe968")
public class HwDevice_BindableInstance extends DeviceResource_BindableInstance {
    @objid ("f9700d69-e133-4ec9-92b6-ee3fffb0bb18")
    public HwDevice_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_BindableInstance"));
    }

    @objid ("61c88779-31af-4cbb-aae6-43ce506936a6")
    public HwDevice_BindableInstance(BindableInstance element) {
        super(element);
    }

}
