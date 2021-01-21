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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("99a5c6a7-a794-43f1-badf-e6190b4d892f")
public class ProfileAssociationMessageResourcesSwConcurrentResource {
    @objid ("a6298193-0cfc-4b25-8bec-dbadf427f1fd")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c215e2c3-d1eb-451f-bf18-b9d20762fbbc")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("00fa3b32-b189-4fae-aba2-63a5270721a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("8817b1fb-8f8b-4d1f-9aa7-c8eea4ceab97")
    public static ProfileAssociationMessageResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("aca10b60-fdc5-4795-9f0b-be9499622310")
    public static ProfileAssociationMessageResourcesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationMessageResourcesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationMessageResourcesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("916934ae-8f1d-40fc-90cd-fd21873b9361")
    public static ProfileAssociationMessageResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationMessageResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa7b2ee5-8fca-4ad8-b2ea-e42f0ff59d0b")
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
        ProfileAssociationMessageResourcesSwConcurrentResource other = (ProfileAssociationMessageResourcesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f06f1524-c23f-49a8-bf8d-f20c680ce668")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d190b7fa-6c35-41c3-846f-094783e7945a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fed40766-9f6b-4151-84d5-d300df92b7f0")
    protected ProfileAssociationMessageResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("39c3b18c-2ac2-46e8-b70f-8f4a843c4864")
    public static final class MdaTypes {
        @objid ("422e9b15-dd0b-4002-8688-7dd77c8f3aa9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6062759a-6199-4303-bd04-676015a5c0df")
        private static Stereotype MDAASSOCDEP;

        @objid ("790eb38d-f9d3-4564-bd16-c063c536d5b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1cf6a38-26be-476d-840e-dd1603785cec")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d1874155-9756-11e0-94fb-0027103f347c");
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
