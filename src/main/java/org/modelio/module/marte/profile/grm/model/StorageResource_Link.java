package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2ff10736-fcf1-4a21-8f9b-24a1564b8ae5")
public class StorageResource_Link {
    @objid ("a023509c-125a-49d7-904b-461dc10e205e")
    protected Link element;

    @objid ("95371fb2-1b61-4314-9d10-87863049c7e2")
    public StorageResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.STORAGERESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("StorageResource_Link"));
    }

    @objid ("485157c0-f222-455d-95b8-af42c7b8f855")
    public StorageResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("aafe6097-9162-4b43-ae65-771d56b4a901")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("473d4286-9559-4265-9dad-3b6204b0ad54")
    public Link getElement() {
        return this.element;
    }

    @objid ("6ad18aab-4900-4854-a55f-6f6a1dc7e84a")
    public String getelementSize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.STORAGERESOURCE_LINK_STORAGERESOURCE_LINK_ELEMENTSIZE, this.element);
    }

    @objid ("323e5bd7-d6f8-4825-b664-38b0c6813bfe")
    public void setelementSize(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.STORAGERESOURCE_LINK_STORAGERESOURCE_LINK_ELEMENTSIZE, value);
    }

}
