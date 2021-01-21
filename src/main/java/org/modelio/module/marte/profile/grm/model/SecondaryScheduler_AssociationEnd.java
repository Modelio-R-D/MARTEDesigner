package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("05813b72-2200-4aee-8694-e371d2399967")
public class SecondaryScheduler_AssociationEnd extends Scheduler_AssociationEnd {
    @objid ("7d5a9fa5-8515-44dd-b0c6-e9e88c66761b")
    public SecondaryScheduler_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATIONEND);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_AssociationEnd"));
        this.isisPreemptible(true);
    }

    @objid ("4e2ede1e-2ea3-4c74-aaf1-8e7569b73d35")
    public SecondaryScheduler_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("211c8599-b4c1-47c5-bdbf-a8816fd25b4b")
    public String getSecondaryScheduler_AssociationEnd_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("f50db6ae-7a2b-4ec1-9bf3-3c065bc9495d")
    public void setSecondaryScheduler_AssociationEnd_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATIONEND_SECONDARYSCHEDULER_ASSOCIATIONEND_VIRTUALPROCESSINGUNITS, value);
    }

}
