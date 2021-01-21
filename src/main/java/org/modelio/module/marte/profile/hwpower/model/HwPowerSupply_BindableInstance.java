package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_BindableInstance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("63303fe8-43e3-4507-9d9d-11535f249bec")
public class HwPowerSupply_BindableInstance extends HwComponent_BindableInstance {
    @objid ("529f643e-ec3c-41d4-8c3b-acc1d10279dc")
    public HwPowerSupply_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPowerSupply_BindableInstance"));
    }

    @objid ("378b3bc2-516a-4b9b-996b-962aa1213c74")
    public HwPowerSupply_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("638992b8-6e18-4574-b7fd-10ac88ef923b")
    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, this.element);
    }

    @objid ("5032e429-e21e-4d98-9110-59fb0619eb37")
    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, value);
    }

    @objid ("008c0478-cd33-45a9-aa7b-f9d5ea3f78a3")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, this.element);
    }

    @objid ("c0a2502e-c04b-4606-ab66-86b9cbbaace3")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, value);
    }

}
