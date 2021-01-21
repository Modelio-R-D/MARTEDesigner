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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_waitingPolicyElements_SwInteractionResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9b194104-87f9-48d3-94e4-c58224659db1")
public class ProfileAssociationWaitingPolicyElementsSwInteractionResource {
    @objid ("7b0d4513-1f84-43ab-b167-08a29653bbd0")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_waitingPolicyElements_SwInteractionResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("707855f4-f7e1-4362-ab9a-7a798b2ff890")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_waitingPolicyElements_SwInteractionResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f561e830-1226-4ae3-b7fc-1d955a7d0a00")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWaitingPolicyElementsSwInteractionResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_waitingPolicyElements_SwInteractionResource >> then instantiate a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy.
     * 
     * @return a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy on the created {@link Dependency}.
     */
    @objid ("8e949c1a-d773-43ae-9d47-7832229d9214")
    public static ProfileAssociationWaitingPolicyElementsSwInteractionResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWaitingPolicyElementsSwInteractionResource.STEREOTYPE_NAME);
        return ProfileAssociationWaitingPolicyElementsSwInteractionResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_waitingPolicyElements_SwInteractionResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy or <i>null</i>.
     */
    @objid ("140b6b59-decc-4adb-854c-27ba8c3ba79d")
    public static ProfileAssociationWaitingPolicyElementsSwInteractionResource instantiate(final Dependency obj) {
        return ProfileAssociationWaitingPolicyElementsSwInteractionResource.canInstantiate(obj) ? new ProfileAssociationWaitingPolicyElementsSwInteractionResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_waitingPolicyElements_SwInteractionResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationWaitingPolicyElementsSwInteractionResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("93d47ac5-1ccf-4065-a2fa-224b87f5ac3e")
    public static ProfileAssociationWaitingPolicyElementsSwInteractionResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationWaitingPolicyElementsSwInteractionResource.canInstantiate(obj))
        	return new ProfileAssociationWaitingPolicyElementsSwInteractionResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationWaitingPolicyElementsSwInteractionResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("89473e3a-ef11-41ff-854d-c3c47c19257b")
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
        ProfileAssociationWaitingPolicyElementsSwInteractionResource other = (ProfileAssociationWaitingPolicyElementsSwInteractionResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("452b3801-468a-4a64-9639-a539a289c30d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ff4cb3e4-0072-4bda-b591-beee67305b88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c65d29c3-93e4-448c-9d4a-9ba5ec74dc14")
    protected ProfileAssociationWaitingPolicyElementsSwInteractionResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("53b054ee-e924-44d1-9b16-2a2d1252e594")
    public static final class MdaTypes {
        @objid ("e358797f-720a-4542-a1cb-79e532aeef0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3f1fdd6-9e60-4d1f-958e-debf1bd22457")
        private static Stereotype MDAASSOCDEP;

        @objid ("bff9b6af-b3bf-42d4-86c7-22661e0eedfc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b73173b-bfd7-4190-b15f-7054f3d6b122")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "57f2d72c-9758-11e0-94fb-0027103f347c");
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
