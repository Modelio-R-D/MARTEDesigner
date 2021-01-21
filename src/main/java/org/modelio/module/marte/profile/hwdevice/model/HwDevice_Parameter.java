package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Parameter;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("58c81c89-6ec6-4586-9d7d-e13ad209534c")
public class HwDevice_Parameter extends DeviceResource_Parameter {
    @objid ("fba22866-d0f9-4641-b959-05618524d35f")
    public HwDevice_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Parameter"));
    }

    @objid ("77d93afa-59df-4900-91d4-5477e75ed9e5")
    public HwDevice_Parameter(Parameter element) {
        super(element);
    }

}
