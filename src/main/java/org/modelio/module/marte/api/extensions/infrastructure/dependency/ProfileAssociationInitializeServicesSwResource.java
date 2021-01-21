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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_initializeServices_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7c1c84cc-6a39-4f2a-a5f8-12e7bfaff19f")
public class ProfileAssociationInitializeServicesSwResource {
    @objid ("770e57da-ead2-4bce-97fe-8cbe2439a02d")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_initializeServices_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ca676d59-d354-4846-8a18-2c8bd9d2b3ea")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInitializeServicesSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_initializeServices_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ed231d7c-d5cf-4a46-ac8e-28fb16b5e55b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInitializeServicesSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_initializeServices_SwResource >> then instantiate a {@link ProfileAssociationInitializeServicesSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationInitializeServicesSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("7d3b7a4f-47ad-417f-8117-c3eb2d9278cb")
    public static ProfileAssociationInitializeServicesSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInitializeServicesSwResource.STEREOTYPE_NAME);
        return ProfileAssociationInitializeServicesSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInitializeServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_initializeServices_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInitializeServicesSwResource} proxy or <i>null</i>.
     */
    @objid ("cf94765c-8cc5-4add-a83f-43a1000f5f97")
    public static ProfileAssociationInitializeServicesSwResource instantiate(final Dependency obj) {
        return ProfileAssociationInitializeServicesSwResource.canInstantiate(obj) ? new ProfileAssociationInitializeServicesSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInitializeServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_initializeServices_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInitializeServicesSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a5c0e89f-0fc6-41a9-9f16-dc1671458e1a")
    public static ProfileAssociationInitializeServicesSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInitializeServicesSwResource.canInstantiate(obj))
        	return new ProfileAssociationInitializeServicesSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInitializeServicesSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4b101b1-29e4-4c4a-afe7-ce4e1e0f62b6")
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
        ProfileAssociationInitializeServicesSwResource other = (ProfileAssociationInitializeServicesSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8f2c152e-7ee6-4158-8607-38555c91910a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ae0a7841-8528-4ab9-90b9-90015fc80c3a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f82d479e-bab3-4ab4-a67c-15d68efbc7fd")
    protected ProfileAssociationInitializeServicesSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("dea865f3-7153-4ef1-8594-46e9fad09097")
    public static final class MdaTypes {
        @objid ("61050039-329e-43b3-8b48-e4e707c96c1f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f589a1c6-e999-4b37-8e6e-6110c9484b13")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9f98ed5-aee2-4650-96d0-a8d621e6163c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("604ed92a-5c77-4d03-913a-2a2c44a9be5a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "04e9b693-9756-11e0-94fb-0027103f347c");
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
