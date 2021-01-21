package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("1331d6dc-604f-46f6-bce9-8794d38ca913")
public class SaSchedObs_Constraint {
    @objid ("37b5518a-2ea8-425b-9f3e-0b1d6608b727")
    protected Constraint element;

    @objid ("9d82b1f6-4a40-4501-bfe1-4485d57312bd")
    public SaSchedObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASCHEDOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASCHEDOBS_CONSTRAINT));
    }

    @objid ("3bc2cdac-6ded-4de3-8ca1-b6a145814570")
    public SaSchedObs_Constraint(Constraint element) {
        this.element = element;
    }

    @objid ("5dd07a04-feb8-45a3-a72a-02021f62801f")
    public Constraint getElement() {
        return this.element;
    }

    @objid ("62e93cd6-24b5-41dd-865e-dd0e16399a1d")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("77ffec23-e506-4e51-a14d-ee23827d728a")
    public String getsuspentions() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_suspentions", this.element);
    }

    @objid ("c9c2fa95-2eeb-43e7-8fd4-b278df4d0e08")
    public void setsuspentions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_SUSPENTIONS, value);
    }

    @objid ("eb86fb97-9869-4522-b80c-a9d8712237d2")
    public String getblockT() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_blockT", this.element);
    }

    @objid ("50c270bf-39a5-4f2a-9988-eb308d4974d1")
    public void setblockT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_BLOCKT, value);
    }

    @objid ("0b61ef43-6a43-4152-9448-fc3b4b005ee8")
    public String getoverlaps() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_overlaps", this.element);
    }

    @objid ("dda95f78-15d4-4c98-9589-b3e24435f636")
    public void setoverlaps(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_OVERLAPS, value);
    }

}
