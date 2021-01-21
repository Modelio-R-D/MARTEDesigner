package org.modelio.module.marte.profile.gqam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.CommunicationMedia_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("24038f88-ac58-4e4c-aaab-a096a9b55913")
public class GaCommHost_AssociationEnd extends CommunicationMedia_AssociationEnd {
    @objid ("f59b54bd-4240-4537-aa99-d19c3de97874")
    public GaCommHost_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GACOMMHOST_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("GaCommHost_AssociationEnd"));
    }

    @objid ("1a44cd32-8667-4f46-998c-dc8587847822")
    public GaCommHost_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("59d40294-7157-462f-87e4-39de1e9f7558")
    public String getthroughput() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_THROUGHPUT, this.element);
    }

    @objid ("2dfec2a5-5470-464f-849e-5d31fadd5121")
    public void setthroughput(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_THROUGHPUT, value);
    }

    @objid ("94afaa1b-ebad-49be-9c9f-e669ddb72e72")
    public String getutilization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_UTILIZATION, this.element);
    }

    @objid ("af8d1c18-2945-4fd6-aeca-2487e4099698")
    public void setutilization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_UTILIZATION, value);
    }

    @objid ("b6da2655-1be8-4abf-b9d6-295f3720e41c")
    public boolean isisPreemptible() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE, this.element);
    }

    @objid ("e35d1e2a-a004-4e42-9b45-fb068896066d")
    public void isisPreemptible(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_ISPREEMPTIBLE,value);
    }

    @objid ("3ff519fc-672c-42db-abf5-ea4fff499848")
    public String getschedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY, this.element);
    }

    @objid ("52476c1a-014e-4f80-9915-940fe94246ab")
    public void setschedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDPOLICY, value);
    }

    @objid ("e59dfbd0-3040-4ac9-a85b-73e381d15ee5")
    public String getotherSchedPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, this.element);
    }

    @objid ("28e787cf-6644-4ab4-aff5-35276e263ecc")
    public void setotherSchedPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_OTHERSCHEDPOLICY, value);
    }

    @objid ("1d541e11-df54-412d-bcef-e486627b5795")
    public String getschedule() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULE, this.element);
    }

    @objid ("201deae1-51ea-4f23-a610-3547d04c931c")
    public void setschedule(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULE, value);
    }

    @objid ("d5c131e5-903b-4554-9100-27bd074c6b58")
    public String getprocessingUnits() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS, this.element);
    }

    @objid ("4d4d82b0-501c-4efb-b3e3-c5024f6501c7")
    public void setprocessingUnits(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROCESSINGUNITS, value);
    }

    @objid ("cf487373-dadc-4ae5-a444-c5b5715eafd2")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_HOST, this.element);
    }

    @objid ("f39e3907-98a8-492b-8523-a6ee41db08e5")
    public void sethost(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_HOST, value);
    }

    @objid ("d9472161-af8b-4c65-88ba-da776b651844")
    public String getprotectedSharedRsources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, this.element);
    }

    @objid ("1657fe0c-4353-4f70-9685-c41e02b8b3b1")
    public void setprotectedSharedRsources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_PROTECTEDSHAREDRESOURCES, value);
    }

    @objid ("1dc6b0c7-5630-4452-92a9-01e38ec6cf3d")
    public String getschedulableResources() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, this.element);
    }

    @objid ("d514037d-07ed-41d1-a418-3aed7ae0cb08")
    public void setschedulableResources(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GACOMMHOST_ASSOCIATIONEND_GACOMMHOST_ASSOCIATIONEND_SCHEDULABLERESOURCES, value);
    }

}
