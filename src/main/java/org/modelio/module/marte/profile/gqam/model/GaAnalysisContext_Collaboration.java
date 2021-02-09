package org.modelio.module.marte.profile.gqam.model;

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

public class GaAnalysisContext_Collaboration {
    protected Collaboration element;

    public GaAnalysisContext_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Collaboration"));
    }

    public GaAnalysisContext_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS, this.element);
    }

    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_CONTEXTPARAMS, value);
    }

    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_WORKLOAD, this.element);
    }

    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_WORKLOAD, value);
    }

    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_PLATFORM, this.element);
    }

    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_COLLABORATION_GAANALYSISCONTEXT_COLLABORATION_PLATFORM, value);
    }

    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
