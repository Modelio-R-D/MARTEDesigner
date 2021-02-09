package org.modelio.module.marte.profile.hwtiming.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwClock_Node extends HwTimingResource_Node {
    public HwClock_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCLOCK_CLASSIFIER));
    }

    public HwClock_Node(Node element) {
        super(element);
    }

    public String getfrenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, this.element);
    }

    public void setfrenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_CLASSIFIER_HWCLOCK_CLASSIFIER_FREQUENCY, value);
    }

}
