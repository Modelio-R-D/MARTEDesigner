package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3580de2c-3cea-407d-add6-58860c79a0a6")
public class HwTimer_Instance extends HwTimingResource_Instance {
    @objid ("7025b001-69df-43c9-8629-bf5c3bd27584")
    public HwTimer_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimer_Instance"));
    }

    @objid ("fda37509-6acf-44d6-aefb-021bb560b8ae")
    public HwTimer_Instance(Instance element) {
        super(element);
    }

    @objid ("de654bb1-b5ec-4203-bcea-07e46ab0a294")
    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, this.element);
    }

    @objid ("45b59a90-a8d5-4da1-84f2-12f45fc3b11c")
    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, value);
    }

    @objid ("1d2cd36b-5e10-4149-892d-bf71fe0e6699")
    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, this.element);
    }

    @objid ("49058b2c-1772-436f-b443-d9d442057fe8")
    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, value);
    }

    @objid ("44ea63a8-b86f-46af-8454-df1946181581")
    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, this.element);
    }

    @objid ("69ab56f2-0585-43bc-8ba4-0fe9901eb33b")
    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, value);
    }

}
