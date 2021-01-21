package org.modelio.module.marte.profile.time.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e15ad304-f8e2-46f2-8476-e8a3fb91d9c1")
public class TimedEvent_Event {
    @objid ("6bfcec38-3beb-4988-9f4d-d9ff05d584d0")
    protected Event element;

    @objid ("4adcfe93-592d-47ae-8a84-bcf583f89206")
    public TimedEvent_Event() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEvent();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDEVENT_EVENT);
        this.element.setName(MARTEResourceManager.getName("TimedEvent_Event")+ModelUtils.getNbElement(Event.class, MARTEDesignerStereotypes.TIMEDEVENT_EVENT));
    }

    @objid ("86935e23-e027-46d2-b2dd-98284bc4cac9")
    public TimedEvent_Event(Event element) {
        this.element = element;
    }

    @objid ("ce2e0008-e0d7-45d2-b92a-36a78cb8d754")
    public Event getElement() {
        return this.element;
    }

    @objid ("9a6a10c3-b3bb-4d7d-98f2-b39a85c13601")
    public void setParent(Behavior parent) {
        this.element.setComposed(parent);
    }

    @objid ("0593d1f2-3c74-4c9f-8192-24c2f7cc9a17")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("8f74471f-d841-4661-938c-6e364d4ceb80")
    public String getrepetition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, this.element);
    }

    @objid ("44fd2669-b607-44ba-8476-b45f1dce0b54")
    public void setrepetition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, value);
    }

    @objid ("b5cae0d0-ea5b-46cc-ab9d-513ff1908e88")
    public String getevery() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, this.element);
    }

    @objid ("b8c81d1a-676d-4970-9ebc-197f4fd218d8")
    public void setevery(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, value);
    }

    @objid ("9d9bc543-b3ac-49e0-9523-eeff5ce69c8a")
    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
