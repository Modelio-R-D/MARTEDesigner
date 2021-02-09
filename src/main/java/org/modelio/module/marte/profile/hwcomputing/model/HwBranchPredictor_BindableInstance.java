package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBranchPredictor_BindableInstance extends HwResource_BindableInstance {
    public HwBranchPredictor_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_BindableInstance"));
    }

    public HwBranchPredictor_BindableInstance(BindableInstance element) {
        super(element);
    }

}
