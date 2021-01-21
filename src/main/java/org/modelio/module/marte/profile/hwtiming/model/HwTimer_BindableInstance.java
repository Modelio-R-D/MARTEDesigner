package org.modelio.module.marte.profile.hwtiming.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("eb6e6a39-383b-4a97-a5aa-c9cf4399d926")
public class HwTimer_BindableInstance extends HwTimingResource_BindableInstance {
    @objid ("6b9a3b36-a733-4a77-b658-659876a684df")
    public HwTimer_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWTIMER_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwTimer_BindableInstance"));
    }

    @objid ("2326d21e-e338-46ac-a890-851b2d2ec852")
    public HwTimer_BindableInstance(BindableInstance element) {
        super(element);
    }

    @objid ("888680d0-a712-4c60-abb1-8cb31e605c48")
    public String getnbCounters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, this.element);
    }

    @objid ("2f34379c-e4ed-4e2a-b197-e1951fafe165")
    public void setnbCounters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_NBCOUNTERS, value);
    }

    @objid ("41a7f35f-73b6-4ee7-af47-e3ef512c5afb")
    public String getcounterWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, this.element);
    }

    @objid ("00f9f4ba-2114-4088-9783-f35d1ba359a2")
    public void setcounterWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_COUNTERWIDTH, value);
    }

    @objid ("e0b4c424-ee7c-4d8b-8eb8-0ca6cd3ae83a")
    public String getinputClock() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, this.element);
    }

    @objid ("6e66a855-278a-444e-8a5a-a711edc2e0d5")
    public void setinputClock(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWTIMER_INSTANCE_HWTIMER_INSTANCE_INPUTCLOCK, value);
    }

}
