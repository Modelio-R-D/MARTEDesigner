/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint;

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
 * Proxy class to handle a {@link Constraint} with << NfpConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NfpConstraintConstraint {
    public static final String STEREOTYPE_NAME = "NfpConstraint_Constraint";

    public static final String NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE = "NfpConstraint_Constraint_kind";

    public static final String NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE = "NfpConstraint_Constraint_mode";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    protected final Constraint elt;

    /**
     * Tells whether a {@link NfpConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << NfpConstraint_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << NfpConstraint_Constraint >> then instantiate a {@link NfpConstraintConstraint} proxy.
     * 
     * @return a {@link NfpConstraintConstraint} proxy on the created {@link Constraint}.
     */
    public static NfpConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpConstraintConstraint.STEREOTYPE_NAME);
        return NfpConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link NfpConstraintConstraint} proxy from a {@link Constraint} stereotyped << NfpConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link NfpConstraintConstraint} proxy or <i>null</i>.
     */
    public static NfpConstraintConstraint instantiate(final Constraint obj) {
        return NfpConstraintConstraint.canInstantiate(obj) ? new NfpConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpConstraintConstraint} proxy from a {@link Constraint} stereotyped << NfpConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link NfpConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NfpConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (NfpConstraintConstraint.canInstantiate(obj))
        	return new NfpConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("NfpConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NfpConstraintConstraint other = (NfpConstraintConstraint) obj;
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
     * Getter for string property 'NfpConstraint_Constraint_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNfpConstraint_Constraint_kind() {
        return this.elt.getTagValue(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'NfpConstraint_Constraint_mode'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNfpConstraint_Constraint_mode() {
        return this.elt.getTagValues(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'NfpConstraint_Constraint_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpConstraint_Constraint_kind(final String value) {
        this.elt.putTagValue(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'NfpConstraint_Constraint_mode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpConstraint_Constraint_mode(final List<String> values) {
        this.elt.putTagValues(NfpConstraintConstraint.MdaTypes.NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT, values);
    }

    protected NfpConstraintConstraint(final Constraint elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT;

        public static TagType NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d96f2592-0cce-11df-8525-001302895b2b");
            NFPCONSTRAINT_CONSTRAINT_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d98e23bd-0cce-11df-8525-001302895b2b");
            NFPCONSTRAINT_CONSTRAINT_MODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d98e23bf-0cce-11df-8525-001302895b2b");
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
