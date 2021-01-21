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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageSizeElements_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e27814f1-dfb9-4931-98ec-a6fee0cea5d8")
public class ProfileAssociationMessageSizeElementsMessageComResource {
    @objid ("89a322ff-0a68-4322-89d1-374b42e12739")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageSizeElements_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("91b9a292-e4ba-4307-b01b-ef416ea96b9b")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageSizeElementsMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e82205ed-2b70-40af-b216-6e8a2efc89b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageSizeElementsMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >> then instantiate a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("4953fd82-6764-418d-96ef-042f9a40e79e")
    public static ProfileAssociationMessageSizeElementsMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageSizeElementsMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageSizeElementsMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy or <i>null</i>.
     */
    @objid ("786c0bef-8634-459f-aaa3-ba109e0faa1b")
    public static ProfileAssociationMessageSizeElementsMessageComResource instantiate(final Dependency obj) {
        return ProfileAssociationMessageSizeElementsMessageComResource.canInstantiate(obj) ? new ProfileAssociationMessageSizeElementsMessageComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("065b4d4e-7a7a-4ccd-8090-17a21b052fb0")
    public static ProfileAssociationMessageSizeElementsMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageSizeElementsMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationMessageSizeElementsMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageSizeElementsMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7aab38b2-ffd2-4f04-aa3a-36962da7debe")
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
        ProfileAssociationMessageSizeElementsMessageComResource other = (ProfileAssociationMessageSizeElementsMessageComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9bbca1d3-e38d-4f94-ad9d-046995577f7f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d1c99840-fda2-4140-ae07-ad8c8087f6fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("24eb9f1d-0311-404b-85b5-bac4f578ccde")
    protected ProfileAssociationMessageSizeElementsMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c3c23f8a-a150-428a-a0ad-642e3df12084")
    public static final class MdaTypes {
        @objid ("5b617317-6ee1-41ed-aca9-431f0a6ab781")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b9b9cc7-fad5-4d66-b502-3c42aacb6fd6")
        private static Stereotype MDAASSOCDEP;

        @objid ("fca75f68-ecb5-4841-bd84-d78f9cae4fc3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("568b71c3-c59a-4989-965b-a4b5a5765fa2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "86a59e5f-9758-11e0-94fb-0027103f347c");
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
