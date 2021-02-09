package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaAnalysisContext_Package {
    protected Package element;

    public SaAnalysisContext_Package() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_PACKAGE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_PACKAGE));
    }

    public SaAnalysisContext_Package(Package element) {
        this.element = element;
    }

    public Package getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Package_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED,value);
    }

    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Package_optCriterion", this.element);
    }

    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, value);
    }

}
