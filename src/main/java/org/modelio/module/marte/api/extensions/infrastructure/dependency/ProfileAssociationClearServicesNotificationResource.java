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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_clearServices_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("19a56b2a-4d8d-4214-9cf7-9fbb02a462c5")
public class ProfileAssociationClearServicesNotificationResource {
    @objid ("6b7dec7e-5fcc-41d8-a25b-3fdc6fcd10fa")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_clearServices_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("a8d116b2-aa9d-4d85-a26a-2caf838f9f12")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationClearServicesNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("217a376d-ba78-49ca-84f1-9ced05011c45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClearServicesNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >> then instantiate a {@link ProfileAssociationClearServicesNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationClearServicesNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("a7e5dd94-5477-48d2-84fd-fcb28dbbab95")
    public static ProfileAssociationClearServicesNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClearServicesNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationClearServicesNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClearServicesNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_clearServices_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationClearServicesNotificationResource} proxy or <i>null</i>.
     */
    @objid ("2e5ecbda-aa35-4dd9-8199-b3b9592db3c8")
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
    @objid ("723a064c-7b2c-42d3-b534-58e833b6b776")
    public static ProfileAssociationClearServicesNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationClearServicesNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationClearServicesNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationClearServicesNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6b478829-9298-472c-85bb-284b9ff16cdd")
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
    @objid ("de608df1-af70-419e-95f2-129e3fde4628")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2e5ffb5b-73a1-42b6-a8df-87013b4790e1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dd77640c-0693-477c-acf5-091950bcf38f")
    protected ProfileAssociationClearServicesNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c92d5a71-0f99-4757-ae87-86fddb1279ff")
    public static final class MdaTypes {
        @objid ("20e959e7-aa3d-4db7-950b-48ef1b28bfe6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b34b961-753f-403c-9ae3-6979e2d264d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0c26713-a036-4fd0-a05b-2f92898af1f9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fcc4d102-727b-47af-a833-862fcc293bed")
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
