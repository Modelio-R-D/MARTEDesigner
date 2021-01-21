package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ee6b0a95-135a-4c94-a0d9-f950da591c3e")
public class HwClock_Instance extends HwTimingResource_Instance {
    @objid ("99d932a0-0451-4233-8401-3d63b34a0c71")
    public HwClock_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwClock_Instance"));
    }

    @objid ("be7606b3-8395-4264-a5b5-ad68f73e9e3f")
    public HwClock_Instance(Instance element) {
        super(element);
    }

    @objid ("240e579c-9f89-4b22-af4c-6f61e778e52c")
    public String getHwClock_Instance_frenquency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("08ee2da4-bc47-4864-94c6-10c26a360d72")
    public void setHwClock_Instance_frenquency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, value);
    }

}
