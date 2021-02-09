package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.TimerResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwTimerResource_Node extends TimerResource_Node {
    public SwTimerResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER);
        element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWTIMERRESOURCE_CLASSIFIER));
    }

    public SwTimerResource_Node(Node element) {
        super(element);
    }

}
