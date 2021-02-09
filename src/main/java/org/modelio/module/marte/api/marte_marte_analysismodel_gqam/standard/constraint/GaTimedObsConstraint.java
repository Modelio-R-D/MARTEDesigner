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
 * Proxy class to handle a {@link Constraint} with << GaTimedObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaTimedObsConstraint {
    public static final String STEREOTYPE_NAME = "GaTimedObs_Constraint";

    public static final String GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE = "GaTimedObs_Constraint_endObs";

    public static final String GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE = "GaTimedObs_Constraint_laxity";

    public static final String GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE = "GaTimedObs_Constraint_startObs";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    protected final Constraint elt;

    /**
     * Tells whether a {@link GaTimedObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << GaTimedObs_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaTimedObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << GaTimedObs_Constraint >> then instantiate a {@link GaTimedObsConstraint} proxy.
     * 
     * @return a {@link GaTimedObsConstraint} proxy on the created {@link Constraint}.
     */
    public static GaTimedObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaTimedObsConstraint.STEREOTYPE_NAME);
        return GaTimedObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link GaTimedObsConstraint} proxy from a {@link Constraint} stereotyped << GaTimedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link GaTimedObsConstraint} proxy or <i>null</i>.
     */
    public static GaTimedObsConstraint instantiate(final Constraint obj) {
        return GaTimedObsConstraint.canInstantiate(obj) ? new GaTimedObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaTimedObsConstraint} proxy from a {@link Constraint} stereotyped << GaTimedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link GaTimedObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaTimedObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (GaTimedObsConstraint.canInstantiate(obj))
        	return new GaTimedObsConstraint(obj);
        else
        	throw new IllegalArgumentException("GaTimedObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaTimedObsConstraint other = (GaTimedObsConstraint) obj;
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
     * Getter for List<String> property 'GaTimedObs_Constraint_endObs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaTimedObs_Constraint_endObs() {
        return this.elt.getTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaTimedObs_Constraint_laxity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaTimedObs_Constraint_laxity() {
        return this.elt.getTagValue(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaTimedObs_Constraint_startObs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaTimedObs_Constraint_startObs() {
        return this.elt.getTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaTimedObs_Constraint_endObs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaTimedObs_Constraint_endObs(final List<String> values) {
        this.elt.putTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaTimedObs_Constraint_laxity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaTimedObs_Constraint_laxity(final String value) {
        this.elt.putTagValue(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaTimedObs_Constraint_startObs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaTimedObs_Constraint_startObs(final List<String> values) {
        this.elt.putTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT, values);
    }

    protected GaTimedObsConstraint(final Constraint elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT;

        public static TagType GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT;

        public static TagType GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "035c33a1-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a3-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a5-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a7-0ccf-11df-8525-001302895b2b");
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
