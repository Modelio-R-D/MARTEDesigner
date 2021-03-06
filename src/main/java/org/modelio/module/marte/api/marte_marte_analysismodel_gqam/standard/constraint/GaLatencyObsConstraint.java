/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint;

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
 * Proxy class to handle a {@link Constraint} with << GaLatencyObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaLatencyObsConstraint {
    public static final String STEREOTYPE_NAME = "GaLatencyObs_Constraint";

    public static final String GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE = "GaLatencyObs_Constraint_latency";

    public static final String GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE = "GaLatencyObs_Constraint_maxJitter";

    public static final String GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE = "GaLatencyObs_Constraint_miss";

    public static final String GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE = "GaLatencyObs_Constraint_utility";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    protected final Constraint elt;

    /**
     * Tells whether a {@link GaLatencyObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << GaLatencyObs_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaLatencyObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << GaLatencyObs_Constraint >> then instantiate a {@link GaLatencyObsConstraint} proxy.
     * 
     * @return a {@link GaLatencyObsConstraint} proxy on the created {@link Constraint}.
     */
    public static GaLatencyObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaLatencyObsConstraint.STEREOTYPE_NAME);
        return GaLatencyObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link GaLatencyObsConstraint} proxy from a {@link Constraint} stereotyped << GaLatencyObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link GaLatencyObsConstraint} proxy or <i>null</i>.
     */
    public static GaLatencyObsConstraint instantiate(final Constraint obj) {
        return GaLatencyObsConstraint.canInstantiate(obj) ? new GaLatencyObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaLatencyObsConstraint} proxy from a {@link Constraint} stereotyped << GaLatencyObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link GaLatencyObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaLatencyObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (GaLatencyObsConstraint.canInstantiate(obj))
        	return new GaLatencyObsConstraint(obj);
        else
        	throw new IllegalArgumentException("GaLatencyObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaLatencyObsConstraint other = (GaLatencyObsConstraint) obj;
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
     * Getter for List<String> property 'GaLatencyObs_Constraint_latency'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaLatencyObs_Constraint_latency() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaLatencyObs_Constraint_maxJitter'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaLatencyObs_Constraint_maxJitter() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaLatencyObs_Constraint_miss'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaLatencyObs_Constraint_miss() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaLatencyObs_Constraint_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaLatencyObs_Constraint_utility() {
        return this.elt.getTagValue(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_latency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaLatencyObs_Constraint_latency(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_maxJitter'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaLatencyObs_Constraint_maxJitter(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaLatencyObs_Constraint_miss(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaLatencyObs_Constraint_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaLatencyObs_Constraint_utility(final String value) {
        this.elt.putTagValue(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT, value);
    }

    protected GaLatencyObsConstraint(final Constraint elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT;

        public static TagType GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT;

        public static TagType GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT;

        public static TagType GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "035e95f1-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f3-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f5-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f7-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f9-0ccf-11df-8525-001302895b2b");
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
