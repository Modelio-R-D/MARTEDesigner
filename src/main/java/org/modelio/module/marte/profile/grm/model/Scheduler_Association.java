package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("31ff3c0e-f6bc-4a90-841a-ffe58d977fbe")
public class Scheduler_Association {
    @objid ("36e5bcb7-a521-4440-9614-80b7729357b3")
    protected Association element;

    @objid ("9020fe05-e0a8-47de-8983-1eab7789593f")
    public Scheduler_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SCHEDULER_ASSOCIATION);
        this.isisPreemptible(true);
        this.element.setName(MARTEResourceManager.getName("Scheduler_Association"));
    }

    @objid ("1b0905c7-e500-4ef6-8bc6-3efdd7bee4c7")
    public Scheduler_Association(final Association element) {
        this.element = element;
    }

    @objid ("a188d7b7-5317-4faf-a0a4-71c6cf0faaf4")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("508f766c-df84-420f-a5a3-75a2772f4d88")
    public Association getElement() {
        return this.element;
    }

    @objid ("7cb3dc73-6275-4b2b-a8b2-0cb671f0f153")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_ISPREEMPTIBLE, this.element);
    }

    @objid ("2d65a256-9ac5-425b-8ea1-812809fdd5d3")
    public void isisPreemptible(final boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_ISPREEMPTIBLE,value);
    }

    @objid ("74ef66ea-df02-4561-aacc-47daec1bd347")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDPOLICY, this.element);
    }

    @objid ("95947b3d-f13c-4beb-8342-81c8bb145d86")
    public void setschedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDPOLICY, value);
    }

    @objid ("88936969-17a5-4449-b770-ea1b99464812")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("b701befa-97d7-492d-ba4a-9716413e8b55")
    public void setotherSchedPolicy(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_OTHERSCHEDPOLICY, value);
    }

    @objid ("77bee142-09da-4d1a-9d87-f5e1ef4564e9")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDULE, this.element);
    }

    @objid ("61d4bf5d-f222-45cc-bc41-a577391e75c7")
    public void setschedule(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDULE, value);
    }

    @objid ("70d1a18e-0111-4030-a9d6-4cf3b6b089e8")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROCESSINGUNITS, this.element);
    }

    @objid ("2be86c24-b104-4d92-83fa-7fe8efb92ae4")
    public void setprocessingUnits(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROCESSINGUNITS, value);
    }

    @objid ("7c7b67ca-ce17-47b2-9ae6-a673f5a01c24")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_HOST, this.element);
    }

    @objid ("5921bc22-a27f-4c8c-9f52-28a7d5a4b7b2")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_HOST, value);
    }

    @objid ("8632b417-cab7-425c-ac55-1feb082321bb")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("040d3dad-344c-4c7f-b948-eb5830ad3ee3")
    public void setprotectedSharedRsources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("438df858-ec60-4acf-ae71-f60102cea8cb")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("e40cde93-94cc-4cfb-b732-448af1ab27d5")
    public void setschedulableResources(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SCHEDULER_ASSOCIATION_SCHEDULER_ASSOCIATION_SCHEDULABLERESOURCES, value);
    }

}
