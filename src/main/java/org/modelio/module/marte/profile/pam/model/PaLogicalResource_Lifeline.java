package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d91d660b-5c32-4756-b930-cacc796e0e08")
public class PaLogicalResource_Lifeline {
    @objid ("1c3251a9-8b04-4e1e-866a-be189acc88a8")
    protected Lifeline element;

    @objid ("825dc75b-772e-41f3-b94a-7b31ee266e2f")
    public PaLogicalResource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_LIFELINE));
    }

    @objid ("caaeac1d-bf94-4838-ba3d-cb528a86deea")
    public PaLogicalResource_Lifeline(Lifeline element) {
        this.element = element;
    }

    @objid ("c58698db-93ef-454a-96f6-55ccbff3c3ae")
    public Lifeline getElement() {
        return this.element;
    }

    @objid ("95245429-ebfb-4611-ab1d-830d513bade9")
    public void setParent(Interaction parent) {
        this.element.setOwner(parent);
    }

    @objid ("39476730-5f56-449f-9814-5a23921a2ff5")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("9a78d3b1-f5d5-49dc-9808-273fb0726395")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_utilization", this.element);
    }

    @objid ("f223e3fc-58b6-4d80-a05c-29fc36a09ce6")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_utilization", value);
    }

    @objid ("df634652-cd98-427c-8fdf-10d60286595b")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_throughput", this.element);
    }

    @objid ("e54b75ca-20fb-4739-82b5-6af77025f890")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_throughput", value);
    }

    @objid ("e1bd2c03-7430-4834-8789-b530224a04f7")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Lifeline_poolSize", this.element);
    }

    @objid ("ee86d2ea-ead9-41ea-b174-9df4add12ef9")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Lifeline_poolSize", value);
    }

}
