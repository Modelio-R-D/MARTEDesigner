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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_sides_HwBridge_HwMedia >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3721627a-32a1-4692-af24-ded9dcb3b0c1")
public class ProfileAssociationSidesHwBridgeHwMedia {
    @objid ("4fb548be-0d83-47ea-aec4-0c9dbac1a3cd")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_sides_HwBridge_HwMedia";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6fcbcddb-0ebd-413d-9aec-15bbda22386a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSidesHwBridgeHwMedia proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_sides_HwBridge_HwMedia >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0fb085ca-6db9-42f4-8b6e-07ed25cbe3df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSidesHwBridgeHwMedia.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_sides_HwBridge_HwMedia >> then instantiate a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy.
     * 
     * @return a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy on the created {@link Dependency}.
     */
    @objid ("e2b10308-ec1d-4e8d-9f57-9212391a3e59")
    public static ProfileAssociationSidesHwBridgeHwMedia create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSidesHwBridgeHwMedia.STEREOTYPE_NAME);
        return ProfileAssociationSidesHwBridgeHwMedia.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sides_HwBridge_HwMedia >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy or <i>null</i>.
     */
    @objid ("ac1b5465-2bfd-4dd0-bece-369c4e4223db")
    public static ProfileAssociationSidesHwBridgeHwMedia instantiate(final Dependency obj) {
        return ProfileAssociationSidesHwBridgeHwMedia.canInstantiate(obj) ? new ProfileAssociationSidesHwBridgeHwMedia(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sides_HwBridge_HwMedia >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSidesHwBridgeHwMedia} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("33b60060-8059-485b-a954-f8c97e96c8ae")
    public static ProfileAssociationSidesHwBridgeHwMedia safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSidesHwBridgeHwMedia.canInstantiate(obj))
        	return new ProfileAssociationSidesHwBridgeHwMedia(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSidesHwBridgeHwMedia: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d025955e-e0d1-4e42-b9cc-71c61fefe05b")
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
        ProfileAssociationSidesHwBridgeHwMedia other = (ProfileAssociationSidesHwBridgeHwMedia) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("bffc77bb-f128-483c-8ec8-7b6daa028218")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("063fc3a7-1314-423c-aa4c-bbd69b4b7353")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9e8b47a3-0651-4c0b-b7d3-7dfa732e4741")
    protected ProfileAssociationSidesHwBridgeHwMedia(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("9a30a907-f50a-405b-a85b-0c0e2fa224de")
    public static final class MdaTypes {
        @objid ("78f976ee-57ef-41b3-9a73-0e3b539fe420")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3082d736-fe93-40cd-b4b2-767766dd4046")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e2da12a-a9a4-4b63-bf46-6c705c2b562e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dd340bc-8c5d-4051-ab99-b02a9b73c095")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dc3974bd-936a-11e0-b960-0027103f347c");
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
