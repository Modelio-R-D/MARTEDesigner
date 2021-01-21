package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b71c30f5-0c8e-4026-950f-0080f3f45c25")
public class ComputingResource_Node extends ProcessingResource_Node {
    @objid ("ba530920-3951-4daf-a810-18d91cc87660")
    public ComputingResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.COMPUTINGRESOURCE_CLASSIFIER));
    }

    @objid ("63e76f5b-e868-4685-9d04-952f58803b15")
    public ComputingResource_Node(final Node element) {
        super(element);
    }

}
