package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("722cf363-ef28-49e9-924b-0bd416ca224a")
public class HwArbiter_BindableInstance extends HwCommunicationResource_BindableInstance {
    @objid ("038864bf-03b9-4aa2-97bd-9acd608006a1")
    public HwArbiter_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_BindableInstance"));
    }

    @objid ("d5252d27-41f7-42a0-b051-6891a332b280")
    public HwArbiter_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("9997e43c-27fc-4d4b-97db-fb85c2e917f8")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("f7c78286-3b59-48bc-8ab8-bf25fab3bd4d")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS, value);
    }

}
