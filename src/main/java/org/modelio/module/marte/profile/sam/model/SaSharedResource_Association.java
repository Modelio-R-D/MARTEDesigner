package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSharedResource_Association {
    protected Association element;

    public SaSharedResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION));
    }

    public SaSharedResource_Association(Association element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    public Association getElement() {
        return this.element;
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_capacity", this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_CAPACITY, value);
    }

    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Association_isPreemp", this.element);
    }

    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISPREEMP,value);
    }

    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Association_isConsum", this.element);
    }

    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISCONSUM,value);
    }

    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_acquisT", this.element);
    }

    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ACQUIST, value);
    }

    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_releaseT", this.element);
    }

    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_RELEASET, value);
    }

}
