package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_Instance extends HwMedia_Instance {
    public HwBridge_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_Instance"));
    }

    public HwBridge_Instance(Instance element) {
        super(element);
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, value);
    }

}
