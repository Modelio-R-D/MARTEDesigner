package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Package;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaAnalysisContext_Package extends Configuration_Package {
    public GaAnalysisContext_Package() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_PACKAGE);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Package"));
    }

    public GaAnalysisContext_Package(Package element) {
        super(element);
    }

    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, this.element);
    }

    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, value);
    }

    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD, this.element);
    }

    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD, value);
    }

    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM, this.element);
    }

    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM, value);
    }

}
