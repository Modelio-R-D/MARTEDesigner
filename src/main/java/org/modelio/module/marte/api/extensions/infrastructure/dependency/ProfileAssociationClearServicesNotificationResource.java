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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_clearServices_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("19a56b2a-4d8d-4214-9cf7-9fbb02a462c5")
public class ProfileAssociationClearServicesNotificationResource {
    @objid ("f76de2d4-e417-46ef-912f-b4c2331571d6")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_clearServices_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("220a90e5-cd9e-4044-8e85-7b2c0817cbc7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationClearServicesNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d9fd8b5e-abec-420e-aec7-54c0ff3a6347")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClearServicesNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >> then instantiate a {@link ProfileAssociationClearServicesNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationClearServicesNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("be60f6ea-d452-44f5-84b4-5a25c65a32ba")
    public static ProfileAssociationClearServicesNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClearServicesNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationClearServicesNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClearServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationClearServicesNotificationResource} proxy or <i>null</i>.
     */
    @objid ("266b4223-58ee-40cc-bbd6-125dcf157f6b")
    public static ProfileAssociationClearServicesNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationClearServicesNotificationResource.canInstantiate(obj) ? new ProfileAssociationClearServicesNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClearServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationClearServicesNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("659f5c5b-4b67-4782-8c7f-d8c1b555cc11")
    public static ProfileAssociationClearServicesNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationClearServicesNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationClearServicesNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationClearServicesNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aded44ff-db08-4a64-8ff9-896140f466bb")
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
        ProfileAssociationClearServicesNotificationResource other = (ProfileAssociationClearServicesNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("5e747ca0-74b3-49ef-8e03-a98da83d9a70")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("99ba81e8-0351-4b48-9078-bec3b5205583")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cceac2c3-887f-4cc4-8b32-1b47137cc7a9")
    protected ProfileAssociationClearServicesNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c92d5a71-0f99-4757-ae87-86fddb1279ff")
    public static final class MdaTypes {
        @objid ("bb7b0fbc-e237-4e41-a0f3-abb07c2e84ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d94735e7-9b46-477c-86ae-e67b9967cc8d")
        private static Stereotype MDAASSOCDEP;

        @objid ("eacb0fee-da26-426d-8222-0104f8f6d589")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06a9c0ec-02e4-4dd8-b0f4-ab2cb43140e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "06228c8b-9759-11e0-94fb-0027103f347c");
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
