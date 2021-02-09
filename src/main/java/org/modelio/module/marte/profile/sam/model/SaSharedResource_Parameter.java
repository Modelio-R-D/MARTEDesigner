package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSharedResource_Parameter {
    protected Parameter element;

    public SaSharedResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER));
    }

    public SaSharedResource_Parameter(Parameter element) {
        this.element = element;
    }

    public Parameter getElement() {
        return this.element;
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_capacity", this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_CAPACITY, value);
    }

    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Parameter_isPreemp", this.element);
    }

    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ISPREEMP, value);
    }

    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Parameter_isConsum", this.element);
    }

    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ISCONSUM, value);
    }

    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_acquisT", this.element);
    }

    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ACQUIST, value);
    }

    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_releaseT", this.element);
    }

    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_RELEASET, value);
    }

}
