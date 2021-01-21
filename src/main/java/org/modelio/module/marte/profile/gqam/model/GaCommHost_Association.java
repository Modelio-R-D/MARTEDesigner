package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6d1a6f58-d76f-4ef2-a39b-53b62e0c5b0c")
public class GaCommHost_Association {
    @objid ("af7eba95-06e5-46dd-8416-9b5c5f62fcfa")
    protected Association element;

    @objid ("f02020fe-45bc-42a9-a221-cdada28852d0")
    public GaCommHost_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("GaCommHost_Association"));
    }

    @objid ("adc00c1d-7682-4c06-96db-79a650943e8e")
    public GaCommHost_Association(Association element) {
        this.element = element;
    }

    @objid ("b4b31182-82b1-46b1-9d5f-a242e164cc46")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("97bd989b-685f-4f6c-8805-e75698a98c62")
    public Association getElement() {
        return this.element;
    }

    @objid ("90cd877d-f54c-402a-aba2-68c475562d08")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_THROUGHPUT, this.element);
    }

    @objid ("79ed6e75-3402-4d41-bf7f-dd8682e5a2fa")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_THROUGHPUT, value);
    }

    @objid ("ac0f9fba-1f01-4a55-b888-a7efa85fce3c")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_UTILIZATION, this.element);
    }

    @objid ("1bf3053e-ab27-4dd5-8fda-4ddaedc80673")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_UTILIZATION, value);
    }

    @objid ("cb69d1b5-a9e7-44a3-9061-ffe727f06f24")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE, this.element);
    }

    @objid ("d27941fb-1c32-48e9-8b8b-50db345010f1")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_ISPREEMPTIBLE,value);
    }

    @objid ("adea1101-cd40-42b5-b16b-6d155c10d066")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDPOLICY, this.element);
    }

    @objid ("10f4413c-2085-482c-a36c-52223fe1d83e")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDPOLICY, value);
    }

    @objid ("d9b2ebb6-09f6-4c81-9e75-b9cd4aa6258d")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("cebfef47-c677-4243-8191-c4268496498f")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_OTHERSCHEDPOLICY, value);
    }

    @objid ("9817663c-fb9f-4e40-ac53-cdd208d3fd82")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDULE, this.element);
    }

    @objid ("39752c45-c4fb-494e-9ceb-489e3252899f")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDULE, value);
    }

    @objid ("80f81ff0-58d1-4df5-ada0-65f2f94e983c")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_PROCESSINGUNITS, this.element);
    }

    @objid ("5007b7ee-99e6-41d2-8cee-47f9e743b6e7")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_PROCESSINGUNITS, value);
    }

    @objid ("127e3110-d6e3-4063-8697-fd5d80357de9")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_HOST, this.element);
    }

    @objid ("6b3efb85-f9b9-4651-9879-e9382e55ac6d")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_HOST, value);
    }

    @objid ("46462a14-05f4-4469-bbce-3a3075cf5572")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("3372f4fd-6d33-4cda-8884-a9e9d224b6fb")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("d045a12b-90a8-4a80-8966-955f4f8a5377")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("37b65913-14cf-48fa-96f6-0a92a55d5421")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATION_GACOMMHOST_ASSOCIATION_SCHEDULABLERESOURCES, value);
    }

}
