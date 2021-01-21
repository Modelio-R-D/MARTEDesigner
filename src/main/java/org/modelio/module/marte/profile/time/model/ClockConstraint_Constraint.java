package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("74bc2664-2430-43ef-ac3f-50b218b4e1ae")
public class ClockConstraint_Constraint extends NfpConstraint_Constraint {
    @objid ("7171aaa1-470e-4792-8a4b-fffdebdb73cd")
    public ClockConstraint_Constraint() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCKCONSTRAINT_CONSTRAINT);       
           this.element.setName(MARTEResourceManager.getName("ClockConstraint_Constraint")+ModelUtils.getNbElement(Constraint.class, MARTEDesignerStereotypes.CLOCKCONSTRAINT_CONSTRAINT));
    }

    @objid ("b2314199-9d76-4a19-a056-5bd8d4f325b3")
    public ClockConstraint_Constraint(Constraint element) {
        super(element);
    }

    @objid ("1cc4560f-d985-433c-b811-ca52c70b4647")
    public boolean isisCoincidenceBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED, this.element);
    }

    @objid ("584777e0-d340-4f74-b9c1-9d4a90c28783")
    public void isisCoincidenceBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCOINCIDENCEBASED,value);
    }

    @objid ("b5d8064e-4bb1-4cc6-ac0e-78468df3af31")
    public boolean isisPrecedenceBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED, this.element);
    }

    @objid ("4a03f00a-fc42-497f-b065-a7a32e3b3b9b")
    public void isisPrecedenceBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISPRECEDENCEBASED,value);
    }

    @objid ("c4b1bfb0-392a-4c35-8904-db031374a88b")
    public boolean isisChronometricBased() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED, this.element);
    }

    @objid ("2eaea3dc-ae31-405b-a059-78a60e1011c5")
    public void isisChronometricBased(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.CLOCKCONSTRAINT_CONSTRAINT_CLOCKCONSTRAINT_CONSTRAINT_ISCHRONOMETRICBASED,value);
    }

    @objid ("cbd7498d-7f50-40a4-9e86-b2c55032479e")
    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(ModelElement modelElt : this.element.getConstrainedElement()){
            res.add(new Clock_Instance((Instance)modelElt));
        }
        return res;
    }

    @objid ("66a99610-531c-47ea-abf5-93d56617387b")
    public void addClock_Instance(Clock_Instance model) {
        this.element.getConstrainedElement().add(model.getElement());
    }

    @objid ("62ddc9a0-3b21-424e-b2e4-ad46aa909cae")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
