/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("aa0c025c-a133-4071-ba65-dac1842e1d71")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_occurenceCountElements_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0576c496-4502-4c4b-956d-b9f448db67c8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOccurenceCountElementsNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ffa6e0be-9903-4e24-9eeb-53ac37c97876")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOccurenceCountElementsNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >> then instantiate a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("60c8f8ff-48c4-4017-a4fb-9837b64dd18f")
    public static ProfileAssociationOccurenceCountElementsNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOccurenceCountElementsNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationOccurenceCountElementsNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_occurenceCountElements_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOccurenceCountElementsNotificationResource} proxy or <i>null</i>.
     */
    @objid ("1b8f91ff-b33b-4a14-a88a-d7f92ddd15df")
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
    @objid ("c77eae19-278f-487b-857d-0799d19dde06")
    public static ProfileAssociationOccurenceCountElementsNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOccurenceCountElementsNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationOccurenceCountElementsNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOccurenceCountElementsNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d69aa31c-caa4-453b-98ee-d74fb28759f4")
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
    @objid ("167ab880-c767-4fd6-bbb1-8c5f283cd2a5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("99f94b01-f61a-4b8e-8515-0e03f8f9ac9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("73672287-2ccb-4a02-a710-450f014a4ea0")
    protected ProfileAssociationOccurenceCountElementsNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5c445e68-8766-40a8-9f5f-e8ff03226f8d")
    public static final class MdaTypes {
        @objid ("70c9d9a9-537b-4604-baad-5446dbde40c6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41ce4319-37e5-4152-94a6-92306a1eaabc")
        private static Stereotype MDAASSOCDEP;

        @objid ("b37debfe-a997-4101-86c6-d81ecabf6c44")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c29c7f71-8107-4530-aa10-181f3ad15074")
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
