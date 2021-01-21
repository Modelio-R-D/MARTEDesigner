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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_flushServices_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac10df77-3a32-4f06-9930-cdbac27b7674")
public class ProfileAssociationFlushServicesNotificationResource {
    @objid ("325c8b38-5881-4df9-988c-3ca019a60b63")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_flushServices_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("bcc3ade0-bb66-4b0e-802e-6328ff34dbb1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationFlushServicesNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_flushServices_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("53697f18-fa69-4d72-916a-ddad7b9c5cf1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFlushServicesNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_flushServices_NotificationResource >> then instantiate a {@link ProfileAssociationFlushServicesNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationFlushServicesNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("e497cae3-39d7-4237-a8d0-885d029e519c")
    public static ProfileAssociationFlushServicesNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFlushServicesNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationFlushServicesNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFlushServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_flushServices_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationFlushServicesNotificationResource} proxy or <i>null</i>.
     */
    @objid ("e1c5713f-050d-45a4-a1bc-6ced7c6b423e")
    public static ProfileAssociationFlushServicesNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationFlushServicesNotificationResource.canInstantiate(obj) ? new ProfileAssociationFlushServicesNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFlushServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_flushServices_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationFlushServicesNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9177f31e-8ac4-4f73-a397-66cbae55a684")
    public static ProfileAssociationFlushServicesNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationFlushServicesNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationFlushServicesNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationFlushServicesNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ad0a7e95-6aea-4274-9f56-3467e76c0514")
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
        ProfileAssociationFlushServicesNotificationResource other = (ProfileAssociationFlushServicesNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("45663e55-df91-4327-bb90-0bd1cf370957")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("7bb3ddf7-6103-42ff-aed1-ce1c62a3a89d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("060b36cb-166b-4747-b5d1-9736a169325a")
    protected ProfileAssociationFlushServicesNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("95b88bad-e473-4d70-971e-f2a30fa818e2")
    public static final class MdaTypes {
        @objid ("df4ce54d-5153-4398-a5ac-7c0f948b946a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0367b68b-2654-48a7-adbb-bba9c81d8d00")
        private static Stereotype MDAASSOCDEP;

        @objid ("04b3d2b2-b0a4-4431-8807-f9bdd9b887cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d64c127-452f-42eb-a3ed-346b6d105f05")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f1cbe1d4-9758-11e0-94fb-0027103f347c");
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
