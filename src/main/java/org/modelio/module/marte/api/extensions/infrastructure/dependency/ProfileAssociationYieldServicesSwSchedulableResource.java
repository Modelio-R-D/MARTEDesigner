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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_yieldServices_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9f055c14-f947-4103-93ad-0492ce36d5ff")
public class ProfileAssociationYieldServicesSwSchedulableResource {
    @objid ("db92852a-5cf4-466f-b01a-ac4aaa72a788")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_yieldServices_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d355aaef-f174-49c2-8ae9-97babe0b9c42")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationYieldServicesSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3be81658-0bf4-468c-9a66-5d8ceed89df8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationYieldServicesSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >> then instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("51c412de-fe82-4f63-9092-154cc913df8b")
    public static ProfileAssociationYieldServicesSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationYieldServicesSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationYieldServicesSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("27d5c2c8-3ec1-4360-bf38-f1b9181c4009")
    public static ProfileAssociationYieldServicesSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationYieldServicesSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationYieldServicesSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_yieldServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationYieldServicesSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dff22f43-9fc3-4b75-aadc-eb918848146d")
    public static ProfileAssociationYieldServicesSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationYieldServicesSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationYieldServicesSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationYieldServicesSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9d99f0ef-11a4-48b2-b108-21bf6da3702c")
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
        ProfileAssociationYieldServicesSwSchedulableResource other = (ProfileAssociationYieldServicesSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("0674f7e5-e61d-41e7-8362-e2a00f381776")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a7389bfe-8ef1-464b-87d9-7f2f2a541aca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f9f37add-075e-4ef3-bc3f-5b33e27647dc")
    protected ProfileAssociationYieldServicesSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("43bb0b57-4106-400e-a4a6-af1d3221ec09")
    public static final class MdaTypes {
        @objid ("9e426422-19f0-4bab-be3a-100ab3deb479")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("371a967f-ca14-495d-82ee-2d9116373a56")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d69b318-ab09-4625-9498-41f19cd2f48f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffae9703-f898-44e2-a328-fdfac5438f7e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3266854f-9758-11e0-94fb-0027103f347c");
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
