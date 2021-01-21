package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9dba8928-b866-4b3b-9db1-6ed7f0c87e8b")
public class HwASIC_Node extends HwComputingResource_Node {
    @objid ("219231d4-47da-4a59-9b1c-c5490f40da2e")
    public HwASIC_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWASIC_CLASSIFIER));
    }

    @objid ("72eedcef-631e-45c5-9376-b24077552d32")
    public HwASIC_Node(Node element) {
        super(element);
    }

}
