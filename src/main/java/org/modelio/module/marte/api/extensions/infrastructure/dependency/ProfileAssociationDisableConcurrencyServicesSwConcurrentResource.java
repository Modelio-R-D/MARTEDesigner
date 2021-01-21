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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c95ec636-a650-4e05-aa47-549ecd938b64")
public class ProfileAssociationDisableConcurrencyServicesSwConcurrentResource {
    @objid ("aae018bc-8e88-4650-aac5-880c18f0c47e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_disableConcurrencyServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("375d39eb-3e15-47ec-8b74-d0ed3b277dde")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c196f3c5-bd9e-495e-88d0-70cb7ba393d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("8ccaff00-290a-423f-ab90-1f69b383c412")
    public static ProfileAssociationDisableConcurrencyServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("45b02232-1378-44f7-af27-493b73d5c8e8")
    public static ProfileAssociationDisableConcurrencyServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationDisableConcurrencyServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_disableConcurrencyServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDisableConcurrencyServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cb85e149-8189-4932-9a5b-8ee681600907")
    public static ProfileAssociationDisableConcurrencyServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDisableConcurrencyServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationDisableConcurrencyServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDisableConcurrencyServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab8d7724-2062-42ea-bc6c-99fcb4f3680d")
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
        ProfileAssociationDisableConcurrencyServicesSwConcurrentResource other = (ProfileAssociationDisableConcurrencyServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("eeeee848-008d-475b-b39c-582d3f37f2ca")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e36127a0-4398-4521-bcc6-b370672dd371")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("970c6850-e9dd-48b6-84cf-09c3a79a31b5")
    protected ProfileAssociationDisableConcurrencyServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ea02b3a4-361a-4cd7-98dc-f53442010da4")
    public static final class MdaTypes {
        @objid ("70f0282c-1af7-405b-bf58-fb1134dc424a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e82a6d46-cee5-4d88-ba88-3defcbf806e0")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc830c70-c26a-4e4c-9f1d-0214b635b137")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("43805c89-e4da-4db5-af2f-44fa6d402a93")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2a1604c-9756-11e0-94fb-0027103f347c");
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
