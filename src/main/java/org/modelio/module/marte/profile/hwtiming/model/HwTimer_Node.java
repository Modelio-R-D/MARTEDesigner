package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwTimer_Node extends HwTimingResource_Node {
    public HwTimer_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWTIMER_CLASSIFIER));
    }

    public HwTimer_Node(Node element) {
        super(element);
    }

    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, this.element);
    }

    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_NBCOUNTERS, value);
    }

    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, this.element);
    }

    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_COUNTERWIDTH, value);
    }

    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, this.element);
    }

    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_CLASSIFIER_HWTIMER_CLASSIFIER_INPUTCLOCK, value);
    }

}
