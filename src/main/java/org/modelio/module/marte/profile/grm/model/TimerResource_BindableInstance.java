package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9e295814-b74d-4590-852b-5ceb4ea03c8a")
public class TimerResource_BindableInstance extends TimingResource_BindableInstance {
    @objid ("b12338c9-4306-4246-932c-9fb8835fcc4b")
    public TimerResource_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMERRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("TimerResource_BindableInstance"));
    }

    @objid ("48cc70f1-61f9-4b59-b985-d31fb283abae")
    public TimerResource_BindableInstance(final BindableInstance element) {
        super(element);
    }

    @objid ("4cd60aed-2d48-4426-9e76-14c9b78dae26")
    public String getduration() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, this.element);
    }

    @objid ("55ec9096-1c3f-4ed9-8e13-f486d26ef6b7")
    public void setduration(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, value);
    }

    @objid ("89bd8936-8fb2-47b1-9607-374bb8a6b4dd")
    public boolean isisPeriodic() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC, this.element);
    }

    @objid ("be7c91db-3a8a-4060-9c4e-0a8d0f7789a0")
    public void isisPeriodic(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC,value);
    }

}
