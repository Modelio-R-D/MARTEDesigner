package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c70707af-05e7-4e69-ada3-7ece8028ec64")
public class HwBranchPredictor_Node extends HwResource_Node {
    @objid ("86bf47b8-fa72-4650-a138-618ac6676633")
    public HwBranchPredictor_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWBRANCHPREDICTOR_CLASSIFIER));
    }

    @objid ("a094ae7c-da77-4186-a25e-052e1be54d16")
    public HwBranchPredictor_Node(Node element) {
        super(element);
    }

}
