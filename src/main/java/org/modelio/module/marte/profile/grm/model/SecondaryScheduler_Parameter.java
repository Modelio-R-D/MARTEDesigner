package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e9181d0c-739e-4f57-9f89-d17dd454249e")
public class SecondaryScheduler_Parameter extends Scheduler_Parameter {
    @objid ("ffb249f2-0d44-47be-a176-f8b416fb953c")
    public SecondaryScheduler_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Parameter"));
        this.isisPreemptible(true);
    }

    @objid ("e6d4b5bb-3e60-45f1-b2b0-e7616371209d")
    public SecondaryScheduler_Parameter(final Parameter element) {
        super(element);
    }

    @objid ("d40f6e28-1537-4444-9765-4b691f331e64")
    public String getSecondaryScheduler_Parameter_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_PARAMETER_SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("dee51b6e-ec1d-436f-9f5c-8f9b11ac82e7")
    public void setSecondaryScheduler_Parameter_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_PARAMETER_SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS, value);
    }

}
