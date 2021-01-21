package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("408a57b9-4a61-444d-9d8a-381955e4fa24")
public class HwI_O_Parameter extends HwDevice_Parameter {
    @objid ("5f85427b-ecdb-438e-bbb3-881a1a0cd6ec")
    public HwI_O_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Parameter"));
    }

    @objid ("994f24e0-b4bb-45f4-8e9d-40388e718729")
    public HwI_O_Parameter(Parameter element) {
        super(element);
    }

}
