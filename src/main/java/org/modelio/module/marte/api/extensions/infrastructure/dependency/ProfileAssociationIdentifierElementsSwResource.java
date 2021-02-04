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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_identifierElements_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8623130b-4ab8-499b-95c5-6544482c3038")
public class ProfileAssociationIdentifierElementsSwResource {
    @objid ("dda5228a-f3aa-4078-8792-df58c56f6386")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_identifierElements_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("a5b44fb5-632b-4ddc-bc1b-e24fc9514e87")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationIdentifierElementsSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fd75b525-ff49-487a-9128-acaa5ed43d8d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIdentifierElementsSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >> then instantiate a {@link ProfileAssociationIdentifierElementsSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationIdentifierElementsSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("a4f45e98-aca0-4a67-825f-bf9e308aff27")
    public static ProfileAssociationIdentifierElementsSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIdentifierElementsSwResource.STEREOTYPE_NAME);
        return ProfileAssociationIdentifierElementsSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIdentifierElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_identifierElements_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationIdentifierElementsSwResource} proxy or <i>null</i>.
     */
    @objid ("e6cdfee7-1b42-4161-a050-24382c92bfc2")
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
    @objid ("b66bada6-78b1-48f1-936a-43dfa32f2839")
    public static ProfileAssociationIdentifierElementsSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationIdentifierElementsSwResource.canInstantiate(obj))
        	return new ProfileAssociationIdentifierElementsSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationIdentifierElementsSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b7c43f98-d712-40d9-83bb-edf26bb8d38d")
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
    @objid ("cae7aee6-0983-474b-93d7-8c9a733b3de5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("50cf7182-496c-4c6b-8208-3838a117ec2e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e83a32a6-563d-4705-a5f5-e4426303ce5d")
    protected ProfileAssociationIdentifierElementsSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("fc47e763-179a-44fe-b200-fcd42ff005a9")
    public static final class MdaTypes {
        @objid ("dbd713bb-2987-4680-bc48-5f7d4d27d7c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bdee9279-11c2-4183-8d94-537f3e73a5d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1eee4291-0f87-4343-a03e-38764022f8f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b96f6eb-816b-4a90-993a-633e1e3e7203")
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
