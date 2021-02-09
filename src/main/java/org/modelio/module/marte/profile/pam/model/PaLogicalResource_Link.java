package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_Link {
    protected Link element;

    public PaLogicalResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_LINK));
    }

    public PaLogicalResource_Link(Link element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, "PaLogicalResource_Link_utilization", value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_THROUGHPUT, value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Link_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_LINK_PALOGICALRESOURCE_LINK_POOLSIZE, value);
    }

}
