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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_lockService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f98bf189-82bb-45ac-905e-a3b2487d4fed")
public class ProfileAssociationLockServiceMemoryBroker {
    @objid ("9efae7ea-8c21-4785-93f1-f59cf1c86346")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_lockService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b71491f8-b1c5-48bf-ae8c-959cc20778b7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationLockServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("03105b23-f388-4d84-9861-803ab8f5c9e3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationLockServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >> then instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("20dc36ee-b2b6-420e-96ba-d9901fb2240c")
    public static ProfileAssociationLockServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationLockServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationLockServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("7c9112e9-ec9b-4320-a546-5f6d0b653fd3")
    public static ProfileAssociationLockServiceMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationLockServiceMemoryBroker.canInstantiate(obj) ? new ProfileAssociationLockServiceMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationLockServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_lockService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationLockServiceMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e3cd93ae-bff6-485c-8032-d8f84908bb8f")
    public static ProfileAssociationLockServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationLockServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationLockServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationLockServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b6717208-37ef-44a0-86db-0d6578912aef")
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
        ProfileAssociationLockServiceMemoryBroker other = (ProfileAssociationLockServiceMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b6f0504a-93f2-4f78-9215-57c6f0e4e017")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b8d6e712-4298-48f1-baca-e40a434bcafa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1d0a6d47-500d-47f5-82e9-349448b526cb")
    protected ProfileAssociationLockServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d4067bc2-e388-482f-a606-c9a55d28cd52")
    public static final class MdaTypes {
        @objid ("d7df174d-e662-4856-b013-c2538e6f47a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3d73cac9-2724-4bef-99da-27159902c678")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f530e01-6689-4805-a062-17769cd4e06d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4610555-e761-4c16-810b-da53ddaa3796")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6251cdf-9759-11e0-94fb-0027103f347c");
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
