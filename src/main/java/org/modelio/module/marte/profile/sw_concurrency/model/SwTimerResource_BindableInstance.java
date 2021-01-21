package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fab9c466-6a07-420d-8c5c-532849c5e038")
public class SwTimerResource_BindableInstance extends TimerResource_BindableInstance {
    @objid ("6cb6b32f-5ba2-4f68-8e42-90b658381b81")
    public SwTimerResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWTIMERRESOURCE_INSTANCE);
        element.setName(MARTEResourceManager.getName("SwTimerResource_BindableInstance"));
    }

    @objid ("d21ffdb1-419a-460b-a6c5-5c0dd399b115")
    public SwTimerResource_BindableInstance(BindableInstance element) {
        super(element);
    }

}
