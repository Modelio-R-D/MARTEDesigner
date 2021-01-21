package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("78bb3015-d16c-403f-a8ce-491fee5d6b36")
public class Alarm_Class extends InterruptResource_Class {
    @objid ("907ca571-b9d5-4390-864a-37bfde52a107")
    public Alarm_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.ALARM_CLASSIFIER));
    }

    @objid ("e398d611-da9c-45a3-86f2-cc5c2f388660")
    public Alarm_Class(Class element) {
        super(element);
    }

    @objid ("a06e219c-f0bb-4395-9093-6b18225492b5")
    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG, this.element);
    }

    @objid ("a4565d44-6744-41df-b306-4bbee5f1b913")
    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_ISWATCHDOG,value);
    }

    @objid ("6e200e55-b454-41cc-8219-4e14669544fe")
    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, this.element);
    }

    @objid ("4559619b-cd27-40c7-b6f2-ecdb5303e8e2")
    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_CLASSIFIER_ALARM_CLASSIFIER_TIMERS, value);
    }

}
