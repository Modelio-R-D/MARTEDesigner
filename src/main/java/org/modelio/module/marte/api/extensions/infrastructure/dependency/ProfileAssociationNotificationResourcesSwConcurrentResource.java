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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_notificationResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("29efaff0-480a-4dcb-bda7-0cbc362862e2")
public class ProfileAssociationNotificationResourcesSwConcurrentResource {
    @objid ("07c91176-cd24-44fd-8baf-83028a84f313")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_notificationResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("37a53cd5-c41a-4386-844b-81de2a78faec")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationNotificationResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_notificationResources_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0de2f2e1-a995-4855-8294-ecec331c9625")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationNotificationResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_notificationResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("afd046cb-ade9-467c-940f-68555d44ab0f")
    public static ProfileAssociationNotificationResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationNotificationResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationNotificationResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_notificationResources_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("a89d943c-667c-4127-9def-13a428f2b362")
    public static ProfileAssociationNotificationResourcesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationNotificationResourcesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationNotificationResourcesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_notificationResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationNotificationResourcesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0d4969de-94a7-4184-911a-6c3cef1cc5ff")
    public static ProfileAssociationNotificationResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationNotificationResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationNotificationResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationNotificationResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3b2626c-1925-43c9-9335-22b9c0a9dadb")
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
        ProfileAssociationNotificationResourcesSwConcurrentResource other = (ProfileAssociationNotificationResourcesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6173fa1c-c1ba-426e-9676-55bb59474583")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a7c0f359-7b4f-4613-8b50-4c81abd30669")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a34d453d-f96b-4747-bd5c-8b3380d184c4")
    protected ProfileAssociationNotificationResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0d4b1901-40d2-4307-ba56-49faaced55ce")
    public static final class MdaTypes {
        @objid ("78b84b49-69b1-4813-b90b-8a5213b6436e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a780a91c-02bd-4f7a-830c-a5b9b46a018f")
        private static Stereotype MDAASSOCDEP;

        @objid ("31dfffcc-5576-4a33-9331-9fdef59903d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("05ef8c90-57b4-479b-8470-a7d3bd119e09")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ef531fa6-9756-11e0-94fb-0027103f347c");
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
