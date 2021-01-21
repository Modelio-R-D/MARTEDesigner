package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("7a94878a-5af6-4b6d-b320-039811bc1c70")
public class TimedObservation_Note {
    @objid ("c21e0bd3-480b-4d4a-aec9-316d2040db82")
    protected Note element;

    @objid ("99572a43-daf4-4a85-b19b-f2e58a544a8e")
    public TimedObservation_Note() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNote();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDOBSERVATION_NOTE);
        this.element.setName(MARTEResourceManager.getName("TimedObservation"));
    }

    @objid ("5b902e41-a42a-417c-85f1-69efc1e9d330")
    public TimedObservation_Note(Note element) {
        this.element = element;
    }

    @objid ("ee05f8c2-98e0-4253-a1ea-8eba7c996539")
    public Note getElement() {
        return this.element;
    }

    @objid ("46517cee-f24c-416a-8846-445b8318208e")
    public void setParent(ModelElement parent) {
        this.element.setSubject(parent);
    }

    @objid ("3c0fe391-c102-4f70-b48c-b7d3620d6003")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
