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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("32bf79bd-71b8-42f8-b66d-0567c03b4814")
public class ProfileAssociationManagedMemoriesHwStorageManagerHwMemory {
    @objid ("8c43336a-cff9-48e3-9cb5-6bdd6d21cb28")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_managedMemories_HwStorageManager_HwMemory";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("78d64adf-2ec5-42ac-b422-02dc78c3fc0d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a049d681-ca4c-4a78-9523-c1505a78a984")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> then instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy.
     * 
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy on the created {@link Dependency}.
     */
    @objid ("7ae9e6fa-a4a3-4cec-997c-7e9333db0a62")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.STEREOTYPE_NAME);
        return ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy from a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy or <i>null</i>.
     */
    @objid ("c4ab0dc5-2be7-4a81-bf1b-58d44161b762")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory instantiate(final Dependency obj) {
        return ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.canInstantiate(obj) ? new ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy from a {@link Dependency} stereotyped << ProfileAssociation_managedMemories_HwStorageManager_HwMemory >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationManagedMemoriesHwStorageManagerHwMemory} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("62abfbb0-dc91-4424-8744-16bb4359202e")
    public static ProfileAssociationManagedMemoriesHwStorageManagerHwMemory safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationManagedMemoriesHwStorageManagerHwMemory.canInstantiate(obj))
        	return new ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationManagedMemoriesHwStorageManagerHwMemory: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0304b1cb-be16-4256-94bf-fceeaf489582")
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
        ProfileAssociationManagedMemoriesHwStorageManagerHwMemory other = (ProfileAssociationManagedMemoriesHwStorageManagerHwMemory) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("edf673ed-6833-4f63-893d-874b2bf08af5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f66c6bcb-1058-44c3-917b-e9743005b955")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8a115cc2-f10f-4775-8ef3-779ff497ce7d")
    protected ProfileAssociationManagedMemoriesHwStorageManagerHwMemory(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0caaff36-be2e-458a-b6b0-c86533f5e217")
    public static final class MdaTypes {
        @objid ("7d7729d3-e6cf-4fdf-bb19-e4a0755ecdd2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01903f73-6017-4aeb-a300-7734f6a5f01d")
        private static Stereotype MDAASSOCDEP;

        @objid ("78b10c36-7ea8-4c49-8c24-2aa3792b66ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("818002d5-e22c-4a45-a4d3-52740561f13f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd8c181d-936b-11e0-b960-0027103f347c");
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
