package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwCoolingSupply_Class extends HwComponent_Class {
    public HwCoolingSupply_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWCOOLINGSUPPLY_CLASSIFIER));
    }

    public HwCoolingSupply_Class(Class element) {
        super(element);
    }

    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, this.element);
    }

    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_CLASSIFIER_HWCOOLINGSUPPLY_CLASSIFIER_COOLINGPOWER, value);
    }

}
