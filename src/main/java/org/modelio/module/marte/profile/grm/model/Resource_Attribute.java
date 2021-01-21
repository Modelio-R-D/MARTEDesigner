package org.modelio.module.marte.profile.grm.model;

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

@objid ("d6b8a586-a45a-405c-a771-6d565d37aec8")
public class Resource_Attribute {
    @objid ("16c210e8-c047-4b7d-85e6-5dfa9c184ddf")
    protected Attribute element;

    @objid ("251444f5-2c21-4b1c-a475-c40fbe1c6997")
    public Resource_Attribute() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("Resource_Attribute"));
    }

    @objid ("088a1c33-5eb6-4839-9f59-853dca46b316")
    public Resource_Attribute(final Attribute element) {
        this.element = element;
    }

    @objid ("49ba3161-35c0-4eb1-b08a-ce8aa786152b")
    public Attribute getElement() {
        return this.element;
    }

    @objid ("a9cbf350-72d2-4667-b0d8-c7f663de6a63")
    public void setParent(final AssociationEnd parent) {
        this.element.setQualified(parent);
    }

    @objid ("f15a9d20-d7c6-44c2-bed3-e9269c2338b6")
    public void setParent(final Classifier parent) {
        this.element.setOwner(parent);
    }

    @objid ("60f1ccfa-016e-4419-9d16-ddc56d7822f7")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("abd4b4c4-b26c-4271-9ea2-bdb0bb4a1634")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_RESMULT, this.element);
    }

    @objid ("28f96b3a-ff86-479c-b156-a553918aec2b")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_RESMULT, value);
    }

    @objid ("bdc12ece-04e0-4a8a-8dc1-003e2e9eea2e")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISPROTECTED, this.element);
    }

    @objid ("a0dfdc9a-0928-43bd-bc11-2dcf5cea5c0d")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISPROTECTED,value);
    }

    @objid ("8b80ace3-5a44-429c-8e82-4159078ccace")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISACTIVE, this.element);
    }

    @objid ("7f11d470-56e3-44a1-9652-321eae5f3481")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ATTRIBUTE_RESOURCE_ATTRIBUTE_ISACTIVE,value);
    }

}
