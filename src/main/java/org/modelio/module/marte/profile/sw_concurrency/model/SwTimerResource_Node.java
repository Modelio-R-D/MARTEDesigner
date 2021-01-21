package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7c29a46d-0117-43d7-9dd4-4b36060a4939")
public class SwTimerResource_Node extends TimerResource_Node {
    @objid ("5cf56c52-e8b1-4d29-ad47-802ca29c7648")
    public SwTimerResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER);
        element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER));
    }

    @objid ("edda9d2a-46ef-4706-bd2e-0e82d1d06d61")
    public SwTimerResource_Node(Node element) {
        super(element);
    }

}
