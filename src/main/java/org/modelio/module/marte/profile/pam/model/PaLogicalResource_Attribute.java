package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_Attribute {
    protected Attribute element;

    public PaLogicalResource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ATTRIBUTE));
    }

    public PaLogicalResource_Attribute(Attribute element) {
        this.element = element;
    }

    public Attribute getElement() {
        return this.element;
    }

    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_utilization", value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_throughput", value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_poolSize", value);
    }

}
