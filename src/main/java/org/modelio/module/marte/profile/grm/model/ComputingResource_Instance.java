package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2e13b494-003a-45a4-bc1b-8c895edf888d")
public class ComputingResource_Instance extends ProcessingResource_Instance {
    @objid ("0fc65a5f-14df-4f85-965f-2b71bfeedc25")
    public ComputingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("ComputingResource_Instance"));
    }

    @objid ("a504fb6f-01cf-4010-bc2b-925e476e9c81")
    public ComputingResource_Instance(final Instance element) {
        super(element);
    }

}
