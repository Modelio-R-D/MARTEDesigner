package org.modelio.module.marte.profile.gcm.model;

import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class DataEvent_Event {
    protected Event element;

    public DataEvent_Event() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEvent();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAEVENT_EVENT);
        this.element.setName(MARTEResourceManager.getName("DataEvent_Event"));
    }

    public DataEvent_Event(Event element) {
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

    public String getclassifier() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER, this.element);
    }

    public void setclassifier(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER, value);
    }

}
