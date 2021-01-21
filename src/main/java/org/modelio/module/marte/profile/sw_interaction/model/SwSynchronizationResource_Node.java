package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.SynchronizationResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4e00669f-4548-4e7b-8115-355d77ed4d5e")
public class SwSynchronizationResource_Node extends SynchronizationResource_Node {
    @objid ("9f73d020-a3be-4681-b15a-551454b06c7e")
    public SwSynchronizationResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWSYNCHRONIZATIONRESOURCE_CLASSIFIER));
    }

    @objid ("d7cd66d2-dfea-40de-aa12-e7c86b47cec3")
    public SwSynchronizationResource_Node(Node element) {
        super(element);
    }

    @objid ("0782936c-9814-4829-9a10-d30e10d8d9d1")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
