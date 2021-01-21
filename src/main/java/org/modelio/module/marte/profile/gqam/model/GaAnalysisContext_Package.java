package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.coreelements.model.Configuration_Package;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("92015c02-1f82-4075-9fc2-26e51712c0d6")
public class GaAnalysisContext_Package extends Configuration_Package {
    @objid ("17dff0aa-476a-4e3b-b0db-c0b1f5b28002")
    public GaAnalysisContext_Package() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GAANALYSISCONTEXT_PACKAGE);
                this.element.setName(MARTEResourceManager.getName("GaAnalysisContext_Package"));
    }

    @objid ("a7b202bf-8cc4-424e-8410-37be2c87f722")
    public GaAnalysisContext_Package(Package element) {
        super(element);
    }

    @objid ("948fb11f-245f-4be0-b5d0-fb7412e0109c")
    public String getcontext() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, this.element);
    }

    @objid ("c1744b01-0099-42db-88ac-9fae074d08ab")
    public void setcontext(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_CONTEXTPARAMS, value);
    }

    @objid ("8ede637f-f9b1-49e8-a809-d4764d8c03a9")
    public String getworkload() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD, this.element);
    }

    @objid ("f59f79ba-8084-44a3-9cc4-c0b40f3846f3")
    public void setworkload(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_WORKLOAD, value);
    }

    @objid ("5cff2a58-5c25-47be-8795-3129a0bcdf96")
    public String getplatform() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM, this.element);
    }

    @objid ("06e44971-7e00-4ad2-9a52-2ad71d539b96")
    public void setplatform(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GAANALYSISCONTEXT_PACKAGE_GAANALYSISCONTEXT_PACKAGE_PLATFORM, value);
    }

}
