/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.event;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Event} with << Clock_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ff09eb50-2c5f-4a17-ba18-8c96f9e52d98")
public class ClockEvent {
    @objid ("e675f9c6-0705-4949-bf6f-339997b02ac3")
    public static final String STEREOTYPE_NAME = "Clock_Event";

    @objid ("4529fa1f-1976-41c5-b51b-e062fbaf4298")
    public static final String CLOCK_EVENT_STANDARD_TAGTYPE = "Clock_Event_standard";

    @objid ("dc9f7eef-897e-4888-8a25-3be4472864d6")
    public static final String CLOCK_EVENT_TYPE_TAGTYPE = "Clock_Event_type";

    @objid ("20bf515f-90d0-4a61-99b0-b0b4ae29d8ed")
    public static final String CLOCK_EVENT_UNIT_TAGTYPE = "Clock_Event_unit";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    @objid ("b38df3cd-fc2c-4849-999a-abc2f31fe770")
    protected final Event elt;

    /**
     * Tells whether a {@link ClockEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << Clock_Event >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("20531133-092b-488c-83de-113a8fbd4cf6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << Clock_Event >> then instantiate a {@link ClockEvent} proxy.
     * 
     * @return a {@link ClockEvent} proxy on the created {@link Event}.
     */
    @objid ("af99c5d3-3841-42bd-a398-bc9b140d7786")
    public static ClockEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockEvent.STEREOTYPE_NAME);
        return ClockEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link ClockEvent} proxy from a {@link Event} stereotyped << Clock_Event >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link ClockEvent} proxy or <i>null</i>.
     */
    @objid ("419b8a7e-d7bf-495e-99bc-ea5c8a8a517f")
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
    @objid ("6871d3ce-3821-403c-a8b3-989ab65ef996")
    public static ClockEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (ClockEvent.canInstantiate(obj))
        	return new ClockEvent(obj);
        else
        	throw new IllegalArgumentException("ClockEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8c5e177-b5e7-4808-90c5-8b97b15b0413")
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
    @objid ("325a9c78-0318-4e1c-91dd-17f0a09c7fec")
    public String getClock_Event_standard() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Event_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("039d5cea-2267-4200-b0b6-3cefca83cf7a")
    public String getClock_Event_type() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Event_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d1f6242-33d9-4ad0-9e94-f5ce1c72e67a")
    public String getClock_Event_unit() {
        return this.elt.getTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Event}. 
     * @return the Event represented by this proxy, never null.
     */
    @objid ("953f9a48-c0a7-4cba-a0fb-dc14f10a1e7b")
    public Event getElement() {
        return this.elt;
    }

    @objid ("fbe8f570-c25b-4649-9cb6-0281febadfc9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Event_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4699950c-e48a-45b8-a176-ddafa8646bfe")
    public void setClock_Event_standard(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Event_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("324c6f4d-0eb5-42c2-9863-cefe71ceed1b")
    public void setClock_Event_type(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Event_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("585272c1-4718-49f2-a31d-bb23be0d6110")
    public void setClock_Event_unit(final String value) {
        this.elt.putTagValue(ClockEvent.MdaTypes.CLOCK_EVENT_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("5deb93ce-0c64-4f96-bbe1-e8b342310ca9")
    protected ClockEvent(final Event elt) {
        this.elt = elt;
    }

    @objid ("d3fe6153-47be-4cc8-8a2f-b2ddb1968b96")
    public static final class MdaTypes {
        @objid ("35a20bf2-fc73-4f91-b8d5-e59876e5155d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("682aac8e-370f-43a6-bcb8-0fdd81a6c5ba")
        public static TagType CLOCK_EVENT_STANDARD_TAGTYPE_ELT;

        @objid ("65118f74-3377-43d9-ad18-27345cd92b90")
        public static TagType CLOCK_EVENT_TYPE_TAGTYPE_ELT;

        @objid ("5d435a32-66f1-496d-b682-a5597837bb35")
        public static TagType CLOCK_EVENT_UNIT_TAGTYPE_ELT;

        @objid ("94dc6e4a-6509-423c-a2ec-bfee516bd9d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ea5ab0d-66d5-46be-9a74-c7de29d0e660")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffb9e08b-e445-4ef7-a827-47f86f995b23")
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
