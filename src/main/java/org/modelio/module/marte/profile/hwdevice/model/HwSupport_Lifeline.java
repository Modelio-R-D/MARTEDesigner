package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a7868478-23e4-4e36-9ca3-61f147530578")
public class HwSupport_Lifeline extends HwDevice_Lifeline {
    @objid ("adbeb9ca-188e-4a5c-bec3-49a6fd1542f9")
    public HwSupport_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwSupport_Lifeline"));
    }

    @objid ("867e2f10-4a2f-4be3-9689-2e5f8a06a992")
    public HwSupport_Lifeline(Lifeline element) {
        super(element);
    }

}
