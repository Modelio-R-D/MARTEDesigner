package org.modelio.module.marte.profile.grm.model;

import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SecondaryScheduler_BindableInstance extends Scheduler_BindableInstance {
    public SecondaryScheduler_BindableInstance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createBindableInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_BindableInstance"));
        this.isisPreemptible(true);
    }

    public SecondaryScheduler_BindableInstance(final BindableInstance element) {
        super(element);
    }

    public String gvirtualprocessingunits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, this.element);
    }

    public void setvirtualprocessingunits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, value);
    }

}
