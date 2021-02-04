/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_shareDataResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("75f0685a-4227-4b73-b2fb-4734d3024949")
public class ProfileAssociationShareDataResourcesSwConcurrentResource {
    @objid ("b55fcc4f-2d68-429a-b6d7-fc8df2cd22bb")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_shareDataResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0ea352ed-fed3-4c28-a5e9-d5d2cf50a685")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationShareDataResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7a1995f-9121-42b8-ac10-d32b7fb3a7a6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationShareDataResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("79ed5daa-f2a9-41c7-b543-c874e3153a8a")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationShareDataResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationShareDataResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("f6a1a5c7-d7ea-4dff-8cde-6a3dc396014b")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationShareDataResourcesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationShareDataResourcesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_shareDataResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationShareDataResourcesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("37cbe850-e599-483b-8ce0-94acac3bc864")
    public static ProfileAssociationShareDataResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationShareDataResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationShareDataResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationShareDataResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4c046755-3e7b-4b5d-84af-60ee7f2ac729")
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
        ProfileAssociationShareDataResourcesSwConcurrentResource other = (ProfileAssociationShareDataResourcesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("dcb9d6a5-b81c-49c5-8d82-dc6b0007f111")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("18f1a39d-8e9d-411a-b48f-87cbde841edd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8635ecfe-4b20-4438-972c-0a3a82cf1902")
    protected ProfileAssociationShareDataResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c2a1a409-7c04-458d-be26-3320b8abb590")
    public static final class MdaTypes {
        @objid ("6e26212a-1ee9-4b9f-8e93-7d8ca980cab0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a96a34e8-ece0-4406-a0ab-5af3fb8d2d40")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9a1ba3a-0695-4e9c-9e9a-38d0baf9875b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3013eab6-23d7-4110-a160-7b4b54442062")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c4252972-9756-11e0-94fb-0027103f347c");
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
