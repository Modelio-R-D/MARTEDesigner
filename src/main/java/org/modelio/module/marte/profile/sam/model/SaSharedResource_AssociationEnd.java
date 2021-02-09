package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSharedResource_AssociationEnd {
    protected AssociationEnd element;

    public SaSharedResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND));
    }

    public SaSharedResource_AssociationEnd(AssociationEnd element) {
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

    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_capacity", this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY, value);
    }

    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_AssociationEnd_isPreemp", this.element);
    }

    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP,value);
    }

    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_AssociationEnd_isConsum", this.element);
    }

    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM,value);
    }

    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_acquisT", this.element);
    }

    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST, value);
    }

    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_releaseT", this.element);
    }

    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET, value);
    }

}
