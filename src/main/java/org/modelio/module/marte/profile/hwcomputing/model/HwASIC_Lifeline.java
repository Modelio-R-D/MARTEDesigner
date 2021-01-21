package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5779b817-5214-472f-ab75-55f6f9a86c1a")
public class HwASIC_Lifeline extends HwComputingResource_Lifeline {
    @objid ("36e6e6b5-5d07-47de-ad08-10fccf5dd2ef")
    public HwASIC_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Lifeline"));
    }

    @objid ("3ff267e8-bb42-4e0c-ac92-2eaba58519cc")
    public HwASIC_Lifeline(Lifeline element) {
        super(element);
    }

}
