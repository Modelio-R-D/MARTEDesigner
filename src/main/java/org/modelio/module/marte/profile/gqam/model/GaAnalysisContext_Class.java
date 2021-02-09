package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaAnalysisContext_Class extends Configuration_Class {
    public GaAnalysisContext_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_CLASS);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Class"));
    }

    public GaAnalysisContext_Class(Class element) {
        super(element);
    }

    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, this.element);
    }

    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, value);
    }

    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD, this.element);
    }

    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD, value);
    }

    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM, this.element);
    }

    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM, value);
    }

}
