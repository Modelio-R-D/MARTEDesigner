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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mutualExclusionResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7eab36b2-e6e6-4a50-907b-35cfcea6f6ee")
public class ProfileAssociationMutualExclusionResourcesSwConcurrentResource {
    @objid ("219a809e-f709-42a9-87fd-eab2aeb29521")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mutualExclusionResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("abded78d-a768-43e2-8323-28b6e435f501")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mutualExclusionResources_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c8651fd5-69ba-444d-91e2-1abd2356dbe6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMutualExclusionResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mutualExclusionResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("dd81f709-e10a-48a8-bacd-222d900798e1")
    public static ProfileAssociationMutualExclusionResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMutualExclusionResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationMutualExclusionResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mutualExclusionResources_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("c622dcfb-6006-4cdd-820f-9b60a0391953")
    public static ProfileAssociationMutualExclusionResourcesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationMutualExclusionResourcesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationMutualExclusionResourcesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mutualExclusionResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMutualExclusionResourcesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("260bfdb8-cd89-45d5-ad00-f0efbc8c2a0e")
    public static ProfileAssociationMutualExclusionResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMutualExclusionResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationMutualExclusionResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMutualExclusionResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e879d55b-c176-40a4-b5aa-a8ad98144b42")
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
        ProfileAssociationMutualExclusionResourcesSwConcurrentResource other = (ProfileAssociationMutualExclusionResourcesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("022842fa-c7b3-428e-af27-8f6aaaa78d7e")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("417f4e66-c2b8-4624-a463-0b3b719ab0ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a186bcfc-fb0c-4b59-95f6-72d9670e3190")
    protected ProfileAssociationMutualExclusionResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("b3f8bf7c-0389-4955-82c9-eba7ef50262b")
    public static final class MdaTypes {
        @objid ("0dd7f4f1-9018-4dec-88b6-1417f44df2b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6352190f-9cf2-4f11-99fb-7f6c1f603f65")
        private static Stereotype MDAASSOCDEP;

        @objid ("9315bb8e-b1aa-4006-8ca1-9e4660039a1b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8a0240b-bf4e-4ee1-8c3b-c6de8e3dc5df")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e20c7fb7-9756-11e0-94fb-0027103f347c");
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
