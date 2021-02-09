package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Shaped_Parameter {
    protected Parameter element;

    public Shaped_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,"Shaped_Parameter");
        this.element.setName(MARTEResourceManager.getName("Shaped_Parameter"));
    }

    public Shaped_Parameter(Parameter element) {
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

    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_Parameter_shape", this.element);
    }

    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_Parameter_shape", value);
    }

}
