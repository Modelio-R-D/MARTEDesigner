package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("384717e9-4463-4326-98c6-e1bf13a7e7e2")
public class HwPowerSupply_Instance extends HwComponent_Instance {
    @objid ("020a3ec4-fb2b-4bb9-bad1-cefae6a1768b")
    public HwPowerSupply_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPOWERSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPowerSupply_Instance"));
    }

    @objid ("ae53927b-0f9d-4def-8f3e-e4c07ebb50f4")
    public HwPowerSupply_Instance(Instance element) {
        super(element);
    }

    @objid ("02d3b85d-0cec-466a-8be3-d8b6350f05ec")
    public String getsuppliedPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, this.element);
    }

    @objid ("6513b5ec-6a4a-43a1-a43f-fc6b3fd6e547")
    public void setsuppliedPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_SUPPLIEDPOWER, value);
    }

    @objid ("cdcfd3d6-1e89-4f2c-a911-26ef6b400ce4")
    public String getcapacity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, this.element);
    }

    @objid ("241fee39-cf74-4117-b3b4-a1dcbe489f13")
    public void setcapacity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPOWERSUPPLY_INSTANCE_HWPOWERSUPPLY_INSTANCE_CAPACITY, value);
    }

}
