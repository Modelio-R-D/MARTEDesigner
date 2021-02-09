package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimerResource_Node extends TimingResource_Node {
    public TimerResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.TIMERRESOURCE_CLASSIFIER));
    }

    public TimerResource_Node(final Node element) {
        super(element);
    }

    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, this.element);
    }

    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_DURATION, value);
    }

    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC, this.element);
    }

    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_CLASSIFIER_TIMERRESOURCE_CLASSIFIER_ISPERIODIC,value);
    }

}
