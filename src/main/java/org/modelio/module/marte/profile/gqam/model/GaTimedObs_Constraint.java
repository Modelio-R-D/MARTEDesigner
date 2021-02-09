package org.modelio.module.marte.profile.gqam.model;

import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class GaTimedObs_Constraint {
    protected Constraint element;

    public GaTimedObs_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GATIMEDOBS_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("GaTimedObs_Constraint"));
    }

    public GaTimedObs_Constraint(Constraint element) {
        this.element = element;
    }

    public Constraint getElement() {
        return this.element;
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getlaxity() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, this.element);
    }

    public void setlaxity(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_LAXITY, value);
    }

    public String getstartObs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, this.element);
    }

    public void setstartObs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_STARTOBS, value);
    }

    public String getendObs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, this.element);
    }

    public void setendObs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GATIMEDOBS_CONSTRAINT_GATIMEDOBS_CONSTRAINT_ENDOBS, value);
    }

}
