package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_Association {
    protected Association element;

    public PaLogicalResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_ASSOCIATION));
    }

    public PaLogicalResource_Association(Association element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    public Association getElement() {
        return this.element;
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_utilization", value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_throughput", value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Association_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Association_poolSize", value);
    }

}
