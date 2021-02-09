package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Alarm_Node extends InterruptResource_Node {
    public Alarm_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.ALARM_CLASSIFIER));
    }

    public Alarm_Node(Node element) {
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
