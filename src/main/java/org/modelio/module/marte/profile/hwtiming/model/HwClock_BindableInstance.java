package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwClock_BindableInstance extends HwTimingResource_BindableInstance {
    public HwClock_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwClock_BindableInstance"));
    }

    public HwClock_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, this.element);
    }

    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, value);
    }

}
