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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("438ac179-3b28-4bb2-b206-36685d753a3b")
public class ProfileAssociationOwnedMMUsHwProcessorHwMMU {
    @objid ("566d2394-f523-432f-92cf-7627a48abcca")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_ownedMMUs_HwProcessor_HwMMU";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("92112986-e9d8-4c9a-b65d-037b552fa998")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cc37994f-ac7c-4473-8915-85b200e56d35")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedMMUsHwProcessorHwMMU.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >> then instantiate a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy.
     * 
     * @return a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy on the created {@link Dependency}.
     */
    @objid ("a13b4497-35ad-48ab-ab3d-2892197fef73")
    public static ProfileAssociationOwnedMMUsHwProcessorHwMMU create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOwnedMMUsHwProcessorHwMMU.STEREOTYPE_NAME);
        return ProfileAssociationOwnedMMUsHwProcessorHwMMU.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy or <i>null</i>.
     */
    @objid ("4ca6628c-8d6b-4c82-b896-dcc7b0f57fba")
    public static ProfileAssociationOwnedMMUsHwProcessorHwMMU instantiate(final Dependency obj) {
        return ProfileAssociationOwnedMMUsHwProcessorHwMMU.canInstantiate(obj) ? new ProfileAssociationOwnedMMUsHwProcessorHwMMU(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy from a {@link Dependency} stereotyped << ProfileAssociation_ownedMMUs_HwProcessor_HwMMU >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOwnedMMUsHwProcessorHwMMU} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a7ab563-0fe7-46b8-b79c-c275c5cad11d")
    public static ProfileAssociationOwnedMMUsHwProcessorHwMMU safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOwnedMMUsHwProcessorHwMMU.canInstantiate(obj))
        	return new ProfileAssociationOwnedMMUsHwProcessorHwMMU(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOwnedMMUsHwProcessorHwMMU: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ab5a812-1159-41ff-bfe7-68a7348e3d6a")
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
        ProfileAssociationOwnedMMUsHwProcessorHwMMU other = (ProfileAssociationOwnedMMUsHwProcessorHwMMU) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ad9f8435-88ff-4c2c-9eba-356c0cb24c1b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("3cd42972-ab37-4ba5-bfa6-2cf872621947")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4292d158-4065-405b-97d2-ddbdce260713")
    protected ProfileAssociationOwnedMMUsHwProcessorHwMMU(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e9fb1a69-cfa4-4859-a67d-9d74a2ce5cc0")
    public static final class MdaTypes {
        @objid ("274c3e12-3975-47f8-846a-98076198ec77")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("568c3cdd-1fb4-4b67-8562-c5a684e4467d")
        private static Stereotype MDAASSOCDEP;

        @objid ("322caf76-0557-4eb5-b32f-75980a9509e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cdcba25a-3b67-461d-8df1-8ad722964c5a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "461eabda-937d-11e0-b960-0027103f347c");
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
