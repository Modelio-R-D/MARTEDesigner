package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCoolingSupply_Instance extends HwComponent_Instance {
    public HwCoolingSupply_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCoolingSupply_Instance"));
    }

    public HwCoolingSupply_Instance(Instance element) {
        super(element);
    }

    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, this.element);
    }

    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, value);
    }

}
