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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_sendServices_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eb026383-ef46-4f0d-8925-89458c6eb692")
public class ProfileAssociationSendServicesMessageComResource {
    @objid ("7ea03b17-8d1b-433e-9d8c-4c42cddd3862")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_sendServices_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d87368d6-453e-4d5a-8bf7-f7e988d68c7f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSendServicesMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6300de4c-8715-40b2-8681-6ab449bf0851")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSendServicesMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >> then instantiate a {@link ProfileAssociationSendServicesMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationSendServicesMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("6382137b-9adc-4e76-b524-6a889c2f804e")
    public static ProfileAssociationSendServicesMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSendServicesMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationSendServicesMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSendServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSendServicesMessageComResource} proxy or <i>null</i>.
     */
    @objid ("f80572dd-768a-4775-b01f-4bf1fa7b49d5")
    public static ProfileAssociationSendServicesMessageComResource instantiate(final Dependency obj) {
        return ProfileAssociationSendServicesMessageComResource.canInstantiate(obj) ? new ProfileAssociationSendServicesMessageComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSendServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSendServicesMessageComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fa96b415-87c6-4b0f-a591-187b36ee04d8")
    public static ProfileAssociationSendServicesMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSendServicesMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationSendServicesMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSendServicesMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a90ebeb-a73f-4f39-9591-b2f609437ca5")
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
        ProfileAssociationSendServicesMessageComResource other = (ProfileAssociationSendServicesMessageComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("95b8a4b4-7f4b-4709-abee-9fe93b63664c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("33a379be-3868-49b5-b38a-9b49ddfb4f86")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5751e48e-bf57-4343-9d6c-c0f3f53468bb")
    protected ProfileAssociationSendServicesMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("8a39b24b-2171-4787-aa5b-217df8b186ff")
    public static final class MdaTypes {
        @objid ("29ec4142-6006-404b-bb33-7266b1979cc7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afeb7554-db04-4dd6-b629-db230895d65e")
        private static Stereotype MDAASSOCDEP;

        @objid ("2d958014-dfc6-460b-9075-aa4fea213763")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33ca8d60-e7cd-40a1-a3f7-6af7efe88170")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ac35c0e5-9758-11e0-94fb-0027103f347c");
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
