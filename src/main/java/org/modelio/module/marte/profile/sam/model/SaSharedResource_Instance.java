package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("06508f4e-3977-4f42-9be3-7e3b56c7b8d2")
public class SaSharedResource_Instance {
    @objid ("bbeb461a-2f33-4af0-af7f-7200d822f4c7")
    protected Instance element;

    @objid ("00dafb19-21c9-4e7e-936a-3bd19a245874")
    public SaSharedResource_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_INSTANCE));
    }

    @objid ("291c4212-ad41-4504-b516-a7f16f5dc75b")
    public SaSharedResource_Instance(Instance element) {
        this.element = element;
    }

    @objid ("7a805978-b735-45e3-a1c4-803b85740e1f")
    public Instance getElement() {
        return this.element;
    }

    @objid ("5ce66835-b7a6-4143-b250-160e867f2156")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("960928b1-175e-4a02-af42-b0b14755d6a6")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("3edaeebc-bf97-49ba-b9a2-72e5560e7a58")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_capacity", this.element);
    }

    @objid ("ebaa34aa-184f-4977-bd1b-ab84c623f718")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_CAPACITY, value);
    }

    @objid ("3cd8c40a-6c52-4d0b-ab33-08453fbc7cc1")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Instance_isPreemp", this.element);
    }

    @objid ("b90fe407-8d2f-4151-9b17-fbdb5351bad5")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISPREEMP,value);
    }

    @objid ("a9060797-d3cc-4732-9eb5-1c0b1c7f4e0a")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Instance_isConsum", this.element);
    }

    @objid ("b02c0e13-abd1-4189-a774-bc5224e692e5")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ISCONSUM, value);
    }

    @objid ("18fe823a-c14e-403c-b565-5742b67f78eb")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_acquisT", this.element);
    }

    @objid ("aa9f368e-dac7-49bd-8900-96f1b7f8dc53")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_ACQUIST, value);
    }

    @objid ("49fa6e00-895e-496b-a50b-33ebd0f0ae19")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Instance_releaseT", this.element);
    }

    @objid ("66922fad-01c2-45fe-bdf9-1f6a25c334cb")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_INSTANCE_SASHAREDRESOURCE_INSTANCE_RELEASET, value);
    }

}
