package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwgeneral.model.HwResource_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6e031068-9039-42c4-b6e8-f74996aeb334")
public class HwBranchPredictor_BindableInstance extends HwResource_BindableInstance {
    @objid ("d7fd422e-471a-4e81-a3aa-38f056300c71")
    public HwBranchPredictor_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_BindableInstance"));
    }

    @objid ("a624df56-0d18-4998-9475-3c79272f4e23")
    public HwBranchPredictor_BindableInstance(BindableInstance element) {
        super(element);
    }

}
