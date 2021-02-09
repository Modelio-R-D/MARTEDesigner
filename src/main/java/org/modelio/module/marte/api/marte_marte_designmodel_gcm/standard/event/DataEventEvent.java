/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.event;

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
 * Proxy class to handle a {@link Event} with << DataEvent_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DataEventEvent {
    public static final String STEREOTYPE_NAME = "DataEvent_Event";

    public static final String DATAEVENT_EVENT_CLASSIFIER_TAGTYPE = "DataEvent_Event_classifier";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    protected final Event elt;

    /**
     * Tells whether a {@link DataEventEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << DataEvent_Event >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataEventEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << DataEvent_Event >> then instantiate a {@link DataEventEvent} proxy.
     * 
     * @return a {@link DataEventEvent} proxy on the created {@link Event}.
     */
    public static DataEventEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataEventEvent.STEREOTYPE_NAME);
        return DataEventEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link DataEventEvent} proxy from a {@link Event} stereotyped << DataEvent_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link DataEventEvent} proxy or <i>null</i>.
     */
    public static DataEventEvent instantiate(final Event obj) {
        return DataEventEvent.canInstantiate(obj) ? new DataEventEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataEventEvent} proxy from a {@link Event} stereotyped << DataEvent_Event >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Event}
     * @return a {@link DataEventEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DataEventEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (DataEventEvent.canInstantiate(obj))
        	return new DataEventEvent(obj);
        else
        	throw new IllegalArgumentException("DataEventEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DataEventEvent other = (DataEventEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataEvent_Event_classifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataEvent_Event_classifier() {
        return this.elt.getTagValue(DataEventEvent.MdaTypes.DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT);
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
     * Setter for string property 'DataEvent_Event_classifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataEvent_Event_classifier(final String value) {
        this.elt.putTagValue(DataEventEvent.MdaTypes.DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT, value);
    }

    protected DataEventEvent(final Event elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0264424e-0ccf-11df-8525-001302895b2b");
            DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264424f-0ccf-11df-8525-001302895b2b");
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
