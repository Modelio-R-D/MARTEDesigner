package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCoolingSupply_BindableInstance extends HwComponent_BindableInstance {
    public HwCoolingSupply_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCoolingSupply_BindableInstance"));
    }

    public HwCoolingSupply_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, this.element);
    }

    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, value);
    }

}
