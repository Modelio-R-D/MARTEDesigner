package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a4b72d8c-26e3-49a2-89da-395ba1afb969")
public class Shaped_AssociationEnd {
    @objid ("6ba7528a-b14b-4430-93ce-8fc86779ba54")
    protected AssociationEnd element;

    @objid ("a9e028d5-5a96-447f-bbb6-d4b7d7e7eea1")
    public Shaped_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,"Shaped_AssociationEnd");
        this.element.setName(MARTEResourceManager.getName("Shaped_AssociationEnd"));
    }

    @objid ("b6490215-b8cf-47fe-a63a-3fc58acd3e53")
    public Shaped_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("8fb25e41-9eed-4e64-89ea-7e2c5924e879")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("95e1358a-1b99-4d5b-a523-f0055bfa00d9")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("8a8823db-4e4d-419a-bef0-89a15c5892d4")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("c1712c3f-ad03-49d7-a6c2-80be6eba0a8b")
    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_AssociationEnd_shape", this.element);
    }

    @objid ("cb8964b1-b698-4b23-bd10-90e586c92235")
    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_AssociationEnd_shape", value);
    }

}
