package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("d06e13db-011f-4c73-bb75-dfd237040949")
public class Clock_Instance {
    @objid ("54ae28a8-5011-4f52-86a9-01df43930e4f")
    protected Instance element;

    @objid ("1c893fdc-0065-4ab1-91ed-8186e8d233f2")
    public Clock_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CLOCK_INSTANCE);
        
        
        this.element.setName(MARTEResourceManager.getName("Clock_Instance")+ModelUtils.getNbElement(Instance.class, MARTEDesignerStereotypes.CLOCK_INSTANCE));
    }

    @objid ("480e2b03-255e-4dea-a3a3-ba2b32d8e441")
    public Clock_Instance(Instance element) {
        this.element = element;
    }

    @objid ("721dd23a-2f15-41d4-bab4-1a971f20415c")
    public Instance getElement() {
        return this.element;
    }

    @objid ("b152fb62-3dc8-47ed-93af-78b2891c4813")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("04d33e35-bc65-4e91-b9b7-2c84a547fb2c")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("f9984f5b-15d9-45cd-a107-3d2784f2d433")
    public String getstandard() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, this.element);
    }

    @objid ("e5346634-2583-4409-b61c-ce6718137d86")
    public void setstandard(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_STANDARD, value);
    }

    @objid ("277cafbb-cef4-4cc7-ad0b-d79250c13422")
    public String getunit() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, this.element);
    }

    @objid ("91379115-cce5-4008-b7b1-1bd8207d7df2")
    public void setunit(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CLOCK_INSTANCE_CLOCK_INSTANCE_UNIT, value);
    }

    @objid ("813f3641-5cbf-4bb1-a519-317d40ed82d8")
    public TimedDomain_NameSpace getTimedDomain_NameSpace() {
        return new TimedDomain_NameSpace((Package) this.element.getOwner());
    }

    @objid ("ff73cfe4-3e8d-4bc5-ab52-dce831a2e734")
    public void addTimedDomain_NameSpace(TimedDomain_NameSpace model) {
        this.element.setOwner(model.getElement());
    }

    @objid ("963b62c8-42e7-4f19-920a-5cd90bd2d979")
    public List<ClockConstraint_Constraint> getClockConstraint_Constraint() {
        List<ClockConstraint_Constraint> res = new java.util.ArrayList<>();        
        for(Constraint constraint : this.element.getConstraintDefinition()){
            res.add(new ClockConstraint_Constraint(constraint));
        }
        return res;
    }

    @objid ("8710255f-0c42-4328-8c4f-bc369652f6eb")
    public void addClockConstraint_Constraint(ClockConstraint_Constraint model) {
        this.element.getConstraintDefinition().add(model.getElement());
    }

    @objid ("9db0897e-d3c5-40d6-ae33-61d5789d49be")
    public ClockType_Class getClockType_Class() {
        return new ClockType_Class((Class) this.element.getBase());
    }

    @objid ("4fa2ceed-423a-4e6d-873a-ea2169302418")
    public void addClockType_Class(ClockType_Class model) {
        this.element.setBase(model.getElement());
    }

    @objid ("9ff8ec36-c584-4be6-bec8-476e6d9d0b18")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getImpactedDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

    @objid ("9f8a6b5a-5258-483d-892a-44e3acc8ec16")
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

    @objid ("a6bb9612-392e-41d5-bee8-2a1b41c60aa4")
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
