package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f753f555-6f36-4d0c-b0e8-9ce6fb162e81")
public class HwISA_Lifeline {
    @objid ("80f505dd-3800-4e58-9d6d-1cdc3ea1c706")
    protected Lifeline element;

    @objid ("5bd50552-921d-4c14-b52a-90d58d5ae75f")
    public HwISA_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("HwISA_Lifeline"));
    }

    @objid ("514db069-b37b-4e26-bc74-dec8064a46a0")
    public HwISA_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("c9dd476e-7959-476c-93e5-d4943add02cc")
    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_FAMILY, this.element);
    }

    @objid ("b4e9ff43-24d1-4abc-a6fa-8cc5841eb7fb")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("d8c0e6bb-5442-4016-9bb4-45874ef1b508")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("6184ff1a-3c7b-4720-afad-8a190e5829f8")
    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_FAMILY, value);
    }

    @objid ("30cfe5fa-6995-4eb8-ba2f-6fe922f77a2b")
    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_INST_WIDTH, this.element);
    }

    @objid ("dede1cc8-235f-4baf-920e-3538f5eeea55")
    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_INST_WIDTH, value);
    }

    @objid ("2613bbef-7296-4a1b-b8fe-44f7654a15a1")
    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_TYPE, this.element);
    }

    @objid ("fa17ce92-c984-4750-a9cc-0e93b3dfb0b6")
    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_LIFELINE_HWISA_LIFELINE_TYPE, value);
    }

    @objid ("2aa311f5-5d21-4da0-9f57-5c5f1101bef3")
    public Lifeline getElement() {
        return this.element;
    }

}
