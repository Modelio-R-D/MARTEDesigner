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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_createServices_SwResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9cd9e7f5-006b-469a-b844-5ff6d7d39077")
public class ProfileAssociationCreateServicesSwResource {
    @objid ("1944bfc6-66e1-486a-aee3-1fca5ae377b4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_createServices_SwResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ab11d7e7-2ba6-4fe6-bc41-75e492b7540d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCreateServicesSwResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_createServices_SwResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9d0e3a2e-a9a8-452c-8264-1c081a81077e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCreateServicesSwResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_createServices_SwResource >> then instantiate a {@link ProfileAssociationCreateServicesSwResource} proxy.
     * 
     * @return a {@link ProfileAssociationCreateServicesSwResource} proxy on the created {@link Dependency}.
     */
    @objid ("b80944cf-f251-4909-8d2c-4516519c8965")
    public static ProfileAssociationCreateServicesSwResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCreateServicesSwResource.STEREOTYPE_NAME);
        return ProfileAssociationCreateServicesSwResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCreateServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_createServices_SwResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCreateServicesSwResource} proxy or <i>null</i>.
     */
    @objid ("6377941f-ad3a-4288-80a1-f8f79ea890ee")
    public static ProfileAssociationCreateServicesSwResource instantiate(final Dependency obj) {
        return ProfileAssociationCreateServicesSwResource.canInstantiate(obj) ? new ProfileAssociationCreateServicesSwResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCreateServicesSwResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_createServices_SwResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationCreateServicesSwResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bc89a491-d126-46e4-9cb6-5a2f9fd63669")
    public static ProfileAssociationCreateServicesSwResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCreateServicesSwResource.canInstantiate(obj))
        	return new ProfileAssociationCreateServicesSwResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCreateServicesSwResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("686ceb20-77cc-4a31-bbd9-b6427cc07000")
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
        ProfileAssociationCreateServicesSwResource other = (ProfileAssociationCreateServicesSwResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b5127e85-f30b-469d-b204-775cd830671b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("9015a805-9020-4c7f-86ce-5a7b1a35e4a8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3d586bc0-880a-4da8-bfd1-81b4472c0457")
    protected ProfileAssociationCreateServicesSwResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d9ad717a-8bf7-4193-917f-8876cca6ccb1")
    public static final class MdaTypes {
        @objid ("dcf15d00-06f5-4cb1-9934-3da21d2bd33d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26a30485-d3de-4611-bb4f-fa5780064c55")
        private static Stereotype MDAASSOCDEP;

        @objid ("658241ef-51f4-466c-b008-c7bfee827996")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4841ea81-4453-481a-bcb6-025c38070013")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ee812be3-9755-11e0-94fb-0027103f347c");
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
