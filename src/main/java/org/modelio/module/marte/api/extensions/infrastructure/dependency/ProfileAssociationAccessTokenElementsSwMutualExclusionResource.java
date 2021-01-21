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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_accessTokenElements_SwMutualExclusionResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5a761dda-eb4e-4b47-8eba-45aedc764e65")
public class ProfileAssociationAccessTokenElementsSwMutualExclusionResource {
    @objid ("a67be886-8ec2-4186-b8e3-b7da150c6796")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_accessTokenElements_SwMutualExclusionResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1fcab877-a725-4b34-aea6-26cc88a84cb7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_accessTokenElements_SwMutualExclusionResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b7028d4d-ea37-41fe-9aec-1b0d2b850965")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAccessTokenElementsSwMutualExclusionResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_accessTokenElements_SwMutualExclusionResource >> then instantiate a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy.
     * 
     * @return a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy on the created {@link Dependency}.
     */
    @objid ("dd38c36d-3fc3-41cb-9c7d-25149115034f")
    public static ProfileAssociationAccessTokenElementsSwMutualExclusionResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAccessTokenElementsSwMutualExclusionResource.STEREOTYPE_NAME);
        return ProfileAssociationAccessTokenElementsSwMutualExclusionResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_accessTokenElements_SwMutualExclusionResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy or <i>null</i>.
     */
    @objid ("601ce583-ba7f-4152-9493-13ff0be78e50")
    public static ProfileAssociationAccessTokenElementsSwMutualExclusionResource instantiate(final Dependency obj) {
        return ProfileAssociationAccessTokenElementsSwMutualExclusionResource.canInstantiate(obj) ? new ProfileAssociationAccessTokenElementsSwMutualExclusionResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_accessTokenElements_SwMutualExclusionResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationAccessTokenElementsSwMutualExclusionResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97db9baa-b810-4809-be6c-b0e5d39e99d5")
    public static ProfileAssociationAccessTokenElementsSwMutualExclusionResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationAccessTokenElementsSwMutualExclusionResource.canInstantiate(obj))
        	return new ProfileAssociationAccessTokenElementsSwMutualExclusionResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationAccessTokenElementsSwMutualExclusionResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd1221c6-ac58-4069-a5bf-0cbfbaf5bcdf")
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
        ProfileAssociationAccessTokenElementsSwMutualExclusionResource other = (ProfileAssociationAccessTokenElementsSwMutualExclusionResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9aca2f8b-4f8d-4155-a37e-515a3cf593e0")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a176bff7-d380-4a35-8500-ef4d703da7bc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f9293cf3-a8f7-4c1d-a2f9-17b0ea3415d8")
    protected ProfileAssociationAccessTokenElementsSwMutualExclusionResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("30c36c3b-0198-4ab7-aaa4-15ef6159972f")
    public static final class MdaTypes {
        @objid ("aaa3890d-6874-42c3-aa1a-bf4712e246e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("304386d9-6b17-4a66-8e85-0727d2c1d241")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffd1ce21-f38d-4ef7-bc2e-cf50a5da5ddc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a5587c83-17d4-470e-a82f-111a021d8908")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1be4de81-9759-11e0-94fb-0027103f347c");
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
