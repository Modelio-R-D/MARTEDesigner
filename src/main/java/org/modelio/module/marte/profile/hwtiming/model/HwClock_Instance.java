package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwClock_Instance extends HwTimingResource_Instance {
    public HwClock_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwClock_Instance"));
    }

    public HwClock_Instance(Instance element) {
        super(element);
    }

    public String getHwClock_Instance_frenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, this.element);
    }

    public void setHwClock_Instance_frenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, value);
    }

}
