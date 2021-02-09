package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwClock_Class extends HwTimingResource_Class {
    public HwClock_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER));
    }

    public HwClock_Class(Class element) {
        super(element);
    }

    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, this.element);
    }

    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, value);
    }

}
