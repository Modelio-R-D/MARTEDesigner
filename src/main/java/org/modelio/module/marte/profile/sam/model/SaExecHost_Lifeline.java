package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaExecHost_Lifeline {
    protected Lifeline element;

    public SaExecHost_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_LIFELINE));
    }

    public SaExecHost_Lifeline(Lifeline element) {
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
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISSCHED, this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISSCHED ,value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHSLACK, this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHSLACK, value);
    }

    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHEDUTILIZ, this.element);
    }

    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_SCHEDUTILIZ, value);
    }

    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRSWITCHT, this.element);
    }

    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRSWITCHT, value);
    }

    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRPRIORANGE, this.element);
    }

    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_LIFELINE_SAEXECHOST_LIFELINE_ISRPRIORANGE, value);
    }

}
