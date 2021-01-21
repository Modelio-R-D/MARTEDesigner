package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1022cfc3-0b2f-4910-a8ba-abc860dc2b8d")
public class Shaped_Attribute {
    @objid ("84a0ba80-7afc-4374-bdc2-8cb1281b3b51")
    protected Attribute element;

    @objid ("82ef37e7-1730-40b4-b246-6876a866166f")
    public Shaped_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,"Shaped_Attribute");
        this.element.setName(MARTEResourceManager.getName("Shaped_Attribute"));
    }

    @objid ("659ee95d-dcda-460b-a4ef-5bc9e30b4370")
    public Shaped_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("b9643909-25e2-4159-a46f-e8a58ba2b8e0")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("2be9d451-620b-420b-911c-3e4e5805bef8")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("c6f1d809-84c1-4922-a193-4fe4430d0abe")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("e17efd57-11d9-47f2-bd57-704fac25acee")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("69e9defb-eea9-4a58-863a-5e7c618b5c05")
    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_Attribute_shape", this.element);
    }

    @objid ("94811370-92f8-42d2-9c6b-abab3116edab")
    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_Attribute_shape", value);
    }

}
