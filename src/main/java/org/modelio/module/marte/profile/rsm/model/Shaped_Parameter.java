package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d6b19d7b-6a84-4be6-87b2-0dcb7ba93704")
public class Shaped_Parameter {
    @objid ("d8a517a1-1cd1-4185-9090-67c5004a9252")
    protected Parameter element;

    @objid ("def79510-94ac-4e48-b58f-789897641159")
    public Shaped_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,"Shaped_Parameter");
        this.element.setName(MARTEResourceManager.getName("Shaped_Parameter"));
    }

    @objid ("d56a26dc-5172-4275-a910-0be56ddf1f97")
    public Shaped_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("ddb1ee9d-ccc3-4e6c-abe3-895b3386a40e")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("5697d0cf-c07c-4319-84ba-e73ff9d9379f")
    public void setParent(Operation parent) {
        this.element.setComposed(parent);
    }

    @objid ("d5d4a953-58db-4014-b434-bfa2cc2c7bd1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("88ce1d19-eb6e-4982-9e43-6ccfd112a5c8")
    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_Parameter_shape", this.element);
    }

    @objid ("5977c1fc-2e31-4f65-a47b-17810be960ad")
    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_Parameter_shape", value);
    }

}
