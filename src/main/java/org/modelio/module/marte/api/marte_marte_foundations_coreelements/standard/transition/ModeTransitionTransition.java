/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_coreelements.standard.transition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
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
 * Proxy class to handle a {@link Transition} with << ModeTransition_Transition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ModeTransitionTransition {
    public static final String STEREOTYPE_NAME = "ModeTransition_Transition";

    /**
     * The underlying {@link Transition} represented by this proxy, never null.
     */
    protected final Transition elt;

    /**
     * Tells whether a {@link ModeTransitionTransition proxy} can be instantiated from a {@link MObject} checking it is a {@link Transition} stereotyped << ModeTransition_Transition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Transition) && ((Transition) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ModeTransitionTransition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Transition} stereotyped << ModeTransition_Transition >> then instantiate a {@link ModeTransitionTransition} proxy.
     * 
     * @return a {@link ModeTransitionTransition} proxy on the created {@link Transition}.
     */
    public static ModeTransitionTransition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Transition");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ModeTransitionTransition.STEREOTYPE_NAME);
        return ModeTransitionTransition.instantiate((Transition)e);
    }

    /**
     * Tries to instantiate a {@link ModeTransitionTransition} proxy from a {@link Transition} stereotyped << ModeTransition_Transition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Transition
     * @return a {@link ModeTransitionTransition} proxy or <i>null</i>.
     */
    public static ModeTransitionTransition instantiate(final Transition obj) {
        return ModeTransitionTransition.canInstantiate(obj) ? new ModeTransitionTransition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModeTransitionTransition} proxy from a {@link Transition} stereotyped << ModeTransition_Transition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Transition}
     * @return a {@link ModeTransitionTransition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ModeTransitionTransition safeInstantiate(final Transition obj) throws IllegalArgumentException {
        if (ModeTransitionTransition.canInstantiate(obj))
        	return new ModeTransitionTransition(obj);
        else
        	throw new IllegalArgumentException("ModeTransitionTransition: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        ModeTransitionTransition other = (ModeTransitionTransition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Transition}. 
     * @return the Transition represented by this proxy, never null.
     */
    public Transition getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected ModeTransitionTransition(final Transition elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00bbe54a-0ccf-11df-8525-001302895b2b");
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
