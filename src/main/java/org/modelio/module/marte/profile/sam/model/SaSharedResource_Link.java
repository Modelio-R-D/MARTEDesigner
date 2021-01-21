package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fb416601-7e8f-4805-9f1c-0776387885d2")
public class SaSharedResource_Link {
    @objid ("8c49f650-8390-492a-a5ee-92ca39290739")
    protected Link element;

    @objid ("e7d474b4-5979-4af3-b6d2-c07559e09a71")
    public SaSharedResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_LINK));
    }

    @objid ("2362e659-9a89-4e38-b528-3f45b3e68cff")
    public SaSharedResource_Link(Link element) {
        this.element = element;
    }

    @objid ("fdb20966-509a-4683-824a-8e483095374d")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("6a01b86f-5a8a-4964-8e05-68a5785d24d4")
    public Link getElement() {
        return this.element;
    }

    @objid ("3cc76802-148e-4994-b7d8-1342d7282242")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Link_capacity", this.element);
    }

    @objid ("07759b6d-79a9-4951-81d1-510aa195efd2")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_CAPACITY, value);
    }

    @objid ("5d780f7c-1f00-4585-8d3d-c903cbdf72e4")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Link_isPreemp", this.element);
    }

    @objid ("898d4942-8ace-44b3-b1fd-556501d71c3c")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISPREEMP, value);
    }

    @objid ("1210569e-8041-494a-9366-764500851e07")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Link_isConsum", this.element);
    }

    @objid ("c1bff463-bcf6-4005-8148-ffc1230f0a15")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ISCONSUM, value);
    }

    @objid ("6305138c-1a88-4897-bd47-25a9117a7c6b")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Link_acquisT", this.element);
    }

    @objid ("819027f3-5b6d-4811-98c4-c8f7721362b9")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_ACQUIST, value);
    }

    @objid ("448a1212-3842-49c3-983a-57390d320c9b")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Link_releaseT", this.element);
    }

    @objid ("34a85756-7875-42ef-9bde-d946024136cb")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_LINK_SASHAREDRESOURCE_LINK_RELEASET, value);
    }

}
