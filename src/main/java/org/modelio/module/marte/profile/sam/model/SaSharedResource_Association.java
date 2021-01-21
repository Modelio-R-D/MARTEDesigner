package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4f857faf-9510-442e-a29f-f7759b36d78a")
public class SaSharedResource_Association {
    @objid ("c3ba921f-9966-4bf8-a2c1-f3eb81587c94")
    protected Association element;

    @objid ("3378fe5b-52aa-4bb6-b073-0cc43f12908f")
    public SaSharedResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATION));
    }

    @objid ("b2abc3ce-a6ce-44ef-af20-8d2b5725a2c3")
    public SaSharedResource_Association(Association element) {
        this.element = element;
    }

    @objid ("e110ea6a-0d82-48ac-926c-4720e0cef039")
    public void setParent(TemplateParameter source, AssociationEnd destination) {
        this.element.setOwnerTemplateParameter(source);
    }

    @objid ("9224fd68-d415-4700-9a34-9bb7e050b50e")
    public Association getElement() {
        return this.element;
    }

    @objid ("2a7f3792-c359-4023-8a1e-b5ee7ca76bd9")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_capacity", this.element);
    }

    @objid ("311c406d-0430-4b6b-b20e-90d8ff7bdb69")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_CAPACITY, value);
    }

    @objid ("d7fccbc7-8a72-475f-816e-a41ed7a26bb2")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Association_isPreemp", this.element);
    }

    @objid ("8580e490-c697-4e7a-aeb0-77af84cde793")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISPREEMP,value);
    }

    @objid ("e66ac51f-f93c-4c91-84cf-35ee10f9dbb1")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Association_isConsum", this.element);
    }

    @objid ("b79d1660-5df5-46ab-88af-8faa36b6294c")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ISCONSUM,value);
    }

    @objid ("e6863b3d-286e-4bef-81a7-792467dd2a3d")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_acquisT", this.element);
    }

    @objid ("e7bbd3c3-a171-4a1f-a7b8-aa192f5a50b6")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_ACQUIST, value);
    }

    @objid ("7f8801a3-9732-474d-96ec-60ba8fd6bb56")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Association_releaseT", this.element);
    }

    @objid ("2b5bc074-df1b-4be8-ad07-d1e8f2a0344e")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATION_SASHAREDRESOURCE_ASSOCIATION_RELEASET, value);
    }

}
