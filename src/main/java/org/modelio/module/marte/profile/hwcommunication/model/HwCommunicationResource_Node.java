package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dcd60e0a-4e77-4402-80bd-6f7c02a96fdd")
public class HwCommunicationResource_Node extends HwResource_Node {
    @objid ("19425389-2d64-4d7a-8bb3-71f24a677880")
    public HwCommunicationResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_CLASSIFIER));
    }

    @objid ("1d42f739-0e76-483d-a181-3d1a91f7e64f")
    public HwCommunicationResource_Node(Node element) {
        super(element);
    }

}
