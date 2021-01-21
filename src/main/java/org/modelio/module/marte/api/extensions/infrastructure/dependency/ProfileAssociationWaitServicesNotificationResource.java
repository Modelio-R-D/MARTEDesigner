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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_waitServices_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("19bc40b3-9573-4daa-bfd8-1aae99e9ff6c")
public class ProfileAssociationWaitServicesNotificationResource {
    @objid ("f868fa6e-4422-4745-a3f3-649edd14eb28")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_waitServices_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5fecf046-7e06-47ed-a4b9-37bfc385ff8c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationWaitServicesNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_waitServices_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("282e9e66-dec7-439f-bca7-092c23b9ba5e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWaitServicesNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_waitServices_NotificationResource >> then instantiate a {@link ProfileAssociationWaitServicesNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationWaitServicesNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("8908a111-d4f4-4625-9513-b186f4e1be32")
    public static ProfileAssociationWaitServicesNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWaitServicesNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationWaitServicesNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWaitServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_waitServices_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationWaitServicesNotificationResource} proxy or <i>null</i>.
     */
    @objid ("8b595df9-e00e-429f-a903-91217cf54a74")
    public static ProfileAssociationWaitServicesNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationWaitServicesNotificationResource.canInstantiate(obj) ? new ProfileAssociationWaitServicesNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWaitServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_waitServices_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationWaitServicesNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a5b06e73-0d25-4645-8172-7c562bf3d4b7")
    public static ProfileAssociationWaitServicesNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationWaitServicesNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationWaitServicesNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationWaitServicesNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("65fe112b-deba-46b8-bfd2-39f410979b9f")
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
        ProfileAssociationWaitServicesNotificationResource other = (ProfileAssociationWaitServicesNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8b0543cd-08cc-4d83-b1f7-89753208c1bf")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("57aec5c1-27bc-4254-84f8-0b46ff4fb673")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("df9795ef-e20c-4cd6-bd2f-206736ab4448")
    protected ProfileAssociationWaitServicesNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f09e080d-4eba-4c6a-9070-f57b939f04ac")
    public static final class MdaTypes {
        @objid ("ca7b19ed-ff4a-4837-84fb-74aeb7f41bdf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("396136e3-a0ff-46e2-ac94-e978daa28d8e")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc18c6a4-c8e0-4f4b-a250-417b6cb823f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b2152f87-41d9-4d99-a73a-38d1ca118716")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0f653d2a-9759-11e0-94fb-0027103f347c");
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
