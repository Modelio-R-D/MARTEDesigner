package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Resource_Parameter {
    protected Parameter element;

    public Resource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("Resource_Parameter"));
    }

    public Resource_Parameter(final Parameter element) {
        this.element = element;
    }

    public Parameter getElement() {
        return this.element;
    }

    public void setParent(final Operation parent) {
        this.element.setComposed(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, this.element);
    }

    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_RESMULT, value);
    }

    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED, this.element);
    }

    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISPROTECTED,value);
    }

    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE, this.element);
    }

    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_PARAMETER_RESOURCE_PARAMETER_ISACTIVE,value);
    }

}
