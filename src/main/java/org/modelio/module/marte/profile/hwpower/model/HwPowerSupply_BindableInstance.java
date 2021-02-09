package org.modelio.module.marte.profile.hwpower.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwPowerSupply_BindableInstance extends HwComponent_BindableInstance {
    public HwPowerSupply_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPowerSupply_BindableInstance"));
    }

    public HwPowerSupply_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, this.element);
    }

    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, value);
    }

    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, this.element);
    }

    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, value);
    }

}
