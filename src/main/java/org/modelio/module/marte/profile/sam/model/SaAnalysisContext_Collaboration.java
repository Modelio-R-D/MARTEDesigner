package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_Collaboration {
    protected Collaboration element;

    public SaAnalysisContext_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_COLLABORATION));
    }

    public SaAnalysisContext_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Collaboration_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, value);
    }

    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Collaboration_optCriterion", this.element);
    }

    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, value);
    }

    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
