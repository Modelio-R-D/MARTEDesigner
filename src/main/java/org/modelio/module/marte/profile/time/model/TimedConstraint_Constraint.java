package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.nfps.model.NfpConstraint_Constraint;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d6ad13cc-a383-4a3e-92de-00109968af99")
public class TimedConstraint_Constraint extends NfpConstraint_Constraint {
    @objid ("efbe1b42-26ca-4609-857a-dfbe1c3bdcab")
    public TimedConstraint_Constraint() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDCONSTRAINT_CONSTRAINT);
               this.element.setName(MARTEResourceManager.getName("TimedConstraint_Constraint")+ModelUtils.getNbElement(Constraint.class, MARTEDesignerStereotypes.TIMEDCONSTRAINT_CONSTRAINT));
    }

    @objid ("aca5906b-40f4-4bbb-96f6-42e3dda8c75f")
    public TimedConstraint_Constraint(Constraint element) {
        super(element);
    }

    @objid ("e39d0324-a903-4d18-9ea5-3617ea224b2e")
    public String getinterpretation() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, this.element);
    }

    @objid ("9bba67da-c44b-4423-a56e-2b643cf32de8")
    public void setinterpretation(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDCONSTRAINT_CONSTRAINT_TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION, value);
    }

    @objid ("91abd62f-25be-4128-b80e-7f13c79462b5")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

    @objid ("05734b6d-72b1-4d30-a1d6-3aeded8cf894")
    public enum TimeInterpretationKind {
        duration,
        instant;
    }

}
