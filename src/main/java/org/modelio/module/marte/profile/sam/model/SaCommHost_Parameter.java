package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaCommHost_Parameter {
    protected Parameter element;

    public SaCommHost_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_PARAMETER));
    }

    public SaCommHost_Parameter(Parameter element) {
        this.element = element;
    }

    public Parameter getElement() {
        return this.element;
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Parameter_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_ISSCHED, value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Parameter_schSlack", this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_PARAMETER_SACOMMHOST_PARAMETER_SCHSLACK, value);
    }

}
