package org.modelio.module.marte.profile.sw_concurrency.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Alarm_BindableInstance extends InterruptResource_BindableInstance {
    public Alarm_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("Alarm_BindableInstance"));
    }

    public Alarm_BindableInstance(BindableInstance element) {
        super(element);
    }

    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG, this.element);
    }

    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG,value);
    }

    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, this.element);
    }

    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, value);
    }

}
