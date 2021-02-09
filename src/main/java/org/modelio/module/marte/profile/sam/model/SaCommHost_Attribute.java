package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaCommHost_Attribute {
    protected Attribute element;

    public SaCommHost_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_ATTRIBUTE));
    }

    public SaCommHost_Attribute(Attribute element) {
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

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Attribute_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_ISSCHED, value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Attribute_schSlack", this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_SCHSLACK, value);
    }

}
