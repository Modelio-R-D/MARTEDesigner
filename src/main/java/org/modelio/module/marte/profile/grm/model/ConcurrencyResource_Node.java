package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a18007bc-b9aa-4bbf-9301-2971fc878e05")
public class ConcurrencyResource_Node extends SchedulableResource_Node {
    @objid ("a16a265c-1fc9-46ea-9c71-6655a81fa159")
    public ConcurrencyResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.CONCURRENCYRESOURCE_CLASSIFIER));
    }

    @objid ("772531f1-1e96-41c0-bfcf-5019c20dc9c5")
    public ConcurrencyResource_Node(final Node element) {
        super(element);
    }

}
