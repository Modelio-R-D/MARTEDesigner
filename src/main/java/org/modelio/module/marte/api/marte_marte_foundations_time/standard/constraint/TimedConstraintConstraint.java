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
import org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint.NfpConstraintConstraint;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << TimedConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedConstraintConstraint extends NfpConstraintConstraint {
    public static final String STEREOTYPE_NAME = "TimedConstraint_Constraint";

    public static final String TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE = "TimedConstraint_Constraint_interpretation";

    public static final String TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE = "TimedConstraint_Constraint_on";

    /**
     * Tells whether a {@link TimedConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << TimedConstraint_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << TimedConstraint_Constraint >> then instantiate a {@link TimedConstraintConstraint} proxy.
     * 
     * @return a {@link TimedConstraintConstraint} proxy on the created {@link Constraint}.
     */
    public static TimedConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedConstraintConstraint.STEREOTYPE_NAME);
        return TimedConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link TimedConstraintConstraint} proxy from a {@link Constraint} stereotyped << TimedConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link TimedConstraintConstraint} proxy or <i>null</i>.
     */
    public static TimedConstraintConstraint instantiate(final Constraint obj) {
        return TimedConstraintConstraint.canInstantiate(obj) ? new TimedConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedConstraintConstraint} proxy from a {@link Constraint} stereotyped << TimedConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link TimedConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (TimedConstraintConstraint.canInstantiate(obj))
        	return new TimedConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("TimedConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        TimedConstraintConstraint other = (TimedConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'TimedConstraint_Constraint_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedConstraint_Constraint_interpretation() {
        return this.elt.getTagValue(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedConstraint_Constraint_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedConstraint_Constraint_on() {
        return this.elt.getTagValues(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedConstraint_Constraint_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedConstraint_Constraint_interpretation(final String value) {
        this.elt.putTagValue(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedConstraint_Constraint_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedConstraint_Constraint_on(final List<String> values) {
        this.elt.putTagValues(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT, values);
    }

    protected TimedConstraintConstraint(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT;

        public static TagType TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db3680c1-0cce-11df-8525-001302895b2b");
            TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db38e312-0cce-11df-8525-001302895b2b");
            TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2aa5ab5d-1259-11df-8f55-0014222a9f79");
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
