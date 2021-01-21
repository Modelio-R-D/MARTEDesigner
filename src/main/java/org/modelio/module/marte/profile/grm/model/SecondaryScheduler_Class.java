package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51e0535c-d62c-447f-91e7-80521c2171fa")
public class SecondaryScheduler_Class extends Scheduler_Class {
    @objid ("f99606a9-6bb2-4a8d-8883-1cdf4e14e3bf")
    public SecondaryScheduler_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SECONDARYSCHEDULER_CLASSIFIER));
        this.isisPreemptible(true);
    }

    @objid ("6027fd13-e51c-4e6c-9abb-6dd9fabf5526")
    public SecondaryScheduler_Class(final Class element) {
        super(element);
    }

    @objid ("2f2733c3-1519-4aa1-adb3-a5841564c827")
    public String getvirtualprocessingunits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_CLASSIFIER_SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("c9955fde-cea7-45be-b4ca-e740d97f51ef")
    public void setvirtualprocessingunits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_CLASSIFIER_SECONDARYSCHEDULER_CLASSIFIER_VIRTUALPROCESSINGUNITS, value);
    }

}
