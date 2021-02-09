package org.modelio.module.marte.profile.grm.model;

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

public class GrService_Collaboration {
    protected Collaboration element;

    public GrService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("GrService_Collaboration"));
    }

    public GrService_Collaboration(final Collaboration element) {
        this.element = element;
    }

    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, this.element);
    }

    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, value);
    }

    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
