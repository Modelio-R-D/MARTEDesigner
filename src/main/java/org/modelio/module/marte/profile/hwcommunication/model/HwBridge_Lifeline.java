package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fefecde1-d142-413c-8f36-7e48fefaa1c0")
public class HwBridge_Lifeline extends HwMedia_Lifeline {
    @objid ("85e2127a-ff09-4204-af5e-8d1115dde0f8")
    public HwBridge_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Lifeline"));
    }

    @objid ("8fc517f7-c527-4e71-8b5b-b0fe0c12d090")
    public HwBridge_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("d2d5fd61-2117-443d-8af0-96243ea68e77")
    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_LIFELINE_HWBRIDGE_LIFELINE_SIDES, this.element);
    }

    @objid ("f98eba39-e759-40dd-bc51-c5d9bf414ac0")
    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_LIFELINE_HWBRIDGE_LIFELINE_SIDES, value);
    }

    @objid ("dd6ba03d-9fc8-4c20-825d-f0c2da52a04f")
    public Lifeline getElement() {
        return this.element;
    }

}
