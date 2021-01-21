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

@objid ("e5ab9e6f-fed5-488a-a179-d799e6ed9d8f")
public class SaSharedResource_Attribute {
    @objid ("ffcdd92c-cdb4-481e-b9a4-3d8051d8189d")
    protected Attribute element;

    @objid ("0c82c566-3448-4a49-a575-38b02b03c82d")
    public SaSharedResource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE));
    }

    @objid ("4f12d825-876e-4186-aabb-2ce6ad7a6e3f")
    public SaSharedResource_Attribute(Attribute element) {
        this.element = element;
    }

    @objid ("cd1a9da7-ba98-4619-b3cf-a8f48cd1cc18")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("0e8b4acc-6b48-43de-a82a-0633d245a418")
    public void setParent(AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("cb12e4aa-7f2a-490b-befd-cb59b053c313")
    public void setParent(Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("e21836e3-87c6-4387-a1c6-b31606deebbd")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("580a280d-f94b-4af6-9707-9450233fd6ed")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_capacity", this.element);
    }

    @objid ("1118c5c0-8475-4f01-86c7-fbee8406be91")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_CAPACITY, value);
    }

    @objid ("61fa55ce-931d-43fc-969d-b704ba2aa819")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Attribute_isPreemp", this.element);
    }

    @objid ("4fa391d2-035f-4c2f-9003-3bf60fc01516")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP,value);
    }

    @objid ("6a4148f0-2a16-4042-bd35-c9db44d0b666")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Attribute_isConsum", this.element);
    }

    @objid ("d1ff606b-3901-4dad-afeb-8f68ada4d7e6")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM,value);
    }

    @objid ("c71a0b87-0ca5-4022-b788-259b1a98a792")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_acquisT", this.element);
    }

    @objid ("3fe75779-a728-4fb2-a3c4-f37cf347c7bd")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ACQUIST, value);
    }

    @objid ("5bba0bc1-b197-47e0-95be-cd209b0d39d6")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_releaseT", this.element);
    }

    @objid ("5770f596-a20e-4150-8bdf-6299480a4515")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_RELEASET, value);
    }

}
