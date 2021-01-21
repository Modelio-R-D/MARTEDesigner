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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_receiveServices_MessageComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c28e15bc-96ea-46fe-b1a5-38c0f8225abf")
public class ProfileAssociationReceiveServicesMessageComResource {
    @objid ("59b22f27-aa3c-4a61-bcb9-c085b86aafd5")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_receiveServices_MessageComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3555f6ae-ce58-4f10-bcd2-7b4acbf6f0ba")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationReceiveServicesMessageComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7a04d3d5-1e32-49ef-b6b8-b64e916629ad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReceiveServicesMessageComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >> then instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy.
     * 
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy on the created {@link Dependency}.
     */
    @objid ("1b16ae49-a9bc-4b23-9093-da82f0f471c0")
    public static ProfileAssociationReceiveServicesMessageComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReceiveServicesMessageComResource.STEREOTYPE_NAME);
        return ProfileAssociationReceiveServicesMessageComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy or <i>null</i>.
     */
    @objid ("b9e0f78e-74f3-4e23-9c26-fe178e01bdb3")
    public static ProfileAssociationReceiveServicesMessageComResource instantiate(final Dependency obj) {
        return ProfileAssociationReceiveServicesMessageComResource.canInstantiate(obj) ? new ProfileAssociationReceiveServicesMessageComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReceiveServicesMessageComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_receiveServices_MessageComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationReceiveServicesMessageComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4c8dcfa9-1a27-49dd-a92e-d40145ddf3b4")
    public static ProfileAssociationReceiveServicesMessageComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationReceiveServicesMessageComResource.canInstantiate(obj))
        	return new ProfileAssociationReceiveServicesMessageComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationReceiveServicesMessageComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7004ea32-a59e-4b01-b102-0c30586c4c65")
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
        ProfileAssociationReceiveServicesMessageComResource other = (ProfileAssociationReceiveServicesMessageComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("89de4408-8bcb-489f-bef3-1c37b9af1c1d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ff09f79e-5642-4142-80d6-237d35646d7e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4d5704ee-6f88-4158-be65-68442b751326")
    protected ProfileAssociationReceiveServicesMessageComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d29eeecb-53eb-4447-854b-3c2b9b064dff")
    public static final class MdaTypes {
        @objid ("887242d2-808d-440b-bb4f-52f21fb496a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("37ae3006-ed39-40fd-a2a3-dccc946327e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("a83b8bea-c15d-49cd-9735-23f3e81c20f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62481a05-7f68-4af2-8369-71550b50eebe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c01d0522-9758-11e0-94fb-0027103f347c");
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
