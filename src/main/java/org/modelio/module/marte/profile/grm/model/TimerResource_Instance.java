package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("11b4c657-f55e-41af-8f93-bd7c688f67c0")
public class TimerResource_Instance extends TimingResource_Instance {
    @objid ("6a44a952-14e2-4df6-8433-82d6de9cf46f")
    public TimerResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_Instance"));
    }

    @objid ("5ca53ab0-a07c-49e2-af77-2cc1bc8b6982")
    public TimerResource_Instance(final Instance element) {
        super(element);
    }

    @objid ("e1000ecf-149e-43e3-9eaf-7d95c9c45098")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, this.element);
    }

    @objid ("d216ce16-743f-45e6-93a6-2200272eb4c5")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, value);
    }

    @objid ("adf7797c-54af-48ec-b7db-acbe07e402af")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC, this.element);
    }

    @objid ("d2111e26-6585-4531-985e-b119f6390d3c")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC,value);
    }

}
