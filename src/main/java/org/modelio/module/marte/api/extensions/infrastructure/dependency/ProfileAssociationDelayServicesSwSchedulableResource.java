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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_delayServices_SwSchedulableResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0c4d7c51-1c2a-43a7-868b-4eb65cdcae28")
public class ProfileAssociationDelayServicesSwSchedulableResource {
    @objid ("6249e675-d737-4d7f-b947-61479596c2a7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_delayServices_SwSchedulableResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b71838a7-e147-400f-b51c-d781c819b557")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDelayServicesSwSchedulableResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("691560c7-dee2-4c01-9465-4a9a4d81118b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDelayServicesSwSchedulableResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >> then instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy.
     * 
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy on the created {@link Dependency}.
     */
    @objid ("68a72337-ea73-48c8-9b37-f6205f578787")
    public static ProfileAssociationDelayServicesSwSchedulableResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDelayServicesSwSchedulableResource.STEREOTYPE_NAME);
        return ProfileAssociationDelayServicesSwSchedulableResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy or <i>null</i>.
     */
    @objid ("2416bf2b-188c-4d51-94ec-1ac5f6cc3cd0")
    public static ProfileAssociationDelayServicesSwSchedulableResource instantiate(final Dependency obj) {
        return ProfileAssociationDelayServicesSwSchedulableResource.canInstantiate(obj) ? new ProfileAssociationDelayServicesSwSchedulableResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_delayServices_SwSchedulableResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDelayServicesSwSchedulableResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f6f18c34-f80d-44d5-9033-b7517ed37d69")
    public static ProfileAssociationDelayServicesSwSchedulableResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDelayServicesSwSchedulableResource.canInstantiate(obj))
        	return new ProfileAssociationDelayServicesSwSchedulableResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDelayServicesSwSchedulableResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd180f85-5084-416d-bbd6-90cc1c99abfe")
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
        ProfileAssociationDelayServicesSwSchedulableResource other = (ProfileAssociationDelayServicesSwSchedulableResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d9ecc6b5-60f1-4568-ace1-62d8eea8b173")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b717a810-b5c6-4c37-bb75-ca280a55af6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9318c472-cbc8-4d15-ac30-9c78b6c6a299")
    protected ProfileAssociationDelayServicesSwSchedulableResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("672a43bd-2190-4a2c-a178-cc5a1ca93a65")
    public static final class MdaTypes {
        @objid ("77877b14-878f-4f6e-94f8-d66a7aa1363c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("759de536-7f6a-41ad-bc26-64d420a9571b")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d4810f6-cb55-4d97-a914-62aa94a373cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("67b502b1-aa84-4b56-b828-04d9293e5d5b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1bb4eb39-9758-11e0-94fb-0027103f347c");
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
