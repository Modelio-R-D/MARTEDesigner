package org.modelio.module.marte.profile.gcm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c87e369e-8ea2-469d-b043-d9734d4ffd23")
public class DataEvent_Event {
    @objid ("cf69c748-37a8-45f5-aa29-8e426381a9d6")
    protected Event element;

    @objid ("1487e80b-a35d-4ee7-9c80-f29fd861d977")
    public DataEvent_Event() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createEvent();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DATAEVENT_EVENT);
        this.element.setName(MARTEResourceManager.getName("DataEvent_Event"));
    }

    @objid ("c6093f10-e3af-44b5-a0d6-1e53c2ccef41")
    public DataEvent_Event(Event element) {
        this.element = element;
    }

    @objid ("7a36df42-a34a-445a-9f1b-74d9ecd10cd6")
    public Event getElement() {
        return this.element;
    }

    @objid ("c4e20937-f855-4e71-8081-fb42bf828fbf")
    public void setParent(Behavior parent) {
        this.element.setComposed(parent);
    }

    @objid ("f604027f-b30a-4454-ae9e-e68899b8c920")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("aa67cf20-f0ad-47e0-a7a1-940d52899826")
    public String getclassifier() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER, this.element);
    }

    @objid ("1c264913-25ac-4847-9690-45c0ea90132c")
    public void setclassifier(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.DATAEVENT_EVENT_DATAEVENT_EVENT_CLASSIFIER, value);
    }

}
