package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.NfpConstraint_Constraint;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class ClockConstraint_Constraint extends NfpConstraint_Constraint {
    public ClockConstraint_Constraint() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKCONSTRAINT_CONSTRAINT);       
           this.element.setName(MARTEResourceManager.getName("ClockConstraint_Constraint")+ModelUtils.getNbElement(Constraint.class, MARTEDesignerStereotypes.CLOCKCONSTRAINT_CONSTRAINT));
    }

    public ClockConstraint_Constraint(Constraint element) {
        super(element);
    }

    public boolean isisCoincidenceBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED, this.element);
    }

    public void isisCoincidenceBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED,value);
    }

    public boolean isisPrecedenceBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED, this.element);
    }

    public void isisPrecedenceBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED,value);
    }

    public boolean isisChronometricBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED, this.element);
    }

    public void isisChronometricBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED,value);
    }

    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(ModelElement modelElt : this.element.getConstrainedElement()){
            res.add(new Clock_Instance((Instance)modelElt));
        }
        return res;
    }

    public void addClock_Instance(Clock_Instance model) {
        this.element.getConstrainedElement().add(model.getElement());
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
