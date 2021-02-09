package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_Parameter extends HwComputingResource_Parameter {
    public HwASIC_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwASIC_Parameter"));
    }

    public HwASIC_Parameter(Parameter element) {
        super(element);
    }

}
