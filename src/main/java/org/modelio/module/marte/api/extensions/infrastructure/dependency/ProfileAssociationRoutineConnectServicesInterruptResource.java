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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_routineConnectServices_InterruptResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4ef4cd0e-99a2-4d7f-8eef-ab3eb215a697")
public class ProfileAssociationRoutineConnectServicesInterruptResource {
    @objid ("fd338c57-4c89-4d13-bf7c-7468aa9707df")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_routineConnectServices_InterruptResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("10ac4e41-82ec-4632-a5d4-b30754097a36")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRoutineConnectServicesInterruptResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_routineConnectServices_InterruptResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cb32cdbd-b3e1-4b5e-842c-80afb1222bc1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineConnectServicesInterruptResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_routineConnectServices_InterruptResource >> then instantiate a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy.
     * 
     * @return a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy on the created {@link Dependency}.
     */
    @objid ("ec96ec38-73a4-4e88-80a3-3cef9f829682")
    public static ProfileAssociationRoutineConnectServicesInterruptResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineConnectServicesInterruptResource.STEREOTYPE_NAME);
        return ProfileAssociationRoutineConnectServicesInterruptResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routineConnectServices_InterruptResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy or <i>null</i>.
     */
    @objid ("2f6b0da8-4f86-4e70-9876-c18149b44178")
    public static ProfileAssociationRoutineConnectServicesInterruptResource instantiate(final Dependency obj) {
        return ProfileAssociationRoutineConnectServicesInterruptResource.canInstantiate(obj) ? new ProfileAssociationRoutineConnectServicesInterruptResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routineConnectServices_InterruptResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRoutineConnectServicesInterruptResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("62fb92ae-07d8-4d1f-9881-a77ed809bb44")
    public static ProfileAssociationRoutineConnectServicesInterruptResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRoutineConnectServicesInterruptResource.canInstantiate(obj))
        	return new ProfileAssociationRoutineConnectServicesInterruptResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRoutineConnectServicesInterruptResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("40bf7252-1f54-4032-ba71-3925e9df296a")
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
        ProfileAssociationRoutineConnectServicesInterruptResource other = (ProfileAssociationRoutineConnectServicesInterruptResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("70ae9cc8-b6a5-4a3d-acba-20dcf58c8674")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c26dbd9b-2118-4f85-ba0f-f4c4a1cbbc00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("10c75064-b9b9-44c8-87c7-798cdc2be819")
    protected ProfileAssociationRoutineConnectServicesInterruptResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ab378102-1a85-4f3f-9931-a994ae5db469")
    public static final class MdaTypes {
        @objid ("e1822673-5443-48df-a1db-e5586154e5c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b09d47c4-deba-4f90-8ea3-c1c011cff1a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("c94e79fb-ddb1-4ce4-8ec2-2613d92cf752")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8e77ef5e-9c19-40c6-a758-43c7a9affec8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aa4d15d5-9757-11e0-94fb-0027103f347c");
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
