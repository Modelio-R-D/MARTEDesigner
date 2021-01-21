package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5efefb45-5984-44b6-b80e-495c2758f9b1")
public class Alarm_Instance extends InterruptResource_Instance {
    @objid ("f7a4ab48-6d1b-4634-a0ca-465ef8863383")
    public Alarm_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("Alarm_Instance"));
    }

    @objid ("217aaafa-f457-4da4-943c-f3938551c99a")
    public Alarm_Instance(Instance element) {
        super(element);
    }

    @objid ("e349bb6f-0ca0-4d50-b10b-e39ba61c390d")
    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG, this.element);
    }

    @objid ("4db4045f-e457-4dd7-9d49-74d069e3d00c")
    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG,value);
    }

    @objid ("6be2d2d0-b3f3-4170-8c02-e5137a8e4e76")
    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, this.element);
    }

    @objid ("48142ad2-e25f-4f58-ad69-07bfc7510eca")
    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, value);
    }

}
