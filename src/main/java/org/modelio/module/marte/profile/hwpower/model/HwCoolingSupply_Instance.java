package org.modelio.module.marte.profile.hwpower.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.hwlayout.model.HwComponent_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("405974ef-62e9-4a54-b402-45dd325dc5c1")
public class HwCoolingSupply_Instance extends HwComponent_Instance {
    @objid ("552d46ab-983d-4031-b191-ea6fe731d20a")
    public HwCoolingSupply_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOOLINGSUPPLY_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwCoolingSupply_Instance"));
    }

    @objid ("4abd29df-6fe7-410b-bd4c-9eeeac35af01")
    public HwCoolingSupply_Instance(Instance element) {
        super(element);
    }

    @objid ("36812af6-1247-4693-9a7e-e09273d75347")
    public String getcoolingPower() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, this.element);
    }

    @objid ("6eb9d3b0-8397-4915-a41b-e4a8b3e015d2")
    public void setcoolingPower(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOOLINGSUPPLY_INSTANCE_HWCOOLINGSUPPLY_INSTANCE_COOLINGPOWER, value);
    }

}
