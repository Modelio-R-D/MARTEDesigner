package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("8d77505b-eac1-47fe-beb6-16aebd0135a4")
public class HwArbiter_Instance extends HwCommunicationResource_Instance {
    @objid ("dcb19e6d-490d-4c7e-8b43-d6c1fffaacc0")
    public HwArbiter_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWARBITER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwArbiter_Instance"));
    }

    @objid ("9163d577-8b32-45fa-ac72-510af2d2ca91")
    public HwArbiter_Instance(Instance element) {
        super(element);
    }

    @objid ("8603d86a-5bf3-4dd7-89e9-da998260cef8")
    public String getcontrolledMedias() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS, this.element);
    }

    @objid ("cf6762d6-94dc-4ebe-996a-183f47ec6e4b")
    public void setcontrolledMedias(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWARBITER_INSTANCE_HWARBITER_INSTANCE_CONTROLLEDMEDIAS, value);
    }

}
