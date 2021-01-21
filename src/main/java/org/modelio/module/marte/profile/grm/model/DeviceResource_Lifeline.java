package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2719cc89-473d-4ed3-8f8a-f65a61ed03be")
public class DeviceResource_Lifeline extends ProcessingResource_Lifeline {
    @objid ("6f55d5a4-5879-45e4-9cd1-3484b682e943")
    public DeviceResource_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("DeviceResource_Lifeline"));
    }

    @objid ("7b8084ae-efac-437e-84d5-589965e10bcd")
    public DeviceResource_Lifeline(final Lifeline element) {
        super(element);
    }

}
