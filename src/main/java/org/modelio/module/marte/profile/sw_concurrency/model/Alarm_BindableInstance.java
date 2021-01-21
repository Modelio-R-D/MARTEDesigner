package org.modelio.module.marte.profile.sw_concurrency.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("bc12abeb-27f5-4b8a-9efe-3601123e4f26")
public class Alarm_BindableInstance extends InterruptResource_BindableInstance {
    @objid ("509cf628-d1c6-429f-bf94-f79dc44d0bef")
    public Alarm_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.ALARM_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("Alarm_BindableInstance"));
    }

    @objid ("88402887-cba6-48fa-8a95-3cdb89e41504")
    public Alarm_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("768d05c5-e72e-4408-95f1-cfa4a4b49d73")
    public boolean isisWatchdog() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG, this.element);
    }

    @objid ("5b2ca2f8-9d04-4fac-83a3-dddd6a984a1b")
    public void isisWatchdog(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_ISWATCHDOG,value);
    }

    @objid ("86d711cd-4958-45db-bbe7-f786ad24058d")
    public String gettimers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, this.element);
    }

    @objid ("a13d8eff-d3db-4354-a9b6-940b16da6582")
    public void settimers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.ALARM_INSTANCE_ALARM_INSTANCE_TIMERS, value);
    }

}
