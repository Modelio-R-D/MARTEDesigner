package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4dacb177-23ee-4248-8e0c-50e72ca9afba")
public class HwArbiter_Lifeline extends HwCommunicationResource_Lifeline {
    @objid ("affd8601-5f67-4955-806f-d7ce787492ab")
    public HwArbiter_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_Lifeline"));
    }

    @objid ("d6e79407-4a3d-4884-9bdc-eb2da9f4a38b")
    public HwArbiter_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("51db2883-f084-45fc-818f-f3a2e110ca99")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_LIFELINE_HWARBITER_LIFELINE_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("3dc8303b-e06d-4f27-9cbf-443e44d486ce")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_LIFELINE_HWARBITER_LIFELINE_CONTROLLEDMEDIAS, value);
    }

    @objid ("72389299-8c7f-4236-bc6f-f3eb95a9516d")
    public Lifeline getElement() {
        return this.element;
    }

}
