package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Clock_Instance {
    protected Instance element;

    public Clock_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCK_INSTANCE);
        
        
        this.element.setName(MARTEResourceManager.getName("Clock_Instance")+ModelUtils.getNbElement(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE));
    }

    public Clock_Instance(Instance element) {
        this.element = element;
    }

    public Instance getElement() {
        return this.element;
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getstandard() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, this.element);
    }

    public void setstandard(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, value);
    }

    public String getunit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, this.element);
    }

    public void setunit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, value);
    }

    public TimedDomain_NameSpace getTimedDomain_NameSpace() {
        return new TimedDomain_NameSpace((Package) this.element.getOwner());
    }

    public void addTimedDomain_NameSpace(TimedDomain_NameSpace model) {
        this.element.setOwner(model.getElement());
    }

    public List<ClockConstraint_Constraint> getClockConstraint_Constraint() {
        List<ClockConstraint_Constraint> res = new java.util.ArrayList<>();        
        for(Constraint constraint : this.element.getConstraintDefinition()){
            res.add(new ClockConstraint_Constraint(constraint));
        }
        return res;
    }

    public void addClockConstraint_Constraint(ClockConstraint_Constraint model) {
        this.element.getConstraintDefinition().add(model.getElement());
    }

    public ClockType_Class getClockType_Class() {
        return new ClockType_Class((Class) this.element.getBase());
    }

    public void addClockType_Class(ClockType_Class model) {
        this.element.setBase(model.getElement());
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getImpactedDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

    public enum TimeStandardKind {
        TAI,
        UT0,
        UT1,
        UTC,
        Local,
        TT,
        TBD,
        TCG,
        TCB,
        Sidereal,
        GPS;
    }

    public enum TimeUnitKind {
        s,
        ms,
        us,
        ns,
        min,
        hrs,
        day;
    }

}
