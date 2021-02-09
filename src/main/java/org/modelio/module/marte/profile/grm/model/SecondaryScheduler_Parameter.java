package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SecondaryScheduler_Parameter extends Scheduler_Parameter {
    public SecondaryScheduler_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_PARAMETER);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Parameter"));
        this.isisPreemptible(true);
    }

    public SecondaryScheduler_Parameter(final Parameter element) {
        super(element);
    }

    public String getSecondaryScheduler_Parameter_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_PARAMETER_SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS, this.element);
    }

    public void setSecondaryScheduler_Parameter_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_PARAMETER_SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS, value);
    }

}
