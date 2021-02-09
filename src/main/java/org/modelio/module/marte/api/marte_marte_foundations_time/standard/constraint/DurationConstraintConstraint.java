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
 * Proxy class to handle a {@link Constraint} with << DurationConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DurationConstraintConstraint {
    public static final String STEREOTYPE_NAME = "DurationConstraint_Constraint";

    public static final String DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE = "DurationConstraint_Constraint_firstEvent";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    protected final Constraint elt;

    /**
     * Tells whether a {@link DurationConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << DurationConstraint_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DurationConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << DurationConstraint_Constraint >> then instantiate a {@link DurationConstraintConstraint} proxy.
     * 
     * @return a {@link DurationConstraintConstraint} proxy on the created {@link Constraint}.
     */
    public static DurationConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DurationConstraintConstraint.STEREOTYPE_NAME);
        return DurationConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link DurationConstraintConstraint} proxy from a {@link Constraint} stereotyped << DurationConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link DurationConstraintConstraint} proxy or <i>null</i>.
     */
    public static DurationConstraintConstraint instantiate(final Constraint obj) {
        return DurationConstraintConstraint.canInstantiate(obj) ? new DurationConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DurationConstraintConstraint} proxy from a {@link Constraint} stereotyped << DurationConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link DurationConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DurationConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (DurationConstraintConstraint.canInstantiate(obj))
        	return new DurationConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("DurationConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DurationConstraintConstraint other = (DurationConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'DurationConstraint_Constraint_firstEvent'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getDurationConstraint_Constraint_firstEvent() {
        return this.elt.getTagValues(DurationConstraintConstraint.MdaTypes.DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    public Constraint getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'DurationConstraint_Constraint_firstEvent'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDurationConstraint_Constraint_firstEvent(final List<String> values) {
        this.elt.putTagValues(DurationConstraintConstraint.MdaTypes.DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT, values);
    }

    protected DurationConstraintConstraint(final Constraint elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe852062-97b6-11e3-8772-0027103f347d");
            DURATIONCONSTRAINT_CONSTRAINT_FIRSTEVENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1a8f1eef-97b7-11e3-8772-0027103f347d");
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
