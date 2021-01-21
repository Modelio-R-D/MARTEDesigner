package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.DeviceResource_Lifeline;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("54e85b9b-6601-4eeb-a476-45d6725c40cb")
public class HwDevice_Lifeline extends DeviceResource_Lifeline {
    @objid ("2f3423b9-aba1-473e-9644-83a8a7448204")
    public HwDevice_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWDEVICE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwDevice_Lifeline"));
    }

    @objid ("7c3c3b10-8596-4fd8-bab9-e0390d0f797e")
    public HwDevice_Lifeline(Lifeline element) {
        super(element);
    }

}
