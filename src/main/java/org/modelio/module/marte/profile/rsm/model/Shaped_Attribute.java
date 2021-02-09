package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Shaped_Attribute {
    protected Attribute element;

    public Shaped_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,"Shaped_Attribute");
        this.element.setName(MARTEResourceManager.getName("Shaped_Attribute"));
    }

    public Shaped_Attribute(Attribute element) {
        this.element = element;
    }

    public Attribute getElement() {
        return this.element;
    }

    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_Attribute_shape", this.element);
    }

    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_Attribute_shape", value);
    }

}
