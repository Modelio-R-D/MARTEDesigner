package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("539576f3-a2e6-425f-a0f2-cad0c8e1d01c")
public class SecondaryScheduler_Instance extends Scheduler_Instance {
    @objid ("c75bc3ca-b2a2-4a4c-b5e4-a0709b952462")
    public SecondaryScheduler_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_INSTANCE);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Instance"));
        this.isisPreemptible(true);
    }

    @objid ("ae3ff387-f29b-41ca-b0f6-df5bcc64e432")
    public SecondaryScheduler_Instance(final Instance element) {
        super(element);
    }

    @objid ("50f915be-7d20-4693-96e8-067476a73458")
    public String getSecondaryScheduler_Instance_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("510f6ced-406b-4926-b6c4-4873b3ac904b")
    public void setSecondaryScheduler_Instance_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_INSTANCE_SECONDARYSCHEDULER_INSTANCE_VIRTUALPROCESSINGUNITS, value);
    }

}
