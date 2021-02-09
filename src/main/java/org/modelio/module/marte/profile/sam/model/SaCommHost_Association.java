package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaCommHost_Association {
    protected Association element;

    public SaCommHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_ASSOCIATION));
    }

    public SaCommHost_Association(Association element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    public Association getElement() {
        return this.element;
    }

    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Association_isSched", this.element);
    }

    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_ISSCHED, value);
    }

    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Association_schSlack", this.element);
    }

    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ASSOCIATION_SACOMMHOST_ASSOCIATION_SCHSLACK, value);
    }

}
