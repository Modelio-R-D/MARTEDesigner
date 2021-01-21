package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("99b99ac3-ed8a-402d-8308-7e2362b90db6")
public class SecondaryScheduler_Attribute extends Scheduler_Attribute {
    @objid ("c5bd3476-43dc-4031-a232-454e10d9b08f")
    public SecondaryScheduler_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_ATTRIBUTE);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Attribute"));
        this.isisPreemptible(true);
    }

    @objid ("823ea6c7-cdf5-436f-ac36-ae2ef754786c")
    public SecondaryScheduler_Attribute(final Attribute element) {
        super(element);
    }

    @objid ("3d3c6512-27c4-4f1d-abdd-4a14f4039500")
    public String getSecondaryScheduler_Attribute_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ATTRIBUTE_SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("67305b1e-9edd-49a2-ab7f-dfbf973e535a")
    public void setSecondaryScheduler_Attribute_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_ATTRIBUTE_SECONDARYSCHEDULER_ATTRIBUTE_VIRTUALPROCESSINGUNITS, value);
    }

}
