/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Note} with << TimedObservation_Note >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("84c1c2cc-0c06-4593-a284-560866afb4d2")
public class TimedObservationNote {
    @objid ("2799e471-de0e-499e-b16e-7e78a6a2c445")
    public static final String STEREOTYPE_NAME = "TimedObservation_Note";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    @objid ("17d21d4a-1078-4aa1-8a30-60a0906a750e")
    protected final Note elt;

    /**
     * Tells whether a {@link TimedObservationNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << TimedObservation_Note >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dd94e570-3da7-429d-8035-6be73ae2998e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedObservationNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << TimedObservation_Note >> then instantiate a {@link TimedObservationNote} proxy.
     * 
     * @return a {@link TimedObservationNote} proxy on the created {@link Note}.
     */
    @objid ("34499cd0-f375-43c6-80b2-d77fda0d0ff5")
    public static TimedObservationNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedObservationNote.STEREOTYPE_NAME);
        return TimedObservationNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link TimedObservationNote} proxy from a {@link Note} stereotyped << TimedObservation_Note >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link TimedObservationNote} proxy or <i>null</i>.
     */
    @objid ("513580ac-e464-4ea9-b482-ab5178ba8c50")
    public static TimedObservationNote instantiate(final Note obj) {
        return TimedObservationNote.canInstantiate(obj) ? new TimedObservationNote(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedObservationNote} proxy from a {@link Note} stereotyped << TimedObservation_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Note}
     * @return a {@link TimedObservationNote} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("78e96940-9e65-49a5-88b2-6989db8d7d47")
    public static TimedObservationNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (TimedObservationNote.canInstantiate(obj))
        	return new TimedObservationNote(obj);
        else
        	throw new IllegalArgumentException("TimedObservationNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d47ea49f-af27-4ee5-a53e-57d03ace9429")
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
        TimedObservationNote other = (TimedObservationNote) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Note}. 
     * @return the Note represented by this proxy, never null.
     */
    @objid ("45887daf-3a2f-476e-bf9b-c5e9ea9aa5f5")
    public Note getElement() {
        return this.elt;
    }

    @objid ("d8ac9ec3-3eef-4840-bf7d-98487c513177")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3e9f9e58-27be-4ce1-9392-241cf96fcc72")
    protected TimedObservationNote(final Note elt) {
        this.elt = elt;
    }

    @objid ("01a06f35-10ad-43b6-9a0e-d1c6f32f6b2f")
    public static final class MdaTypes {
        @objid ("3a78bdae-b046-476d-ae06-9b6bd10779e8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92479f3f-f7b6-4bba-bec3-972680fe733f")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9d90b9f-34cb-4fc5-ad62-3cafa4f7eb5a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b695714-ee8b-4195-b86e-5bb0e085f560")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "65426dcf-2210-11df-b40d-0014224f9977");
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
