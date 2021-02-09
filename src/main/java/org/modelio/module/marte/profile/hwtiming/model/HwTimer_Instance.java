package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwTimer_Instance extends HwTimingResource_Instance {
    public HwTimer_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimer_Instance"));
    }

    public HwTimer_Instance(Instance element) {
        super(element);
    }

    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, this.element);
    }

    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, value);
    }

    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, this.element);
    }

    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, value);
    }

    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, this.element);
    }

    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, value);
    }

}
