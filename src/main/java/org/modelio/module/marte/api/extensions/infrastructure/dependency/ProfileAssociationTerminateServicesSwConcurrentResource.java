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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_terminateServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("62a7f6bb-140c-44ea-8f3c-4b019b226adb")
public class ProfileAssociationTerminateServicesSwConcurrentResource {
    @objid ("39e534c9-875d-4583-b32c-96a0b1a51c28")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_terminateServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("49706507-c7f0-4f88-9f87-5dfa3f2b4731")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTerminateServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f63d3c08-dfdf-4aae-b002-723f837e1f20")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTerminateServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("29ee1afa-99e3-4147-a29a-af7912793916")
    public static ProfileAssociationTerminateServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTerminateServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationTerminateServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("f4c5c5fb-bdc0-4ec7-b7e7-79d97f11ce8c")
    public static ProfileAssociationTerminateServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationTerminateServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationTerminateServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_terminateServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTerminateServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7dc26c3-55d6-46b9-b65f-980c71013c7c")
    public static ProfileAssociationTerminateServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTerminateServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationTerminateServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTerminateServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6184439a-f9ff-40a5-b69c-bba8d415cc03")
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
        ProfileAssociationTerminateServicesSwConcurrentResource other = (ProfileAssociationTerminateServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("59e80f5b-8446-4e04-bb01-c889d322f937")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2a443e3d-478c-459d-815a-de965eb2d863")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("73769d9f-d652-4789-a36b-a3837244da23")
    protected ProfileAssociationTerminateServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e651dc0f-6ff9-497b-957c-b8dd06f2dcb8")
    public static final class MdaTypes {
        @objid ("2752fdf0-582f-44d8-a137-789748e3c2f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8905447-f91b-4b15-bc77-c8caf47e373f")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ff53bbf-3890-4e23-b943-bee87c3963a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fcd5ab22-e305-447a-93de-648293398d96")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "98ddb727-9756-11e0-94fb-0027103f347c");
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
