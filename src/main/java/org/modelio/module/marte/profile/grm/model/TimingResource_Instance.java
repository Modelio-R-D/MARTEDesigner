package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("105a83ca-ff39-4b5f-9ff7-9e787cc6fa1c")
public class TimingResource_Instance extends Resource_Instance {
    @objid ("1abc62a6-d2a4-489f-a50f-8f0088ff3583")
    public TimingResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("TimingResource_Instance"));
    }

    @objid ("c3d9772c-8a6e-4287-b292-03b42071e099")
    public TimingResource_Instance(final Instance element) {
        super(element);
    }

}
