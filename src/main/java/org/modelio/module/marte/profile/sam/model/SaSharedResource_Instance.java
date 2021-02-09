package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSharedResource_Instance {
    protected Instance element;

    public SaSharedResource_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE));
    }

    public SaSharedResource_Instance(Instance element) {
        this.element = element;
    }

    public Instance getElement() {
        return this.element;
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_capacity", this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_CAPACITY, value);
    }

    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Instance_isPreemp", this.element);
    }

    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISPREEMP,value);
    }

    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Instance_isConsum", this.element);
    }

    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISCONSUM, value);
    }

    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_acquisT", this.element);
    }

    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ACQUIST, value);
    }

    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_releaseT", this.element);
    }

    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_RELEASET, value);
    }

}
