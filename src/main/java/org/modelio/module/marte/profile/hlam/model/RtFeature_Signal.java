package org.modelio.module.marte.profile.hlam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("469ea158-4684-4501-9b4b-521a7e09aa43")
public class RtFeature_Signal {
    @objid ("3bb007f9-ba17-4674-adf5-47b690f3e4a5")
    protected Signal element;

    @objid ("88519a0e-f434-43e4-9a91-48e154bbeae6")
    public RtFeature_Signal() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createSignal();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_SIGNAL);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Signal"));
    }

    @objid ("003f7062-d5b6-4ad4-9837-438ac14d11ec")
    public RtFeature_Signal(Signal element) {
        this.element = element;
    }

    @objid ("6573568f-eaca-4b58-a3df-2a46961cbf64")
    public Signal getElement() {
        return this.element;
    }

    @objid ("e5de3881-70db-4393-b254-3b693e3640b0")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("7e77ce7d-43c8-49b5-83ec-8944b886881f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
