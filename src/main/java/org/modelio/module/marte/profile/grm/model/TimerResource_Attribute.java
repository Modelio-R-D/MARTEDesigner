package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimerResource_Attribute extends TimingResource_Attribute {
    public TimerResource_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Attribute"));
    }

    public TimerResource_Attribute(final Attribute element) {
        super(element);
    }

    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, this.element);
    }

    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, value);
    }

    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC, this.element);
    }

    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC,value);
    }

}
