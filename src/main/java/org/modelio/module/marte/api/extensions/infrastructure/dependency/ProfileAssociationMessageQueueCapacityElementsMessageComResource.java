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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6545d92d-9b65-4db2-b69c-9bfd32158bec")
public class ProfileAssociationMessageQueueCapacityElementsMessageComResource {
    @objid ("9f95bd26-6373-4746-b19d-05dacb5d27ca")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageQueueCapacityElements_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("eba9b7a5-9998-4e8c-af4c-5a9308478a04")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("26c40ad8-830a-4b94-88b4-dea979f440f9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageQueueCapacityElementsMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> then instantiate a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("c6b0cbfe-3dd0-4492-a131-de28af21cf24")
    public static ProfileAssociationMessageQueueCapacityElementsMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageQueueCapacityElementsMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageQueueCapacityElementsMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy or <i>null</i>.
     */
    @objid ("4d19dd49-0fb0-47c3-aeba-bab458a2b30d")
    public static ProfileAssociationMessageQueueCapacityElementsMessageComResource instantiate(final Dependency obj) {
        return ProfileAssociationMessageQueueCapacityElementsMessageComResource.canInstantiate(obj) ? new ProfileAssociationMessageQueueCapacityElementsMessageComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("af15a642-fe2c-4461-956c-bef0bbb8b41b")
    public static ProfileAssociationMessageQueueCapacityElementsMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageQueueCapacityElementsMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationMessageQueueCapacityElementsMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageQueueCapacityElementsMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("52f6f3e2-207c-4a98-bb17-c4cc37cf7e5b")
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
        ProfileAssociationMessageQueueCapacityElementsMessageComResource other = (ProfileAssociationMessageQueueCapacityElementsMessageComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("2b19aa55-edfb-478b-8de3-88d27bddefd4")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("bc4b87fe-9715-4ef9-9e26-2eb61a90c3cf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("88d2e951-92e6-4913-9e03-df5e79b0291d")
    protected ProfileAssociationMessageQueueCapacityElementsMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("153c9c5a-0788-40de-bb96-4f9949c970d9")
    public static final class MdaTypes {
        @objid ("dbfe214a-7a8c-470c-859f-16519590930d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("76829634-6ab1-4d55-aa5b-f6127c5a6f47")
        private static Stereotype MDAASSOCDEP;

        @objid ("415d7e48-4207-47bf-b540-758395d7aaeb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c09c6d5-2a31-4d4f-85d7-4061d764db13")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9a193646-9758-11e0-94fb-0027103f347c");
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
