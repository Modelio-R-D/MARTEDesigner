/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("c7a6f2c7-6526-43fa-a474-347bd078d82b")
public class TimedEventEvent {
    @objid ("5ade291a-02c7-452c-aee1-13e4aa542801")
    public static final String STEREOTYPE_NAME = "TimedEvent_Event";

    @objid ("d47e57e0-9f2d-4ca5-80c8-f893e94f5c0a")
    public static final String TIMEDEVENT_EVENT_EVERY_TAGTYPE = "TimedEvent_Event_every";

    @objid ("e0d8149f-0ef2-47f8-b5d5-1539a5956da6")
    public static final String TIMEDEVENT_EVENT_ON_TAGTYPE = "TimedEvent_Event_on";

    @objid ("2ec72626-78f0-4424-ba20-ea58501d00bb")
    public static final String TIMEDEVENT_EVENT_REPETITION_TAGTYPE = "TimedEvent_Event_repetition";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    @objid ("841b1892-2381-406e-bd2f-51143140e93c")
    protected final Event elt;

    /**
     * Tells whether a {@link TimedEventEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << TimedEvent_Event >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7e08bae4-460a-481c-92f7-161bc65015f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedEventEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << TimedEvent_Event >> then instantiate a {@link TimedEventEvent} proxy.
     * 
     * @return a {@link TimedEventEvent} proxy on the created {@link Event}.
     */
    @objid ("28172a0a-99ac-4470-ab46-3c658d5bda60")
    public static TimedEventEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedEventEvent.STEREOTYPE_NAME);
        return TimedEventEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link TimedEventEvent} proxy from a {@link Event} stereotyped << TimedEvent_Event >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link TimedEventEvent} proxy or <i>null</i>.
     */
    @objid ("7efe7123-3e6d-4cdf-aa51-be6ca708312b")
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
    @objid ("3ce2de3d-4fb6-4d7b-83bf-18d2b6b98132")
    public static TimedEventEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (TimedEventEvent.canInstantiate(obj))
        	return new TimedEventEvent(obj);
        else
        	throw new IllegalArgumentException("TimedEventEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("893514dc-ef0d-4b08-a5e9-d743fbc0e3a9")
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
    @objid ("99b036f8-bc4d-4d47-b393-783e317349c3")
    public Event getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedEvent_Event_every'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba8d2da9-f0a0-40ad-b139-d873f2f11c2a")
    public String getTimedEvent_Event_every() {
        return this.elt.getTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedEvent_Event_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("32a31204-5e11-4b9f-bd25-5a458c1652f8")
    public List<String> getTimedEvent_Event_on() {
        return this.elt.getTagValues(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedEvent_Event_repetition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b833398f-391e-46c2-b5f6-15647909bdc4")
    public String getTimedEvent_Event_repetition() {
        return this.elt.getTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT);
    }

    @objid ("524c1403-4a66-42ce-945e-519f9e0159b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedEvent_Event_every'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7cb61dc-4ad4-4c0f-b694-7262bca932ca")
    public void setTimedEvent_Event_every(final String value) {
        this.elt.putTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedEvent_Event_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d3e8ca6-56c7-42a6-a095-e612ca5a841d")
    public void setTimedEvent_Event_on(final List<String> values) {
        this.elt.putTagValues(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedEvent_Event_repetition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f7935d0-566a-4bee-968b-0d36b26830bd")
    public void setTimedEvent_Event_repetition(final String value) {
        this.elt.putTagValue(TimedEventEvent.MdaTypes.TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT, value);
    }

    @objid ("957d7ba0-5e3b-4b5d-b338-ef2833623e8f")
    protected TimedEventEvent(final Event elt) {
        this.elt = elt;
    }

    @objid ("d44b9884-eb07-4ed0-bd64-195f38642d69")
    public static final class MdaTypes {
        @objid ("7126129e-dc11-43c8-b74f-51b2f72bf372")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4a54f5f-9e2a-4190-8377-c0957d7059d7")
        public static TagType TIMEDEVENT_EVENT_REPETITION_TAGTYPE_ELT;

        @objid ("cf676708-27bb-4af1-89ce-948e621c27d1")
        public static TagType TIMEDEVENT_EVENT_EVERY_TAGTYPE_ELT;

        @objid ("37d81b49-44c9-4039-899b-e4b23d06d136")
        public static TagType TIMEDEVENT_EVENT_ON_TAGTYPE_ELT;

        @objid ("9a95db00-5ace-4fbf-b5bc-dc159d50e359")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bbb23c8-b1dd-4375-aa9d-7a43cb30373a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f570f41-fe01-4bd3-a80c-dcb8aa78720d")
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
