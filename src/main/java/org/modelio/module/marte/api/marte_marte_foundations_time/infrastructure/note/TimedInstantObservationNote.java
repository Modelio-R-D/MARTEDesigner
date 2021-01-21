/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Note} with << TimedInstantObservation_Note >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("79a5bf05-4d06-4164-b800-060c3e3cf4eb")
public class TimedInstantObservationNote {
    @objid ("151bc859-2d04-41a7-8014-bffbf4f75dc5")
    public static final String STEREOTYPE_NAME = "TimedInstantObservation_Note";

    @objid ("5acf40d3-85c5-46e5-8e91-55cf34851dee")
    public static final String TIMEDINSTANTOBSERVATION_NOTE_OBSKIND_TAGTYPE = "TimedInstantObservation_Note_obsKind";

    @objid ("feccbb61-37e8-4016-80f4-a31bf57daa2c")
    public static final String TIMEDINSTANTOBSERVATION_NOTE_ON_TAGTYPE = "TimedInstantObservation_Note_on";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    @objid ("a0b0645e-b8e0-4d7b-a47b-ba61ecec6e25")
    protected final Note elt;

    /**
     * Tells whether a {@link TimedInstantObservationNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << TimedInstantObservation_Note >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3027c98f-b9e1-491d-9e6e-4ddc41369a29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedInstantObservationNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << TimedInstantObservation_Note >> then instantiate a {@link TimedInstantObservationNote} proxy.
     * 
     * @return a {@link TimedInstantObservationNote} proxy on the created {@link Note}.
     */
    @objid ("55df304b-aad2-4bf3-aad6-9e147b383257")
    public static TimedInstantObservationNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedInstantObservationNote.STEREOTYPE_NAME);
        return TimedInstantObservationNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link TimedInstantObservationNote} proxy from a {@link Note} stereotyped << TimedInstantObservation_Note >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link TimedInstantObservationNote} proxy or <i>null</i>.
     */
    @objid ("2d50d37f-d6a3-4e25-bac7-329157847cdb")
    public static TimedInstantObservationNote instantiate(final Note obj) {
        return TimedInstantObservationNote.canInstantiate(obj) ? new TimedInstantObservationNote(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedInstantObservationNote} proxy from a {@link Note} stereotyped << TimedInstantObservation_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Note}
     * @return a {@link TimedInstantObservationNote} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0248b5d0-2b58-411d-9cb3-b80b898345bb")
    public static TimedInstantObservationNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (TimedInstantObservationNote.canInstantiate(obj))
        	return new TimedInstantObservationNote(obj);
        else
        	throw new IllegalArgumentException("TimedInstantObservationNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3c9ab3cb-fad1-48cd-94b2-be6b92d7fd71")
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
        TimedInstantObservationNote other = (TimedInstantObservationNote) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Note}. 
     * @return the Note represented by this proxy, never null.
     */
    @objid ("fe1f003c-72ab-4b5d-a816-324c18db7f29")
    public Note getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedInstantObservation_Note_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("019c3bb4-fab4-4219-a76f-4ac5d5fcefb4")
    public String getTimedInstantObservation_Note_obsKind() {
        return this.elt.getTagValue(TimedInstantObservationNote.MdaTypes.TIMEDINSTANTOBSERVATION_NOTE_OBSKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedInstantObservation_Note_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("149061a0-6676-4594-af9c-1c01035ede33")
    public List<String> getTimedInstantObservation_Note_on() {
        return this.elt.getTagValues(TimedInstantObservationNote.MdaTypes.TIMEDINSTANTOBSERVATION_NOTE_ON_TAGTYPE_ELT);
    }

    @objid ("170a71d9-6520-4d88-b7ef-00e87de3b1a3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedInstantObservation_Note_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2199a978-87aa-4575-8f64-afd3c71cb02d")
    public void setTimedInstantObservation_Note_obsKind(final String value) {
        this.elt.putTagValue(TimedInstantObservationNote.MdaTypes.TIMEDINSTANTOBSERVATION_NOTE_OBSKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedInstantObservation_Note_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45de5b6e-3b9d-494b-8c6c-7ff606f04ab4")
    public void setTimedInstantObservation_Note_on(final List<String> values) {
        this.elt.putTagValues(TimedInstantObservationNote.MdaTypes.TIMEDINSTANTOBSERVATION_NOTE_ON_TAGTYPE_ELT, values);
    }

    @objid ("ca3307f7-d04e-408a-8372-d7ddd864cace")
    protected TimedInstantObservationNote(final Note elt) {
        this.elt = elt;
    }

    @objid ("92760db0-5431-4680-b30b-58973521cf98")
    public static final class MdaTypes {
        @objid ("abd64456-472c-4e9c-a60c-d19f76c78b14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3562e5bc-aaf3-40d2-8e41-b5ebb4cf023a")
        public static TagType TIMEDINSTANTOBSERVATION_NOTE_OBSKIND_TAGTYPE_ELT;

        @objid ("1ca9be12-1f90-42cb-a62f-03a4b9ed08ae")
        public static TagType TIMEDINSTANTOBSERVATION_NOTE_ON_TAGTYPE_ELT;

        @objid ("12e8da01-7e26-4111-88d6-6f438157ce0e")
        private static Stereotype MDAASSOCDEP;

        @objid ("659c9863-5f99-484d-8ce8-478fb2f08ca2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37e38fee-6cb7-4443-af85-6b3cbb5bddf9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db400a08-0cce-11df-8525-001302895b2b");
            TIMEDINSTANTOBSERVATION_NOTE_OBSKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db400a09-0cce-11df-8525-001302895b2b");
            TIMEDINSTANTOBSERVATION_NOTE_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "66609093-1259-11df-8f55-0014222a9f79");
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
