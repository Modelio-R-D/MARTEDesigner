package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.ComputingResource_AssociationEnd;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("66d16b21-79f3-4022-8472-193b28650582")
public class HwComputingResource_AssociationEnd extends ComputingResource_AssociationEnd {
    @objid ("9d8db7e2-f701-41a7-8430-cf14e1862e84")
    public HwComputingResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwComputingResource_AssociationEnd"));
    }

    @objid ("9fdd100b-87b3-425b-85ee-c3970df5c62a")
    public HwComputingResource_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("7016610c-71d2-4ef2-97ae-4b033074b033")
    public String getop_Frequencies() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, this.element);
    }

    @objid ("311f7ade-5124-411e-8bef-fe8c53dceaa0")
    public void setop_Frequencies(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OP_FREQUENCIES, value);
    }

    @objid ("f66759ce-f1fb-4a70-bc50-3ed1f7a7448f")
    public String getdescription() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, this.element);
    }

    @objid ("689fed27-5ce6-4c3c-9276-0aca1e2ba2a0")
    public void setdescription(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_DESCRIPTION, value);
    }

    @objid ("e6e86aba-2523-4f21-9ed6-345000aa4d1b")
    public String getp_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES, this.element);
    }

    @objid ("c2615532-ae33-4135-aca3-2c776c375bf8")
    public void setp_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_P_HW_SERVICES, value);
    }

    @objid ("e0cfc552-b193-49d3-87f0-11c3d76f177d")
    public String getr_HW_Services() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES, this.element);
    }

    @objid ("8146fe5d-8bfa-4b94-a9e0-057014beb9fb")
    public void setr_HW_Services(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_R_HW_SERVICES, value);
    }

    @objid ("ce209951-b5b9-48ef-8202-387b42f061a0")
    public String getownedHW() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW, this.element);
    }

    @objid ("819c159a-e340-4016-b6fc-2b026d9acfb4")
    public void setownedHW(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_OWNEDHW, value);
    }

    @objid ("53a8a78a-8ae8-476b-a688-4646ec7db1ac")
    public String getHwComputingResource_AssociationEnd_frequency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, this.element);
    }

    @objid ("b2f348ac-5440-442e-8d93-e3487c1e7dee")
    public void setHwComputingResource_AssociationEnd_frequency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_FREQUENCY, value);
    }

    @objid ("6d0709aa-c931-4a0c-9c5d-2c771bc4741a")
    public String getHwComputingResource_AssociationEnd_endPoints() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS, this.element);
    }

    @objid ("a42c5fb3-cf2a-4fbb-bc1c-41eaad1d9710")
    public void setHwComputingResource_AssociationEnd_endPoints(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWCOMPUTINGRESOURCE_ASSOCIATIONEND_HWCOMPUTINGRESOURCE_ASSOCIATIONEND_ENDPOINTS, value);
    }

}
