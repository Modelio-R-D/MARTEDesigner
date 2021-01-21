package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("0a7ec803-ce1d-4f20-9f4c-87ac638627f3")
public class HwBranchPredictor_Instance extends HwResource_Instance {
    @objid ("97d684c4-96ac-4366-945b-db549b098ab5")
    public HwBranchPredictor_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Instance"));
    }

    @objid ("6e76a4ab-966c-413d-a997-18b2863099af")
    public HwBranchPredictor_Instance(Instance element) {
        super(element);
    }

}
