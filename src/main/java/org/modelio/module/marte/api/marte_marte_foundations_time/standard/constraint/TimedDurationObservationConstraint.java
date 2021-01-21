/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("2f4fdcf9-e74f-4329-bdd2-85be1d0e5600")
public class TimedDurationObservationConstraint {
    @objid ("a18c78d3-34de-4130-9393-c9e847ac123d")
    public static final String STEREOTYPE_NAME = "TimedDurationObservation_Constraint";

    @objid ("9f0b6cac-be2a-4b1f-9e4f-5373955033c3")
    public static final String TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE = "TimedDurationObservation_Constraint_obsKind";

    @objid ("31a489bd-fe90-4090-8cc6-9c9dd0339db8")
    public static final String TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE = "TimedDurationObservation_Constraint_on";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("1a64279a-5901-418f-a9df-d6956b582f99")
    protected final Constraint elt;

    /**
     * Tells whether a {@link TimedDurationObservationConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << TimedDurationObservation_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("20a7d1a2-8d14-4b6b-8a3c-d270b8aabfa7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedDurationObservationConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << TimedDurationObservation_Constraint >> then instantiate a {@link TimedDurationObservationConstraint} proxy.
     * 
     * @return a {@link TimedDurationObservationConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("4800039c-6e31-440a-aa8d-a503db8fe24e")
    public static TimedDurationObservationConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedDurationObservationConstraint.STEREOTYPE_NAME);
        return TimedDurationObservationConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link TimedDurationObservationConstraint} proxy from a {@link Constraint} stereotyped << TimedDurationObservation_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link TimedDurationObservationConstraint} proxy or <i>null</i>.
     */
    @objid ("e6ea315c-09da-4b14-a54c-2550badd78d3")
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
    @objid ("bee0604b-664e-42d8-b5b6-acae484e42fb")
    public static TimedDurationObservationConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (TimedDurationObservationConstraint.canInstantiate(obj))
        	return new TimedDurationObservationConstraint(obj);
        else
        	throw new IllegalArgumentException("TimedDurationObservationConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6df7eb54-fd08-4a0a-93fb-ed17db175a70")
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
    @objid ("c3b8ea6e-60c9-4d26-abf2-4489d82599d1")
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedDurationObservation_Constraint_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("477eb360-38e2-4f7a-a38d-142408f78689")
    public String getTimedDurationObservation_Constraint_obsKind() {
        return this.elt.getTagValue(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedDurationObservation_Constraint_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d1e8762-631a-4b24-a1ec-808fd3e0a2f9")
    public List<String> getTimedDurationObservation_Constraint_on() {
        return this.elt.getTagValues(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT);
    }

    @objid ("fe80c92a-95b7-4460-b2e0-6f00c3cea6b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedDurationObservation_Constraint_obsKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3085d517-d668-486f-a569-0c9f6326b830")
    public void setTimedDurationObservation_Constraint_obsKind(final String value) {
        this.elt.putTagValue(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedDurationObservation_Constraint_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b0c662f-01cb-4fd5-8ee9-e9a53efeb665")
    public void setTimedDurationObservation_Constraint_on(final List<String> values) {
        this.elt.putTagValues(TimedDurationObservationConstraint.MdaTypes.TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT, values);
    }

    @objid ("0c6e748a-aae1-4b8c-a678-dc0cab964a47")
    protected TimedDurationObservationConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("f3d63669-4d37-479c-9015-252d580f6b7a")
    public static final class MdaTypes {
        @objid ("943fac54-f63f-435f-9f7e-12c7302f56f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58b11a1c-0745-44ac-a6da-df985ca93bb5")
        public static TagType TIMEDDURATIONOBSERVATION_CONSTRAINT_OBSKIND_TAGTYPE_ELT;

        @objid ("db3efcc8-c878-4e5b-a789-bef814df0982")
        public static TagType TIMEDDURATIONOBSERVATION_CONSTRAINT_ON_TAGTYPE_ELT;

        @objid ("429f1bab-c4ad-42e0-9a0b-c5e9b3697c1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("75758db0-d39d-4f8c-944a-8dcfd5cf45ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3fae02b-3829-4cf7-8c3c-22350841c7b2")
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
