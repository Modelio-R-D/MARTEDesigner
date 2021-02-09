package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Alarm_Class extends InterruptResource_Class {
    public Alarm_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.ALARM_CLASSIFIER));
    }

    public Alarm_Class(Class element) {
        super(element);
    }

    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG, this.element);
    }

    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG,value);
    }

    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, this.element);
    }

    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, value);
    }

}
