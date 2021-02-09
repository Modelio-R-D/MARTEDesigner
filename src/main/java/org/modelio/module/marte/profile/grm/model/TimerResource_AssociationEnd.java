package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimerResource_AssociationEnd extends TimingResource_AssociationEnd {
    public TimerResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("TimerResource_AssociationEnd"));
    }

    public TimerResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, this.element);
    }

    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, value);
    }

    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC, this.element);
    }

    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC,value);
    }

}
