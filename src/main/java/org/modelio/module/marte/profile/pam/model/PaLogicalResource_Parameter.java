package org.modelio.module.marte.profile.pam.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class PaLogicalResource_Parameter {
    protected Parameter element;

    public PaLogicalResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PALOGICALRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.PALOGICALRESOURCE_PARAMETER));
    }

    public PaLogicalResource_Parameter(Parameter element) {
        this.element = element;
    }

    public Parameter getElement() {
        return this.element;
    }

    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getutilization() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_utilization", this.element);
    }

    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_UTILIZATION, value);
    }

    public String getthroughput() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_throughput", this.element);
    }

    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_THROUGHPUT, value);
    }

    public String getpoolSize() {
        return ModelUtils.getTaggedValue("PaLogicalResource_Parameter_poolSize", this.element);
    }

    public void setpoolSize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PALOGICALRESOURCE_PARAMETER_PALOGICALRESOURCE_PARAMETER_POOLSIZE, value);
    }

}
