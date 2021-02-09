package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Resource_Lifeline {
    protected Lifeline element;

    public Resource_Lifeline() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RESOURCE_LIFELINE);
        this.element.setName(MARTEResourceManager.getName("Resource_Lifeline"));
    }

    public Resource_Lifeline(final Lifeline element) {
        this.element = element;
    }

    public Lifeline getElement() {
        return this.element;
    }

    public void setParent(final Interaction parent) {
        this.element.setOwner(parent);
    }

    public void setParent(final TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getresMult() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, this.element);
    }

    public void setresMult(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_RESMULT, value);
    }

    public boolean isisProtected() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, this.element);
    }

    public void isisProtected(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISPROTECTED, value);
    }

    public boolean isisActive() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, this.element);
    }

    public void isisActive(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_LIFELINE_RESOURCE_LIFELINE_ISACTIVE, value);
    }

}
