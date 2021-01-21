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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_identifierElements_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8623130b-4ab8-499b-95c5-6544482c3038")
public class ProfileAssociationIdentifierElementsSwResource {
    @objid ("4d459b37-6dbe-46da-8236-606f4ae5dcf5")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_identifierElements_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("6b191428-fe46-4e3b-b384-93529d64006b")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationIdentifierElementsSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d570597b-5217-4c74-b1be-3b09192a276d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIdentifierElementsSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >> then instantiate a {@link ProfileAssociationIdentifierElementsSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationIdentifierElementsSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("6bc5c660-cadd-419f-8acf-888324c8463c")
    public static ProfileAssociationIdentifierElementsSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIdentifierElementsSwResource.STEREOTYPE_NAME);
        return ProfileAssociationIdentifierElementsSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIdentifierElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationIdentifierElementsSwResource} proxy or <i>null</i>.
     */
    @objid ("69cf1936-0523-4db7-842e-8fa9c2095e3b")
    public static ProfileAssociationIdentifierElementsSwResource instantiate(final Dependency obj) {
        return ProfileAssociationIdentifierElementsSwResource.canInstantiate(obj) ? new ProfileAssociationIdentifierElementsSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIdentifierElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationIdentifierElementsSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1ab2dbef-3ebf-4abc-aab8-cf00c7349583")
    public static ProfileAssociationIdentifierElementsSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationIdentifierElementsSwResource.canInstantiate(obj))
        	return new ProfileAssociationIdentifierElementsSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationIdentifierElementsSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("67e4184e-c2ae-44a4-81a3-8122cf48f5e3")
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
        ProfileAssociationIdentifierElementsSwResource other = (ProfileAssociationIdentifierElementsSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fef6dbf0-8e48-4637-aea5-1bf36e451053")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d2e834c5-6ae2-4242-8e57-8c3e52a205fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6459f8aa-7e4b-4ded-bc36-beba726989c8")
    protected ProfileAssociationIdentifierElementsSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("fc47e763-179a-44fe-b200-fcd42ff005a9")
    public static final class MdaTypes {
        @objid ("415df2bf-5fab-4795-acb3-ca1691d6a2a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e07aabb2-796b-47c6-86b1-ec4735d9ca74")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a4dcc90-5cf0-475d-800e-67e801a30eeb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f650369-2739-4d46-b523-4df320bdd947")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "970a972f-9755-11e0-94fb-0027103f347c");
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
