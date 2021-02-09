package org.modelio.module.marte.profile.rsm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Shaped_AssociationEnd {
    protected AssociationEnd element;

    public Shaped_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,"Shaped_AssociationEnd");
        this.element.setName(MARTEResourceManager.getName("Shaped_AssociationEnd"));
    }

    public Shaped_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    public AssociationEnd getElement() {
        return this.element;
    }

    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_AssociationEnd_shape", this.element);
    }

    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_AssociationEnd_shape", value);
    }

}
