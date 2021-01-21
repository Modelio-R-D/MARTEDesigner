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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_maskElements_NotificationResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("30ddce92-40ad-45f8-95c5-04ceacf0dac1")
public class ProfileAssociationMaskElementsNotificationResource {
    @objid ("71d5a04d-90c6-43e1-9696-569ec8ccdca8")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_maskElements_NotificationResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("dcbf5ed4-9adf-43b3-953a-80e3e1719533")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMaskElementsNotificationResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_maskElements_NotificationResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d07594b7-6e3e-48af-bab9-a8ecea5107af")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaskElementsNotificationResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_maskElements_NotificationResource >> then instantiate a {@link ProfileAssociationMaskElementsNotificationResource} proxy.
     * 
     * @return a {@link ProfileAssociationMaskElementsNotificationResource} proxy on the created {@link Dependency}.
     */
    @objid ("d7d23f3b-0fd3-4d2d-966f-71b7326ac6aa")
    public static ProfileAssociationMaskElementsNotificationResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMaskElementsNotificationResource.STEREOTYPE_NAME);
        return ProfileAssociationMaskElementsNotificationResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaskElementsNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maskElements_NotificationResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMaskElementsNotificationResource} proxy or <i>null</i>.
     */
    @objid ("0cfe1d89-f853-41a2-85a1-e8a215d6d09a")
    public static ProfileAssociationMaskElementsNotificationResource instantiate(final Dependency obj) {
        return ProfileAssociationMaskElementsNotificationResource.canInstantiate(obj) ? new ProfileAssociationMaskElementsNotificationResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMaskElementsNotificationResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_maskElements_NotificationResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMaskElementsNotificationResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6093e64-caea-44aa-b5f4-0dde02556866")
    public static ProfileAssociationMaskElementsNotificationResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMaskElementsNotificationResource.canInstantiate(obj))
        	return new ProfileAssociationMaskElementsNotificationResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMaskElementsNotificationResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d25a45d2-e2f6-4d06-b78b-8feee3d1e120")
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
        ProfileAssociationMaskElementsNotificationResource other = (ProfileAssociationMaskElementsNotificationResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8f82c984-1c70-408a-9fad-989d682d1614")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("43e9a357-ced1-4de0-bf6f-a40221942235")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("35054066-0000-41ba-beb1-a527658c9cf0")
    protected ProfileAssociationMaskElementsNotificationResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("2eb8bb87-9afc-47d1-8482-42141a0985d1")
    public static final class MdaTypes {
        @objid ("164b60ac-dedc-4726-b73b-06462a80ce8d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e6112047-8bb9-4e52-a3d4-6dbf51ce6ee3")
        private static Stereotype MDAASSOCDEP;

        @objid ("82b629e1-4c3f-4043-9e50-49ef9dd8e774")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a01b19ec-04e6-422a-bfa2-cb04d857e8e2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e5aa6876-9758-11e0-94fb-0027103f347c");
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
