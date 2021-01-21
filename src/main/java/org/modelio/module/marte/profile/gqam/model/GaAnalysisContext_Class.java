package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b5a81dad-baf8-4e48-9dea-117adf5f6830")
public class GaAnalysisContext_Class extends Configuration_Class {
    @objid ("5142867b-c6f1-4dc1-9d61-f1d90212a87e")
    public GaAnalysisContext_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_CLASS);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Class"));
    }

    @objid ("df3fd8be-d564-4807-b07a-eef611606d71")
    public GaAnalysisContext_Class(Class element) {
        super(element);
    }

    @objid ("067fc745-2d39-4793-8b91-64ed4051f60d")
    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, this.element);
    }

    @objid ("a09541a1-0ca5-45e3-a4a1-8e161287fdc7")
    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_CONTEXTPARAMS, value);
    }

    @objid ("34828d94-d5d3-48f3-a41f-6ece87022a75")
    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD, this.element);
    }

    @objid ("ba3a5bb2-15d2-4bc2-9a66-d98af312fdef")
    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_WORKLOAD, value);
    }

    @objid ("77bf6a34-dd48-4f6c-848d-4b9ac2938c50")
    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM, this.element);
    }

    @objid ("651d7c27-3daa-423b-9a36-b54bd8a433cb")
    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_CLASS_GAANALYSISCONTEXT_CLASS_PLATFORM, value);
    }

}
