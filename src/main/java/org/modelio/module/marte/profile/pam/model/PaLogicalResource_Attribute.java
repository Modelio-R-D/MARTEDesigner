package org.modelio.module.marte.profile.pam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1702085b-538c-434c-9c97-978e979b8822")
public class PaLogicalResource_Attribute {
    @objid ("62662866-8b0c-4f70-9e2b-3d5899d42c56")
    protected Attribute element;

    @objid ("d3d7d249-18fc-4672-8136-4e9a8638ad42")
    public PaLogicalResource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ATTRIBUTE));
    }

    @objid ("3bccb826-8c32-42df-871a-8514f826cc4b")
    public PaLogicalResource_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("0b2e4a52-4b82-4bd1-bcf6-b4daa7c5941c")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("f6917b9f-27ad-4ce0-b7c4-3537152971cd")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("328f3cf3-f327-4451-b33d-8dd4cf095b99")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("f627d805-9acd-4434-b496-c51215efc8d4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("d5a1049d-4148-41e8-aa68-18778e7e587a")
    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_utilization", this.element);
    }

    @objid ("42d4439c-57f0-43fe-86d5-2212efe1b3ac")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_utilization", value);
    }

    @objid ("c90a55fc-9aeb-40b5-b966-89b733dea65b")
    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_throughput", this.element);
    }

    @objid ("008c9e88-fcb9-4e26-975c-b72d4313b2ea")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_throughput", value);
    }

    @objid ("ffa2057d-77c1-4646-a01d-fcb24bc478fa")
    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Attribute_poolSize", this.element);
    }

    @objid ("fc46ae10-3bd9-4d12-8a56-f7f0723985ac")
    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Attribute_poolSize", value);
    }

}
