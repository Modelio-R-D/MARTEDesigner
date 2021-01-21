/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_on_TimedElement_Clock >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("10882a75-5112-4f76-b4bd-0d8a5e3bafa6")
public class ProfileAssociationOnTimedElementClock {
    @objid ("6d6dbdf6-8cb9-4886-b57c-5f0555f1e504")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_on_TimedElement_Clock";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("77a8bb90-9004-43a9-af1c-0c56caa6aa59")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnTimedElementClock proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_on_TimedElement_Clock >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7874d517-007c-4231-a647-9cbc2fa81bf1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnTimedElementClock.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_on_TimedElement_Clock >> then instantiate a {@link ProfileAssociationOnTimedElementClock} proxy.
     * 
     * @return a {@link ProfileAssociationOnTimedElementClock} proxy on the created {@link Dependency}.
     */
    @objid ("46e50060-b5ae-4a78-93ad-89101d673e23")
    public static ProfileAssociationOnTimedElementClock create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnTimedElementClock.STEREOTYPE_NAME);
        return ProfileAssociationOnTimedElementClock.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnTimedElementClock} proxy from a {@link Dependency} stereotyped << ProfileAssociation_on_TimedElement_Clock >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnTimedElementClock} proxy or <i>null</i>.
     */
    @objid ("001c0a01-c4a6-4d3c-b916-78acd1963b0d")
    public static ProfileAssociationOnTimedElementClock instantiate(final Dependency obj) {
        return ProfileAssociationOnTimedElementClock.canInstantiate(obj) ? new ProfileAssociationOnTimedElementClock(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnTimedElementClock} proxy from a {@link Dependency} stereotyped << ProfileAssociation_on_TimedElement_Clock >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOnTimedElementClock} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("607fced9-8a42-4e38-86b8-10d323d1dd16")
    public static ProfileAssociationOnTimedElementClock safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnTimedElementClock.canInstantiate(obj))
        	return new ProfileAssociationOnTimedElementClock(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnTimedElementClock: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e7ce901a-8603-4f26-9fa1-33862673e9a2")
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
        ProfileAssociationOnTimedElementClock other = (ProfileAssociationOnTimedElementClock) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("bdf1b8fd-6a1c-4925-af0a-94ff0013f68d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("293c63b0-68b9-4b7d-8e13-306738967800")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1a0e42d4-28b1-48f0-86af-f2005962c7ab")
    protected ProfileAssociationOnTimedElementClock(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c571b127-6388-4766-ad26-9a56d52fbe10")
    public static final class MdaTypes {
        @objid ("d4cd9228-818d-423e-9b18-e162c76e0aa5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("120a3f3b-a025-4566-a7a2-a4de675fca00")
        private static Stereotype MDAASSOCDEP;

        @objid ("449ba08b-50d5-4821-ba46-a64108dce857")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("70040f4d-75c3-484c-a1b9-0744f79c401d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bb6b552a-7a1a-11df-a20b-0014222a9f79");
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
