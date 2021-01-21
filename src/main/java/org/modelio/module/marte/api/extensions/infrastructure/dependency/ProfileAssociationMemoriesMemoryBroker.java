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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memories_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b6c88378-78d0-4c74-8eb1-7b89e89574b9")
public class ProfileAssociationMemoriesMemoryBroker {
    @objid ("2a2b6240-070a-4ee2-a2cb-b8aeb3a17cb3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memories_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1ab86549-ffe3-4ff6-94e0-c8d47ff2fdd2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemoriesMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7cb346e4-583f-4dc8-a17a-ee3cb2fd8ea6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoriesMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >> then instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("a73e6157-2836-469f-9174-1fb8326b5268")
    public static ProfileAssociationMemoriesMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoriesMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMemoriesMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("ce509d4b-dc89-4fa0-888b-2fbcac6618a1")
    public static ProfileAssociationMemoriesMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationMemoriesMemoryBroker.canInstantiate(obj) ? new ProfileAssociationMemoriesMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f9bbac75-cabb-4e89-936a-35d274769b63")
    public static ProfileAssociationMemoriesMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemoriesMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMemoriesMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemoriesMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14de41c5-3982-4d93-9a69-90ec9502333f")
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
        ProfileAssociationMemoriesMemoryBroker other = (ProfileAssociationMemoriesMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("14bf5267-a194-44dc-a380-8b1c133b606c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("e5e7bc21-5ecc-4d08-96a0-306a2a74b0ce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3e54854f-4446-46bc-a386-e1424ae9bb67")
    protected ProfileAssociationMemoriesMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("9a4ab844-2621-4677-b51e-10673b070c25")
    public static final class MdaTypes {
        @objid ("ad4a0d65-1ad3-41d5-96f0-111289f0a302")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef2c1e12-363e-4c53-82aa-eb8bafd4cfcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("586d7ffd-6f27-4122-810b-8b11093ab8ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f3374d5-0c6d-46b3-ae58-3cd1ff57d9cf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "93675be5-9759-11e0-94fb-0027103f347c");
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
