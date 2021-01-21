package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fc7ca0fc-ed07-4fd0-922d-76c4746b0808")
public class HwTimer_Class extends HwTimingResource_Class {
    @objid ("4cdfe099-a29e-43a2-a8ac-85b1ea49932a")
    public HwTimer_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMER_CLASSIFIER));
    }

    @objid ("3b0cd8e6-abf8-4d72-9034-e0199bd1c8b2")
    public HwTimer_Class(Class element) {
        super(element);
    }

    @objid ("20b9298c-4dec-4fae-8e25-892979d5ff95")
    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, this.element);
    }

    @objid ("c32e49cb-b5ed-4156-b680-d4849c13dfe8")
    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, value);
    }

    @objid ("0f4cc721-f1a3-4f88-863d-2aef1672ab30")
    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, this.element);
    }

    @objid ("b3250dae-ba2a-42f5-bfec-b647eb790eb9")
    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, value);
    }

    @objid ("31c33ce4-504d-41eb-afbe-f3dc42d8f82c")
    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, this.element);
    }

    @objid ("ac9d905c-246e-4dd0-bf4b-5256a3d0e8f4")
    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, value);
    }

}
