package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwISA_Parameter {
    protected Parameter element;

    public HwISA_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWISA_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwISA_Parameter"));
    }

    public HwISA_Parameter(Parameter element) {
        this.element = element;
    }

    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getfamily() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, this.element);
    }

    public void setfamily(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_FAMILY, value);
    }

    public String getinst_Width() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, this.element);
    }

    public void setinst_Width(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_INST_WIDTH, value);
    }

    public String gettype() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_TYPE, this.element);
    }

    public void settype(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWISA_PARAMETER_HWISA_PARAMETER_TYPE, value);
    }

    public Parameter getElement() {
        return this.element;
    }

}
