package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaExecHost_Parameter {
    protected BehaviorParameter element;

    public SaExecHost_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBehaviorParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_PARAMETER));
    }

    public SaExecHost_Parameter(BehaviorParameter element) {
        this.element = element;
    }

    public BehaviorParameter getElement() {
        return this.element;
    }

    public void setParent(Behavior parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaExecHost_Parameter_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISSCHED,value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_schSlack", this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHSLACK, value);
    }

    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_schedUtiliz", this.element);
    }

    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_SCHEDUTILIZ, value);
    }

    public String getISRswitchT() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_ISRswitchT", this.element);
    }

    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRSWITCHT, value);
    }

    public String getISRprioRange() {
        return ModelUtils.getTaggedValue("SaExecHost_Parameter_ISRprioRange", this.element);
    }

    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_PARAMETER_SAEXECHOST_PARAMETER_ISRPRIORANGE, value);
    }

}
