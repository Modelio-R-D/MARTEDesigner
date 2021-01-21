package org.modelio.module.marte.profile.nfps.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.alloc.model.Allocate_Dependency;
import org.modelio.module.marte.profile.alloc.model.Assign_Note;
import org.modelio.module.marte.profile.alloc.model.NfpRefine_Dependency;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4d2037fb-0e1e-4327-8801-2c881beb005a")
public class NfpConstraint_Constraint {
    @objid ("b5753628-23bd-48b7-8db5-9ea4ef9b6361")
    protected Constraint element;

    @objid ("cfc02c61-9c37-4454-852b-88146dd88a42")
    public NfpConstraint_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NFPCONSTRAINT_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("NfpConstraint_Constraint"));
    }

    @objid ("9dba25d9-fe30-4a03-a4da-1436a7c93a46")
    public NfpConstraint_Constraint(final Constraint element) {
        this.element = element;
    }

    @objid ("7974f97d-942d-48d7-a3f6-b174604b32a4")
    public Constraint getElement() {
        return this.element;
    }

    @objid ("1f1fbaf8-542f-474f-9689-354ddf7bd15a")
    public void setParent(final UmlModelElement parent) {
        this.element.getConstrainedElement().add(parent);
    }

    @objid ("3560f898-fc6d-41e2-ab27-4bdf936df083")
    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, this.element);
    }

    @objid ("c39ed16f-dd94-4619-b063-7920d78c158d")
    public void setkind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, value);
    }

    @objid ("86d66f2b-f58a-4597-8839-f93f7c6bf0fb")
    public List<Allocate_Dependency> getAllocate_Dependency() {
        List<Allocate_Dependency> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new Allocate_Dependency((Dependency)constrainedElt));
        }
        return res;
    }

    @objid ("350997fe-22b4-4b4e-80d6-321f698557c0")
    public List<Assign_Note> getAssign_Note() {
        List<Assign_Note> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new Assign_Note((Note)constrainedElt));
        }
        return res;
    }

    @objid ("7bece5a1-f263-4bd1-8628-5f1b5d6d44ac")
    public List<NfpRefine_Dependency> getNfpRefine_Dependency() {
        List<NfpRefine_Dependency> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new NfpRefine_Dependency((Dependency)constrainedElt));
        }
        return res;
    }

    @objid ("89693d3f-6c29-44ba-96ca-fa25e8f88e3a")
    public enum ConstraintKind {
        required,
        offered,
        contract;
    }

}
