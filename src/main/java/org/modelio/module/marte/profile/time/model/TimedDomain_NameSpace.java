package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("303eb2a4-b339-49af-b3f9-a1062650c2c5")
public class TimedDomain_NameSpace {
    @objid ("5f6950f4-2089-4a9f-9b6b-74a5803a79d6")
    protected Package element;

    @objid ("d4d85a9b-3638-4b1f-bbd4-cc3442600d0c")
    public TimedDomain_NameSpace() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE);
        this.element.setName(MARTEResourceManager.getName("TimedDomain_NameSpace")+ModelUtils.getNbElement(NameSpace.class, MARTEDesignerStereotypes.TIMEDDOMAIN_NAMESPACE));
    }

    @objid ("055a8601-ae98-4915-a97a-ec76fd1fdfba")
    public TimedDomain_NameSpace(Package element) {
        this.element = element;
    }

    @objid ("8ea7e084-870c-4f87-a947-25920832252d")
    public Package getElement() {
        return this.element;
    }

    @objid ("2e8e9613-391c-40ea-88da-299f292370db")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("cb9134d6-dc66-4da4-9a7c-62eeab32cbc9")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("6048f778-ca8d-4f57-93e8-933a931c05a6")
    public List<Clock_Instance> getClock_Instance() {
        List<Clock_Instance> res = new java.util.ArrayList<>();        
        for(Instance instance : this.element.getDeclared()){
            res.add(new Clock_Instance(instance));
        }
        return res;
    }

    @objid ("c6a4dbdb-d381-4b73-a33f-3d9e884f44e0")
    public void addClock_Instance(Clock_Instance model) {
        this.element.getDeclared().add(model.getElement());
    }

    @objid ("baec4f90-932e-4a0b-80fd-69e5214861b2")
    public List<ClockType_Class> getClockType_Class() {
        List<ClockType_Class> res = new java.util.ArrayList<>();        
        for(ModelTree modelTree : this.element.getOwnedElement()){
            res.add(new ClockType_Class((Class)modelTree));
        }
        return res;
    }

    @objid ("013af843-35e1-45a9-ab2e-bd8d7964c97d")
    public void addClockType_Class(ClockType_Class model) {
        this.element.getOwnedElement().add(model.getElement());
    }

}
