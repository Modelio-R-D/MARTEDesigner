package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cbca745f-1180-4b01-be73-fc5d7dbab27c")
public class SaAnalysisContext_Node {
    @objid ("f7c020ff-fadf-4395-8609-b43a00f06441")
    protected Node element;

    @objid ("fbe42597-551c-42ad-9912-1ac3cd77a742")
    public SaAnalysisContext_Node() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAANALYSISCONTEXT_NODE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAANALYSISCONTEXT_NODE));
    }

    @objid ("2e8b6ffc-3710-4271-89fe-12d6a35d3a2d")
    public SaAnalysisContext_Node(Node element) {
        this.element = element;
    }

    @objid ("6335ee2a-0f1f-489e-9867-a007c9f53253")
    public Node getElement() {
        return this.element;
    }

    @objid ("6a7b1b3e-df93-4728-bf96-0974a7dfb0f3")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("7b4c6c25-2e3b-4e21-80ee-da4a090e1bc8")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b85a6df2-93cc-43d5-94b4-ae6d41f19f22")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaAnalysisContext_Node_isSched", this.element);
    }

    @objid ("08809e8e-981a-43a8-bb4e-2fe4b0441c5d")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_ISSCHED,value);
    }

    @objid ("75f1f7c5-eb92-4954-9009-7983ab2f5983")
    public String getoptCriterion() {
        return ModelUtils.getTaggedValue("SaAnalysisContext_Node_optCriterion", this.element);
    }

    @objid ("1890b413-86a9-49ee-96ae-f3c5bd06e042")
    public void setoptCriterion(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAANALYSISCONTEXT_NODE_SAANALYSISCONTEXT_NODE_OPTCRITERION, value);
    }

}
