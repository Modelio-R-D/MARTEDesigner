package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_Lifeline {
    protected Lifeline element;

    public PaLogicalResource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_LIFELINE));
    }

    public PaLogicalResource_Lifeline(Lifeline element) {
        this.element = element;
    }

    public Lifeline getElement() {
        return this.element;
    }

    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_utilization", value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_throughput", value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_poolSize", value);
    }

}
