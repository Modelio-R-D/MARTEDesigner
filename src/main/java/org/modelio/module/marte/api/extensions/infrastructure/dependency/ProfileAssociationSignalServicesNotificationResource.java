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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_signalServices_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d7b02495-9e26-4e2c-b1ed-131345d081c0")
public class ProfileAssociationSignalServicesNotificationResource {
    @objid ("9d35bd00-9dcd-4e3a-ba91-158cff23015f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_signalServices_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("19da7ff3-de76-4244-8212-dd711e392308")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSignalServicesNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_signalServices_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("94d1f40a-ea72-46c3-90cb-a8fb7b09666f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSignalServicesNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_signalServices_NotificationResource >> then instantiate a {@link ProfileAssociationSignalServicesNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationSignalServicesNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("0755d0ae-05f7-4291-b08b-67d67eb0d6d4")
    public static ProfileAssociationSignalServicesNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSignalServicesNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationSignalServicesNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSignalServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_signalServices_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSignalServicesNotificationResource} proxy or <i>null</i>.
     */
    @objid ("4ba22524-d8c4-4684-8e2b-9ee770213e20")
    public static ProfileAssociationSignalServicesNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationSignalServicesNotificationResource.canInstantiate(obj) ? new ProfileAssociationSignalServicesNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSignalServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_signalServices_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSignalServicesNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cdd93a2b-d853-4156-a8f9-c3ac1f71483a")
    public static ProfileAssociationSignalServicesNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSignalServicesNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationSignalServicesNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSignalServicesNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a790df11-8955-42c9-82be-aa7a84d4b777")
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
        ProfileAssociationSignalServicesNotificationResource other = (ProfileAssociationSignalServicesNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("119631c0-750e-42e9-be59-f18b05d87a7b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("af34586b-5c6b-4cfc-89a0-e69f093c5426")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f64bc205-cef1-4c00-b3ce-230c1a3ada64")
    protected ProfileAssociationSignalServicesNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("7fd43145-cfd5-44c9-95d2-8c320a64fa05")
    public static final class MdaTypes {
        @objid ("f9808e70-b35f-42d7-9d27-088620e22daa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43b4fc84-b302-477d-85ca-758b0e92d228")
        private static Stereotype MDAASSOCDEP;

        @objid ("9ca1281b-4333-4995-8c12-cd71af3949cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("802d09ce-4a42-4ac2-a1c7-1e5f104c846a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc89f189-9758-11e0-94fb-0027103f347c");
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
