/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.event;

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
 * Proxy class to handle a {@link Event} with << DataEvent_Event >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e02a456d-3893-43ba-b216-68cc5acda9fb")
public class DataEventEvent {
    @objid ("3a14c3b3-cc5f-4f7e-bc15-e9aa80cf5b04")
    public static final String STEREOTYPE_NAME = "DataEvent_Event";

    @objid ("7d16b83b-c6ec-4715-9c4c-b1a460531b55")
    public static final String DATAEVENT_EVENT_CLASSIFIER_TAGTYPE = "DataEvent_Event_classifier";

    /**
     * The underlying {@link Event} represented by this proxy, never null.
     */
    @objid ("74eee9db-ee7f-4943-92b1-fdfa6c59e99d")
    protected final Event elt;

    /**
     * Tells whether a {@link DataEventEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Event} stereotyped << DataEvent_Event >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("820b0277-7dcb-4a4f-bebe-41b345de20f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Event) && ((Event) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataEventEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Event} stereotyped << DataEvent_Event >> then instantiate a {@link DataEventEvent} proxy.
     * 
     * @return a {@link DataEventEvent} proxy on the created {@link Event}.
     */
    @objid ("333e1d03-63eb-4ce8-8f48-c7e1dbd203c4")
    public static DataEventEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Event");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataEventEvent.STEREOTYPE_NAME);
        return DataEventEvent.instantiate((Event)e);
    }

    /**
     * Tries to instantiate a {@link DataEventEvent} proxy from a {@link Event} stereotyped << DataEvent_Event >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Event
     * @return a {@link DataEventEvent} proxy or <i>null</i>.
     */
    @objid ("5503f5fb-3a3b-4bfe-8962-56fe919ba5aa")
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
    @objid ("9fb80dac-2ad8-4610-9dce-9331b50b2eb6")
    public static DataEventEvent safeInstantiate(final Event obj) throws IllegalArgumentException {
        if (DataEventEvent.canInstantiate(obj))
        	return new DataEventEvent(obj);
        else
        	throw new IllegalArgumentException("DataEventEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d374913-d9d8-4153-9222-82a2dd54a584")
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
    @objid ("17dc1b3e-6bea-4bd9-a65c-18291f72c74a")
    public String getDataEvent_Event_classifier() {
        return this.elt.getTagValue(DataEventEvent.MdaTypes.DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Event}. 
     * @return the Event represented by this proxy, never null.
     */
    @objid ("3fd2a0a4-2757-45ea-9253-0346f3c8cbe1")
    public Event getElement() {
        return this.elt;
    }

    @objid ("e9cb3bdd-080d-432c-b0a3-29c5669a0919")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataEvent_Event_classifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad866483-bf85-416c-948a-0cc9a292efdd")
    public void setDataEvent_Event_classifier(final String value) {
        this.elt.putTagValue(DataEventEvent.MdaTypes.DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT, value);
    }

    @objid ("63e5f268-b009-4027-b2e4-c541a1174391")
    protected DataEventEvent(final Event elt) {
        this.elt = elt;
    }

    @objid ("c0cbf81e-96c4-4bbf-9955-83af5e58c854")
    public static final class MdaTypes {
        @objid ("9e172a41-ccc7-41dd-ac70-2d9dfa2a8f28")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb43f9c8-997f-40dd-9398-103c52d10bc3")
        public static TagType DATAEVENT_EVENT_CLASSIFIER_TAGTYPE_ELT;

        @objid ("7bd0837d-7b1f-4b33-87b4-54b0a61bfc72")
        private static Stereotype MDAASSOCDEP;

        @objid ("64d81860-51f1-48b0-8c0e-2fad2c2c9000")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37bbaf9a-f146-4173-a6f5-e7ab3036d676")
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
