/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
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
 * Proxy class to handle a {@link Dependency} with << NfpRefine_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NfpRefineDependency {
    public static final String STEREOTYPE_NAME = "NfpRefine_Dependency";

    public static final String NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE = "NfpRefine_Dependency_constraint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    protected final Dependency elt;

    /**
     * Tells whether a {@link NfpRefineDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << NfpRefine_Dependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpRefineDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << NfpRefine_Dependency >> then instantiate a {@link NfpRefineDependency} proxy.
     * 
     * @return a {@link NfpRefineDependency} proxy on the created {@link Dependency}.
     */
    public static NfpRefineDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpRefineDependency.STEREOTYPE_NAME);
        return NfpRefineDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link NfpRefineDependency} proxy from a {@link Dependency} stereotyped << NfpRefine_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link NfpRefineDependency} proxy or <i>null</i>.
     */
    public static NfpRefineDependency instantiate(final Dependency obj) {
        return NfpRefineDependency.canInstantiate(obj) ? new NfpRefineDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpRefineDependency} proxy from a {@link Dependency} stereotyped << NfpRefine_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link NfpRefineDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NfpRefineDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (NfpRefineDependency.canInstantiate(obj))
        	return new NfpRefineDependency(obj);
        else
        	throw new IllegalArgumentException("NfpRefineDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NfpRefineDependency other = (NfpRefineDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    public Dependency getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'NfpRefine_Dependency_constraint'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getNfpRefine_Dependency_constraint() {
        return this.elt.getTagValues(NfpRefineDependency.MdaTypes.NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NfpRefine_Dependency_constraint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpRefine_Dependency_constraint(final List<String> values) {
        this.elt.putTagValues(NfpRefineDependency.MdaTypes.NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT, values);
    }

    protected NfpRefineDependency(final Dependency elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00b4be56-0ccf-11df-8525-001302895b2b");
            NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b720a7-0ccf-11df-8525-001302895b2b");
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
