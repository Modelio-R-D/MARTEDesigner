package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwAccessService_Collaboration {
    protected Collaboration element;

    public SwAccessService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWACCESSSERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("SwAccessService_Collaboration"));
    }

    public SwAccessService_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public boolean isisModifier() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER, this.element);
    }

    public void isisModifier(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ISMODIFIER,value);
    }

    public String getaccessedElement() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, this.element);
    }

    public void setaccessedElement(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWACCESSSERVICE_COLLABORATION_SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT, value);
    }

    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
