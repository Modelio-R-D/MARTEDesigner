package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b1d637d7-2adb-49c7-8e79-e48af7f0bf1b")
public class SaCommHost_Lifeline {
    @objid ("d143f958-4d5e-489b-b272-0d72f0c78f3b")
    protected Lifeline element;

    @objid ("d3b91a63-a68b-4292-8f38-27b5cc5e0ef1")
    public SaCommHost_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_LIFELINE));
    }

    @objid ("24c6c750-563a-423f-96f0-11d33b5f59ad")
    public SaCommHost_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("147fcde4-1f24-4896-8360-f768ae95a3e2")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("d28526a3-afdc-4f66-b4e1-550d83e2dc30")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("1b7ca46e-a3ec-4d15-87b4-df06f115abb1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("b5d7d514-dbe1-4d3f-9f9e-732bb2cb10ac")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Lifeline_isSched", this.element);
    }

    @objid ("1e2220e6-3554-4714-8795-f0dcb013beeb")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_ISSCHED,value );
    }

    @objid ("fb5de249-0f2f-4ec1-9f68-eb4ed3b48ffb")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Lifeline_schSlack", this.element);
    }

    @objid ("c1e9ee59-4497-4e09-9515-005d45dd8873")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_LIFELINE_SACOMMHOST_LIFELINE_SCHSLACK, value);
    }

}
