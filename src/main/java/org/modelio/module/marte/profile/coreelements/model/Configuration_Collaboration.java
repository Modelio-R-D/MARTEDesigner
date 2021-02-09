package org.modelio.module.marte.profile.coreelements.model;

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

public class Configuration_Collaboration {
    protected Collaboration element;

    public Configuration_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("Configuration_Collaboration"));
    }

    public Configuration_Collaboration(Collaboration element) {
        this.element = element;
    }

    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    public Collaboration getElement() {
        return this.element;
    }

    public String getmode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE, this.element);
    }

    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE, value);
    }

    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

}
