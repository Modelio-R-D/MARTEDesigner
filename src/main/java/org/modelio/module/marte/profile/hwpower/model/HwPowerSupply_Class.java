package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPowerSupply_Class extends HwComponent_Class {
    public HwPowerSupply_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPOWERSUPPLY_CLASSIFIER));
    }

    public HwPowerSupply_Class(Class element) {
        super(element);
    }

    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, this.element);
    }

    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_SUPPLIEDPOWER, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_CLASSIFIER_HWPOWERSUPPLY_CLASSIFIER_CAPACITY, value);
    }

}
