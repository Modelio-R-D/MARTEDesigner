package org.modelio.module.marte.profile.sam.model;

import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SaSchedObs_Constraint {
    protected Constraint element;

    public SaSchedObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SASCHEDOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SASCHEDOBS_CONSTRAINT));
    }

    public SaSchedObs_Constraint(Constraint element) {
        this.element = element;
    }

    public Constraint getElement() {
        return this.element;
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getsuspentions() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_suspentions", this.element);
    }

    public void setsuspentions(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_SUSPENTIONS, value);
    }

    public String getblockT() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_blockT", this.element);
    }

    public void setblockT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_BLOCKT, value);
    }

    public String getoverlaps() {
        return ModelUtils.getTaggedValue("SaSchedObs_Constraint_overlaps", this.element);
    }

    public void setoverlaps(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SASCHEDOBS_CONSTRAINT_SASCHEDOBS_CONSTRAINT_OVERLAPS, value);
    }

}
