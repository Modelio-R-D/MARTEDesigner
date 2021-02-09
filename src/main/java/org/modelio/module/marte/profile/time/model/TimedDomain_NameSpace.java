package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedDomain_NameSpace {
    protected Package element;

    public TimedDomain_NameSpace() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE);
        this.element.setName(MARTEResourceManager.getName("TimedDomain_NameSpace")+ModelUtils.getNbElement(NameSpace.class, MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE));
    }

    public TimedDomain_NameSpace(Package element) {
        this.element = element;
    }

    public Package getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(Instance instance : this.element.getDeclared()){
            res.add(new Clock_Instance(instance));
        }
        return res;
    }

    public void addClock_Instance(Clock_Instance model) {
        this.element.getDeclared().add(model.getElement());
    }

    public List<ClockType_Class> getClockType_Class() {
        List<ClockType_Class> res = new java.util.ArrayList<>();        
        for(ModelTree modelTree : this.element.getOwnedElement()){
            res.add(new ClockType_Class((Class)modelTree));
        }
        return res;
    }

    public void addClockType_Class(ClockType_Class model) {
        this.element.getOwnedElement().add(model.getElement());
    }

}
