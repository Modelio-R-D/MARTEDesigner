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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d57bad71-0629-47fd-8e01-d54014b928d5")
public class ProfileAssociationMemoryBlockSizeElementsMemoryBroker {
    @objid ("54160a92-cd90-4ce9-b3b6-6da2bc6b8496")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memoryBlockSizeElements_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("482fd591-2d0a-4dbc-90a2-1dfc57821234")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7194255d-276b-496c-9209-557cc6f1f1fe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockSizeElementsMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> then instantiate a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("040a6e94-d5dd-4fb4-a5c4-7d52fc64bf20")
    public static ProfileAssociationMemoryBlockSizeElementsMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoryBlockSizeElementsMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMemoryBlockSizeElementsMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memoryBlockSizeElements_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemoryBlockSizeElementsMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("4dffa250-5145-4a50-a972-092cf671a589")
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
    @objid ("d376300f-dc22-4534-80a3-762eb7a7d9ac")
    public static ProfileAssociationMemoryBlockSizeElementsMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemoryBlockSizeElementsMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMemoryBlockSizeElementsMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemoryBlockSizeElementsMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93f01765-dc9a-4d49-974a-b7002c09ffbd")
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
    @objid ("c1a7a68b-0499-4614-b80b-3b4ca768efb3")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1b763e5f-bac5-4c32-b2db-5dcff815700c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c3c8cc10-5c9e-4b77-b565-e1258864fb9e")
    protected ProfileAssociationMemoryBlockSizeElementsMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("45564b68-3c27-4257-b7de-32c5137d0040")
    public static final class MdaTypes {
        @objid ("c7bf9790-9c40-41a5-97be-5d078b0719aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af54203b-ea64-4642-8036-85b18f860b0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("31f3c57b-16b6-46a4-9aac-e5f37ccda5ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a1fe62ed-ad81-48a6-909d-c6aa4356f22b")
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
