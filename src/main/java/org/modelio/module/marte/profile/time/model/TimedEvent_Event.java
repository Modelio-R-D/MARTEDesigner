package org.modelio.module.marte.profile.time.model;

import java.util.List;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TimedEvent_Event {
    protected Event element;

    public TimedEvent_Event() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEvent();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMEDEVENT_EVENT);
        this.element.setName(MARTEResourceManager.getName("TimedEvent_Event")+ModelUtils.getNbElement(Event.class, MARTEDesignerStereotypes.TIMEDEVENT_EVENT));
    }

    public TimedEvent_Event(Event element) {
        this.element = element;
    }

    public Event getElement() {
        return this.element;
    }

    public void setParent(Behavior parent) {
        this.element.setComposed(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getrepetition() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, this.element);
    }

    public void setrepetition(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_REPETITION, value);
    }

    public String getevery() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, this.element);
    }

    public void setevery(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.TIMEDEVENT_EVENT_TIMEDEVENT_EVENT_EVERY, value);
    }

    public List<TimedElement> getTimedElement() {
        List<TimedElement> res = new java.util.ArrayList<>();        
        for(Dependency dep : this.element.getDependsOnDependency()){
            res.add(new TimedElement(dep));
        }
        return res;
    }

}
