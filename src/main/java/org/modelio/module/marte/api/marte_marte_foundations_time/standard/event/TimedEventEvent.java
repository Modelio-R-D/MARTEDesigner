/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Event} with << TimedEvent_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedEventEvent {
    public static final String STEREOTYPE_NAME = "TimedEvent_Event";

    public static final String TIMEDEVENT_EVENT_EVERY_TAGTYPE = "TimedEvent_Event_every";

    public static final String TIMEDEVENT_EVENT_ON_TAGTYPE = "TimedEvent_Event_on";

    public static final String TIMEDEVENT_EVENT_REPETITION_TAGTYPE = "TimedEvent_Event_repetition";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    protected final Event elt;

    /**
     * Tells whether a {@link TimedEventEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << TimedEvent_Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedEventEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << TimedEvent_Event >> then instantiate a {@link TimedEventEvent} proxy.
     * 
     * @return a {@link TimedEventEvent} proxy on the created {@link Event}.
     */
    public static TimedEventEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedEventEvent.STEREOTYPE_NAME);
        return TimedEventEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link TimedEventEvent} proxy from a {@link Event} stereotyped << TimedEvent_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link TimedEventEvent} proxy or <i>null</i>.
     */
    public static TimedEventEvent instantiate(final Event obj) {
        return TimedEventEvent.canInstantiate(obj) ? new TimedEventEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedEventEvent} proxy from a {@link Event} stereotyped << TimedEvent_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Event}
     * @return a {@link TimedEventEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedEventEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (TimedEventEvent.canInstantiate(obj))
        	return new TimedEventEvent(obj);
        else
        	throw new IllegalArgumentException("TimedEventEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TimedEventEvent other = (TimedEventEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Event}. 
     * @return the Event represented by this proxy, never null.
     */
    public Event getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedEvent_Event_every'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedEvent_Event_every() {
        return this.elt.getTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedEvent_Event_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedEvent_Event_on() {
        return this.elt.getTagValues(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedEvent_Event_repetition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedEvent_Event_repetition() {
        return this.elt.getTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedEvent_Event_every'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedEvent_Event_every(final String value) {
        this.elt.putTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedEvent_Event_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedEvent_Event_on(final List<String> values) {
        this.elt.putTagValues(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedEvent_Event_repetition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedEvent_Event_repetition(final String value) {
        this.elt.putTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT, value);
    }

    protected TimedEventEvent(final Event elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT;

        public static TagType TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT;

        public static TagType TIMEDEVENT_EVENT_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db4bf5a2-0cce-11df-8525-001302895b2b");
            TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db4bf5a3-0cce-11df-8525-001302895b2b");
            TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db4bf5a4-0cce-11df-8525-001302895b2b");
            TIMEDEVENT_EVENT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ae6f6d5f-c7fd-11e0-9823-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
