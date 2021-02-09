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

public class SaSharedResource_Attribute {
    protected Attribute element;

    public SaSharedResource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ATTRIBUTE));
    }

    public SaSharedResource_Attribute(Attribute element) {
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

    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_capacity", this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_CAPACITY, value);
    }

    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Attribute_isPreemp", this.element);
    }

    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP,value);
    }

    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Attribute_isConsum", this.element);
    }

    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM,value);
    }

    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_acquisT", this.element);
    }

    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_ACQUIST, value);
    }

    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Attribute_releaseT", this.element);
    }

    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ATTRIBUTE_SASHAREDRESOURCE_ATTRIBUTE_RELEASET, value);
    }

}
