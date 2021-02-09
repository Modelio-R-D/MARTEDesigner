package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class FlowSpecification_Interface {
    protected Interface element;

    public FlowSpecification_Interface() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInterface();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWSPECIFICATION_INTERFACE);
        this.element.setName(MARTEResourceManager.getName("FlowSpecification_Interface"));
    }

    public FlowSpecification_Interface(Interface element) {
        this.element = element;
    }

    public Interface getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
