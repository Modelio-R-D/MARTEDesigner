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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_stateElements_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9d6a1c28-0d6e-43f4-bf8a-621050941db9")
public class ProfileAssociationStateElementsSwResource {
    @objid ("5fe2c844-42e6-499b-8432-b4204fe2de6b")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_stateElements_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b64f556f-d35c-49d8-95dc-17b4e438f988")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationStateElementsSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f682c5b-6fe3-4c9d-ba06-928afc4998a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStateElementsSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >> then instantiate a {@link ProfileAssociationStateElementsSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("0a99755c-f838-422c-bf21-c57737049956")
    public static ProfileAssociationStateElementsSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStateElementsSwResource.STEREOTYPE_NAME);
        return ProfileAssociationStateElementsSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStateElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy or <i>null</i>.
     */
    @objid ("126144c4-a83c-4f61-9e4f-c772ca122b9d")
    public static ProfileAssociationStateElementsSwResource instantiate(final Dependency obj) {
        return ProfileAssociationStateElementsSwResource.canInstantiate(obj) ? new ProfileAssociationStateElementsSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStateElementsSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stateElements_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationStateElementsSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fba849d6-81b1-4c3d-8432-f13ea169a86e")
    public static ProfileAssociationStateElementsSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationStateElementsSwResource.canInstantiate(obj))
        	return new ProfileAssociationStateElementsSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationStateElementsSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e9196b6-c51e-43db-a64a-250cd87b4650")
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
        ProfileAssociationStateElementsSwResource other = (ProfileAssociationStateElementsSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5ac49f75-74fb-4b57-885e-47d06f2f7107")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("909fc9b8-5b4e-469b-95b4-73e7c6ab2753")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("918ae494-e8b5-4d9a-a5fe-37ef94fe069c")
    protected ProfileAssociationStateElementsSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("44ecadc3-88bc-4986-8945-6202ba72c78e")
    public static final class MdaTypes {
        @objid ("7010b05d-18f1-4b50-bdd2-dc21664ee56c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1ca31f1-97b6-4bd0-930b-0a417ab54fac")
        private static Stereotype MDAASSOCDEP;

        @objid ("82cec597-7be8-458a-81df-c3a5cd5b2e67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3320c05b-81c5-4c9f-a1d8-e9442a56de93")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ccb262e3-9755-11e0-94fb-0027103f347c");
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
