package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_AssociationEnd {
    protected AssociationEnd element;

    public PaLogicalResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATIONEND));
    }

    public PaLogicalResource_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_utilization", value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_throughput", value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_AssociationEnd_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_AssociationEnd_poolSize", value);
    }

}
