package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaCommHost_Lifeline {
    protected Lifeline element;

    public SaCommHost_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_LIFELINE));
    }

    public SaCommHost_Lifeline(Lifeline element) {
        this.element = element;
    }

    public Lifeline getElement() {
        return this.element;
    }

    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Lifeline_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_ISSCHED,value );
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Lifeline_schSlack", this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_SCHSLACK, value);
    }

}
