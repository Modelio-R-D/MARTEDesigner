package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dc574639-9b70-4f24-98d3-66fcb8f67fae")
public class SecondaryScheduler_Association extends Scheduler_Association {
    @objid ("adb1cad3-c392-4a25-a33e-f04aa890fb5c")
    protected Association element;

    @objid ("799eef0b-e108-4417-a7bc-433401508c6d")
    public SecondaryScheduler_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SECONDARYSCHEDULER_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("SecondaryScheduler_Association"));
        this.isisPreemptible(true);
    }

    @objid ("ce0e72be-d39e-4f55-a97f-4eb445cc586f")
    public SecondaryScheduler_Association(final Association element) {
        this.element = element;
    }

    @objid ("9c968b83-7e0a-4948-b438-9ec50c2efc57")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("d862c678-c30d-478c-ad8a-0bd8d96c622f")
    public Association getElement() {
        return this.element;
    }

    @objid ("f052d388-4f49-4688-bcbd-a32a68388303")
    public String getSecondaryScheduler_Association_virtualProcessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATION_SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS, this.element);
    }

    @objid ("d42b3c73-bcba-4207-8c2c-44208f0bb7d5")
    public void setSecondaryScheduler_Association_virtualProcessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SECONDARYSCHEDULER_ASSOCIATION_SECONDARYSCHEDULER_ASSOCIATION_VIRTUALPROCESSINGUNITS, value);
    }

}
