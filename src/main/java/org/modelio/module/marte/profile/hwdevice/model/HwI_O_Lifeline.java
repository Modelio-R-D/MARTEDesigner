package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1365e01f-3622-41c8-8980-95294e129ccd")
public class HwI_O_Lifeline extends HwDevice_Lifeline {
    @objid ("9113a620-501f-4898-8a11-409ccdb8446e")
    public HwI_O_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwI_O_Lifeline"));
    }

    @objid ("2375471f-5ee3-490a-9114-0123d9809fc2")
    public HwI_O_Lifeline(Lifeline element) {
        super(element);
    }

}
