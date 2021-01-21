package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a38e2214-d59a-4400-b393-0fd272d29484")
public class SaAnalysisContext_Class {
    @objid ("2b969c47-7526-4119-b73b-d9c2b450125d")
    protected Class element;

    @objid ("765dbf60-8ab8-4da1-9e9a-be97b3e4dcfc")
    public SaAnalysisContext_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_CLASS);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_CLASS));
    }

    @objid ("b7f444ed-36be-4842-9a71-5f690c656e90")
    public SaAnalysisContext_Class(Class element) {
        this.element = element;
    }

    @objid ("569da42a-4e55-47fe-b89b-136d5308c0b5")
    public Class getElement() {
        return this.element;
    }

    @objid ("86cde9c2-7cce-42de-83d8-02851c90b6c7")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("41439a8f-5b6e-4e3c-bfed-0c3eb30a8752")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("9d859fc5-b1f0-4e88-9675-a3ae75827fec")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Class_isSched", this.element);
    }

    @objid ("a2ee6f64-e531-4f97-b1c6-9460c7794266")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_ISSCHED, value);
    }

    @objid ("e910c5ae-d308-420f-9541-bbcedd50c423")
    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Class_optCriterion", this.element);
    }

    @objid ("ca97169f-0b65-41fe-8092-f9783af0713a")
    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_CLASS_SAANALYSISCONTEXT_CLASS_OPTCRITERION, value);
    }

}
