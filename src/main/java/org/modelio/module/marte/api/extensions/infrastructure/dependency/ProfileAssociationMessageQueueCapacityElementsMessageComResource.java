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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6545d92d-9b65-4db2-b69c-9bfd32158bec")
public class ProfileAssociationMessageQueueCapacityElementsMessageComResource {
    @objid ("f628626c-5e63-4e50-b997-7f8cd78b668d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageQueueCapacityElements_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1a876d57-ddd7-4265-af71-7bd8b75bd6b5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("eec11f87-403b-4a1c-b82d-18e9755155ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageQueueCapacityElementsMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >> then instantiate a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("68cd3899-c89d-4326-80a1-f4f36387281a")
    public static ProfileAssociationMessageQueueCapacityElementsMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageQueueCapacityElementsMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageQueueCapacityElementsMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageQueueCapacityElements_MessageComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageQueueCapacityElementsMessageComResource} proxy or <i>null</i>.
     */
    @objid ("45418039-2728-471a-ac9b-134d00059d62")
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
    @objid ("f01ec888-bd40-44af-addc-70d5a980b30a")
    public static ProfileAssociationMessageQueueCapacityElementsMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageQueueCapacityElementsMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationMessageQueueCapacityElementsMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageQueueCapacityElementsMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b8241587-86a4-43cc-99ae-e3ee92f472dc")
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
    @objid ("dd9bec58-af33-4e0c-96bd-d731fc1e9a35")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b2ca35a3-8a5a-4102-a6b2-909c18fde2e3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d7e8f2a2-f533-404a-8383-7e00a1750cb9")
    protected ProfileAssociationMessageQueueCapacityElementsMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("153c9c5a-0788-40de-bb96-4f9949c970d9")
    public static final class MdaTypes {
        @objid ("ea282cf6-a6b5-4157-851a-ebbe426637a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72b89afc-f83b-4ac9-8e23-b8a7836f3b39")
        private static Stereotype MDAASSOCDEP;

        @objid ("1109a546-9dc1-44cd-8c89-a29851a0e8de")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a89150a9-f3ea-4232-a8be-73c3e0d3972b")
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
