package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimerResource_Instance extends TimingResource_Instance {
    public TimerResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Instance"));
    }

    public TimerResource_Instance(final Instance element) {
        super(element);
    }

    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, this.element);
    }

    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, value);
    }

    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC, this.element);
    }

    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC,value);
    }

}
