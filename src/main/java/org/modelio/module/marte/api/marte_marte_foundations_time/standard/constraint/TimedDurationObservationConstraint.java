/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
 * Proxy class to handle a {@link Constraint} with << TimedDurationObservation_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedDurationObservationConstraint {
    public static final String STEREOTYPE_NAME = "TimedDurationObservation_Constraint";

    public static final String TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE = "TimedDurationObservation_Constraint_obsKind";

    public static final String TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE = "TimedDurationObservation_Constraint_on";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    protected final Constraint elt;

    /**
     * Tells whether a {@link TimedDurationObservationConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << TimedDurationObservation_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedDurationObservationConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << TimedDurationObservation_Constraint >> then instantiate a {@link TimedDurationObservationConstraint} proxy.
     * 
     * @return a {@link TimedDurationObservationConstraint} proxy on the created {@link Constraint}.
     */
    public static TimedDurationObservationConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedDurationObservationConstraint.STEREOTYPE_NAME);
        return TimedDurationObservationConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link TimedDurationObservationConstraint} proxy from a {@link Constraint} stereotyped << TimedDurationObservation_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link TimedDurationObservationConstraint} proxy or <i>null</i>.
     */
    public static TimedDurationObservationConstraint instantiate(final Constraint obj) {
        return TimedDurationObservationConstraint.canInstantiate(obj) ? new TimedDurationObservationConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedDurationObservationConstraint} proxy from a {@link Constraint} stereotyped << TimedDurationObservation_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link TimedDurationObservationConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedDurationObservationConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (TimedDurationObservationConstraint.canInstantiate(obj))
        	return new TimedDurationObservationConstraint(obj);
        else
        	throw new IllegalArgumentException("TimedDurationObservationConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimedDurationObservationConstraint other = (TimedDurationObservationConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedDurationObservation_Constraint_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedDurationObservation_Constraint_obsKind() {
        return this.elt.getTagValue(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedDurationObservation_Constraint_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedDurationObservation_Constraint_on() {
        return this.elt.getTagValues(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedDurationObservation_Constraint_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedDurationObservation_Constraint_obsKind(final String value) {
        this.elt.putTagValue(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedDurationObservation_Constraint_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedDurationObservation_Constraint_on(final List<String> values) {
        this.elt.putTagValues(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT, values);
    }

    protected TimedDurationObservationConstraint(final Constraint elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT;

        public static TagType TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "964bf953-35f7-11e1-9a03-0027103f347d");
            TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "964bf956-35f7-11e1-9a03-0027103f347d");
            TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "964c2064-35f7-11e1-9a03-0027103f347d");
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
