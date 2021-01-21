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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_maskElements_InterruptResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("116c3a61-3267-400a-acce-80efed5f3ed6")
public class ProfileAssociationMaskElementsInterruptResource {
    @objid ("6f77041d-1cd6-4cfd-b448-6f73bc461679")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_maskElements_InterruptResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("74901791-b00b-46e2-a77f-0f481b759037")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMaskElementsInterruptResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_maskElements_InterruptResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("af6c4c91-63f4-4eb5-98f5-b1279266c727")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaskElementsInterruptResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_maskElements_InterruptResource >> then instantiate a {@link ProfileAssociationMaskElementsInterruptResource} proxy.
     * 
     * @return a {@link ProfileAssociationMaskElementsInterruptResource} proxy on the created {@link Dependency}.
     */
    @objid ("0cb637e0-ef92-412d-8152-069126874750")
    public static ProfileAssociationMaskElementsInterruptResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaskElementsInterruptResource.STEREOTYPE_NAME);
        return ProfileAssociationMaskElementsInterruptResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaskElementsInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maskElements_InterruptResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMaskElementsInterruptResource} proxy or <i>null</i>.
     */
    @objid ("72453adc-00ee-423a-9f25-073d37949918")
    public static ProfileAssociationMaskElementsInterruptResource instantiate(final Dependency obj) {
        return ProfileAssociationMaskElementsInterruptResource.canInstantiate(obj) ? new ProfileAssociationMaskElementsInterruptResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaskElementsInterruptResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maskElements_InterruptResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMaskElementsInterruptResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("521c3ae3-ecb8-458d-8cc8-37b8de4ad5dc")
    public static ProfileAssociationMaskElementsInterruptResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMaskElementsInterruptResource.canInstantiate(obj))
        	return new ProfileAssociationMaskElementsInterruptResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMaskElementsInterruptResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("637e5191-56bb-4d8c-9aad-8bb96d945f41")
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
        ProfileAssociationMaskElementsInterruptResource other = (ProfileAssociationMaskElementsInterruptResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b1176c88-8a7a-4e2f-8593-1f543284d863")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0e0b01fa-49c5-4691-9f52-bd3a949dc8b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0a2177c1-57a4-4ec0-9607-69f5b5c5a67d")
    protected ProfileAssociationMaskElementsInterruptResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("b21e8f86-aebd-4888-9993-a50098c19c8e")
    public static final class MdaTypes {
        @objid ("654f6dc9-4743-45b6-88d3-53fd3af39e90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("520931ac-464b-4b75-8b17-424bccbd9217")
        private static Stereotype MDAASSOCDEP;

        @objid ("b46a88b0-a17f-4add-8f93-75c6d7e128df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8c4c70c-08da-4545-8330-08f62f36879c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8ff454cf-9757-11e0-94fb-0027103f347c");
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
