package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtFeature_Signal {
    protected Signal element;

    public RtFeature_Signal() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createSignal();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_SIGNAL);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Signal"));
    }

    public RtFeature_Signal(Signal element) {
        this.element = element;
    }

    public Signal getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
