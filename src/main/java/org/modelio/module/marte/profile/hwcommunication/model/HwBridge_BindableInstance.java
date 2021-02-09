package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_BindableInstance extends HwMedia_BindableInstance {
    public HwBridge_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwBridge_BindableInstance"));
    }

    public HwBridge_BindableInstance(BindableInstance element) {
        super(element);
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_INSTANCE_HWBRIDGE_INSTANCE_SIDES, value);
    }

}
