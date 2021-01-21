package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("618a898a-4c54-4df3-8f1c-aa045aaaf149")
public class HwBranchPredictor_Attribute extends Resource_Attribute {
    @objid ("62b61c20-98ab-4579-9bca-7afac1fb585d")
    public HwBranchPredictor_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Attribute"));
    }

    @objid ("f06765c7-7c88-4a0f-a402-716ec9652ac2")
    public HwBranchPredictor_Attribute(Attribute element) {
        super(element);
    }

}
