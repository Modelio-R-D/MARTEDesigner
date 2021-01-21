package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("475f8866-7ce2-4664-86c5-422a71df38a6")
public class FlowSpecification_Interface {
    @objid ("27b0877d-1839-446e-ba8c-e866c25bd8ea")
    protected Interface element;

    @objid ("0fee6ea7-a14c-4e7a-9a5e-214f8a7d8e9b")
    public FlowSpecification_Interface() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInterface();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.FLOWSPECIFICATION_INTERFACE);
        this.element.setName(MARTEResourceManager.getName("FlowSpecification_Interface"));
    }

    @objid ("042bbad2-0252-4dc4-99de-06dde95d2149")
    public FlowSpecification_Interface(Interface element) {
        this.element = element;
    }

    @objid ("302d3d20-6c5e-4a11-9eb0-0f2f71f0352a")
    public Interface getElement() {
        return this.element;
    }

    @objid ("9ee9e434-b9a0-4af3-b888-5cf8f99fbf9b")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("18dcb884-d3c2-4eeb-885f-9913f47ad1aa")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
