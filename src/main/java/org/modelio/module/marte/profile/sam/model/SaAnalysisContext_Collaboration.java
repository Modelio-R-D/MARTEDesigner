package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("91b24876-2420-41ce-bcda-a2f8012d8877")
public class SaAnalysisContext_Collaboration {
    @objid ("c1f54796-f8d8-4e85-9c94-6d7c47415fc4")
    protected Collaboration element;

    @objid ("645a038a-ff64-4f10-9499-e1fa77b5ccbc")
    public SaAnalysisContext_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_COLLABORATION));
    }

    @objid ("f1d3c3dc-92e5-4266-b108-d25377bbd48c")
    public SaAnalysisContext_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("64cf2ae6-85f9-4341-8d56-b1338e7ce159")
    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("81d10e70-ce9c-40b7-84df-ebb69bafc357")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("ab5478ed-8963-427a-ad0b-609d5e97ea8b")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Collaboration_isSched", this.element);
    }

    @objid ("fb951718-c177-49f4-acd2-d822b45b0f94")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_ISSCHED, value);
    }

    @objid ("1393b9ac-11f1-4b5b-8a52-bb7429a4ac05")
    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Collaboration_optCriterion", this.element);
    }

    @objid ("c7811cc4-7873-4efb-bfdc-65ef94868776")
    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_COLLABORATION_SAANALYSISCONTEXT_COLLABORATION_OPTCRITERION, value);
    }

    @objid ("5ad4e846-291c-4fde-be94-26c8920382b9")
    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("0cc25dac-f7dc-487d-a1c3-c29132b1a6c7")
    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("07e00bf7-d4bc-4828-86db-05562451ec42")
    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
