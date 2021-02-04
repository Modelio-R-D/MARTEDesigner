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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageSizeElements_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e27814f1-dfb9-4931-98ec-a6fee0cea5d8")
public class ProfileAssociationMessageSizeElementsMessageComResource {
    @objid ("d7b69b61-582f-4479-8f43-4f4b5e439a47")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageSizeElements_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("398b21f1-5e03-46bb-a457-7b68faa987cf")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageSizeElementsMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f82b7361-3d1f-480f-b35c-dc9458ac01ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageSizeElementsMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >> then instantiate a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("be95a1b4-9d23-4e30-83b4-dbc49416f202")
    public static ProfileAssociationMessageSizeElementsMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageSizeElementsMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageSizeElementsMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageSizeElements_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageSizeElementsMessageComResource} proxy or <i>null</i>.
     */
    @objid ("49c28f48-9bd2-441d-80c5-ed056038a060")
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
    @objid ("5e6b58f0-22d8-4a73-8404-91a1e9ba7664")
    public static ProfileAssociationMessageSizeElementsMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageSizeElementsMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationMessageSizeElementsMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageSizeElementsMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("95651ce4-011a-49ee-8350-c1ce618677c9")
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
    @objid ("3e8367c1-99fb-4ef8-80ab-8b4528e1d1fc")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("7f97b93d-595b-4409-a49d-beb2f3286d73")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6111c78d-0cbc-4396-b397-63514977e3d9")
    protected ProfileAssociationMessageSizeElementsMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c3c23f8a-a150-428a-a0ad-642e3df12084")
    public static final class MdaTypes {
        @objid ("fcd18077-76dc-4a71-8a9b-9a19ea5eca57")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d501884-eb48-4c6b-99bb-e447bebbe399")
        private static Stereotype MDAASSOCDEP;

        @objid ("3823aafa-553e-4e8c-a083-7110b0ab1edc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93d8c03e-8ddc-4e1b-9085-9e599cab98c9")
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
