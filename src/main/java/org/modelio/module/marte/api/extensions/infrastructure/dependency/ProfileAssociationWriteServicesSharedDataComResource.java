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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_writeServices_SharedDataComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c38b1d57-6ca2-4f3c-a9a2-2d8f38216436")
public class ProfileAssociationWriteServicesSharedDataComResource {
    @objid ("7406d1f7-e173-4a9f-b902-7f1bcffb8c53")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_writeServices_SharedDataComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("968447da-e504-4385-9c90-c63eb8767752")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationWriteServicesSharedDataComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_writeServices_SharedDataComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("096ff56d-5e4a-4d16-8cf5-c53c6a1e3087")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWriteServicesSharedDataComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_writeServices_SharedDataComResource >> then instantiate a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy.
     * 
     * @return a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy on the created {@link Dependency}.
     */
    @objid ("1fe03bc1-f05d-450d-b35b-d62c8e26c8b7")
    public static ProfileAssociationWriteServicesSharedDataComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWriteServicesSharedDataComResource.STEREOTYPE_NAME);
        return ProfileAssociationWriteServicesSharedDataComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_writeServices_SharedDataComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy or <i>null</i>.
     */
    @objid ("8dfe05d6-45d0-4fe5-8142-d7abd1d80531")
    public static ProfileAssociationWriteServicesSharedDataComResource instantiate(final Dependency obj) {
        return ProfileAssociationWriteServicesSharedDataComResource.canInstantiate(obj) ? new ProfileAssociationWriteServicesSharedDataComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_writeServices_SharedDataComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationWriteServicesSharedDataComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("78f06fa1-058d-420a-b305-bb4e8e5983c1")
    public static ProfileAssociationWriteServicesSharedDataComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationWriteServicesSharedDataComResource.canInstantiate(obj))
        	return new ProfileAssociationWriteServicesSharedDataComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationWriteServicesSharedDataComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f3a296dd-35f5-42f8-91bd-e76f08dbbf34")
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
        ProfileAssociationWriteServicesSharedDataComResource other = (ProfileAssociationWriteServicesSharedDataComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d83094ec-ea91-4849-be29-017be3f4eb6f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6cab65f9-6089-485c-8584-d021c91dd24d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("72bd82ab-1b2a-4077-acfb-ac58ad4c8330")
    protected ProfileAssociationWriteServicesSharedDataComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("004c28c2-5371-4c4a-a9d4-8991f4e436ef")
    public static final class MdaTypes {
        @objid ("899db4da-c45b-4eb3-8fb7-77835a3f9df6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ccb5a1a7-d2f4-4248-a099-1fe9bf8a5a7c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3d80e7c-7c18-4195-a386-c9269d76b4c5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("91cc2230-6c0b-410c-97b0-744c98fadd0b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d494a98-9758-11e0-94fb-0027103f347c");
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
