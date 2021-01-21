package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("28e94757-75a5-412f-bb3d-ee3e277bcde7")
public class SwCommunicationResource_Node extends CommunicationMedia_Node {
    @objid ("a5128690-a7b1-45c0-abba-1b6e87ba9aeb")
    public SwCommunicationResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("c5a413b8-7e90-4542-90f0-f3bbd82f0daa")
    public SwCommunicationResource_Node(Node element) {
        super(element);
    }

    @objid ("fccc7138-91a3-4ca9-99b9-bab84f8d8766")
    public enum QueuePolicyKind {
        FIFO,
        LIFO,
        Priority,
        Undef,
        Other;
    }

}
