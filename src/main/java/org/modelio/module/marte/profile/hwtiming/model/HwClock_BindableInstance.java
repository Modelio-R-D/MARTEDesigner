package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4cc2346a-852f-48d5-bdba-afb94f755ea0")
public class HwClock_BindableInstance extends HwTimingResource_BindableInstance {
    @objid ("7a432d66-2b72-4d7d-9c22-1968b7bee970")
    public HwClock_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCLOCK_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwClock_BindableInstance"));
    }

    @objid ("cb41e344-829b-4079-aab1-2f818e8b7e55")
    public HwClock_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("0d0cff85-9145-480d-abef-037f3326538b")
    public String getfrequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, this.element);
    }

    @objid ("1c06bf6b-5d46-4cf3-950c-42286dfacccc")
    public void setfrequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCLOCK_INSTANCE_HWCLOCK_INSTANCE_FREQUENCY, value);
    }

}
