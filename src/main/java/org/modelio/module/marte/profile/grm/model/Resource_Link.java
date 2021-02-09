package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Resource_Link {
    protected Link element;

    public Resource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("Resource_Link"));
    }

    public Resource_Link(final Link element) {
        this.element = element;
    }

    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, this.element);
    }

    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_RESMULT, value);
    }

    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED, this.element);
    }

    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISPROTECTED,value);
    }

    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE, this.element);
    }

    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LINK_RESOURCE_LINK_ISACTIVE,value);
    }

}
