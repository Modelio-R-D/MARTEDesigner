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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d57bad71-0629-47fd-8e01-d54014b928d5")
public class ProfileAssociationMemoryBlockSizeElementsMemoryBroker {
    @objid ("a03ff82c-b4ae-4bc9-b3d5-33c8c998087c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memoryBlockSizeElements_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0b8186af-5ae3-4525-a492-8d9bb51d5cc2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f68e6002-93d2-474f-9ed2-62b0e2313055")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockSizeElementsMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> then instantiate a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("f900a653-78d7-4913-8e4e-fab0d2e9110f")
    public static ProfileAssociationMemoryBlockSizeElementsMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockSizeElementsMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMemoryBlockSizeElementsMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("959c55e8-5731-40f4-a3cd-c71affb5551f")
    public static ProfileAssociationMemoryBlockSizeElementsMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationMemoryBlockSizeElementsMemoryBroker.canInstantiate(obj) ? new ProfileAssociationMemoryBlockSizeElementsMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e41c5f0-12f7-4c7e-9859-3a9c90079169")
    public static ProfileAssociationMemoryBlockSizeElementsMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemoryBlockSizeElementsMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMemoryBlockSizeElementsMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemoryBlockSizeElementsMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b812a34b-1644-4beb-8068-fec4996a86d0")
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
        ProfileAssociationMemoryBlockSizeElementsMemoryBroker other = (ProfileAssociationMemoryBlockSizeElementsMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("37d7e82a-8c78-492e-ab0c-aa8d84c8a2fd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d7f0756e-f1f2-4d6d-8f29-bc461b643e82")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1e0efb28-4ce6-47a8-a58a-abdfa8baaef4")
    protected ProfileAssociationMemoryBlockSizeElementsMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("45564b68-3c27-4257-b7de-32c5137d0040")
    public static final class MdaTypes {
        @objid ("02050d21-4ef5-43b2-b6b7-3684719c7265")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e41747b2-f4e6-4170-8896-daaf39b3a058")
        private static Stereotype MDAASSOCDEP;

        @objid ("72dc46e5-9379-45d1-9d9a-acffa0f0b510")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed4e8c76-ec09-456a-bbd3-24103fb2d289")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c8c13030-9759-11e0-94fb-0027103f347c");
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
