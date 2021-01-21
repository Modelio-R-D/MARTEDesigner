package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("cc54e461-20ff-44f4-880d-92c5f9c4da5b")
public class SaSharedResource_Parameter {
    @objid ("a450e22b-3f5c-4095-ad99-eeba149a37e3")
    protected Parameter element;

    @objid ("ce04a067-6b4e-46f3-ab7a-1f6916954a77")
    public SaSharedResource_Parameter() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASHAREDRESOURCE_PARAMETER));
    }

    @objid ("68bde2ef-9b3a-4e1f-a0f2-a5a720d7d6a8")
    public SaSharedResource_Parameter(Parameter element) {
        this.element = element;
    }

    @objid ("cf009c70-ffc7-4b4a-8295-72e09490825a")
    public Parameter getElement() {
        return this.element;
    }

    @objid ("48360faf-62e9-4c2c-b087-fa3222a035dd")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("8e66db12-4f5a-4058-834a-b70046258735")
    public String getcapacity() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_capacity", this.element);
    }

    @objid ("2d453f30-51c8-4d7d-b501-624ce33a4f3b")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_CAPACITY, value);
    }

    @objid ("4ae3f228-2578-4caf-b0ef-f00382856523")
    public boolean isisPreemp() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Parameter_isPreemp", this.element);
    }

    @objid ("716fcc07-01fb-4e7b-8a43-dc1fe1bbe4f0")
    public void isisPreemp(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ISPREEMP, value);
    }

    @objid ("ab33e0fd-52c6-4a73-8fbf-709c346a59d9")
    public boolean isisConsum() {
        return ModelUtils.hasTaggedValue("SaSharedResource_Parameter_isConsum", this.element);
    }

    @objid ("bb01d4c0-a512-45f4-b14c-b0d04f69ba0b")
    public void isisConsum(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ISCONSUM, value);
    }

    @objid ("b45b2c28-f586-4285-b06a-9a8809562d53")
    public String getacquisT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_acquisT", this.element);
    }

    @objid ("fc886059-f54b-4329-9e21-051cfda58f8d")
    public void setacquisT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_ACQUIST, value);
    }

    @objid ("e51d3daa-33ad-410b-bde3-33b1800b879b")
    public String getreleaseT() {
        return ModelUtils.getTaggedValue("SaSharedResource_Parameter_releaseT", this.element);
    }

    @objid ("356cc0fb-36e8-4b7b-bb45-950de400e502")
    public void setreleaseT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASHAREDRESOURCE_PARAMETER_SASHAREDRESOURCE_PARAMETER_RELEASET, value);
    }

}
