package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwASIC_BindableInstance extends HwComputingResource_BindableInstance {
    public HwASIC_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwASIC_BindableInstance"));
    }

    public HwASIC_BindableInstance(BindableInstance element) {
        super(element);
    }

}
