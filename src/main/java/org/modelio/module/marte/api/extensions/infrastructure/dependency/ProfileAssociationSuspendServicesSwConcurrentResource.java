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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_suspendServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b40a2d29-9b96-4b04-a15b-0ae3c3cbc521")
public class ProfileAssociationSuspendServicesSwConcurrentResource {
    @objid ("30d8599e-bc1c-42b7-b6e1-323694e33878")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_suspendServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c63598f2-b6bd-4b39-9e1f-41754571e7b6")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSuspendServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_suspendServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("036b27bf-7605-4d8c-8e5c-2e23799edfba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSuspendServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_suspendServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("43bd98b8-c553-4067-b34f-b2399f797c14")
    public static ProfileAssociationSuspendServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSuspendServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationSuspendServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_suspendServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("08c47c38-bdf6-441f-baf2-9b25b98bbc36")
    public static ProfileAssociationSuspendServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationSuspendServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationSuspendServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_suspendServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSuspendServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aef973e2-6a01-45e8-94e1-d741a717c809")
    public static ProfileAssociationSuspendServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSuspendServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationSuspendServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSuspendServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d7ccf3c2-bac5-4786-8fa9-fc2dd3d62975")
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
        ProfileAssociationSuspendServicesSwConcurrentResource other = (ProfileAssociationSuspendServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("89ab2779-cfa0-4257-a027-173ec5099a29")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("42a62fa1-96d8-448b-a891-54699d311a7d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("46649524-fb3c-4165-b061-16debcd599fb")
    protected ProfileAssociationSuspendServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ac317e21-bb59-4a40-a001-a52e4392fcff")
    public static final class MdaTypes {
        @objid ("a33ffe6f-f6f4-4ede-bd26-1e4eea8e7c33")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4a12fc01-16f5-4859-9a41-6b133b87d4dd")
        private static Stereotype MDAASSOCDEP;

        @objid ("b001ace1-9412-49b1-96c4-aa47ef67ba3c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f45d1424-5984-4e03-9446-a626333467d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a6a8a5a9-9756-11e0-94fb-0027103f347c");
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
