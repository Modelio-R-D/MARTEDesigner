package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_Class {
    protected Class element;

    public SaAnalysisContext_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_CLASS);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_CLASS));
    }

    public SaAnalysisContext_Class(Class element) {
        this.element = element;
    }

    public Class getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Class_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_ISSCHED, value);
    }

    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Class_optCriterion", this.element);
    }

    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_OPTCRITERION, value);
    }

}
