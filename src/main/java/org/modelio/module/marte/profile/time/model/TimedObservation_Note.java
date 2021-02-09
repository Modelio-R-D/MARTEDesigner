package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedObservation_Note {
    protected Note element;

    public TimedObservation_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDOBSERVATION_NOTE);
        this.element.setName(MARTEResourceManager.getName("TimedObservation"));
    }

    public TimedObservation_Note(Note element) {
        this.element = element;
    }

    public Note getElement() {
        return this.element;
    }

    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
