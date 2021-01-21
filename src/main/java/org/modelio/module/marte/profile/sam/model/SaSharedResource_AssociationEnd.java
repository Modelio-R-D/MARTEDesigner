package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1069ff17-5fc3-4c4d-a469-0e27982718ef")
public class SaSharedResource_AssociationEnd {
    @objid ("d90e0016-f606-411d-bcf2-44fee6c9d294")
    protected AssociationEnd element;

    @objid ("fa86f965-e3c5-4137-9926-b3fa4a7a2b1a")
    public SaSharedResource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_ASSOCIATIONEND));
    }

    @objid ("c48d19bd-7c70-45fd-af15-d41d877a388b")
    public SaSharedResource_AssociationEnd(AssociationEnd element) {
        this.element = element;
    }

    @objid ("c9221fe2-414b-409f-84c7-747b7c270150")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("5b914f4c-4731-4964-86dd-cb95097422ab")
    public void setParent(Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("6668809a-7eb1-47a4-8a79-7c1c090f5e42")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("4029ebf8-0fe0-460c-876e-f21b420eed9a")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_capacity", this.element);
    }

    @objid ("b62ac74b-d07a-4b6c-98d9-a4295a6d6026")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY, value);
    }

    @objid ("e91074f9-1da8-4694-9e79-a2728a247a1d")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_AssociationEnd_isPreemp", this.element);
    }

    @objid ("fcc241c1-dd47-4c81-8523-898896fc21e4")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP,value);
    }

    @objid ("93aa1c71-8aac-4660-bb27-54309c344da0")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_AssociationEnd_isConsum", this.element);
    }

    @objid ("0bc33292-5956-46ae-8b7c-4f6fbbcf91c9")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM,value);
    }

    @objid ("e60b455f-4a2c-4699-bb48-a2d9960cd623")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_acquisT", this.element);
    }

    @objid ("0e4bde0c-d8a3-4e40-bcf0-05c1dbd91dc6")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST, value);
    }

    @objid ("e2f3953e-a702-44d4-9943-925fe3dd2b3c")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_AssociationEnd_releaseT", this.element);
    }

    @objid ("688f9ac6-345f-4dd4-be19-6850f2d01c54")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_ASSOCIATIONEND_SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET, value);
    }

}
