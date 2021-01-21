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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_activateServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1e1d5e4f-e14c-40d5-b0cf-6d12a6c37276")
public class ProfileAssociationActivateServicesSwConcurrentResource {
    @objid ("92e9eb9d-49f9-4559-b7df-15246369952e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_activateServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("2bf28cea-35e8-4652-bfc6-61ed82107681")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationActivateServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_activateServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("03bb30a0-b0a6-42a7-942e-3605c2a11278")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationActivateServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_activateServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("5e66e771-c173-4f0f-9b61-a39a1e43345f")
    public static ProfileAssociationActivateServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationActivateServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationActivateServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_activateServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("3238c661-1d32-4c7e-9f63-ebf12be74032")
    public static ProfileAssociationActivateServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationActivateServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationActivateServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_activateServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationActivateServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("16a8593b-751c-45d8-92ec-c40752465e37")
    public static ProfileAssociationActivateServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationActivateServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationActivateServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationActivateServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4e04da7d-167d-4039-885c-b9183178f9d4")
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
        ProfileAssociationActivateServicesSwConcurrentResource other = (ProfileAssociationActivateServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("a9891f97-83a9-4ade-a0f2-6b003b7c800a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("79601ce8-e4f4-4d1e-ac98-88d9adf0b38f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("12b2f0a9-816c-4bb5-b8ee-7e752192a650")
    protected ProfileAssociationActivateServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f1afd1fe-ab02-4ae7-b074-5718cec6dc18")
    public static final class MdaTypes {
        @objid ("53eab5f0-bcec-4234-b57e-2a0df985c090")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30d6cc55-b47d-4566-8674-73be294f78a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3e41ec0-2302-4efa-9fd6-e887dc367351")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6ad2ff63-b6df-41fc-876c-2b1af61d6338")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72005953-9756-11e0-94fb-0027103f347c");
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
