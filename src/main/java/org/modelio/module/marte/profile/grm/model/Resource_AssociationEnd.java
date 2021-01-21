package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("aa61450a-ea79-45f0-a742-ea017b2fb91e")
public class Resource_AssociationEnd {
    @objid ("786e7873-93d6-45a7-bc84-1e612c922182")
    protected AssociationEnd element;

    @objid ("74873441-a054-466d-9025-e7465c1a90ea")
    public Resource_AssociationEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("Resource_AssociationEnd"));
    }

    @objid ("a43641ef-8dbd-4304-ae66-c7c23bcc503e")
    public Resource_AssociationEnd(final AssociationEnd element) {
        this.element = element;
    }

    @objid ("ebb173f7-76ad-4940-ae15-e49e1174c77c")
    public AssociationEnd getElement() {
        return this.element;
    }

    @objid ("851cf3fc-cb34-47fd-ac36-7a5a36459e42")
    public void setParent(final Classifier parent) {
        this.element.setSource(parent);
    }

    @objid ("0b44a0a3-c187-4ae1-aafb-efd4d998f1c3")
    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("f0dd1b2c-3286-47cf-81db-3562f26017a6")
    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_RESMULT, this.element);
    }

    @objid ("b8cc6ada-548a-4121-961a-0f57a0c89302")
    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_RESMULT, value);
    }

    @objid ("196d9f60-2045-42c5-b2ae-33ec0865b1dd")
    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED, this.element);
    }

    @objid ("e130973e-c123-40d4-a184-1076e699d94a")
    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISPROTECTED,value);
    }

    @objid ("e6686f78-9cf8-45f7-b3eb-adb4734f02ff")
    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE, this.element);
    }

    @objid ("f14e6a52-1643-4425-ac35-d4dd4b30859f")
    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_ASSOCIATIONEND_RESOURCE_ASSOCIATIONEND_ISACTIVE,value);
    }

}
