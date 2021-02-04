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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_messageResources_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("99a5c6a7-a794-43f1-badf-e6190b4d892f")
public class ProfileAssociationMessageResourcesSwConcurrentResource {
    @objid ("845f76fb-3468-49b3-92e4-223bfb62f836")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_messageResources_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4c0d8521-d35d-4da3-a67b-7ab8606edbfd")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMessageResourcesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1764836-e540-4e8a-9cdc-4f80b273d519")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageResourcesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >> then instantiate a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("27c8ba43-d99c-4ee4-b2c8-2a585c28eb92")
    public static ProfileAssociationMessageResourcesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMessageResourcesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationMessageResourcesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_messageResources_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMessageResourcesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("6b313a77-3e5d-48bc-9554-fe2d2a5f6929")
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
    @objid ("f1f1107d-e58e-4991-b8b5-79d25a552220")
    public static ProfileAssociationMessageResourcesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMessageResourcesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationMessageResourcesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMessageResourcesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd0a074a-9d40-426b-a5d1-40f3016248b6")
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
    @objid ("c01f1486-9881-4fb3-8a91-009236d464d2")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f52dff05-fc1f-4ebd-a0b7-2a4927903acc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9a6b422c-1e25-4504-bcf3-565893d58c0b")
    protected ProfileAssociationMessageResourcesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("39c3b18c-2ac2-46e8-b70f-8f4a843c4864")
    public static final class MdaTypes {
        @objid ("11d74f56-b708-4a55-8e86-a053800c4a9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b1af96a-06aa-4214-94b9-af8908abde40")
        private static Stereotype MDAASSOCDEP;

        @objid ("0daf1657-ad97-4f91-a702-54ce069772b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2cf2e3e-c860-41a5-bf14-15d9ff06da40")
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
