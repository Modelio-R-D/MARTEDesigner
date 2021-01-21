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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_deleteServices_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f2214260-bc88-44ef-9faf-c234dea84349")
public class ProfileAssociationDeleteServicesSwResource {
    @objid ("663a44ec-3dd7-4130-9fbc-3bd943a12e9f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_deleteServices_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("19c399c7-a7eb-434b-9483-a1d89cb79bba")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDeleteServicesSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_deleteServices_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("eac919bf-2df1-4bb6-8062-605bc3d78fd6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeleteServicesSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_deleteServices_SwResource >> then instantiate a {@link ProfileAssociationDeleteServicesSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationDeleteServicesSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("e515717f-4897-440f-a0e8-e3b48a13ffa2")
    public static ProfileAssociationDeleteServicesSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDeleteServicesSwResource.STEREOTYPE_NAME);
        return ProfileAssociationDeleteServicesSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeleteServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deleteServices_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDeleteServicesSwResource} proxy or <i>null</i>.
     */
    @objid ("938d0cee-199a-4fe5-aa95-61d6fd98e148")
    public static ProfileAssociationDeleteServicesSwResource instantiate(final Dependency obj) {
        return ProfileAssociationDeleteServicesSwResource.canInstantiate(obj) ? new ProfileAssociationDeleteServicesSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDeleteServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_deleteServices_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDeleteServicesSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("27c1c88b-be96-429f-bfd9-6ca16fbcaa0a")
    public static ProfileAssociationDeleteServicesSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDeleteServicesSwResource.canInstantiate(obj))
        	return new ProfileAssociationDeleteServicesSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDeleteServicesSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("daebd951-fa3a-4901-af63-954c39fb2fed")
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
        ProfileAssociationDeleteServicesSwResource other = (ProfileAssociationDeleteServicesSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("e877ee08-18a2-4ceb-801f-8f8f1576d0c8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("56c8bdb6-3833-414b-abf4-70716d02eb4d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aebb9349-3275-4ed7-b6eb-31b3be29f7e9")
    protected ProfileAssociationDeleteServicesSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("089159c2-9dc0-44a6-a199-e99c59866fe2")
    public static final class MdaTypes {
        @objid ("9d9b9025-0590-47d1-a73e-83b4e67655b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8481323-9cca-4376-8a40-a7c830528622")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c88220f-5231-4369-962b-64a92dbb87bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19e6294e-e8db-441f-95c3-0ad33656fca7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f888eba3-9755-11e0-94fb-0027103f347c");
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
