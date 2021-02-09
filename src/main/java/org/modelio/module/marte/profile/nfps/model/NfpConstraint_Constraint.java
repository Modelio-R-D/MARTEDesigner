package org.modelio.module.marte.profile.nfps.model;

import java.util.List;
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

public class NfpConstraint_Constraint {
    protected Constraint element;

    public NfpConstraint_Constraint() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConstraint();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NFPCONSTRAINT_CONSTRAINT);
        this.element.setName(MARTEResourceManager.getName("NfpConstraint_Constraint"));
    }

    public NfpConstraint_Constraint(final Constraint element) {
        this.element = element;
    }

    public Constraint getElement() {
        return this.element;
    }

    public void setParent(final UmlModelElement parent) {
        this.element.getConstrainedElement().add(parent);
    }

    public String getkind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, this.element);
    }

    public void setkind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.NFPCONSTRAINT_CONSTRAINT_NFPCONSTRAINT_CONSTRAINT_KIND, value);
    }

    public List<Allocate_Dependency> getAllocate_Dependency() {
        List<Allocate_Dependency> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new Allocate_Dependency((Dependency)constrainedElt));
        }
        return res;
    }

    public List<Assign_Note> getAssign_Note() {
        List<Assign_Note> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new Assign_Note((Note)constrainedElt));
        }
        return res;
    }

    public List<NfpRefine_Dependency> getNfpRefine_Dependency() {
        List<NfpRefine_Dependency> res = new java.util.ArrayList<>();        
        for(ModelElement constrainedElt : this.element.getConstrainedElement()){
            res.add(new NfpRefine_Dependency((Dependency)constrainedElt));
        }
        return res;
    }

    public enum ConstraintKind {
        required,
        offered,
        contract;
    }

}
