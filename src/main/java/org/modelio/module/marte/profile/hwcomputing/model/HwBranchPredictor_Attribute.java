package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Attribute;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBranchPredictor_Attribute extends Resource_Attribute {
    public HwBranchPredictor_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRANCHPREDICTOR_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwBranchPredictor_Attribute"));
    }

    public HwBranchPredictor_Attribute(Attribute element) {
        super(element);
    }

}
