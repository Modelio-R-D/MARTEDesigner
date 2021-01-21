package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("499d7634-6779-4384-84b5-290decbbb676")
public class SaCommHost_Attribute {
    @objid ("0608a6cd-7ea4-426a-bc37-08de2c4479ca")
    protected Attribute element;

    @objid ("8d3feef0-d36c-4a80-95a7-723ff085fd2d")
    public SaCommHost_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_ATTRIBUTE));
    }

    @objid ("2086e420-aefd-4430-8b8f-4ea98229eab0")
    public SaCommHost_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("124b5df1-9e37-4fe7-b8ac-b0a164348ed2")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("b76ec2b0-3db2-4ef1-9451-c32ae9fcdccc")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("dd5ab786-c3c1-4e7d-a72d-ac9cbca1b574")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("9128288e-ccd6-4a0f-952b-b77b3f7efabc")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("0c66fd94-785c-4a58-9134-ff1f7bc87616")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Attribute_isSched", this.element);
    }

    @objid ("271f42fc-2c20-4fa6-ac5b-7936f18977e6")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_ISSCHED, value);
    }

    @objid ("ac9f8d14-08e2-4fda-90fc-b64fe9e110f2")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Attribute_schSlack", this.element);
    }

    @objid ("0d4005dd-90c3-44d9-a6f1-96d9b2b80175")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_ATTRIBUTE_SACOMMHOST_ATTRIBUTE_SCHSLACK, value);
    }

}
