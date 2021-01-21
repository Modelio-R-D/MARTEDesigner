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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_sendServices_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eb026383-ef46-4f0d-8925-89458c6eb692")
public class ProfileAssociationSendServicesMessageComResource {
    @objid ("3225892f-2d1b-41c5-a459-b33a86a77d34")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_sendServices_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3882ff1c-9e22-4018-8045-0e597ee6329e")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSendServicesMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5ca2d556-25a6-4bcf-875a-a6eff3925d85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSendServicesMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >> then instantiate a {@link ProfileAssociationSendServicesMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationSendServicesMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("0a55ac80-301d-4b23-8254-18d51ff5afbc")
    public static ProfileAssociationSendServicesMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSendServicesMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationSendServicesMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSendServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sendServices_MessageComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSendServicesMessageComResource} proxy or <i>null</i>.
     */
    @objid ("d906abac-a210-4e1a-a468-0d3ae136f5ed")
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
    @objid ("03ce4b68-93eb-4913-ac53-9def6a67eb2f")
    public static ProfileAssociationSendServicesMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSendServicesMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationSendServicesMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSendServicesMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5a9736ea-2ebc-4f1f-9dc9-6d93193a820f")
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
    @objid ("417c3eeb-48ae-49e1-9175-5cb57a8039fa")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("70c1028e-4812-4f1a-8c5c-4dc9ffa7c419")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("826e6618-04ed-4f9f-b9c0-6818d63f3053")
    protected ProfileAssociationSendServicesMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("8a39b24b-2171-4787-aa5b-217df8b186ff")
    public static final class MdaTypes {
        @objid ("10ad414a-b8e8-46dd-8da7-625f2728ca5b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c066d73-912d-4cef-abf4-527d75751596")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffef3c39-9b40-4c83-905a-44ada79c042a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5a5ff59-ad27-49f2-8f44-4b462cb02e3b")
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
