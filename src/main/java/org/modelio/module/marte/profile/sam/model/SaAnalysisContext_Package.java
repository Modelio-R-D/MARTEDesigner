package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e4f961ab-cc3c-4c49-aca2-8b6ee6b4af75")
public class SaAnalysisContext_Package {
    @objid ("6e47c20e-cde2-4036-9250-5148b03c50a6")
    protected Package element;

    @objid ("84c13834-e987-41d2-a6ad-e760c11c0f52")
    public SaAnalysisContext_Package() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_PACKAGE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_PACKAGE));
    }

    @objid ("ad910329-ffed-408d-895a-1cdca1df50ce")
    public SaAnalysisContext_Package(Package element) {
        this.element = element;
    }

    @objid ("b10fad20-68ec-43c8-b105-a31961b3496f")
    public Package getElement() {
        return this.element;
    }

    @objid ("0259a409-b302-4471-9b11-5977cb0bf603")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("5bf5a6ad-7da7-485f-8bf2-b72a15ffcc7d")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4a2bcc0e-049b-4901-8e66-2a26557901e3")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Package_isSched", this.element);
    }

    @objid ("60bf3f87-7003-4bfe-91cf-fc4359273f75")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_ISSCHED,value);
    }

    @objid ("5623c3e0-0716-47c4-8a1f-69efc1e9a5fd")
    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Package_optCriterion", this.element);
    }

    @objid ("ea863ac5-e9a0-4469-95dd-12c6d08c90dc")
    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_PACKAGE_SAANALYSISCONTEXT_PACKAGE_OPTCRITERION, value);
    }

}
