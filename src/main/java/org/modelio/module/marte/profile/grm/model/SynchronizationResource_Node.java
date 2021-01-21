package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1933a1a7-434d-418c-a78a-f987a96c1345")
public class SynchronizationResource_Node extends Resource_Node {
    @objid ("53abc5dd-32c1-4a08-9c42-a79acc281e92")
    public SynchronizationResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SYNCHRONIZATIONRESOURCE_CLASSIFIER));
    }

    @objid ("95db96d0-1086-42a3-8d0f-222f08ab4eb3")
    public SynchronizationResource_Node(final Node element) {
        super(element);
    }

}
