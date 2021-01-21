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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_occurenceCountElements_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b866f82c-8571-470c-819d-0b217105714a")
public class ProfileAssociationOccurenceCountElementsNotificationResource {
    @objid ("65fd142b-6f9f-4220-8262-e39d4d54fa11")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_occurenceCountElements_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("bbd687f6-3253-4127-9b9b-48260e85dd2a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOccurenceCountElementsNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f91284d-229c-412a-b04a-094d818da654")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOccurenceCountElementsNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >> then instantiate a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("35ea8cbb-b651-4cb8-abcd-65e7a22fe26a")
    public static ProfileAssociationOccurenceCountElementsNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOccurenceCountElementsNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationOccurenceCountElementsNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy or <i>null</i>.
     */
    @objid ("f8987cfa-7005-4008-8864-7d910a4e1ed1")
    public static ProfileAssociationOccurenceCountElementsNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationOccurenceCountElementsNotificationResource.canInstantiate(obj) ? new ProfileAssociationOccurenceCountElementsNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc43897b-78ef-465e-be47-31b828c25c49")
    public static ProfileAssociationOccurenceCountElementsNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOccurenceCountElementsNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationOccurenceCountElementsNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOccurenceCountElementsNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("acfae169-2b24-4a02-ac5b-c7f9940c5d3e")
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
        ProfileAssociationOccurenceCountElementsNotificationResource other = (ProfileAssociationOccurenceCountElementsNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f854da98-2bad-4add-8882-d708d0fc2e7f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f4fc31c3-a53b-4892-bb66-bc96ae3eff4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("27f085fc-724b-4cf7-b4ad-85c1fb0c7abe")
    protected ProfileAssociationOccurenceCountElementsNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5c445e68-8766-40a8-9f5f-e8ff03226f8d")
    public static final class MdaTypes {
        @objid ("a986a4ab-594e-4ef1-baf6-ecf4898911db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("008a8815-08fb-4a52-8838-62253f95fe0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab080dbc-b98c-4a91-8bcc-3cd14c0f1466")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5baf6155-8e94-44a2-9649-99fe22176de8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cca3d298-9758-11e0-94fb-0027103f347c");
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
