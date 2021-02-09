package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaLatencyObs_Constraint {
    protected Constraint element;

    public GaLatencyObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GALATENCYOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("GaLatencyObs_Constraint"));
    }

    public GaLatencyObs_Constraint(Constraint element) {
        this.element = element;
    }

    public Constraint getElement() {
        return this.element;
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getlatency() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, this.element);
    }

    public void setlatency(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_LATENCY, value);
    }

    public String getmiss() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, this.element);
    }

    public void setmiss(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MISS, value);
    }

    public String getutility() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, this.element);
    }

    public void setutility(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_UTILITY, value);
    }

    public String getmaxJitter() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, this.element);
    }

    public void setmaxJitter(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GALATENCYOBS_CONSTRAINT_GALATENCYOBS_CONSTRAINT_MAXJITTER, value);
    }

}
