/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.event;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Event} with << Clock_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockEvent {
    public static final String STEREOTYPE_NAME = "Clock_Event";

    public static final String CLOCK_EVENT_STANDARD_TAGTYPE = "Clock_Event_standard";

    public static final String CLOCK_EVENT_TYPE_TAGTYPE = "Clock_Event_type";

    public static final String CLOCK_EVENT_UNIT_TAGTYPE = "Clock_Event_unit";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    protected final Event elt;

    /**
     * Tells whether a {@link ClockEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << Clock_Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << Clock_Event >> then instantiate a {@link ClockEvent} proxy.
     * 
     * @return a {@link ClockEvent} proxy on the created {@link Event}.
     */
    public static ClockEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockEvent.STEREOTYPE_NAME);
        return ClockEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link ClockEvent} proxy from a {@link Event} stereotyped << Clock_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link ClockEvent} proxy or <i>null</i>.
     */
    public static ClockEvent instantiate(final Event obj) {
        return ClockEvent.canInstantiate(obj) ? new ClockEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockEvent} proxy from a {@link Event} stereotyped << Clock_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Event}
     * @return a {@link ClockEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (ClockEvent.canInstantiate(obj))
        	return new ClockEvent(obj);
        else
        	throw new IllegalArgumentException("ClockEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ClockEvent other = (ClockEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Event_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Event_standard() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Event_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Event_type() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Event_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClock_Event_unit() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Event}. 
     * @return the Event represented by this proxy, never null.
     */
    public Event getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Event_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Event_standard(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Event_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Event_type(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Event_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClock_Event_unit(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_UNIT_TAGTYPE_ELT, value);
    }

    protected ClockEvent(final Event elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCK_EVENT_STANDARD_TAGTYPE_ELT;

        public static TagType CLOCK_EVENT_TYPE_TAGTYPE_ELT;

        public static TagType CLOCK_EVENT_UNIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6b5f54f4-9e85-11e1-9e75-0027103f347d");
            CLOCK_EVENT_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d79561ae-9e85-11e1-9e75-0027103f347d");
            CLOCK_EVENT_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d87f798c-9e85-11e1-9e75-0027103f347d");
            CLOCK_EVENT_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d952ad74-9e85-11e1-9e75-0027103f347d");
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
