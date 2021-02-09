package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MutualExclusionResource_Link {
    protected Link element;

    public MutualExclusionResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Link"));
    }

    public MutualExclusionResource_Link(final Link element) {
        this.element = element;
    }

    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND, this.element);
    }

    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_PROTECTKIND, value);
    }

    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_CEILING, this.element);
    }

    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_CEILING, value);
    }

    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL, this.element);
    }

    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_OTHERPROTECTPROTOCOL, value);
    }

    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER, this.element);
    }

    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_LINK_MUTUALEXCLUSIONRESOURCE_LINK_SCHEDULER, value);
    }

}
