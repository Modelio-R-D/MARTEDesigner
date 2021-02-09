package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.NfpConstraint_Constraint;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedConstraint_Constraint extends NfpConstraint_Constraint {
    public TimedConstraint_Constraint() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDCONSTRAINT_CONSTRAINT);
               this.element.setName(MARTEResourceManager.getName("TimedConstraint_Constraint")+ModelUtils.getNbElement(Constraint.class, MARTEDesignerStereotypes.TIMEDCONSTRAINT_CONSTRAINT));
    }

    public TimedConstraint_Constraint(Constraint element) {
        super(element);
    }

    public String getinterpretation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, this.element);
    }

    public void setinterpretation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, value);
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

    public enum TimeInterpretationKind {
        duration,
        instant;
    }

}
